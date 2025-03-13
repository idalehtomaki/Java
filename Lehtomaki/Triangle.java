package Lehtomaki;

import static java.lang.Math.sqrt;
import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored {
    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;
    private String color = "No color";

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public Triangle(){} 

    public Triangle(String color) {
        
        this.color = setColor(color);
    }

    public Triangle(double a, double b, double c) {
        if (a >= 3.0) {
            this.a = a;
        }
        if (b >= 3.0) {
            this.b = b;
        }
        if (c >= 3.0) {
            this.c = c;
        }
    }
    
    public Triangle(double a, double b, double c, String color) {
        if (a >= 3.0) {
            this.a = a;
        }
        if (b >= 3.0) {
            this.b = b;
        }
        if (c >= 3.0) {
            this.c = c;
        }

        this.color = setColor(color);
    }


    @Override
    public double calculateArea() {

        double p = (a + b + c) / 2;

        return sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public double calculatePerimeter() {

        return a + b + c; 
    }

    @Override
    public void drawShape() {
       System.out.printf("This is a triangle with area: %s and perimeter: %s. Color: %s\n", df2.format(calculateArea()), df2.format(calculatePerimeter()), color);
    }

    @Override
    public String getColor() {
        if (color.equals("No color")) {
            return "The shape is not colored\n";
        } else {
            return color;
        }
    }
}
