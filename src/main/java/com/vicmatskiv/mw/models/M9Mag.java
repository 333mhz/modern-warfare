// Date: 1/8/2017 12:11:46 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class M9Mag extends ModelBase
{
  //fields
    ModelRenderer gun1;
    ModelRenderer gun2;
    ModelRenderer gun4;
    ModelRenderer gun5;
    ModelRenderer gun7;
    ModelRenderer gun10;
    ModelRenderer gun11;
    ModelRenderer gun12;
    ModelRenderer gun13;
    ModelRenderer gun14;
    ModelRenderer gun15;
    ModelRenderer gun16;
    ModelRenderer gun17;
    ModelRenderer gun18;
    ModelRenderer gun19;
  
  public M9Mag()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      gun1 = new ModelRenderer(this, 0, 0);
      gun1.addBox(0F, 0F, 0F, 4, 2, 6);
      gun1.setRotationPoint(-3.5F, 5.5F, -5.2F);
      gun1.setTextureSize(64, 32);
      gun1.mirror = true;
      setRotation(gun1, 0F, 0F, 0F);
      gun2 = new ModelRenderer(this, 0, 0);
      gun2.addBox(0F, 0F, 0F, 3, 13, 1);
      gun2.setRotationPoint(-3.3F, -6F, -7F);
      gun2.setTextureSize(64, 32);
      gun2.mirror = true;
      setRotation(gun2, 0.2230717F, 0F, 0F);
      gun4 = new ModelRenderer(this, 0, 0);
      gun4.addBox(0F, 0F, 0F, 3, 1, 1);
      gun4.setRotationPoint(-3.3F, 5.5F, -2.5F);
      gun4.setTextureSize(64, 32);
      gun4.mirror = true;
      setRotation(gun4, 0F, 0F, 0F);
      gun5 = new ModelRenderer(this, 0, 0);
      gun5.addBox(0F, 0F, 0F, 1, 13, 1);
      gun5.setRotationPoint(-0.7F, -6F, -7F);
      gun5.setTextureSize(64, 32);
      gun5.mirror = true;
      setRotation(gun5, 0.2230717F, 0F, 0F);
      gun7 = new ModelRenderer(this, 0, 0);
      gun7.addBox(0F, 0F, 0F, 1, 1, 1);
      gun7.setRotationPoint(-0.7F, 5.5F, -2.5F);
      gun7.setTextureSize(64, 32);
      gun7.mirror = true;
      setRotation(gun7, 0F, 0F, 0F);
      gun10 = new ModelRenderer(this, 0, 0);
      gun10.addBox(0F, 0F, 0F, 3, 1, 2);
      gun10.setRotationPoint(-3F, -6.5F, -7F);
      gun10.setTextureSize(64, 32);
      gun10.mirror = true;
      setRotation(gun10, 0.2974289F, 0F, 0F);
      gun11 = new ModelRenderer(this, 0, 0);
      gun11.addBox(0F, 0F, 0F, 3, 1, 4);
      gun11.setRotationPoint(-3F, -7.5F, -7F);
      gun11.setTextureSize(64, 32);
      gun11.mirror = true;
      setRotation(gun11, 0F, 0F, 0F);
      gun12 = new ModelRenderer(this, 0, 0);
      gun12.addBox(0F, 0F, 0F, 1, 2, 3);
      gun12.setRotationPoint(-0.7F, -7.6F, -5.2F);
      gun12.setTextureSize(64, 32);
      gun12.mirror = true;
      setRotation(gun12, 0F, 0F, 0F);
      gun13 = new ModelRenderer(this, 0, 0);
      gun13.addBox(0F, 0F, 0F, 3, 2, 3);
      gun13.setRotationPoint(-3.3F, -7.6F, -5.2F);
      gun13.setTextureSize(64, 32);
      gun13.mirror = true;
      setRotation(gun13, 0F, 0F, 0F);
      gun14 = new ModelRenderer(this, 0, 0);
      gun14.addBox(0F, 0F, 0F, 3, 13, 3);
      gun14.setRotationPoint(-3.3F, -6.5F, -5.1F);
      gun14.setTextureSize(64, 32);
      gun14.mirror = true;
      setRotation(gun14, 0.2230717F, 0F, 0F);
      gun15 = new ModelRenderer(this, 0, 0);
      gun15.addBox(0F, 0F, 0F, 1, 13, 3);
      gun15.setRotationPoint(-0.7F, -6.5F, -5.1F);
      gun15.setTextureSize(64, 32);
      gun15.mirror = true;
      setRotation(gun15, 0.2230717F, 0F, 0F);
      gun16 = new ModelRenderer(this, 0, 0);
      gun16.addBox(0F, 0F, 0F, 1, 9, 2);
      gun16.setRotationPoint(-0.7F, -2F, -5.5F);
      gun16.setTextureSize(64, 32);
      gun16.mirror = true;
      setRotation(gun16, 0.2230717F, 0F, 0F);
      gun17 = new ModelRenderer(this, 0, 0);
      gun17.addBox(0F, 0F, 0F, 1, 9, 2);
      gun17.setRotationPoint(-3.3F, -2F, -5.5F);
      gun17.setTextureSize(64, 32);
      gun17.mirror = true;
      setRotation(gun17, 0.2230717F, 0F, 0F);
      gun18 = new ModelRenderer(this, 0, 0);
      gun18.addBox(0F, 0F, 0F, 1, 13, 2);
      gun18.setRotationPoint(-3.1F, -6F, -6.5F);
      gun18.setTextureSize(64, 32);
      gun18.mirror = true;
      setRotation(gun18, 0.2230717F, 0F, 0F);
      gun19 = new ModelRenderer(this, 0, 0);
      gun19.addBox(0F, 0F, 0F, 1, 13, 2);
      gun19.setRotationPoint(-0.9F, -6F, -6.5F);
      gun19.setTextureSize(64, 32);
      gun19.mirror = true;
      setRotation(gun19, 0.2230717F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    gun1.render(f5);
    gun2.render(f5);
    gun4.render(f5);
    gun5.render(f5);
    gun7.render(f5);
    gun10.render(f5);
    gun11.render(f5);
    gun12.render(f5);
    gun13.render(f5);
    gun14.render(f5);
    gun15.render(f5);
    gun16.render(f5);
    gun17.render(f5);
    gun18.render(f5);
    gun19.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
