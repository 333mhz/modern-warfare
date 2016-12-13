package com.vicmatskiv.mw.items.guns;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.G18;
import com.vicmatskiv.weaponlib.Weapon;
import com.vicmatskiv.weaponlib.WeaponRenderer;
import com.vicmatskiv.weaponlib.WorldHelper;
import com.vicmatskiv.weaponlib.animation.Transition;

public class G18Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		.withModId(ModernWarfareMod.MODID)
		.withName("Glock18")
		.withAmmo(CommonProxy.G18Mag)
		.withAmmoCapacity(20)
		.withFireRate(0.6f)
		.withRecoil(4f)
		.withZoom(0.9f)
		//.withMaxShots(5)
		.withShootSound("G18")
		.withSilencedShootSound("silencer")
		.withReloadSound("PistolReload")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0f)
		.withCreativeTab(ModernWarfareMod.gunsTab)
		/*.withCompatibleAttachment(ModernWarfareMod.ACOG, (model) -> {
			GL11.glTranslatef(0.107F, -1.625F, -0F);
			GL11.glScaled(0.4F, 0.4F, 0.4F);
			})*/
		/*.withCompatibleAttachment(ModernWarfareMod.Grip, (model) -> {
			GL11.glTranslatef(.135F, -0.6F, -1.25F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})*/
		.withCompatibleAttachment(CommonProxy.Laser, (model) -> {
			GL11.glTranslatef(0.01F, -0.7F, -2F);
			GL11.glScaled(1.1F, 1.1F, 1.1F);
			GL11.glRotatef(-90F, 0f, 0f, -4f);
		})
		.withCompatibleAttachment(CommonProxy.Silencer, (model) -> {
			GL11.glTranslatef(-0.25F, -1.15F, -4.61F);
			GL11.glScaled(1.5F, 1.5F, 1.5F);
		})
		.withTextureNames("G18", "Red", "Black", "Desert", "Green", "Blue", "Orange", "Purple", 
				"Cyan", "White", "Arctic", "Electric", "Redline", "M4Cyrex", "Fade", "IceAndFire", "Fade2", "GreenElectric", "Handgun",
				"Creativity", "Dragon", "ASMO", "Vulcan", "GreenVulcan", "GreenVulcan", "Guardian")
		.withRenderer(new WeaponRenderer.Builder()
			.withModId(ModernWarfareMod.MODID)
			.withModel(new G18())
			//.withTextureName("G18")
			//.withWeaponProximity(0.99F)
			//.withYOffsetZoom(5F)
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.4F, 0.4F, 0.4F);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
				GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(0f, 0.8f, 0);
				GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((player, itemStack) -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(-1.8F, -1F, 2F);
				GL11.glRotatef(-45F, 0f, 1f, 0f);
				GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
				
			.withFirstPersonPositioning((player, itemStack) -> {
				GL11.glTranslatef(0.4F, -0.5F, -0.8F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				})
				
			.withFirstPersonPositioningReloading(
					
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0F, -0.3F, -0.4F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					
					GL11.glRotatef(-45F, 1f, 0f, 3f);
					GL11.glTranslatef(0.4F, -1.7F, 0.6F);
				}, 250, 500),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0F, -0.3F, -0.4F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					
					GL11.glRotatef(-45F, 1f, 0f, 3f);
					GL11.glTranslatef(0.4F, -1.7F, 0.6F);
				}, 250, 100),
				
				new Transition((player, itemStack) -> { // Reload position
					GL11.glTranslatef(0.4F, -0.5F, -0.8F);
					GL11.glRotatef(45F, 0f, 1f, 0f);
					GL11.glScaled(0.55F, 0.55F, 0.55F);
					GL11.glTranslatef(-1.1F, -0.76F, 1.5F);
				}, 250, 30)
			) 
				
			.withFirstPersonPositioningZooming((player, itemStack) -> {
				GL11.glTranslatef(0F, -0.3F, -0.2F);
				GL11.glRotatef(45F, 0f, 1f, 0f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);

				// Zoom
				GL11.glTranslatef(0.31F, -1.34f, 1.5f);
				GL11.glScaled(0.55F, 0.55F, 0.55F);
				
			/*	// ACOG Zoom
				if(Weapon.isActiveAttachment(itemStack, ModernWarfareMod.ACOG)) {
					//System.out.println("Position me for Acog");
					GL11.glTranslatef(0F, 0.3f, 1f);
				} */
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Reflex)) {
					//System.out.println("Position me for Reflex");
					GL11.glTranslatef(0F, 0.5f, 0.7f);
				} 

				// Holo Zoom
				if(Weapon.isActiveAttachment(itemStack, CommonProxy.Holo2)) {
					//System.out.println("Position me for Holo");
					GL11.glTranslatef(1.38F, -1.115f, 3.2f);
				} 
				
				// Everything else
				else {
					GL11.glTranslatef(1.373F, -1.34f, 2.4f);
				}
				
			
				})
				
			.withFirstPersonPositioningRunning((player, itemStack) -> {
				GL11.glScaled(0.7F, 0.7F, 0.7F);
				GL11.glRotatef(-20F, -4f, 1f, -2f);
				GL11.glTranslatef(1F, -0.5F, -1.2F);
			 })
			 .withFirstPersonPositioningModifying((player, itemStack) -> {
				 GL11.glScaled(1.2F, 1.2F, 1.2F);
					GL11.glRotatef(-35F, 2f, 1f, 1f);
					GL11.glTranslatef(-1F, 0.1F, 0F);
			 })
			 .withFirstPersonHandPositioning(
					 (player,  itemStack) -> {
						 GL11.glScalef(1.6f, 1.6f, 3f);
						 GL11.glTranslatef(0.6f, 0f, 0.4f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-40f, 1f, 0f, 0f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(2.1f, 2.1f, 2.1f);
						 GL11.glTranslatef(-0.06f, 0.2f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
					 
			.withFirstPersonHandPositioningModifying(
					 (player,  itemStack) -> {
						 GL11.glScalef(2f, 2f, 2f);
						 GL11.glTranslatef(1f, 0.3f, -0.4f);
						 GL11.glRotatef(99f, 0, 0f, 1f);
						 GL11.glRotatef(-20f, 1f, 0f, 0f);
						 GL11.glRotatef(-30f, 0f, 1f, 0f);
					 }, 
					 (player,  itemStack) -> {
						 GL11.glScalef(2.1f, 2.1f, 2.1f);
						 GL11.glTranslatef(-0.06f, 0.2f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					 })
			.withFirstPersonLeftHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.2f, 2.2f);
						 GL11.glTranslatef(0.7f, 0.8f, 0.4f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-100f, 20f, 20f, -20f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.5f, 2.2f, 2.2f);
						 GL11.glTranslatef(0.7f, 0.8f, 0.4f);
						 GL11.glRotatef(110f, 0, 0f, 1f);
						 GL11.glRotatef(-70f, 20f, 20f, -20f);
					}, 50, 200),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(1.6f, 1.6f, 3f);
						 GL11.glTranslatef(0.6f, 0f, 0.4f);
						 GL11.glRotatef(130f, 0, 0f, 1f);
						 GL11.glRotatef(-50f, 1f, 0f, 0f);
					}, 250, 0))
					
			.withFirstPersonRightHandPositioningReloading(
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.1f, 2.1f, 2.1f);
						 GL11.glTranslatef(-0.06f, 0.2f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 1000),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.1f, 2.1f, 2.1f);
						 GL11.glTranslatef(-0.06f, 0.2f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 50),
					
					new Transition((player, itemStack) -> { // Reload position
						GL11.glScalef(2.1f, 2.1f, 2.1f);
						 GL11.glTranslatef(-0.06f, 0.2f, 0.45f);
						 GL11.glRotatef(90f, 0, 0f, 1f);
						 GL11.glRotatef(-95f, 1f, 0f, 0f);
					}, 250, 0))
			.build())
		.withSpawnEntityDamage(5.5f)
		.withSpawnEntityGravityVelocity(0.016f)
		.withSpawnEntityBlockImpactHandler((world, player, entity, position) -> {
			Block block = WorldHelper.getBlockAtPosition(world, position);
			if (WorldHelper.isGlassBlock(block)) {
				WorldHelper.destroyBlock(world, position);
			}
		 })
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}
