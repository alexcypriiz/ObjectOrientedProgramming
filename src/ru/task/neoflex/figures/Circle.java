package ru.task.neoflex.figures;

/**
 * Created by Alexey Podlubnyy on 21.11.2021
 */
public class Circle extends Line {

    public Circle(double length) {
        this.type = "Circle";
        this.length = length;
        this.area = Math.pow(length, 2) / (4 * Math.PI);
    }
}
