package com.softserve.edu.hw11.pt2;

public class Plant {



  private int size;
  private ColorException.Color colorExc;
  private TypeException.Type typeExc;

  public ColorException.Color getColorExc() {
    return colorExc;
  }

  public void setColorExc(ColorException.Color colorExc) {
    this.colorExc = colorExc;
  }

  public TypeException.Type getTypeExc() {
    return typeExc;
  }

  public void setTypeExc(TypeException.Type typeExc) {
    this.typeExc = typeExc;
  }

  public int getSize() { return size; }

  public Plant(int size, ColorException.Color colorExc, TypeException.Type typeExc) {
    this.size = size;
    this.colorExc = colorExc;
    this.typeExc = typeExc;
  }

  @Override
  public String toString() {
    return "\nPlant { " +
            "size=" + size +
            ",    color=" + colorExc +
            ",    type=" + typeExc +
            " }";
  }


}