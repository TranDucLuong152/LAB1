import java.util.Scanner;

public class SanPham {
String tenSP;
double donGia; 
double giamgia;
double thueNhapKhau(){
    return donGia*0.1;
}
public void Nhap() {
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham : ");
        tenSP = sc.nextLine();
        System.out.println("Nhap doi gia : ");
        donGia = sc.nextDouble();
        System.out.println("Nhap giam gia");
        giamgia = sc.nextDouble();
    
}
public void Xuat() {
    System.out.println("| Ten san pham |"+"   Don gia  |" +"   Giam gia   |"+" Thue san pham |");
    System.out.printf("|    %s    |  %.2f  VND |  %.2f VND |   %.2f  VND | \n"
    ,tenSP,donGia,giamgia,thueNhapKhau());
    }
}

