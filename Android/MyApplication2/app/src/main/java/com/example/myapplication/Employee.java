package com.example.myapplication;

public class Employee {
    private String honv;
    private String tenlot;
    private String tennv;
    private String manv;
    private String ngsinh;
    private String dchi;
    private String phai;
    private double luong;
    private String ma_nql;
    private String phg;

    public Employee() {
        this.honv = "";
        this.tenlot = "";
        this.tennv = "";
        this.manv = "";
        this.ngsinh = "";
        this.dchi = "";
        this.phai = "";
        this.luong = 0;
        this.ma_nql = "";
        this.phg = "";
    }

    public String getHonv() {
        return honv;
    }

    public void setHonv(String honv) {
        this.honv = honv;
    }

    public String getTenlot() {
        return tenlot;
    }

    public void setTenlot(String tenlot) {
        this.tenlot = tenlot;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getNgsinh() {
        return ngsinh;
    }

    public void setNgsinh(String ngsinh) {
        this.ngsinh = ngsinh;
    }

    public String getDchi() {
        return dchi;
    }

    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getMa_nql() {
        return ma_nql;
    }

    public void setMa_nql(String ma_nql) {
        this.ma_nql = ma_nql;
    }

    public String getPhg() {
        return phg;
    }

    public void setPhg(String phg) {
        this.phg = phg;
    }

    @Override
    public String toString() {
        /*return "Employee{" +
                "honv='" + honv + '\'' +
                " tenlot='" + tenlot + '\'' +
                ", tennv='" + tennv + '\'' +
                ", manv='" + manv + '\'' +
                ", ngsinh='" + ngsinh + '\'' +
                ", dchi='" + dchi + '\'' +
                ", phai='" + phai + '\'' +
                ", luong=" + luong +
                ", ma_nql='" + ma_nql + '\'' +
                ", phg='" + phg + '\'' +
                '}';*/
        return "Mã nhân viên: " + manv +"\n"
                + "Tên: " +honv + " " + tenlot + " " + tennv + "\n"
                + "Ngày sinh:  " + ngsinh + "\n"
                + "Địa chỉ: " + dchi + "\n"
                + "Giới tính: " + phai + "\n"
                + "Mã NQL: " + ma_nql + "   Phòng: " + phg + "\n";
    }
}
