// Date: 2/11/2017 12:19:38 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ScarHMag extends ModelBase
{
  //fields
    ModelRenderer gun1;
    ModelRenderer gun3;
    ModelRenderer gun4;
    ModelRenderer gun8;
    ModelRenderer gun9;
    ModelRenderer gun11;
    ModelRenderer gun13;
    ModelRenderer gun14;
    ModelRenderer gun15;
    ModelRenderer gun16;
  
  public ScarHMag()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      gun1 = new ModelRenderer(this, 200, 0);
      gun1.addBox(0F, 0F, 0F, 3, 11, 6);
      gun1.setRotationPoint(1F, -12F, -4.5F);
      gun1.setTextureSize(64, 32);
      gun1.mirror = true;
      setRotation(gun1, 0F, 0F, 0F);
      gun3 = new ModelRenderer(this, 200, 0);
      gun3.addBox(0F, 0F, 0F, 1, 12, 2);
      gun3.setRotationPoint(0.8F, -12F, -0.5F);
      gun3.setTextureSize(64, 32);
      gun3.mirror = true;
      setRotation(gun3, 0F, 0F, 0F);
      gun4 = new ModelRenderer(this, 200, 0);
      gun4.addBox(0F, 0F, 0F, 1, 12, 2);
      gun4.setRotationPoint(3.2F, -12F, -0.5F);
      gun4.setTextureSize(64, 32);
      gun4.mirror = true;
      setRotation(gun4, 0F, 0F, 0F);
      gun8 = new ModelRenderer(this, 200, 0);
      gun8.addBox(0F, 0F, 0F, 1, 11, 2);
      gun8.setRotationPoint(3.2F, -12F, -3F);
      gun8.setTextureSize(64, 32);
      gun8.mirror = true;
      setRotation(gun8, 0F, 0F, 0F);
      gun9 = new ModelRenderer(this, 200, 0);
      gun9.addBox(0F, 0F, 0F, 1, 11, 1);
      gun9.setRotationPoint(3.2F, -12F, -4.5F);
      gun9.setTextureSize(64, 32);
      gun9.mirror = true;
      setRotation(gun9, 0F, 0F, 0F);
      gun11 = new ModelRenderer(this, 200, 0);
      gun11.addBox(0F, 0F, 0F, 1, 11, 1);
      gun11.setRotationPoint(0.8F, -12F, -4.5F);
      gun11.setTextureSize(64, 32);
      gun11.mirror = true;
      setRotation(gun11, 0F, 0F, 0F);
      gun13 = new ModelRenderer(this, 200, 0);
      gun13.addBox(0F, 0F, 0F, 1, 11, 2);
      gun13.setRotationPoint(0.8F, -12F, -3F);
      gun13.setTextureSize(64, 32);
      gun13.mirror = true;
      setRotation(gun13, 0F, 0F, 0F);
      gun14 = new ModelRenderer(this, 200, 0);
      gun14.addBox(0F, 0F, 0F, 3, 6, 1);
      gun14.setRotationPoint(1F, -1F, -4.5F);
      gun14.setTextureSize(64, 32);
      gun14.mirror = true;
      setRotation(gun14, 1.412787F, 0F, 0F);
      gun15 = new ModelRenderer(this, 200, 0);
      gun15.addBox(0F, 0F, 0F, 2, 1, 6);
      gun15.setRotationPoint(1.5F, -1F, -4.5F);
      gun15.setTextureSize(64, 32);
      gun15.mirror = true;
      setRotation(gun15, 0F, 0F, 0F);
      gun16 = new ModelRenderer(this, 200, 0);
      gun16.addBox(0F, 0F, 0F, 3, 1, 6);
      gun16.setRotationPoint(1F, 0F, -4.5F);
      gun16.setTextureSize(64, 32);
      gun16.mirror = true;
      setRotation(gun16, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    gun1.render(f5);
    gun3.render(f5);
    gun4.render(f5);
    gun8.render(f5);
    gun9.render(f5);
    gun11.render(f5);
    gun13.render(f5);
    gun14.render(f5);
    gun15.render(f5);
    gun16.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
