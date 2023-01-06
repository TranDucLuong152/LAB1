# LAB1import java.lang.Math;
import java.util.Scanner;
class bailab{
    void Bai1(){
       System.out.println("Nhap ho ten : ");
       try (Scanner scanner = new Scanner(System.in)) {
           String hoten = scanner.nextLine();
           System.out.println("Dien TB");
           double diem = scanner.nextDouble();
           System.out.println("TEN : "+hoten);
           System.out.println("Diem : "+diem);
       }
   }
   void Bai2(){
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Nhap chieu dai : ");
        double dai = scanner.nextDouble();
        System.out.println("Nhap chieu rong : ");
        double rong = scanner.nextDouble();
        double chuvi= (dai+rong)*2;
        double dientich = dai*rong;
        System.out.println("Chu vi = " + chuvi);
        System.out.println("Dien tich = "+ dientich);
   }
}
    void Bai3(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap chieu dai canh lap phuong : ");
            double canh = scanner.nextDouble();
            double thetich=canh*canh*canh;
            System.out.println("The tich = "+thetich);
            
    }
}
    void Bai4(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap a,b,c");
            System.out.println("a = ");
            double a = scanner.nextDouble();
            System.out.println("b = ");
            double b = scanner.nextDouble();
            System.out.println("c = ");
            double c = scanner.nextDouble();
            double Delta = b*b - 4 * a * c ;
            System.out.println("Delta = "+ Delta);
            System.out.println("Can delta = " + Math.sqrt(Delta));
    }
}
}
    public class Lab1 {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("| Nhap 1 -> BAI 1 Tinh diem    |");
        System.out.println("| Nhap 2 -> BAI 2 Tinh cv,dt   |");
        System.out.println("| Nhap 3 -> BAI 3 Tinh the tich|");
        System.out.println("| Nhap 4 -> BAI 4 Tinh Delta   |");
        System.out.println("| Nhap 5 -> KET THUC BAI LAB   |");
        System.out.println("--------------------------------");
        System.out.println("NHAP SO : ");
    try (Scanner scanner = new Scanner(System.in)) {
       bailab BAI = new bailab();
       int chon;
    do{
    chon = scanner.nextInt();
    }while(chon < 0 || chon > 5);
       switch(chon){
        case 1 : {
            BAI.Bai1(); 
            break;
        }
        case 2 : {
            BAI.Bai2(); 
            break;
        }
        case 3 : {
            BAI.Bai3();
            break;
        }
        case 4 : {
            BAI.Bai4();
            break;
        }
       }
    }
    }
    
}
