package Lehtomaki;

public class ShapeDrawer extends Drawing<ShapeBasic> {
    
    @Override
    public void draw() {

        int i; // laskuri

        if (shapes != null) {

            for (i = 0; i < shapes.size(); i++) {
                shapes.get(i).draw();
            }
         } else {
            System.out.println("Drawing is empty");
            }
        }

    public void grow() {

        if (shapes != null) {

            for (ShapeBasic element : shapes) {
                element.grow();
            }
        } else {
                System.out.println("Drawing is empty");
            }
    } 

    public void showVisibility() {

        int n = 0; // number of shapes
        int i; 

        if (shapes != null) {

            for (i = 0; i < shapes.size(); i++ ) {

                if (shapes.get(i).isVisible() == true){
                    System.out.println((n+1) +". shape is visible: " + shapes.get(i).printText());
                } else {
                    System.out.println((n+1) +". shape is in the background: " + shapes.get(i).printText()); 
                } 
                n++;
            }

        } else {
            System.out.println("Drawing is empty");
        }
        System.out.println("\nTotal number of shapes: " + n);
    }
}
