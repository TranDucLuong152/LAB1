public class SanPham_Bai3{
    String tenSP;
    double donGia; 
    double giamgia;

    public SanPham_Bai3(String tenSP, double donGia, double giamgia ){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamgia = giamgia;
    }
    public SanPham_Bai3(String tenSP, double donGia ){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamgia = 0;
    }
    private double thueNhapKhau(){
        return donGia*0.1;
    }
    public void Xuat() {
        System.out.println("|    Ten san pham    |"+"     Don gia     |" +"     Giam gia     |"+" Thue san pham |");
        System.out.printf("|     %s     |  %.2f  VND |  %.2f VND |   %.2f  VND | \n"
        ,tenSP,donGia,giamgia,thueNhapKhau());
    }
}
