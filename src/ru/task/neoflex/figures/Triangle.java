package ru.task.neoflex.figures;

/**
 * Created by Alexey Podlubnyy on 21.11.2021
 */
public class Triangle extends Line {
    double perimeter;
    double radius;

    public Triangle(double perimeter, double radius) {
        this.type = "Triangle"; // треугольник со вписанной окружностью
        this.perimeter =  perimeter; // периметр треугольника
        this.radius = radius; // радиус окружности
        this.area = radius * perimeter / 2;
    }

    public Triangle() {
    }

    @Override
    public String toString() {
        return "GeometricFigure{" +
                "type='" + type + '\'' +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

}
