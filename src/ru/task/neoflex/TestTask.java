package ru.task.neoflex;

import ru.task.neoflex.figures.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Alexey Podlubnyy on 21.11.2021
 */
public class TestTask {
    public static void main(String[] args) {
        System.out.println("Тестирование первого задания:");
        PhoneBook phoneBook =new PhoneBook();
        phoneBook.addContact("88005553535", "Иван");
        phoneBook.addContact("88007008000", "Обиван");
        phoneBook.addContact("553535", "Иван");
        phoneBook.addContact("0611", "Обиван");

        for (Map.Entry<String, String> entry : phoneBook.findNumbers("ван").entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("\nТестирование второго задания:");
        List<GeometricFigure> figures = new ArrayList<>();
        figures.add(new Point());
        figures.add(new Line(12));
        figures.add(new Circle(10));
        figures.add(new Triangle(12, 5));
        figures.add(new Square(7));
        figures.add(new Rectangle(7, 2));
        figures.add(new Parallelogram(7, 2, 5));
        figures.forEach(System.out::println);

        System.out.println("\nТестирование третьего задания:");
        System.out.println(WeekEnum.FRIDAY.getNameDayOfTheWeek());
        System.out.println(WeekEnum.FRIDAY.getNumberDayOfTheWeek());
    }
}
