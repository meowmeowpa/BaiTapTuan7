package BaiTapNangCao;

public class PartTime extends Employee {
    private int giolam;
    private int luongMotGio;

    public PartTime(String name, int giolam, int luongMotGio) {
        super(name);
        this.giolam = giolam;
        this.luongMotGio = luongMotGio;
    }

    public double getGiolam() {
        return giolam;
    }

    public void setGiolam(int giolam) {
        this.giolam = giolam;
    }

    public double getLuongMotGio() {
        return luongMotGio;
    }

    public void setLuongMotGio(int luongMotGio) {
        this.luongMotGio = luongMotGio;
    }

    @Override
    public double tinhLuong() {
        return giolam * luongMotGio;
    }

    @Override
    public String toString() {
        return getName() + " " + giolam + " " + luongMotGio + " " + tinhLuong();
    }



}
