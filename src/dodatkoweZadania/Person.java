package dodatkoweZadania;

import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private String surname;
    private String name;
    private String pesel;
    private String startJob;
    private double salary;

    public Person(String s, String n,  String p, String j, double sa){
        surname = s;
        name = n;
        pesel = p;
        startJob = j;
        salary = sa;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getStartJob() {
        return startJob;
    }

    public void setStartJob(String startJob) {
        this.startJob = startJob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", pesel='" + pesel + '\'' +
                ", startJob='" + startJob + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
