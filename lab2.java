import java.util.Scanner;
import java.lang.Math;
class Baitap{
    void bai1bai2(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("CHUONG TRINH TINH PHUONG TRINH : ");
            System.out.println("Nhap a,b,c");
            System.out.println("Neu nhap a = 0, thi giai phuong trinh bac 1 : ");
            // Nếu nhập a = 0 giải phương trình bậc 1.(Bài 1)
            System.out.println("a = ");
            float a = sc.nextFloat();
            System.out.println("b = ");
            float b = sc.nextFloat();
            System.out.println("c = ");
            float c = sc.nextFloat();
            if(a!=0){
                float delta = b*b-4*a*c;
                if(delta < 0){
                    System.out.println("Phuong trinh vo nghiem ");
                }else if( delta == 0 ){
                    float x = -b/(a*2);
                    System.out.println("Nghiem kep x = " + x);

                }else if(delta >0 ){
                    System.out.println("Phuong trinh co hai nghiem phan biet : ");
                    System.out.printf("Nghiem X1 = %.2f \n", (b+Math.sqrt(delta))/(2*a));
                    System.out.printf("Nghiem X2 = %.2f \n", (-b+Math.sqrt(delta))/(2*a));

                }
            }else{
                if(b == 0 ){
                    if(c==0){
                        System.out.println("Phuong tring vo so nghiem");
                    }else{
                    System.out.println("Phuong trinh vo nghiem ");
                    }
                }else{
                    System.out.println("Phuong trinh co nghiem x = "+ -c/b);
                }
            }

        }
    }

    void bai3(){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("CHUONG TRINH TINH TIEN DIEN : ");
            System.out.println("Nhap so dien = ");
            float sodien = sc.nextFloat();
            if(sodien >0 && sodien < 50){
                System.out.println("Tien dien = "+ sodien*1000+" VND");

            }else if(sodien > 51){
                System.out.println("Tien dien ="+ (50*1000 + (sodien-50)*1200)+" VND");
            }
         }
    }
}
public class Lab2 {
    public static void main(String[] args) {
        Baitap BAI = new Baitap();
        int chon;
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("<---------------------------------------------->");
        System.out.println("| Nhap 1 -> Bai1 voi Bai 2 : tinh phuong trinh |");
        System.out.println("| Nhap 2 -> Bai3 : tinh so tien dien phai tra  |");
        System.out.println("| Nhap 3 ------- KET THUC CHUONG TRINH ------- |");
        System.out.println("<---------------------------------------------->");
        System.out.print("NHAP SO = ");
        do{
             chon = sc.nextInt();
        }while(chon < 0 || chon > 3);
        switch(chon){
            case 1 : {
                BAI.bai1bai2();
                break;
                }
            case 2 : {
                BAI.bai3();
                break;
                }
            case 3 : {
                System.out.println("------------KET THUC CHUONG TRINH --------------");
                }
            }
        }
    } 
}

