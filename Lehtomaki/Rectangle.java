package Lehtomaki;

public class Rectangle extends Visibility implements ShapeBasic {
    
    @Override
    public void draw() {

        System.out.println("This is a rectangle");
    }

    @Override
    public void grow() {
        System.out.println("Growing the size of the rectangle");
    }

    @Override
    public String printText() {
        String text = "Rectangle";

        return text;
    }
}
