// Date: 3/22/2019 12:24:36 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class M6Crearsight extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
  
  public M6Crearsight()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 2, 3, 11);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(128, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 3, 11);
      Shape2.setRotationPoint(4F, 0F, 0F);
      Shape2.setTextureSize(128, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 2, 1, 13);
      Shape3.setRotationPoint(2F, 1F, -1.1F);
      Shape3.setTextureSize(128, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 2, 3, 4);
      Shape4.setRotationPoint(0F, 0F, 11F);
      Shape4.setTextureSize(128, 128);
      Shape4.mirror = true;
      setRotation(Shape4, -0.896934F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 2, 3, 4);
      Shape5.setRotationPoint(4F, 0F, 11F);
      Shape5.setTextureSize(128, 128);
      Shape5.mirror = true;
      setRotation(Shape5, -0.896934F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(0F, 0F, 1.3F, 2, 2, 3);
      Shape6.setRotationPoint(2F, 0F, 11F);
      Shape6.setTextureSize(128, 128);
      Shape6.mirror = true;
      setRotation(Shape6, -0.896934F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 2, 4, 3);
      Shape7.setRotationPoint(4F, 0F, 0F);
      Shape7.setTextureSize(128, 128);
      Shape7.mirror = true;
      setRotation(Shape7, -0.7807508F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 0);
      Shape8.addBox(0F, 0F, 0F, 2, 4, 3);
      Shape8.setRotationPoint(0F, 0F, 0F);
      Shape8.setTextureSize(128, 128);
      Shape8.mirror = true;
      setRotation(Shape8, -0.7807508F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 0);
      Shape9.addBox(0F, 1.4F, 0F, 2, 3, 3);
      Shape9.setRotationPoint(2F, 0F, 0F);
      Shape9.setTextureSize(128, 128);
      Shape9.mirror = true;
      setRotation(Shape9, -0.7807508F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 0, 0);
      Shape10.addBox(0F, 0F, 0F, 4, 2, 11);
      Shape10.setRotationPoint(6F, 0F, 0F);
      Shape10.setTextureSize(128, 128);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 1.189716F);
      Shape11 = new ModelRenderer(this, 0, 0);
      Shape11.addBox(-4F, 0F, 0F, 4, 2, 11);
      Shape11.setRotationPoint(0F, 0F, 0F);
      Shape11.setTextureSize(128, 128);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, -1.189721F);
      Shape12 = new ModelRenderer(this, 0, 50);
      Shape12.addBox(-0.5F, -0.1F, 1F, 1, 1, 1);
      Shape12.setRotationPoint(1F, 0F, 11F);
      Shape12.setTextureSize(128, 128);
      Shape12.mirror = true;
      setRotation(Shape12, -0.896934F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 0, 50);
      Shape13.addBox(-0.5F, -0.1F, 1F, 1, 1, 1);
      Shape13.setRotationPoint(5F, 0F, 11F);
      Shape13.setTextureSize(128, 128);
      Shape13.mirror = true;
      setRotation(Shape13, -0.896934F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
