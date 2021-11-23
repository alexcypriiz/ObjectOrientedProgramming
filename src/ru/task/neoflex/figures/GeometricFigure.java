package ru.task.neoflex.figures;

/**
 * Created by Alexey Podlubnyy on 21.11.2021
 */
public abstract class GeometricFigure {
    String type;
    double length;
    double area;

    public GeometricFigure() {
    }

    public GeometricFigure(double length) {
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "GeometricFigure{" +
                "type='" + type + '\'' +
                ", length=" + length +
                ", area=" + area +
                '}';
    }
}
