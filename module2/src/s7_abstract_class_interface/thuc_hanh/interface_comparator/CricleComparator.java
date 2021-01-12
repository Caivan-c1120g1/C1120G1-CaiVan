package s7_abstract_class_interface.thuc_hanh.interface_comparator;

import inheritance.thuc_hanh.Circle;

import java.util.Comparator;

public class CricleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius())
            return 1;
        else if (c1.getRadius() < c2.getRadius())
            return -1;
        else return 0;
    }
}
