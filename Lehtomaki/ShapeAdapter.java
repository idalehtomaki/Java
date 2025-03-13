package Lehtomaki;

public class ShapeAdapter extends Visibility implements ShapeBasic {

    private ShapeSpecial shape;

     //Konstruktori
    public ShapeAdapter(ShapeSpecial shape) {

        this.shape = shape;
    }
    
     @Override
    public void draw () {

        shape.drawShape();
        
    }

    @Override
    public void grow() {

        System.out.println(printText() + ", cannot grow");
        
    }

    @Override
    public String printText() {
        

        if (shape instanceof ShapeDiamond) {
            return "ShapeDiamond";
        } else if (shape instanceof Triangle) {
            return "Triangle";
        } else {
            return "This shape is not supported";
        }
    }
}
