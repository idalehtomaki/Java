package Lehtomaki;

import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored {
    
    private double a = 2.0;
    private double b = 2.0;
    private String color = "No color";

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public ShapeDiamond(){} 

    public ShapeDiamond(String color) {
        
        this.color = setColor(color);
    }

    public ShapeDiamond(double a, double b) {
        if (a >= 2.0) {
            this.a = a;
        }
        if (b >= 2.0) {
            this.b = b;
        }
    }
    
    public ShapeDiamond(double a, double b, String color) {
        if (a >= 2.0) {
            this.a = a;
        }
        if (b >= 2.0) {
            this.b = b;
        }
        this.color = setColor(color);
    }


    @Override
    public double calculateArea() {

        return a * b;
    }

    @Override
    public double calculatePerimeter() {

        return a + a + b + b; 
    }

    @Override
    public void drawShape() {
       System.out.printf("This is a diamond shape with area: %s and perimeter: %s. Color: %s\n", df2.format(calculateArea()), df2.format(calculatePerimeter()), getColor());
    }

    @Override
    public String getColor() {
        if (color.equals("No color")) {
            return "The shape is not colored\n";
        } else {
            return color;
        }
    }

    public static DecimalFormat getDf2() {
        return df2;
    }

    public static void setDf2(DecimalFormat df2) {
        ShapeDiamond.df2 = df2;
    }

}
