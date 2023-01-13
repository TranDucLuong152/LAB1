
public class SanPham_Bai4 {
    private String tenSP;
    private double donGia; 
    private double giamgia;
    public String gettenSP(){
        return this.tenSP;
    }
    public void settenSP(String tenSP){
        this.tenSP = tenSP;
    }
    public double getdonGia(){
        return this.donGia;
    }
    public void setdonGia(double donGia){
        this.donGia = donGia;
    }
    public double getgiamgia(){
        return this.giamgia;
    }
    public void setgiamgia(double giamgia){
        this.giamgia = giamgia;
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
