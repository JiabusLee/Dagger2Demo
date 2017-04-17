package com.example.dagger2demo.model;

/**
 * Created by HERO on 2017/4/17.
 */

public class Color {
  private   int colorId;
  private   int color;
  private   String name;


    public Color(int colorId, int color, String name) {
        this.colorId = colorId;
        this.color = color;
        this.name = name;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorId=" + colorId +
                ", color=" + color +
                ", name='" + name + '\'' +
                '}';
    }

}
