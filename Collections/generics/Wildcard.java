package Collections.generics;

import java.util.ArrayList;
import java.util.List;

class Shape {
    void draw() {
        System.out.println("drawing shape");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("drawing shape");
    }
}

public class Wildcard {
    // ? extends Number, ? implements List, ?, ? super Integer -> are the available expressions
    static void drawShapes(List<? extends Shape> list) {
        for (Shape shape: list) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list1.add(new Rectangle());

        List<Square> list2 = new ArrayList<>();

        list2.add(new Square());

        drawShapes(list1);
        drawShapes(list2);

        // C.E. cause it expects List of class Shape or it's child classes
//        drawShapes(list);
    }
}
