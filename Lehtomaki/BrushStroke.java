package Lehtomaki;

import java.util.Random;

public class BrushStroke extends Visibility implements ShapeBasic, CanBeColored {

    Random rand = new Random();
    private final int thickness;
    private String color = "Yellow";

    public BrushStroke() {
        thickness = rand.nextInt(11);
    }

    @Override
    public void draw() {
        System.out.println("Brush strokes with thickness " + thickness);
    }

    @Override
    public void grow() {
        System.out.println("Adding some color..." + getColor());
    }

    @Override
    public String printText() {
        return "Brush Stroke";
    }

    @Override
    public String setColor(String color) {
        this.color = CanBeColored.super.setColor(color);
        return this.color;
    }

    @Override
    public String getColor() {
        if (color.equals("No color")) {
            return "Out of color...";
        } else {
            return color;
        }
    }

}
