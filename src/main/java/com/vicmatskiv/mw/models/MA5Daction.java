// Date: 3/11/2018 6:19:56 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MA5Daction extends ModelBase
{
  //fields
    ModelRenderer action1;
    ModelRenderer action2;
    ModelRenderer action3;
    ModelRenderer action4;
    ModelRenderer action5;
    ModelRenderer action6;
    ModelRenderer action7;
    ModelRenderer action8;
  
  public MA5Daction()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      
      action1 = new ModelRenderer(this, 0, 0);
      action1.addBox(0F, 0F, 0F, 1, 1, 12);
      action1.setRotationPoint(0.1F, -16.7F, -10.2F);
      action1.setTextureSize(64, 32);
      action1.mirror = true;
      setRotation(action1, 0F, 0F, 0.7853982F);
      action2 = new ModelRenderer(this, 0, 0);
      action2.addBox(0F, 0F, 0F, 1, 1, 12);
      action2.setRotationPoint(0.2F, -16.6F, -10.2F);
      action2.setTextureSize(64, 32);
      action2.mirror = true;
      setRotation(action2, 0F, 0F, 0.7853982F);
      action3 = new ModelRenderer(this, 0, 0);
      action3.addBox(0F, 0F, 0F, 1, 1, 12);
      action3.setRotationPoint(-3.1F, -16.7F, -10.2F);
      action3.setTextureSize(64, 32);
      action3.mirror = true;
      setRotation(action3, 0F, 0F, 0.7853982F);
      action4 = new ModelRenderer(this, 0, 0);
      action4.addBox(0F, 0F, 0F, 1, 1, 12);
      action4.setRotationPoint(-3.2F, -16.6F, -10.2F);
      action4.setTextureSize(64, 32);
      action4.mirror = true;
      setRotation(action4, 0F, 0F, 0.7853982F);
      action5 = new ModelRenderer(this, 0, 0);
      action5.addBox(0F, 0F, 0F, 1, 2, 1);
      action5.setRotationPoint(0.6F, -17.6F, -9.2F);
      action5.setTextureSize(64, 32);
      action5.mirror = true;
      setRotation(action5, 0F, 0F, 0.4507907F);
      action6 = new ModelRenderer(this, 0, 0);
      action6.addBox(0F, 0F, 0F, 3, 1, 1);
      action6.setRotationPoint(0.6F, -17.6F, -9.2F);
      action6.setTextureSize(64, 32);
      action6.mirror = true;
      setRotation(action6, 0F, 0F, -0.255603F);
      action7 = new ModelRenderer(this, 0, 0);
      action7.addBox(0F, 0F, 0F, 2, 1, 1);
      action7.setRotationPoint(2F, -18.2F, -9.7F);
      action7.setTextureSize(64, 32);
      action7.mirror = true;
      setRotation(action7, 0F, 0F, -0.255603F);
      action8 = new ModelRenderer(this, 0, 0);
      action8.addBox(0F, 0F, 0F, 2, 1, 1);
      action8.setRotationPoint(2.15F, -17.75F, -9.7F);
      action8.setTextureSize(64, 32);
      action8.mirror = true;
      setRotation(action8, 0F, 0F, -0.255603F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    action1.render(f5);
    action2.render(f5);
    action3.render(f5);
    action4.render(f5);
    action5.render(f5);
    action6.render(f5);
    action7.render(f5);
    action8.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
