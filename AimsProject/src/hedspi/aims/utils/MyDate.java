package hedspi.aims.utils;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(){
        this.day=5;
        this.month=10;
        this.year=2022;
    }
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
