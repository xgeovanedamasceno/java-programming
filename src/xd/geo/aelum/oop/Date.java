package xd.geo.aelum.oop;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(month == 2) {
            if(day == 30 || day == 31) {
                this.day = 29;
                this.month = month;
                this.year = year;
            }
        } else {
            this.day = day;
            this.month = month;
            this.year = year;
        }

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFormattedDate() {
        return day + "/" + month + "/" + year;
    }
}
