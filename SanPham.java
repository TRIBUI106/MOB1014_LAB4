package me.chezis;

import java.util.Scanner;

public class SanPham {

    private String tenSp;
    private double donGia;
    private double giamGia;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập tên sản phẩm: ");
//        tenSp = sc.nextLine();
//        System.out.print("Nhập giá tiền: ");
//        donGia = sc.nextDouble();
//        System.out.print("Nhập số tiền giảm giá: ");
//        giamGia = sc.nextDouble();
//    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        setTenSp(sc.nextLine());
        System.out.print("Nhập giá tiền: ");
        setDonGia(sc.nextDouble());
        System.out.print("Nhập số tiền giảm giá: ");
        setGiamGia(sc.nextDouble());
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
//        Đơn giá * 0.1 = 10% đơn giá
    }


    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public SanPham() {
    }

    public void xuat() {
        System.out.println("Tên Sản Phẩm : " + getTenSp());
        System.out.println("Đơn Giá : " + getDonGia());
        System.out.println("Giảm giá : " + getGiamGia());
        System.out.println("Thuế Nhập Khẩu : " + getThueNhapKhau());
    }

}
