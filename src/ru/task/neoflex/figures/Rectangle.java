package ru.task.neoflex.figures;

/**
 * Created by Alexey Podlubnyy on 22.11.2021
 */
public class Rectangle extends Square{

    public Rectangle(double length, double width) {
        this.type = "Rectangle";
        this.perimeter = (length + width) * 2;
        this.area = length * width;
    }

    public Rectangle() {
    }
}
