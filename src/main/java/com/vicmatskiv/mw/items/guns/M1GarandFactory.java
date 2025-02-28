package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AR15CarryHandle;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M1Garand;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M38DMR;
import com.vicmatskiv.mw.models.M4A1;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.NV4;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.RailAlt;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class M1GarandFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("m1_garand")
        .withAmmoCapacity(8)
        .withFireRate(0.2f)
        .withRecoil(3.5f)
        .withZoom(0.9f)
        .withMaxShots(1)
        .withShootSound("m1garand")
//        .withSilencedShootSound("m4a1_silenced")
        .withReloadSound("m1garand_reload")
        .withEndOfShootSound("m1garandping")
//        .withInspectSound("m4a1_inspection")
//        .withDrawSound("m4_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.1f)
        .withShellCasingForwardOffset(0.05f)
        .withShellCasingVerticalOffset(-0.03f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Semi-Automatic Rifle", 
        "Damage: 10", 
        "Cartridge: .30-06 Springfield Bullet",
        "Fire Rate: SEMI",
        "Rate of Fire: 20/100"))
         .withCrafting(CraftingComplexity.MEDIUM,
                Ores.PlasticPlate,
                Ores.GunmetalPlate)
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 3f, // x 
                 2f, // y
                 6f) // z
         
        .withCompatibleBullet(Bullets.Bullet3006Springfield, (model) -> {})
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.162F, -1.75F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.055F, -1.35F, -4.05F);
//                GL11.glScaled(0.8F, 0.68F, 1F);
              GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
            	GL11.glTranslatef(-0.153F, -1.245F, -6.15F);
                GL11.glScaled(0.3F, 0.3F, 1.2F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M1GarandAction, true, (model) -> {
//        	GL11.glTranslatef(0f, 0f, 0.44f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M1GarandMag, true, (model) -> {
//          GL11.glScaled(0.5F, 0.5F, 0.5F);
          GL11.glTranslatef(-0.1f, 0f, 1f);
//          GL11.glRotatef(-20F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Mk14EBRsight, true, (model) -> {
        	GL11.glTranslatef(-0.125F, -1.075F, -0.85F);
            GL11.glScaled(0.11F, 0.11F, 0.11F);
        })
        .withTextureNames("M1Garand")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new M1Garand())
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(0, 0f, 3f);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.175000f, 1.050000f, 0.175000f);
                
//                GL11.glRotatef(41F, 0f, 1f, 0f);
//                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
//                GL11.glRotatef(11.000000f, 0f, 0f, 1f);
//                GL11.glRotatef(1.000000f, 1f, 0f, 0f);
//                GL11.glTranslatef(-0.175000f, 1.150000f, 0.2f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.175000f, 1.050000f, 0.475000f);
                GL11.glRotatef(-2F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.275000f, 0.950000f, 0.275000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glRotatef(16.000000f, 0f, 0f, 1f);
                GL11.glTranslatef(-0.275000f, 0.950000f, 0.475000f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
        
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.M1GarandAction.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.44F);
                }
            })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.M1GarandAction.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0F, 0F, 0.44F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.M1GarandAction.getRenderablePart(), (renderContext) -> {
            	GL11.glTranslatef(0F, 0F, 0.44F);
                })
            
            .withFirstPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.14000f, 1.150000f, 0.135000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(41F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-3.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.175000f, 1.150000f, 0.25f);
                    }, 200, 30),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(41F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(11.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(1.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.175000f, 1.150000f, 0.2f);
                    }, 280, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 1.150000f, 0.2f);
                    }, 270, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(42F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 1.150000f, 0.2f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(13.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 1.150000f, 0.2f);
                    }, 220, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 1.22000f, 0.22f);
                    }, 150, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(44F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(14.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-2.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.175000f, 1.220000f, 0.15f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(12.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 1.10000f, 0.175000f);
                    }, 80, 0)
                )
                
                .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M1GarandAction.getRenderablePart(),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0F, 0F, 0.44F);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0f, 0f, 0.44f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0f, 0f, 0.44f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0f, 0f, 0.44f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0f, 0f, 0.44f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0f, 0f, 0.44f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0f, 0f, 0.44f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0f, 0f, 0.44f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                        }, 250, 200)
                )
                
                .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.M1GarandMag.getRenderablePart(),
                        
                		new Transition((renderContext) -> { // Reload position
                        }, 250, 200),
                        
                        new Transition((renderContext) -> { // Reload position
                        }, 250, 200),
                    
                        new Transition((renderContext) -> { // Reload position
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-1.8f, -1f, -3f);
                            GL11.glRotatef(-20F, 1f, 0f, 0f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-0.15f, -2.15f, -4.1f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-0.15f, -2.02f, -4.1f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-0.15f, -2.02f, -4.1f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-0.15f, -1.62f, -4.1f);
                        }, 250, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-0.15f, -1.62f, -4.1f);
                        }, 250, 200)
                )
                    
            .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 0.6f, 0.3f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glRotatef(50F, 0f, 1f, 0f);
                      GL11.glRotatef(60F, 0f, 0f, 1f);
                      GL11.glRotatef(-11F, 1f, 0f, 0f);
                      GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                      GL11.glTranslatef(0.4f, 1.4f, -0.3f);
                  }, 350, 600)
                    )
                    
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.NV4Action.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 300, 600),
                  new Transition((renderContext) -> {
                  }, 350, 600)
                    )
                    
            .withFirstPersonPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(2F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.375000f, 1.350000f, 0.375000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(10F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.375000f, 1.250000f, 0.375000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(25F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(18.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(5.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.275000f, 1.250000f, 0.25000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(35F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(3.000000f, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.175000f, 1.150000f, 0.175000f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glRotatef(45F, 0f, 1f, 0f);
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.175000f, 1.050000f, 0.175000f);
                    }, 170, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.NV4Action.getRenderablePart(),
                    new Transition((renderContext) -> { // Reload position
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    }, 110, 0)
                    )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.352f, 0.69f, 0.4f);
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.03f, 0.3f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.352f, 0.71f, 0.5f);
                GL11.glRotatef(-2F, 1f, 0f, 0f);
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.03f, 0.3f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
                
            .withFirstPersonPositioningRunning((renderContext) -> {
            	GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glScalef(2.00000f, 2.00000f, 2.00000f);
                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                GL11.glRotatef(10.000000f, 1f, 0f, 0f);
                GL11.glTranslatef(-0.075000f, 1.050000f, 0.775000f);
             })
             .withFirstPersonPositioningModifying((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.425000f, 0.700000f, 0.100000f);
             })
             
             .withFirstPersonHandPositioning(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                         
//                         GL11.glScalef(3f, 3f, 3f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        
//                        GL11.glScalef(3f, 3f, 3f);
                    })
                     
            .withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                    	 GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.025000f, 0.275000f);
                    }, 250, 0))
                    
            .withFirstPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-50.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.425000f, 0.100000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-65.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.025000f, -0.050000f, -0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.225000f, -0.250000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.225000f, -0.250000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-85.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.225000f, -0.300000f, 0.150000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3f, 3f, 3f);
                    	GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.250000f, -0.150000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.125000f, -0.350000f, 0.225000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonRightHandPositioningInspecting(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50)
                    )
                    
            .withFirstPersonLeftHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3f, 3f, 3f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.250000f, -0.250000f, 0.225000f);
                    }, 110, 0)
                    )
                    
            .withFirstPersonRightHandPositioningDrawing(
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 150, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 110, 0)
                    )
                    
            .build())
        .withSpawnEntityDamage(10f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}