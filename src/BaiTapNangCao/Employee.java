package BaiTapNangCao;

import java.util.List;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double tinhLuong();

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double bonus(Employee doiTuong, double bonus) {
        return tinhLuong() + bonus;
    }
    public double bonus(List<Employee> nhanvien, double bonus) {
        return tinhLuong() + bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}

