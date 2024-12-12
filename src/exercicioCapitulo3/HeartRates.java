package exercicioCapitulo3;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {

    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;

    public HeartRates(String name, String surname, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int maximumHeartRate() {
        return 220 - ageInYear();
    }

    public String targetHeartRate() {
        int maximum = maximumHeartRate();

        int minimum = (int) (maximum * 0.50);
        int max = (int) (maximum * 0.85);

        return minimum + " - " + max;
    }

    public int ageInYear() { // Cria uma data com a data de nascimento fornecida
        LocalDate currentDate = LocalDate.now(); // Obtém a data atual
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

}
