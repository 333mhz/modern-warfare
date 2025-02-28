// Date: 6/4/2017 8:20:42 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class VSSVintorezAction extends ModelBase
{
  //fields
    ModelRenderer Action1;
    ModelRenderer Action2;
    ModelRenderer Action3;
    ModelRenderer Action4;
    ModelRenderer Action5;
    ModelRenderer Action6;
    ModelRenderer Action7;
  
  public VSSVintorezAction()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Action1 = new ModelRenderer(this, 0, 0);
      Action1.addBox(0F, 0F, 0F, 3, 1, 12);
      Action1.setRotationPoint(-3.68F, -11.2F, -26.5F);
      Action1.setTextureSize(128, 64);
      Action1.mirror = true;
      setRotation(Action1, 0F, 0F, -1.375609F);
      Action2 = new ModelRenderer(this, 0, 0);
      Action2.addBox(0F, 0F, 0F, 2, 1, 1);
      Action2.setRotationPoint(-4.5F, -12.2F, -26.5F);
      Action2.setTextureSize(128, 64);
      Action2.mirror = true;
      setRotation(Action2, 0F, 0F, 0F);
      Action3 = new ModelRenderer(this, 0, 0);
      Action3.addBox(0F, 0F, 0F, 3, 1, 1);
      Action3.setRotationPoint(-6F, -12.2F, -26.3F);
      Action3.setTextureSize(128, 64);
      Action3.mirror = true;
      setRotation(Action3, 0F, 0F, 0F);
      Action4 = new ModelRenderer(this, 0, 0);
      Action4.addBox(0F, 0F, 0F, 1, 1, 1);
      Action4.setRotationPoint(-4.5F, -12.2F, -26.5F);
      Action4.setTextureSize(128, 64);
      Action4.mirror = true;
      setRotation(Action4, 0F, -1.375609F, 0F);
      Action5 = new ModelRenderer(this, 0, 0);
      Action5.addBox(0F, 0F, 0F, 1, 1, 1);
      Action5.setRotationPoint(-6F, -12.2F, -25.3F);
      Action5.setTextureSize(128, 64);
      Action5.mirror = true;
      setRotation(Action5, 0F, 1.98792F, 0F);
      Action6 = new ModelRenderer(this, 0, 0);
      Action6.addBox(0F, 0F, 0F, 1, 1, 1);
      Action6.setRotationPoint(-3.8F, -12.2F, -25.9F);
      Action6.setTextureSize(128, 64);
      Action6.mirror = true;
      setRotation(Action6, 0F, 0F, 0F);
      Action7 = new ModelRenderer(this, 0, 0);
      Action7.addBox(0F, 0F, 0F, 1, 1, 1);
      Action7.setRotationPoint(-3.8F, -12.2F, -24.9F);
      Action7.setTextureSize(128, 64);
      Action7.mirror = true;
      setRotation(Action7, 0F, 2.41661F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Action1.render(f5);
    Action2.render(f5);
    Action3.render(f5);
    Action4.render(f5);
    Action5.render(f5);
    Action6.render(f5);
    Action7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
