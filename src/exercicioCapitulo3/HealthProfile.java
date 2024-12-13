package exercicioCapitulo3;

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String name;
    private String surname;
    private String sex;
    private int day;
    private int mounth;
    private int year;
    private double meters;
    private int weight;

    public HealthProfile(String name, String surname, String sex, int day, int mounth, int year, double meters, int weight){
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.day = day;
        this.mounth = mounth;
        this.year = year;
        this.meters = meters;
        this.weight = weight;
    }

    public int  maximumHeartRate(){
        return 220 - ageInYear();
    }

    public String calculateTargetHeartRate(){
        int maximum = maximumHeartRate();
        int minimum = (int) (maximum * 0.50);
        int max = (int) (maximum * 0.85);
        return minimum + " - " + max + " bpm";
    }


    public int ageInYear(){
        LocalDate birthDate = LocalDate.of(year, mounth, day);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void imc(){
        double imc = weight / (meters * meters);


        System.out.printf("Your BMI is: %.2f%n", imc);
        if (imc < 18.5) {
            System.out.println("Classification: Below weight");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classification: Normal weight");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classification: Overweight");
        } else {
            System.out.println("Classification: Obesity");
        }
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMeters() {
        return meters;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    

}
