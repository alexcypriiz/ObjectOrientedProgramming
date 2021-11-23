package ru.task.neoflex.figures;

/**
 * Created by Alexey Podlubnyy on 21.11.2021
 */
public class Square extends Triangle {

    public Square(double length) {
        this.type = "Square";
        this.perimeter = length * 4;
        this.area = Math.pow(length, 2);
    }

    public Square() {
    }
}
