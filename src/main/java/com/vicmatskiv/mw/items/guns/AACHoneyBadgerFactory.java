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
import com.vicmatskiv.mw.models.AACHoneyBadger;
import com.vicmatskiv.mw.models.AACHoneyBadgerSilencer;
import com.vicmatskiv.mw.models.AK47iron;
import com.vicmatskiv.mw.models.AKMiron1;
import com.vicmatskiv.mw.models.AKMiron2;
import com.vicmatskiv.mw.models.AKRail;
import com.vicmatskiv.mw.models.AKRail2;
import com.vicmatskiv.mw.models.AKRail3;
import com.vicmatskiv.mw.models.AKRail4;
import com.vicmatskiv.mw.models.AKRail5;
import com.vicmatskiv.mw.models.AR15CarryHandle;
import com.vicmatskiv.mw.models.ARCarryHandle;
import com.vicmatskiv.mw.models.Acog2;
import com.vicmatskiv.mw.models.AcogReticle;
import com.vicmatskiv.mw.models.AcogScope2;
import com.vicmatskiv.mw.models.EotechScopeRing;
import com.vicmatskiv.mw.models.FALIron;
import com.vicmatskiv.mw.models.G36CIron1;
import com.vicmatskiv.mw.models.G36CIron2;
import com.vicmatskiv.mw.models.G95_upright_frontsights;
import com.vicmatskiv.mw.models.G95_upright_rearsights;
import com.vicmatskiv.mw.models.Holo2;
import com.vicmatskiv.mw.models.Holographic;
import com.vicmatskiv.mw.models.Holographic2;
import com.vicmatskiv.mw.models.JPUreticle;
import com.vicmatskiv.mw.models.Kobra;
import com.vicmatskiv.mw.models.LPscope;
import com.vicmatskiv.mw.models.M14Iron;
import com.vicmatskiv.mw.models.M27rearsight;
import com.vicmatskiv.mw.models.M4A1;
import com.vicmatskiv.mw.models.M4Iron1;
import com.vicmatskiv.mw.models.M4Iron2;
import com.vicmatskiv.mw.models.MBUSFrontSight;
import com.vicmatskiv.mw.models.MBUSRearSight;
import com.vicmatskiv.mw.models.MBUSiron;
import com.vicmatskiv.mw.models.MP5Iron;
import com.vicmatskiv.mw.models.MicroT1;
import com.vicmatskiv.mw.models.P90iron;
import com.vicmatskiv.mw.models.RMRsight;
import com.vicmatskiv.mw.models.Reflex;
import com.vicmatskiv.mw.models.Reflex2;
import com.vicmatskiv.mw.models.ScarIron1;
import com.vicmatskiv.mw.models.ScarIron2;
import com.vicmatskiv.mw.models.SightMount;
import com.vicmatskiv.mw.models.TritiumRearSights;
import com.vicmatskiv.weaponlib.AttachmentCategory;
import com.vicmatskiv.weaponlib.ItemAttachment;
import com.vicmatskiv.weaponlib.PlayerWeaponInstance;
import com.vicmatskiv.weaponlib.RenderContext;
import com.vicmatskiv.weaponlib.RenderableState;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponAttachmentAspect;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.crafting.CraftingComplexity;

public class AACHoneyBadgerFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        .withModId(ModernWarfareMod.MODID)
        .withName("aac_honey_badger")
        .withFireRate(0.80f)
        .withRecoil(3.5f)
        .withZoom(0.9f)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("aac_honeybadger")
        .withSilencedShootSound("aac_honeybadger")
        .withReloadSound("honeybadger_reload")
        .withUnloadSound("honeybadger_unload")
        .withEndOfShootSound("gun_click")
        .withInspectSound("m4a1_inspection")
        .withDrawSound("m4_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.13f)
        .withFlashOffsetY(() -> 0.17f)
//        .withShootSoundVolume(1f)
        .withShellCasingForwardOffset(0.1f)
        .withShellCasingVerticalOffset(-0.05f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Personal Defense Weapon", 
        "Damage: 7.5", 
        "Cartridge: .300 AAC Blackout",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 70/100",
        "Magazines:",
        "30rnd .300 AAC Blackout Honeybadger Magazine"
        ))
        .withCrafting(CraftingComplexity.MEDIUM,
                Ores.GunmetalIngot,
                Ores.PlasticPlate)
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1.5f, // x 
                1.5f, // y
                4f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.SILENCER)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.HoneyBadgerHandguard, true, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.2F, -1.32F, -3.4f);
                GL11.glScaled(0.6F, 0.8F, 0.65F);
          } 
        })
        .withCompatibleAttachment(Attachments.HoneyBadgerMatrixArmsHandguard, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.2F, -1.325F, -3.8f);
                GL11.glScaled(0.6F, 0.8F, 0.6F);
          } else if(model instanceof AKRail2) {
	          	GL11.glTranslatef(0.15F, -1.16F, -3.5f);
	            GL11.glScaled(0.6F, 0.8F, 0.65F);
	            GL11.glRotatef(90F, 0f, 0f, 1f);
          } else if(model instanceof AKRail3) {
        	  GL11.glTranslatef(-0.03F, -0.81F, -4.03F);
              GL11.glScaled(0.6F, 0.6F, 0.88F);
              GL11.glRotatef(180F, 0f, 0f, 1f);
          } 
        })
        .withCompatibleAttachment(Attachments.HoneyBadgerStock, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
	    })
        .withCompatibleAttachment(Attachments.HoneyBadgerStockBlack, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
	    })
        .withCompatibleAttachment(Attachments.HoneyBadgerReceiver, true, (model) -> {
        	if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.2F, -1.32F, -1.82f);
                GL11.glScaled(0.6F, 0.8F, 0.78F);
            } 
	    })
        .withCompatibleAttachment(Attachments.HoneyBadgerReceiverBlack, (model) -> {
        	if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.2F, -1.32F, -1.82f);
                GL11.glScaled(0.6F, 0.8F, 0.78F);
            } 
	    })
        .withCompatibleAttachment(Attachments.HoneyBadgerKnightsReceiver, (model) -> {
        	if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.2F, -1.32F, -1.82f);
                GL11.glScaled(0.6F, 0.8F, 0.78F);
            } 
	    })
        .withCompatibleAttachment(Attachments.HoneyBadgerKnightsReceiverBlack, (model) -> {
        	if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.2F, -1.32F, -1.82f);
                GL11.glScaled(0.6F, 0.8F, 0.78F);
            } 
	    })
        .withCompatibleAttachment(Attachments.M4Grip, true, (model) -> {
          GL11.glTranslatef(0.001f, 0f, 0f);
	    })
	    .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
	    	 GL11.glTranslatef(0.001f, 0f, 0f);
	    })
	    .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
	    	 GL11.glTranslatef(0.001f, 0f, 0f);
	    })
        .withCompatibleAttachment(Magazines.HoneyBadgerMag, (model) -> {
          GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
            GL11.glTranslatef(-0.175F, -1.28F, -0.67F);
            GL11.glScaled(0.7F, 0.4F, 0.7F);
        })
        .withCompatibleAttachment(Attachments.HK416FrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.HoneyBadgerMatrixArmsHandguard) {
                    GL11.glTranslatef(0F, 0F, -0.35F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof G95_upright_frontsights) {
            	GL11.glTranslatef(-0.155F, -1.55F, -2.8F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
              }
        }, false, false)
        
        .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.HoneyBadgerMatrixArmsHandguard) {
                    GL11.glTranslatef(0F, 0F, -0.3F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSFrontSight) {
            	GL11.glTranslatef(-0.16F, -1.5F, -3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
              }
        }, true, false)
        .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
            if(model instanceof TritiumRearSights) {
            	 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                 GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        })
 	   .withCompatibleAttachment(Attachments.HK416RearSights, (model) -> {
            if(model instanceof G95_upright_rearsights) {
         	   GL11.glTranslatef(-0.158F, -1.53F, -0.2F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
            }
        })
 	   .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
            if(model instanceof MBUSRearSight) {
         	   GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        })
 		 .withCompatibleAttachment(Attachments.AKMIron, (model) -> {
             if(model instanceof M4Iron1) {
                 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F); 
             } else if(model instanceof M4Iron2) {
                 GL11.glTranslatef(0.255F, -1.55F, -2.25F);
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
                 GL11.glTranslatef(0.127F, -1.77F, -2.22F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof M14Iron) {
                 GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                 GL11.glScaled(0F, 0F, 0F);
             } else if(model instanceof MP5Iron) {
                 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F); 
             } else if(model instanceof M27rearsight) {
                 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                 GL11.glScaled(0.35F, 0.35F, 0.35F);
             } else if(model instanceof MBUSiron) {
                 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F); 
             }
         })
 		.withCompatibleAttachment(AuxiliaryAttachments.AR15Iron, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(-0.145F, -1.55F, -0.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.055F, -1.35F, -4.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.185F, -1.53F, -4.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ARCarryHandle) {
                GL11.glTranslatef(-0.1425F, -1.533F, -0.12F);
                GL11.glScaled(0.29F, 0.29F, 0.29F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
         .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                     GL11.glTranslatef(-0.21F, -1.4F, -1.8F);
                     GL11.glScaled(0.75F, 0.75F, 0.75F);
         },(model) -> {
             if(model instanceof JPUreticle) {
                 GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                 GL11.glScaled(0.03F, 0.03F, 0.03F);
             }
         })
         
 		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                     GL11.glTranslatef(-0.28F, -1.41F, -0.5F);
                     GL11.glScaled(0.7F, 0.7F, 0.7F);
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
 		
 		.withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                     GL11.glTranslatef(-0.18F, -1.1F, -0.7F);
                     GL11.glScaled(0.4F, 0.4F, 0.4F);
         },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
             }
         })
 		
 		.withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
 		            GL11.glTranslatef(-0.151F, -1.25F, -1.2F);
 		            GL11.glScaled(0.4F, 0.4F, 0.4F);
         },(model) -> {
              if(model instanceof JPUreticle) {
                 GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                 GL11.glScaled(0.04F, 0.04F, 0.04F);
             }
         })
 		
 		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
             GL11.glTranslatef(-0.15F, -1.93F, -1F);
             GL11.glScaled(0.35F, 0.35F, 0.35F);
             },(model) -> {
                 if(model instanceof Reflex2) {
                     GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                     GL11.glScaled(0.15F, 0.15F, 0.15F);
                 } else if (model instanceof SightMount) {
//                 	GL11.glTranslatef(-0.15F, -1.82F, -1F);
//                     GL11.glScaled(0.4F, 0.4F, 0.4F);
                 }
             })
 		
 		.withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                     GL11.glTranslatef(-0.066F, -1.21F, -0.9F);
                     GL11.glScaled(0.45F, 0.45F, 0.45F);
 		},(model) -> {
             if(model instanceof Reflex2) {
 			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                 GL11.glScaled(0.15F, 0.15F, 0.15F);
 			}
 		})
 		.withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                     GL11.glTranslatef(-0.062F, -1.2F, -1F);
                     GL11.glScaled(0.48F, 0.48F, 0.48F);
 		},(model) -> {
         if(model instanceof Reflex2) {
             GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
             GL11.glScaled(0.15F, 0.15F, 0.15F);
         }
 		})
 		
 		.withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                     GL11.glTranslatef(-0.041F, -1.25F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
 			},(model) -> {
 	            if(model instanceof Holo2) {
 	                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
 	                GL11.glScaled(0.1F, 0.1F, 0.1F);
 	            }
 	        })
 		
 		.withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                     GL11.glTranslatef(-0.041F, -1.25F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
         },(model) -> {
             if(model instanceof Holo2) {
                 GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
             }
         })
 		
 		.withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
 			GL11.glTranslatef(-0.041F, -1.25F, -1.3F);
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
                     GL11.glTranslatef(-0.3F, -1.45F, -1.1F);
                     GL11.glScaled(0.45F, 0.45F, 0.45F);
             },(model) -> {
                 if(model instanceof Holo2) {
                     GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                     GL11.glScaled(0.15F, 0.15F, 0.15F);
                 }
             })
 	    
 		.withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                     GL11.glTranslatef(-0.041F, -1.26F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
 		},(model) -> {
             if(model instanceof Reflex2) {
                 GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                 GL11.glScaled(0.15F, 0.15F, 0.15F);
             }
         })
 		
 		.withCompatibleAttachment(Attachments.KobraGen3, renderContext -> {
 		    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
             if(instance != null) {
                 ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                         AttachmentCategory.GUARD, instance);
                 if(activeAttachment == Attachments.AR57Handguard) {
                     GL11.glTranslatef(-0.041F, -1.37F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
                 } else {
                     GL11.glTranslatef(-0.041F, -1.26F, -0.7F);
                     GL11.glScaled(0.65F, 0.65F, 0.65F);
                     }
                 }
 		},(model) -> {
             if(model instanceof Reflex2) {
                 GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                 GL11.glScaled(0.15F, 0.15F, 0.15F);
             }
         }, false, false)
 		
 		.withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                     GL11.glTranslatef(-0.18F, -1.45F, -1F);
                     GL11.glScaled(0.38F, 0.38F, 0.38F);
             },(model) -> {
                 if(model instanceof Reflex2) {
                     GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                     GL11.glScaled(0.15F, 0.15F, 0.15F);
                 }
             })
 		
 		.withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                     GL11.glTranslatef(-0.18F, -1.45F, -1F);
                     GL11.glScaled(0.38F, 0.38F, 0.38F);
         },(model) -> {
             if(model instanceof Reflex2) {
                 GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                 GL11.glScaled(0.15F, 0.15F, 0.15F);
             }
         })
 		.withCompatibleAttachment(Attachments.Grip2, (model) -> {
			GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
            GL11.glTranslatef(-0.23F, -0.7F, -2.81F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
		.withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.35F, -2.9F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.VGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments.Bipod, (model) -> {
			GL11.glTranslatef(-0.18F, -0.33F, -3.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
			GL11.glTranslatef(0.05F, -1.18F, -3.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Laser, (p, s) -> {
			GL11.glTranslatef(0.05F, -1.18F, -3.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
        .withCompatibleAttachment(Attachments.HoneyBadgerSilencer, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.HoneyBadgerMatrixArmsHandguard) {
                    GL11.glTranslatef(0F, 0F, -0.5F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AACHoneyBadgerSilencer) {
//            	GL11.glTranslatef(-0.16F, -1.5F, -3F);
//                GL11.glScaled(0.35F, 0.35F, 0.35F);
              }
        }, true, false)
        .withTextureNames("aachoneybadger")
        .withRenderer(new WeaponRenderer.Builder()
            .withModId(ModernWarfareMod.MODID)
            .withModel(new AACHoneyBadger())
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
                GL11.glRotatef(6F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.30000f, 1.224999f, -0.875000f);
                
//                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
//                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.700000f, 1.174999f, -0.675000f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
            	GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(4F, 0f, 0f, 1f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0.3f, 1.224999f, -0.475000f);
                GL11.glRotatef(1F, 1f, 0f, 0f); 
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
            	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
            	GL11.glRotatef(45F, 0f, 1f, 0f);
            	GL11.glRotatef(5.000000f, 0f, 0f, 1f);
            	GL11.glTranslatef(-0.225000f, 1.050000f, -0.750000f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
            	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
            	GL11.glRotatef(45F, 0f, 1f, 0f);
            	GL11.glRotatef(5.000000f, 0f, 0f, 1f);
            	GL11.glTranslatef(-0.225000f, 1.050000f, -0.450000f);
                GL11.glRotatef(-0.7F, 1f, 0f, 0f);
                })
		
			.withFirstPersonCustomPositioning(AuxiliaryAttachments.AR15Action.getRenderablePart(), (renderContext) -> {
//			    GL11.glTranslatef(0f, 0f, 0.5f);
                })
                
            .withFirstPersonCustomPositioning(Magazines.HoneyBadgerMag, (renderContext) -> {
            	
//                	GL11.glTranslatef(-0.4f, 0.68f, -0.15f);
//               	 GL11.glRotatef(-20F, 0f, 1f, 0f);
//               	 GL11.glRotatef(-10F, 1f, 0f, 0f);
               	 
//                	 GL11.glTranslatef(0.15f, 0.68f, -0.15f);
//                	 GL11.glRotatef(5F, 0f, 1f, 0f);
//                	 GL11.glRotatef(-10F, 1f, 0f, 0f);
//                	 
//                	GL11.glTranslatef(0f, 0.68f, -0.15f);
//               	 GL11.glRotatef(-10F, 1f, 0f, 0f);
            	
//            	GL11.glTranslatef(0f, 2.5f, 0f);
                })
            
            .withFirstPersonCustomPositioning(Magazines.P90Mag, (renderContext) -> {
//           	 GL11.glTranslatef(0.45f, -0.35f, 0f);
//           	 GL11.glRotatef(10F, 1f, 1f, 0f);
               })
				
			.withFirstPersonPositioningReloading(
			        
					// mag is at bottom
					
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.700000f, 1.174999f, -0.675000f);
                    }, 350, 0),
			        
			        //mag touches gun
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-23.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.700000f, 1.104999f, -0.675000f);
                    }, 200, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-23.300000f, 1f, 0f, 0f);
		                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-18.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.700000f, 1.174999f, -0.675000f);
                    }, 100, 0),
			        
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-23.100000f, 1f, 0f, 0f);
		                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-16.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.700000f, 1.174999f, -0.675000f);
                    }, 130, 70),
			        
			        //mag gets pushed in
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.700000f, 0.974999f, -0.675000f);
                    }, 120, 0),
                    
			        new Transition((renderContext) -> { 
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-17.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.700000f, 0.994999f, -0.675000f);
                    }, 50, 0),
                
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-13.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.700000f, 1.024999f, -0.675000f);
                    }, 70, 0),
			        
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
		                GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
		                GL11.glRotatef(40.000000f, 0f, 1f, 0f);
		                GL11.glRotatef(-14.000000f, 0f, 0f, 1f);
		                GL11.glTranslatef(-0.700000f, 1.074999f, -0.675000f);
                    }, 120, 0),
                    
                    // left hand goes left
                    
                    new Transition((renderContext) -> {
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(6F, 0f, 0f, 1f);
                         GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                         GL11.glTranslatef(-0.30000f, 1.224999f, -0.875000f);
                    }, 250, 0),
                    
                    // left hand hits button thingy thing
                    
                    new Transition((renderContext) -> {
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(2F, 0f, 0f, 1f);
                         GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                         GL11.glTranslatef(-0.5200f, 1.224999f, -0.875000f);
                    }, 80, 0),
                    new Transition((renderContext) -> {
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(5F, 0f, 0f, 1f);
                         GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                         GL11.glTranslatef(-0.44000f, 1.224999f, -0.875000f);
                    }, 50, 0),
                    new Transition((renderContext) -> {
                    	 GL11.glRotatef(45F, 0f, 1f, 0f);
                         GL11.glRotatef(3F, 0f, 0f, 1f);
                         GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                         GL11.glTranslatef(-0.43000f, 1.224999f, -0.875000f);
                    }, 70, 0)
			        )
			        
			.withFirstPersonPositioningUnloading(
			        
			        new Transition((renderContext) -> {
				        	GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
			                GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
			                GL11.glRotatef(30.000000f, 0f, 1f, 0f);
			                GL11.glRotatef(40.000000f, 0f, 0f, 1f);
			                GL11.glTranslatef(0.025000f, 1.549999f, -0.825000f);
                    }, 200, 0),
			        new Transition((renderContext) -> {
                        	 GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        	 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                        	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
                        	 GL11.glRotatef(70.000000f, 0f, 0f, 1f);
                        	 GL11.glTranslatef(0.300000f, 1.874999f, -0.825000f);
                    }, 140, 0),
			        new Transition((renderContext) -> {
	                   	 GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                   	 GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(64.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.300000f, 1.884999f, -0.825000f);
	               }, 60, 0),
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
	                   	 GL11.glRotatef(-8.000000f, 1f, 0f, 0f);
	                   	 GL11.glRotatef(40.000000f, 0f, 1f, 0f);
	                   	 GL11.glRotatef(65.000000f, 0f, 0f, 1f);
	                   	 GL11.glTranslatef(0.30000f, 1.804999f, -0.825000f);
                    }, 80, 0)
                    )
			
            .withFirstPersonCustomPositioningReloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
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
                    GL11.glTranslatef(0F, 0F, 0F);
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
            .withFirstPersonCustomPositioningUnloading(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000),
                new Transition((renderContext) -> {
                }, 250, 1000)
                    )
                    
			.withFirstPersonCustomPositioningReloading(Magazines.HoneyBadgerMag,
					new Transition((renderContext) -> {
						GL11.glTranslatef(0f, 2.5f, 0f);
                    }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(-0.4f, 0.68f, -0.15f);
               	 GL11.glRotatef(-20F, 0f, 1f, 0f);
               	 GL11.glRotatef(-10F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	 GL11.glTranslatef(0.15f, 0.68f, -0.15f);
                	 GL11.glRotatef(5F, 0f, 1f, 0f);
                	 GL11.glRotatef(-10F, 1f, 0f, 0f);
                }, 250, 1000),
                new Transition((renderContext) -> {
                	GL11.glTranslatef(0f, 0.68f, -0.15f);
//               	 GL11.glRotatef(5F, 0f, 1f, 0f);
               	 GL11.glRotatef(-10F, 1f, 0f, 0f);
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
                    
            .withFirstPersonCustomPositioningUnloading(Magazines.HoneyBadgerMag,
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    	GL11.glTranslatef(0.3F, 1.7F, 0.1F);
                        GL11.glRotatef(-30F, 0f, 0f, 1f);
                      }, 250, 1000),
                      new Transition((renderContext) -> {
                    		GL11.glTranslatef(0f, 2.5f, 0f);
                    }, 250, 1000),
                      new Transition((renderContext) -> {
                    		GL11.glTranslatef(0f, 2.5f, 0f);
                    }, 250, 1000)
                    )
					
		    .withFirstPersonPositioningInspecting(
                    new Transition((renderContext) -> {
                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                        GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.8f, 0.8f, -0.5f);
                    }, 300, 600),
                  new Transition((renderContext) -> {
                      GL11.glRotatef(50F, 0f, 1f, 0f);
                      GL11.glRotatef(60F, 0f, 0f, 1f);
                      GL11.glRotatef(-11F, 1f, 0f, 0f);
                      GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                      GL11.glTranslatef(0.4f, 1.2f, -0.8f);
                  }, 350, 600),
                  new Transition((renderContext) -> {
                      GL11.glRotatef(50F, 0f, 1f, 0f);
                      GL11.glRotatef(60F, 0f, 0f, 1f);
                      GL11.glRotatef(-12F, 1f, 0f, 0f);
                      GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                      GL11.glTranslatef(0.4f, 1.2f, -0.8f);
                  }, 300, 0),
                new Transition((renderContext) -> {
                    GL11.glRotatef(50F, 0f, 1f, 0f);
                    GL11.glRotatef(60F, 0f, 0f, 1f);
                    GL11.glRotatef(-12F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(0.4f, 1.2f, -0.75f);
                }, 450, 400),
                new Transition((renderContext) -> {
                    GL11.glRotatef(50F, 0f, 1f, 0f);
                    GL11.glRotatef(60F, 0f, 0f, 1f);
                    GL11.glRotatef(-11F, 1f, 0f, 0f);
                    GL11.glScalef(4.000000f, 4.000000f, 4.000000f);
                    GL11.glTranslatef(0.4f, 1.2f, -0.8f);
                }, 350, 200)
                    )
                    
            .withFirstPersonCustomPositioningInspecting(AuxiliaryAttachments.AR15Action.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 300, 600),
                  new Transition((renderContext) -> {
                  }, 350, 600),
                  new Transition((renderContext) -> {
                  }, 300, 0),
                new Transition((renderContext) -> {
                    GL11.glTranslatef(0F, 0F, 0.4F);
                }, 450, 400),
                new Transition((renderContext) -> {
                }, 350, 0)
                    )
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 180, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 100),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 170),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 10),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 100, 50)
                    )
                    
                    
            .withFirstPersonPositioningDrawing(
            		new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(42.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.449999f, -0.425000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.200000f, 1.449999f, -0.425000f);
                    }, 100, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 1.249999f, -0.650000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(14.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 1.249999f, -0.58f);
                    }, 170, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                        GL11.glRotatef(15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(27.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, 1.249999f, -0.650000f);
                    }, 170, 0)
                    )
                    
            .withFirstPersonCustomPositioningDrawing(AuxiliaryAttachments.AR15Action.getRenderablePart(),
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
				GL11.glTranslatef(0.35f, 0.995f, 0f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), AuxiliaryAttachments.AR15Iron)) {
                        GL11.glTranslatef(0F, 0.028f, -0.3f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                        GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	GL11.glTranslatef(0F, 0.025f, 0f);
                } 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                        GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                        GL11.glTranslatef(-0.01F, 0.03f, 0.3f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                        GL11.glTranslatef(-0.003F, -0.05f, 0.2f);
                } 

				// HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        GL11.glTranslatef(0.001F, -0.027f, -0.2f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, -0.015f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        GL11.glTranslatef(0F, -0.01f, 0f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    	GL11.glTranslatef(0F, 0.03f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	GL11.glTranslatef(-0.004F, 0.025f, 0.25f);
                } 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        GL11.glTranslatef(0F, 0.06f, 0f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        GL11.glTranslatef(0F, 0.055f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                        GL11.glTranslatef(0F, 0.055f, 0.3f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
			.withFirstPersonPositioningZoomingRecoiled((renderContext) -> {
			    GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.35f, 0.995f, 0.2f);
//                GL11.glRotatef(-0.5F, 1, 0, 0);
                
             // Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), AuxiliaryAttachments.AR15Iron)) {
                        GL11.glTranslatef(0F, 0.027f, -0.3f);
				} 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                	GL11.glTranslatef(0F, 0.025f, -0.1f);
                } 
                
             // Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                        GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
                
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
                
             // Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                        GL11.glTranslatef(0F, 0f, 0f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    	GL11.glTranslatef(-0.01F, 0.03f, 0.15f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    	GL11.glTranslatef(-0.003F, -0.05f, 0.1f);
                } 

             // HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                        GL11.glTranslatef(0.001F, -0.027f, -0.35f);
				} 
                
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                        GL11.glTranslatef(0F, -0.015f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                        GL11.glTranslatef(0F, -0.01f, 0f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    	GL11.glTranslatef(0F, 0.03f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	GL11.glTranslatef(-0.004F, 0.025f, 0.15f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                        GL11.glTranslatef(0F, 0.06f, 0f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                        GL11.glTranslatef(0F, 0.055f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                        GL11.glTranslatef(0F, 0.055f, 0.3f);
                } 
				
				// Everything else
				else {
				}
				
			
				})
				
				
			.withFirstPersonPositioningRunning((renderContext) -> {
//			    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//			    GL11.glRotatef(15.000000f, 1f, 0f, 0f);
//			    GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//			    GL11.glRotatef(35.000000f, 0f, 0f, 1f);
//			    GL11.glTranslatef(-0.050000f, 1.299999f, -0.800000f);
			    
			    GL11.glRotatef(35F, 0f, 1f, 0f);
                GL11.glRotatef(20F, 0f, 0f, 1f);
                GL11.glRotatef(10F, 1f, 0f, 0f);
                GL11.glScalef(3.00000f, 3.00000f, 3.00000f);
                GL11.glTranslatef(-0f, 1.35f, -0.55f);
			 })
			 .withFirstPersonPositioningModifying((renderContext) -> {
			     GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-0.725000f, 0.700000f, -0.700000f);
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                 GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                 GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                 GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                 GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                 GL11.glTranslatef(-1.800000f, 0.50000f, -0.400000f);
             })
			 
			 .withFirstPersonHandPositioning(
			         (renderContext) -> {
                         RenderContext<?> rc = (RenderContext<?>) renderContext;
                         ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                 AttachmentCategory.GRIP, rc.getWeaponInstance());
                         if(activeAttachment == Attachments.Grip2 ||
                                activeAttachment == Attachments.StubbyGrip || 
                                activeAttachment == Attachments.VGrip) {
                             GL11.glScalef(3f, 3f, 3f);
                             GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.175000f, -0.050000f, 0.175000f);
                         } else if(activeAttachment == Attachments.AngledGrip) {
                             GL11.glScalef(3f, 3f, 3f);
                             GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.275000f, 0.025000f, 0.125000f);
                         } else if(activeAttachment == Attachments.JunoGrip) {
                             GL11.glScalef(3f, 3f, 3f);
                             GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.275000f, -0.150000f, 0.350000f);
                         } else if(activeAttachment == Attachments.Bipod) {
                             GL11.glScalef(3f, 3f, 3f);
                             GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.150000f, -0.075000f, 0.200000f);
                         } else {
                             GL11.glScalef(3.5f, 3.5f, 3.5f);
                             GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                             GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                             GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                             GL11.glTranslatef(0.350000f, -0.200000f, 0.150000f);
                             
//                             GL11.glScalef(3.5f, 3.5f, 3.5f);
                         }
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                         
//                         GL11.glScalef(4f, 4f, 4f);
                     })
                     
            .withFirstPersonHandPositioningProning(
            		(renderContext) -> {
                        RenderContext<?> rc = (RenderContext<?>) renderContext;
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GRIP, rc.getWeaponInstance());
                        if(activeAttachment == Attachments.Grip2 ||
                               activeAttachment == Attachments.StubbyGrip || 
                               activeAttachment == Attachments.VGrip) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.175000f, -0.050000f, 0.175000f);
                        } else if(activeAttachment == Attachments.AngledGrip) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-50.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, 0.025000f, 0.125000f);
                        } else if(activeAttachment == Attachments.JunoGrip) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.275000f, -0.150000f, 0.350000f);
                        } else if(activeAttachment == Attachments.Bipod) {
                            GL11.glScalef(3f, 3f, 3f);
                            GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-25.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.150000f, -0.075000f, 0.200000f);
                        } else {
//                            GL11.glScalef(3.5f, 3.5f, 3.5f);
//                            GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(60.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.375000f, -0.350000f, 0.025000f);
                            
                            GL11.glScalef(3.5f, 3.5f, 3.5f);
                        }
                    }, 
                    (renderContext) -> {
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                        
//                        GL11.glScalef(4f, 4f, 4f);
                    })
					 
			.withFirstPersonHandPositioningModifying(
                     (renderContext) -> {
                         GL11.glScalef(3f, 3f, 3f);
                         GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.475000f, -0.500000f, 0.150000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 5f);
                         GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                     })
                     
            .withFirstPersonHandPositioningModifyingAlt(
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(125.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.350000f, -0.50000f, -0.160000f);
                     }, 
                     (renderContext) -> {
                         GL11.glScalef(4f, 4f, 4f);
                         GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                         GL11.glRotatef(25.000000f, 0f, 1f, 0f);
                         GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                         GL11.glTranslatef(0.31000f, -0.550000f, 0.100000f);
                     })
					 
			.withFirstPersonLeftHandPositioningReloading(
			        
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-75.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.600000f, -0.300000f, 0.025000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
			        	 GL11.glScalef(3.5f, 3.5f, 3.5f);
			        	 GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
			        	 GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
			        	 GL11.glRotatef(30.000000f, 0f, 0f, 1f);
			        	 GL11.glTranslatef(0.275000f, -0.375000f, 0.125000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-55.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.275000f, -0.375000f, 0.075000f);
			        }, 50, 200),
			        new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                    	GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-70.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.250000f, -0.375000f, 0.050000f);
			        }, 50, 200),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
			        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.150000f, -0.425000f, 0.075000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
                        	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
    			        	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
    			        	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
    			        	GL11.glTranslatef(0.150000f, -0.425000f, 0.075000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
			        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.150000f, -0.425000f, 0.075000f);
					}, 50, 200),
			        new Transition((renderContext) -> {
			        	GL11.glScalef(3.5f, 3.5f, 3.5f);
			        	GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
			        	GL11.glRotatef(-65.000000f, 0f, 1f, 0f);
			        	GL11.glRotatef(35.000000f, 0f, 0f, 1f);
			        	GL11.glTranslatef(0.150000f, -0.425000f, 0.075000f);
                    }, 50, 200),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-40.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.700000f, -0.175000f);
					}, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
						GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
						GL11.glRotatef(40.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.100000f, -0.650000f, 0.200000f);
                    }, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
						GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
						GL11.glRotatef(40.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.100000f, -0.650000f, 0.200000f);
					}, 250, 0),
					new Transition((renderContext) -> {
						GL11.glScalef(3.5f, 3.5f, 3.5f);
						GL11.glRotatef(-120.000000f, 1f, 0f, 0f);
						GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
						GL11.glRotatef(40.000000f, 0f, 0f, 1f);
						GL11.glTranslatef(-0.100000f, -0.650000f, 0.200000f);
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
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
					}, 250, 0),
					new Transition((renderContext) -> { // Reload position
					    GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 0))
                    
            .withFirstPersonLeftHandPositioningUnloading(
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glTranslatef(0.225000f, -0.100000f, 0.475000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glTranslatef(0.225000f, -0.100000f, 0.475000f);
                    }, 50, 200),
                    new Transition((renderContext) -> {
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glTranslatef(0.225000f, -0.100000f, 0.475000f);
                }, 50, 200),
                    new Transition((renderContext) -> { // Reload position
                    	GL11.glScalef(3.5f, 3.5f, 3.5f);
                        GL11.glTranslatef(0.225000f, -0.100000f, 0.475000f);
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
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50))
                    
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
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.725000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.425000f, -0.775000f, -0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(60.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.350000f, -0.725000f, 0.000000f);
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
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 5f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
                    }, 250, 50)
                    )
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.325000f, -0.150000f, 0.375000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0))
                    
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
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.000000f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(35.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.500000f, -0.575000f, -0.025000f);
                    }, 130, 60),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(4f, 4f, 4f);
                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(30.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-70.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.375000f, -0.500000f, 0.000000f);
                    }, 110, 0)
                    )
					
			.build())
		.withSpawnEntityDamage(7.5f)
		.withSpawnEntityGravityVelocity(0.0118f)
				
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}