package me.chezis;

public class Bai3 {
    public static void main(String[] args) {
        SanPham spGiamGia = new SanPham("Sản Phẩm Giảm Giá",10000,1000);
        SanPham spGiaGoc = new SanPham("Sản Phẩm Không Giảm Giá",10000);

        spGiamGia.xuat();
        System.out.println("\n");
        spGiaGoc.xuat();
    }
}
