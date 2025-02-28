// Date: 5/3/2017 12:38:15 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

public class G36Action extends ModelBase
{
  //fields
    ModelRenderer gun93;
    ModelRenderer gun376;
    ModelRenderer gun377;
    ModelRenderer gun378;
    ModelRenderer gun379;
    ModelRenderer gun380;
    ModelRenderer gun381;
  
  public G36Action()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      gun93 = new ModelRenderer(this, 0, 0);
      gun93.addBox(0F, 0F, 0F, 1, 2, 13);
      gun93.setRotationPoint(-3.3F, -15.7F, -28F);
      gun93.setTextureSize(64, 32);
      gun93.mirror = true;
      setRotation(gun93, 0F, 0F, 0F);
      gun376 = new ModelRenderer(this, 0, 0);
      gun376.addBox(0F, 0F, 0F, 2, 2, 12);
      gun376.setRotationPoint(-2.5F, -20F, -27F);
      gun376.setTextureSize(64, 32);
      gun376.mirror = true;
      setRotation(gun376, 0F, 0F, 0F);
      gun377 = new ModelRenderer(this, 0, 0);
      gun377.addBox(0F, 0F, 0F, 2, 2, 5);
      gun377.setRotationPoint(-2.5F, -19.7F, -32F);
      gun377.setTextureSize(64, 32);
      gun377.mirror = true;
      setRotation(gun377, 0F, 0F, 0F);
      gun378 = new ModelRenderer(this, 0, 0);
      gun378.addBox(0F, 0F, 0F, 2, 1, 1);
      gun378.setRotationPoint(-2.5F, -20F, -27F);
      gun378.setTextureSize(64, 32);
      gun378.mirror = true;
      setRotation(gun378, -0.8551081F, 0F, 0F);
      gun379 = new ModelRenderer(this, 0, 0);
      gun379.addBox(0F, 0F, 0F, 1, 1, 7);
      gun379.setRotationPoint(-2.3F, -19.8F, -38.8F);
      gun379.setTextureSize(64, 32);
      gun379.mirror = true;
      setRotation(gun379, -0.0261799F, 0F, 0F);
      gun380 = new ModelRenderer(this, 0, 0);
      gun380.addBox(0F, 0F, 0F, 1, 1, 7);
      gun380.setRotationPoint(-1.7F, -19.8F, -38.8F);
      gun380.setTextureSize(64, 32);
      gun380.mirror = true;
      setRotation(gun380, -0.0261799F, 0F, 0F);
      gun381 = new ModelRenderer(this, 0, 0);
      gun381.addBox(0F, 0F, 0F, 2, 1, 2);
      gun381.setRotationPoint(-2.5F, -19.1F, -34F);
      gun381.setTextureSize(64, 32);
      gun381.mirror = true;
      setRotation(gun381, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    gun93.render(f5);
    gun376.render(f5);
    gun377.render(f5);
    gun378.render(f5);
    gun379.render(f5);
    gun380.render(f5);
    gun381.render(f5);
 }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
