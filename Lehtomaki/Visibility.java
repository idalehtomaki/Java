package Lehtomaki;

public class Visibility {

    // atribuutit 
    private boolean inBackground = false;

    // konstruktori
    public Visibility() {
        
    }

    public void changeVisibility() {
        if (this.inBackground == false) {
        this.inBackground = true;
        }
    }

    public boolean isVisible() {

        return !inBackground;
    }

}