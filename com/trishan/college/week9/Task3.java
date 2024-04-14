package com.trishan.college.week9;

public class Task3 {
//    Imagine you are building a geometry calculator program. You need to implement the calculation of areas for different
//    shapes, including rectangles, squares, and circles. To achieve this, use hierarchial inheritance.
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12, 14);
        Square sq = new Square(12);
        Circle circ = new Circle(8);

        rect.area();
        sq.area();
        circ.area();
    }
}

class Shape {
    protected int length;
    protected int breadth;
    protected double radius;
    protected int side;

    Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    Shape(double radius){
        this.radius = radius;
    }

    Shape(int side){
        this.side = side;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth){
        super(length, breadth);
    }

    void area(){
        int area = super.length * super.breadth;
        System.out.println("Area of this rectangle is: " + area);
    }
}


class Square extends Shape {
    Square(int side){
        super(side);
    }

    void area(){
        int area = (int)Math.pow(super.side, 2);
        System.out.println("Area of this square is: " + area);
    }
}

class Circle extends Shape {
    private static final float PI = 3.14f;

    Circle(double radius){
        super(radius);
    }

    void area(){
        double area = PI * (int)Math.pow(super.radius, 2);
        System.out.println("Area of this circle is: " + area);
    }
}

