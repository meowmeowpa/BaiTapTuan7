package BaiTapNangCao;

public class FullTime extends Employee {


    public FullTime() {
    }

    public FullTime(String name) {
        super(name);
    }

    public FullTime(String name, double salary) {
        super(name, salary);
    }


    @Override
    public double tinhLuong() {
        return super.getSalary();
    }


    @Override
    public String toString() {
        return getName()+" " + tinhLuong() ;
    }
}
