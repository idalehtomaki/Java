package Lehtomaki;

import java.util.ArrayList;
import java.util.List;

public abstract class Drawing<T> {
    // tarkista tarvitseeko olla final
    public final List<T> shapes = new ArrayList<>();

    public void addBasicShape(T element) {

        if (element != null) {
            shapes.add(element);
        }
    }

    public List<T> getBasicShapes() {
        return shapes;
    }

   public abstract void draw();

}
