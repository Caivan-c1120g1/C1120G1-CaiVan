package s7_abstract_class_interface.bai_tap.bai1;

import inheritance.thuc_hanh.Circle;

public class ResizeableCircle extends Circle implements Resizeable{
    public ResizeableCircle() {
    }

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public ResizeableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public void resize(double percent) {

    }
}
