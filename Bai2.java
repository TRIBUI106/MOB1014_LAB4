package me.chezis;

public class Bai2 {

    public static void main(String[] args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        System.out.println("SP1");
        sp1.nhap();
        System.out.println("\nSP2");
        sp2.nhap();
        System.out.println("\n\n");
        System.out.println("Sản Phẩm 1");
        sp1.xuat();
        System.out.println("\nSản Phẩm 2");
        sp2.xuat();
    }

}
