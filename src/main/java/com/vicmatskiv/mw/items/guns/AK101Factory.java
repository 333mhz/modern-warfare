package com.vicmatskiv.mw.items.guns;

import java.util.Arrays;

import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.Attachments;
import com.vicmatskiv.mw.AuxiliaryAttachments;
import com.vicmatskiv.mw.Bullets;
import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.GunSkins;
import com.vicmatskiv.mw.Magazines;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;
import com.vicmatskiv.mw.models.AK101;
import com.vicmatskiv.mw.models.AK101DustCover;
import com.vicmatskiv.mw.models.AK15;
import com.vicmatskiv.mw.models.AK15DustCover;
import com.vicmatskiv.mw.models.AK15HandleGuard;
import com.vicmatskiv.mw.models.AK15ironsight;
import com.vicmatskiv.mw.models.AK47;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AKiron3;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.EotechScopeRing;
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
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MLOKExtendedHandguard;
import com.vicmatskiv.mw.models.MLOKHandguard;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.OKP7;
import com.vicmatskiv.mw.models.OKP7reticle;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.PSO12;
import com.vicmatskiv.mw.models.PSO1reticle;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.mw.models.VeprDustCover;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.compatibility.CompatibleBlocks;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class AK101Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("ak101")
//        .withAmmoCapacity(30)
        .withFireRate(0.6f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("ak101")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("ak_reload")
        .withUnloadSound("ak_unload")
        .withInspectSound("inspection")
        .withDrawSound("ak_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.16f)
//        .withSpawnEntityModel(ammoModel)
//        .withSpawnEntityModelTexture(ammoModelTextureName)
        .withShellCasingVerticalOffset(-0.05f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Assault Rifle",
        "Damage: 7", 
        "Cartridge: 5.56x45mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 60/100",
        "Magazines:",
        "30rnd 5.56x45mm Magazine",
        "60rnd 5.56x45mm Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1.5f, // x 
                3f, // y
                3f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCrafting(CraftingComplexity.MEDIUM,
                Ores.GunmetalIngot,
                Ores.GunmetalPlate)
//        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.AK47Stock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK101Stock, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKMDustCover, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK47HandleGuard, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK101HandGuard, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKMagpulHandleGuard, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKMagpulHandleGuardTan, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.MLOKHandguard, (model) -> {
            if(model instanceof MLOKHandguard) {
//                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -4.3f);
                GL11.glScaled(0.7F, 0.8F, 0.4F);
            } else if(model instanceof AKRail2) {   
                GL11.glTranslatef(-0.02F, -0.5F, -4.3f);
                GL11.glScaled(0.7F, 0.8F, 0.4F);
                GL11.glRotatef(180.000000f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.MLOKExtendedHandguard, (model) -> {
            if(model instanceof MLOKExtendedHandguard) {
//                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -5.6f);
                GL11.glScaled(0.7F, 0.8F, 1F);
            } else if(model instanceof AKRail2) {   
                GL11.glTranslatef(-0.02F, -0.5F, -5.6f);
                GL11.glScaled(0.7F, 0.8F, 1F);
                GL11.glRotatef(180.000000f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.AK15HandleGuard, (model) -> {
            if(model instanceof AK15HandleGuard) {
//                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -4.3f);
                GL11.glScaled(0.7F, 0.8F, 0.4F);
            } else if(model instanceof AKRail2) {   
                GL11.glTranslatef(-0.02F, -0.5F, -4.3f);
                GL11.glScaled(0F, 0F, 0F);
                GL11.glRotatef(180.000000f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.AK101DustCover, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.VeprDustCover, (model) -> {
            if(model instanceof VeprDustCover) {
                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -2.75f);
                GL11.glScaled(0.7F, 0.8F, 1.1F);
            }
        })
        .withCompatibleAttachment(Attachments.AK15DustCover, (model) -> {
            if(model instanceof AK15DustCover) {
//                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.205F, -1.3F, -2.75f);
                GL11.glScaled(0.6F, 0.8F, 1.12F);
            }
        })
        .withCompatibleAttachment(Attachments.RPKDustCover, (model) -> {
            if(model instanceof AK101DustCover) {
//                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.205F, -1.3F, -2.75f);
                GL11.glScaled(0.6F, 0.8F, 1.12F);
            }
        })
        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.2f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK47Grip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK101Grip, true, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AKErgoGrip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AKaction, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AKpart, true, (model) -> {
            GL11.glTranslatef(-0.14F, -0.81F, -5.96F);
            GL11.glScaled(0.5F, 0.5F, 3F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AKMuzzle, true, (model) -> {
            GL11.glTranslatef(-0.19F, -1.01F, -6.92F);
            GL11.glScaled(0.8F, 0.8F, 0.6F);
        })
        .withCompatibleAttachment(Attachments.AKIron, true, (model) -> {
            if(model instanceof AKiron3) {
                GL11.glTranslatef(-0.195F, -1.06F, -5.96F);
                GL11.glScaled(0.9F, 0.55F, 0.5F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.185F, -1.32F, -5.95F);
                GL11.glScaled(0.55F, 0.55F, 0.68F);
            }
        })
        .withCompatibleAttachment(Magazines.AK101Mag, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
//            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(Magazines.AK60Mag, (model) -> {
//          GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
//            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
          GL11.glTranslatef(-0.2F, -1.06F, -7.55F);
          GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.185F, -1.32F, -5.95F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.25F, -1.65F, -3.05F);
                GL11.glScaled(0.8F, 0.7F, 0.6F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
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
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.18F, -0.15F, -4F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.05F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.05F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.2F, 0.05F, -4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.05F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.PSO1, (player, stack) -> {
            
            GL11.glTranslatef(0.14F, -0.9F, -1.1F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        },(model) -> {
            if(model instanceof PSO1reticle) {
                GL11.glTranslatef(-0.212F, -0.483F, 1.27F);
                GL11.glScaled(0.017F, 0.017F, 0.017F);
            }
             else if(model instanceof PSO12) {
                 GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                 GL11.glScaled(0.8F, 0.8F, 0.8F);
             }
        })
        .withCompatibleAttachment(Attachments.OKP7, (model) -> {
            if(model instanceof OKP7) {
                GL11.glTranslatef(-0.18F, -0.65F, -1.15F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            } else if(model instanceof OKP7reticle) {
                GL11.glTranslatef(-0.07F, -1.45F, -1.5F);
                GL11.glScaled(0.07F, 0.07F, 0.07F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.4F, -2.1F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.295F, -1.4F, -0.8F);
            GL11.glScaled(0.73F, 0.73F, 0.73F);
        },(model) -> {
            if(model instanceof AcogScope2) {
                GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            else if(model instanceof AcogReticle) {
                GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.155F, -1.23F, -1.6F);
		            GL11.glScaled(0.43F, 0.43F, 0.43F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
		            GL11.glTranslatef(-0.185F, -1.1F, -1F);
		            GL11.glScaled(0.4F, 0.4F, 0.4F);
		},(model) -> {
		    if(model instanceof Acog2) {
		        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
        
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.15F, -1.91F, -1F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		//        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
		//            GL11.glScaled(0.4F, 0.4F, 0.4F);
		        }
		    })
        
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.177F, -1.41F, -1.2F);
                GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.177F, -1.41F, -1.2F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.065F, -1.2F, -1.8F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.066F, -1.18F, -1.2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.042F, -1.25F, -1.4F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(-0.042F, -1.25F, -1.4F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -1.25F, -1.4F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
		},(model) -> {
		    if(model instanceof EotechScopeRing) {
		        GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
		        GL11.glScaled(0.5F, 0.5F, 0.5F);
		    }
		    if(model instanceof Holo2) {
		        GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
		        GL11.glScaled(0.05F, 0.05F, 0.05F);
		    }
		})
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.42F, -1.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.044F, -1.24F, -1F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
	            GL11.glTranslatef(-0.044F, -1.24F, -1F);
	            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withTextureNames("bareak")
        .withRenderer(new WeaponRenderer.Builder()
                .withModId(ModernWarfareMod.MODID)
                .withModel(new AK101())
                //.withTextureName("AK47")
                //.withWeaponProximity(0.99F)
                //.withYOffsetZoom(5F)
                .withEntityPositioning(itemStack -> {
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                    GL11.glRotatef(-90F, 0f, 0f, 4f);
                })
                .withInventoryPositioning(itemStack -> {
                    GL11.glScaled(0.28F, 0.28F, 0.28F);
                    GL11.glTranslatef(1, 2f, -1.2f);
                    GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                })
                .withThirdPersonPositioning((renderContext) -> {
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-1.8F, -1.1F, 2F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(70F, 1f, 0f, 0f);
                    })
                
                 .withFirstPersonPositioning((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.275000f, 0.850000f, -0.175000f);
                    
//                    GL11.glRotatef(41F, 0f, 1f, 0f);
//                    GL11.glScalef(2f, 2f, 2f);
//                    GL11.glRotatef(-22.000000f, 0f, 0f, 1f);
//                    GL11.glRotatef(-7F, 1f, 0f, 0f);
//                    GL11.glTranslatef(-0.28f, 0.85f, 0.2f);
                    })
                    
                .withFirstPersonPositioningRecoiled((renderContext) -> {
                	GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(4.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.275000f, 0.850000f, 0.225000f);
                    GL11.glRotatef(1F, 1f, 0f, 0f);
                    })
                    
                .withFirstPersonPositioningProning((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.325000f, 0.675000f, -0.425000f);
                    })
                    
                .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(6.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.325000f, 0.675000f, -0.025000f);
                    GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                    })
                
                .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.AKaction.getRenderablePart(), (renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 1f);
                    })
                    
                .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.AKaction.getRenderablePart(), (renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 1f);
                    })
                
                .withFirstPersonPositioningReloading(
                        
                		// hand goes down
                		
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(2f, 2f, 2f);
                            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.550000f, 1.050000f, -0.025000f);
                        }, 400, 0),
                        
                        // mag touches gun
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(2f, 2f, 2f);
                            GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-3.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.550000f, 0.950000f, -0.025000f);
                        }, 260, 0),
                        
                        // jiggle
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(2f, 2f, 2f);
                            GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-3.500000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.550000f, 0.970000f, -0.025000f);
                        }, 60, 0),
                        
                        // jiggle
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(2f, 2f, 2f);
                            GL11.glRotatef(-22.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-3.20000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.550000f, 0.990000f, -0.025000f);
                        }, 90, 0),
                        
                        // mag inserts
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 1.100000f, -0.025000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-27.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-7.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 1.170000f, -0.025000f);
                    }, 70, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-26.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-4.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 1.180000f, -0.025000f);
                    }, 90, 0),
                    
                    // jiggle
                    
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-26.500000f, 1f, 0f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-6.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.550000f, 1.190000f, -0.025000f);
                    }, 100, 0),
                    
                    
                    // left hand goes to action
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.28f, 0.85f, -0.07f);
                    }, 350, 100),
                    
                    // left hand pulls action
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(41F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-8F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.28f, 0.85f, 0.2f);
                    }, 180, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(41F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-22.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-7F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.28f, 0.85f, 0.2f);
                    }, 70, 0),
                    
                    // action slides forward
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-3F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.28f, 0.85f, -0.14f);
                    }, 100, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-2F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.28f, 0.85f, -0.17f);
                    }, 50, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glRotatef(43F, 0f, 1f, 0f);
                        GL11.glScalef(2f, 2f, 2f);
                        GL11.glRotatef(-8.000000f, 0f, 0f, 1f);
                        GL11.glRotatef(-2.5F, 1f, 0f, 0f);
                        GL11.glTranslatef(-0.28f, 0.85f, -0.17f);
                    }, 80, 0)
                )
                
                .withFirstPersonPositioningUnloading(
                        new Transition((renderContext) -> { // Reload position
                            GL11.glRotatef(44F, 0f, 1f, 0f);
                            GL11.glScalef(2f, 2f, 2f);
                            GL11.glRotatef(9.000000f, 0f, 0f, 1f);
                            GL11.glRotatef(-2F, 1f, 0f, 0f);
                            GL11.glTranslatef(-0.28f, 0.85f, -0.07f);
                        }, 240, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glRotatef(41F, 0f, 1f, 0f);
                            GL11.glScalef(2f, 2f, 2f);
                            GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                            GL11.glRotatef(-5F, 1f, 0f, 0f);
                            GL11.glTranslatef(-0.28f, 0.8f, -0.07f);
                        }, 150, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glRotatef(42F, 0f, 1f, 0f);
                            GL11.glScalef(2f, 2f, 2f);
                            GL11.glRotatef(1.000000f, 0f, 0f, 1f);
                            GL11.glRotatef(-8F, 1f, 0f, 0f);
                            GL11.glTranslatef(-0.28f, 1.1f, -0.07f);
                        }, 200, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glRotatef(43F, 0f, 1f, 0f);
                            GL11.glScalef(2f, 2f, 2f);
                            GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                            GL11.glRotatef(-5F, 1f, 0f, 0f);
                            GL11.glTranslatef(-0.28f, 1f, -0.07f);
                        }, 160, 0)
                        )
                        
                .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AKaction.getRenderablePart(),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glTranslatef(0F, 0F, 1F);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                            GL11.glTranslatef(0F, 0F, 1F);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
//                        	GL11.glTranslatef(0F, 0F, 1F);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000)
                            )
                            
                 .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AKaction.getRenderablePart(),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000)
                            )
                        
                .withFirstPersonCustomPositioningReloading(Magazines.AK101Mag,
                        new Transition((renderContext) -> {
                        	GL11.glTranslatef(0F, 2F, 0.2F);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glTranslatef(0f, 0.5f, -0.12f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glTranslatef(0f, 0.5f, -0.12f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glTranslatef(0f, 0.5f, -0.12f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000)
                        )
                        
                .withFirstPersonCustomPositioningUnloading(Magazines.AK101Mag,
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glTranslatef(0f, 0.5f, -0.12f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glTranslatef(0F, 2F, 0.2F);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glTranslatef(0F, 2F, 0.2F);
                      }, 250, 1000)
                        )
                        
                .withFirstPersonCustomPositioningReloading(Magazines.AK60Mag,
                        new Transition((renderContext) -> {
                        	GL11.glTranslatef(0F, 2F, 0.2F);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glTranslatef(0f, 0.5f, -0.12f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glTranslatef(0f, 0.5f, -0.12f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glTranslatef(0f, 0.5f, -0.12f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000)
                        )
                        
                .withFirstPersonCustomPositioningUnloading(Magazines.AK60Mag,
                		new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glTranslatef(0f, 0.5f, -0.12f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glTranslatef(0F, 2F, 0.2F);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        	GL11.glTranslatef(0F, 2F, 0.2F);
                      }, 250, 1000)
                        )
                        
                .withFirstPersonPositioningInspecting(
                        new Transition((renderContext) -> {
                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-1f, 0.8f, 0f);
                        }, 300, 600),
                      new Transition((renderContext) -> {
                          GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                          GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                          GL11.glRotatef(45.000000f, 0f, 1f, 0f);
                          GL11.glRotatef(65.000000f, 0f, 0f, 1f);
                          GL11.glTranslatef(0.2f, 1f, -0.2f);
                      }, 350, 600)
                        )
                        
                .withThirdPersonPositioningReloading(
//                        new Transition((renderContext) -> { // Reload position
//                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                        }, 200, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 210, 100),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 130, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 240, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 400, 150),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 300, 60),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 120, 190),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 3.6F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(95F, 1f, 0f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                    }, 120, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                    }, 120, 0)
//                    }, 100, 0)
                )
                
                        
                .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.AKaction.getRenderablePart(),
//                        new Transition((renderContext) -> {
//                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                            GL11.glTranslatef(0f, 0f, 1f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000)
                            )
                            
                .withFirstPersonPositioningDrawing(
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                            GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.200000f, 1.449999f, -0.2f);
                        }, 120, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                            GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(37.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.200000f, 1.449999f, -0.2f);
                        }, 120, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                            GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, 1.249999f, -0f);
                        }, 270, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                            GL11.glRotatef(13.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, 1.249999f, 0.15f);
                        }, 190, 150),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                            GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(27.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, 1.249999f, -0f);
                        }, 190, 0)
                        )
                        
                .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AKaction.getRenderablePart(),
                        new Transition((renderContext) -> { // Reload position
                        }, 150, 0),
                        new Transition((renderContext) -> { // Reload position
                        }, 130, 0),
                        new Transition((renderContext) -> { // Reload position
                        }, 200, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glTranslatef(0f, 0f, 1f);
                        }, 130, 60),
                        new Transition((renderContext) -> { // Reload position
                        }, 110, 0)
                        )
                
                .withFirstPersonPositioningZooming((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(0.353f, 0.79f, -0.4f);

                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(-0.015F, 0.157f, 0.1f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(-0.046F, 0.11f, 0.2f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.23f, 0.7f);
                    } 
                    
                    // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.235f, 0.9f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.18f, 0.5f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.15f, 0.9f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.22f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.2f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                        //System.out.println("Position me for Acog");
                    	GL11.glTranslatef(0F, 0.2f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.17f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.1415f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.227f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.227f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.227f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.225f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.21f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.21f, 0.7f);
                    } 
                    
                    // Everything else
                    else {
                    }
                    
                
                    })
                    
                .withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                    GL11.glTranslatef(0.353f, 0.79f, -0.2f);

                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(-0.015F, 0.157f, 0f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(-0.046F, 0.11f, 0.2f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                        //System.out.println("Position me for Acog");
                    	GL11.glTranslatef(0F, 0.23f, 0.6f);
                    } 
                    
                    // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        //System.out.println("Position me for Acog");
                    	GL11.glTranslatef(0F, 0.235f, 0.8f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.18f, 0.4f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        //System.out.println("Position me for Acog");
                    	GL11.glTranslatef(0F, 0.15f, 0.8f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.22f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        //System.out.println("Position me for Acog");
                    	GL11.glTranslatef(0F, 0.2f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                        //System.out.println("Position me for Acog");
                    	GL11.glTranslatef(0F, 0.2f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.17f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.1415f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.227f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.227f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.227f, 0.6f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.225f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.21f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.21f, 0.7f);
                    } 
                    
                    // Everything else
                    else {
                    }
                    
                
                    })
                
                .withFirstPersonPositioningRunning((renderContext) -> {
                    GL11.glRotatef(35F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScalef(2f, 2f, 2f);
                    GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    GL11.glTranslatef(-0.1f, 1.1f, -0.15f);
                 })
                 
                 .withFirstPersonPositioningModifying((renderContext) -> {
                     GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                     GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-1f, 0.675000f, -0.5f);
                 })
                 
                 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                     GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                     GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                     GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                     GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                     GL11.glTranslatef(-2.300000f, 0.600000f, 0.500000f);
                 })
                 
                 .withFirstPersonHandPositioning(
                         (renderContext) -> {
                             RenderContext<?> rc = (RenderContext<?>) renderContext;
                             ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                     AttachmentCategory.GRIP, rc.getWeaponInstance());
                             if(activeAttachment == Attachments.Grip2 ||
                                    activeAttachment == Attachments.StubbyGrip || 
                                    activeAttachment == Attachments.VGrip) {
                                 GL11.glScalef(4f, 4f, 4f);
                                 GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                 GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                                 GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                                 GL11.glTranslatef(0.275000f, -0.000000f, 0.275000f);
                                 
//                                 GL11.glScalef(4f, 4f, 4f);
                             } else if(activeAttachment == Attachments.AngledGrip) {
                                 GL11.glScalef(4f, 4f, 4f);
                                 GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                 GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                 GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                                 GL11.glTranslatef(0.300000f, 0.100000f, 0.400000f);
                             } else {
                                 GL11.glScalef(4f, 4f, 4f);
                                 GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                                 GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                                 GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                                 GL11.glTranslatef(0.375000f, -0.125000f, 0.000000f);
                             }
                         }, 
                         (renderContext) -> {
                             GL11.glScalef(4f, 4f, 5f);
                             GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                         })
                         
                .withFirstPersonHandPositioningProning(
                		(renderContext) -> {
                            RenderContext<?> rc = (RenderContext<?>) renderContext;
                            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                    AttachmentCategory.GRIP, rc.getWeaponInstance());
                            if(activeAttachment == Attachments.Grip2 ||
                                   activeAttachment == Attachments.StubbyGrip || 
                                   activeAttachment == Attachments.VGrip) {
                                GL11.glScalef(4f, 4f, 4f);
                                GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                                GL11.glTranslatef(0.275000f, -0.000000f, 0.275000f);
                                
//                                GL11.glScalef(4f, 4f, 4f);
                            } else if(activeAttachment == Attachments.AngledGrip) {
                                GL11.glScalef(4f, 4f, 4f);
                                GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                                GL11.glTranslatef(0.300000f, 0.100000f, 0.400000f);
                            } else {
                                GL11.glScalef(4f, 4f, 4f);
                                GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                                GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                                GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                                GL11.glTranslatef(0.375000f, -0.125000f, 0.000000f);
                                
//                                GL11.glScalef(4f, 4f, 4f);
                            }
                        }, 
                        (renderContext) -> {
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        })
                         
                .withFirstPersonHandPositioningZooming(
                		(renderContext) -> {
                            RenderContext<?> rc = (RenderContext<?>) renderContext;
                            ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                    AttachmentCategory.GRIP, rc.getWeaponInstance());
                            if(activeAttachment == Attachments.Grip2 ||
                                   activeAttachment == Attachments.StubbyGrip || 
                                   activeAttachment == Attachments.VGrip) {
                                GL11.glScalef(4f, 4f, 4f);
                                GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                                GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                                GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                                GL11.glTranslatef(0.275000f, -0.000000f, 0.275000f);
                                
//                                GL11.glScalef(4f, 4f, 4f);
                            } else if(activeAttachment == Attachments.AngledGrip) {
                                GL11.glScalef(4f, 4f, 4f);
                                GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                GL11.glRotatef(-35.000000f, 0f, 1f, 0f);
                                GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                                GL11.glTranslatef(0.300000f, 0.100000f, 0.400000f);
                            } else {
                            	GL11.glScalef(4f, 4f, 4f);
                                GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                                GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                                GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                                GL11.glTranslatef(0.275000f, -0.300000f, 0.150000f);
                            }
                        }, 
                        (renderContext) -> {
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        })
                         
                .withFirstPersonHandPositioningModifying(
                         (renderContext) -> {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-35.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(90.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.175000f, -0.575000f, -0.075000f);
                         }, 
                         (renderContext) -> {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-115.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(-30.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.400000f, -0.500000f, 0.200000f);
                         })
                         
                .withFirstPersonHandPositioningModifyingAlt(
                         (renderContext) -> {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(130.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.225000f, -0.675000f, -0.450000f);
                         }, 
                         (renderContext) -> {
                             GL11.glScalef(4f, 4f, 4f);
                             GL11.glRotatef(-125.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.350000f, -0.625000f, 0.150000f);
                         })
                         
                .withFirstPersonLeftHandPositioningReloading(
                        
                		// left hand goes down
                		
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.600000f, -0.475000f, 0.250000f);
                        }, 50, 200),
                        
                        // mag touches gun
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.300000f, -0.500000f, 0.200000f);
                        }, 50, 200),
                        
                        // jiggle
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.300000f, -0.500000f, 0.200000f);
                        }, 250, 0),
                        
                        // jiggle
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.300000f, -0.500000f, 0.200000f);
                        }, 250, 0),
                        
                        // mag inserts
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.100000f, -0.300000f, 0.050000f);
                        }, 250, 0),
                        
                        // jiggle
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.100000f, -0.300000f, 0.050000f);
                        }, 250, 0),
                        
                        // jiggle
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.100000f, -0.300000f, 0.050000f);
                        }, 250, 0),
                        
                        // jiggle
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.100000f, -0.300000f, 0.050000f);
                        }, 250, 0),
                        
                        // left hand goes to action
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-130.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.050000f, -0.625000f, 0.375000f);
                        }, 250, 0),
                        
                        // left hand pulls action
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.175000f, -0.725000f, 0.300000f);
                        }, 250, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.175000f, -0.725000f, 0.300000f);
                        }, 250, 0),
                        
                        // action slides forward
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(-0.575000f, -0.750000f, 0.325000f);
                        }, 300, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(-0.575000f, -0.750000f, 0.325000f);
                        }, 300, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-145.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(-0.575000f, -0.750000f, 0.325000f);
                        }, 300, 0))
                        
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
                        }, 250, 50),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 260, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 260, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 260, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 250, 100),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 5f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        }, 280, 0))
                        
                .withFirstPersonLeftHandPositioningUnloading(
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.100000f, -0.300000f, 0.050000f);
                        }, 50, 200),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.300000f, -0.500000f, 0.200000f);
                        }, 50, 200),
                        
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.600000f, -0.475000f, 0.250000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                        	GL11.glScalef(4f, 4f, 4f);
                        	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        	GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                        	GL11.glRotatef(50.000000f, 0f, 0f, 1f);
                        	GL11.glTranslatef(0.600000f, -0.475000f, 0.250000f);
                        }, 50, 200))
                        
                .withFirstPersonRightHandPositioningUnloading(
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
                        }, 250, 50),
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
                        }, 250, 50))
                        
                .withFirstPersonLeftHandPositioningInspecting(
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.35f, -0.13f, 0.25f);
                        }, 250, 50),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.35f, -0.13f, 0.25f);
                        }, 250, 50))
                        
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
                        }, 250, 50))
                        
                .withThirdPersonLeftHandPositioningReloading(
//                        new Transition((renderContext) -> { // Reload position
//                            GL11.glScalef(3.5f, 3.5f, 3.5f);
//                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 250, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 250, 100),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 280, 0))
                        
                .withThirdPersonRightHandPositioningReloading(
//                        new Transition((renderContext) -> { // Reload position
//                            GL11.glScalef(4f, 4f, 5f);
//                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                        }, 250, 1000),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 1000),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-49.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 50),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 50),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 1000),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 50),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(14.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 260, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                        }, 250, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.075000f, -0.075000f, 0.025000f);
                        }, 250, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                        }, 300, 0))
                        
                .withFirstPersonLeftHandPositioningDrawing(
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                        }, 150, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                        }, 130, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                        }, 200, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
                        }, 130, 60),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.300000f, 0.250000f);
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
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-190.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(140.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.075000f, -0.225000f, -0.300000f);
                        }, 250, 100),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-205.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(140.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.025000f, -0.450000f, -0.225000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(4f, 4f, 4f);
                            GL11.glRotatef(-190.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(140.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.075000f, -0.225000f, -0.300000f);
                        }, 280, 0)
                        )
                 
                .build())
            .withSpawnEntityDamage(7f)
            .withSpawnEntityGravityVelocity(0.0118f)
                    
            .build(ModernWarfareMod.MOD_CONTEXT);
        }
    }

