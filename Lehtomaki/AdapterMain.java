package Lehtomaki;

public class AdapterMain {


    public static void main(String[] args) {

        ShapeDrawer myShapeDrawer = new ShapeDrawer();

        // 1. adding rectangle that is visible
        Rectangle myRectangle1 = new Rectangle();
        myShapeDrawer.addBasicShape(myRectangle1);

        // 2. adding rectangle background
        Rectangle myRectangle2 = new Rectangle();
        myRectangle2.changeVisibility();
        myShapeDrawer.addBasicShape(myRectangle2);

        // 3. Add visible circle
        Circle myCircle1 = new Circle();
        myShapeDrawer.addBasicShape(myCircle1);

        // 4. add circle in background
        Circle myCircle2 = new Circle();
        myCircle2.changeVisibility();
        myShapeDrawer.addBasicShape(myCircle2);

        // 5. add visible rectangle
        Rectangle myRectangle3 = new Rectangle();
        myShapeDrawer.addBasicShape(myRectangle3);

        // 6. add visible triangle color: "Other color"
        Triangle myTriangle1 = new Triangle("Other color");
        myShapeDrawer.addBasicShape(new ShapeAdapter(myTriangle1));

        // 7. add visible diamond shape with color "PURPLE"
        ShapeDiamond myShapeDiamond1 = new ShapeDiamond("PURPLE");
        myShapeDrawer.addBasicShape(new ShapeAdapter(myShapeDiamond1));

        // 8. add diamond shape in background, color: "somethingElse"
        ShapeDiamond myShapeDiamond2 = new ShapeDiamond("SomethingElse");
        ShapeAdapter diamondAdapter2 = new ShapeAdapter(myShapeDiamond2);
        diamondAdapter2.changeVisibility();
        myShapeDrawer.addBasicShape(diamondAdapter2);

        // 9. add diamond shape (4.0, 4.0), in background, color: "Yellow"
        ShapeDiamond myShapeDiamond3 = new ShapeDiamond(4.0, 4.0, "Yellow");
        ShapeAdapter diamondAdapter3 = new ShapeAdapter(myShapeDiamond3);
        diamondAdapter3.changeVisibility();
        myShapeDrawer.addBasicShape(diamondAdapter3);

        // 10. add background triangle with values (6.0, 6.0, 6.0, "Blue")
        Triangle myTriangle2 = new Triangle(6.0, 6.0, 6.0, "Blue");
        ShapeAdapter triangleAdapter2 = new ShapeAdapter(myTriangle2);
        triangleAdapter2.changeVisibility();
        myShapeDrawer.addBasicShape(triangleAdapter2);

        // 11. add visible diamond, values (1.0, 1.0, "Green")
        ShapeDiamond myShapeDiamond4 = new ShapeDiamond(1.0, 1.0, "Green");
        ShapeAdapter diamondAdapter4 = new ShapeAdapter(myShapeDiamond4);
        myShapeDrawer.addBasicShape(diamondAdapter4);

        // 12. add background brushstroke
        BrushStroke myBrushStroke1 = new BrushStroke();
        myBrushStroke1.changeVisibility();
        myShapeDrawer.addBasicShape(myBrushStroke1);

        // 13. add visible brush stroke, color: "someColor"
        BrushStroke myBrushStroke2 = new BrushStroke();
        myBrushStroke2.setColor("someColor");
        myShapeDrawer.addBasicShape(myBrushStroke2);

        // 14. add visible brush stroke, color: "RED"
        BrushStroke myBrushStroke3 = new BrushStroke();
        myBrushStroke3.setColor("RED");
        myShapeDrawer.addBasicShape(myBrushStroke3);

        myShapeDrawer.draw();
        myShapeDrawer.grow();
        myShapeDrawer.showVisibility();
    }
}
