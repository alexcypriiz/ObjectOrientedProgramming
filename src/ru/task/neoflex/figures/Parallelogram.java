package ru.task.neoflex.figures;

/**
 * Created by Alexey Podlubnyy on 22.11.2021
 */
public class Parallelogram extends Rectangle {

    public Parallelogram(double length, double width, double height) {
        this.type = "Parallelogram";
        this.perimeter = (length + width) * 2;
        this.area = length * height;
    }
}
