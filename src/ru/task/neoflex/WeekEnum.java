package ru.task.neoflex;

/**
 * Created by Alexey Podlubnyy on 23.11.2021
 */
public class WeekEnum {
        public static final WeekEnum MONDAY = new WeekEnum(1, "Понедельник");
        public static final WeekEnum TUESDAY = new WeekEnum(2, "Вторник");
        public static final WeekEnum WEDNESDAY = new WeekEnum(3, "Среда");
        public static final WeekEnum THURSDAY = new WeekEnum(4, "Четверг");
        public static final WeekEnum FRIDAY = new WeekEnum(5, "Пятница");
        public static final WeekEnum SATURDAY = new WeekEnum(6, "Суббота");
        public static final WeekEnum SUNDAY = new WeekEnum(7, "Воскресенье");

        private int numberDayOfTheWeek;
        private String nameDayOfTheWeek;

        private WeekEnum(int numberDayOfTheWeek, String nameDayOfTheWeek){
            this.numberDayOfTheWeek = numberDayOfTheWeek;
            this.nameDayOfTheWeek = nameDayOfTheWeek;
        }
        public int getNumberDayOfTheWeek(){
            return numberDayOfTheWeek;
        }
        public String getNameDayOfTheWeek(){
            return nameDayOfTheWeek;
        }

}
