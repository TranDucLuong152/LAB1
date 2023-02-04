import java.util.Arrays;
import java.util.Scanner;
public class Lab5 {
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println(" Nhap so :");
        n = sc.nextInt();
        double[] mang = new double[n];
        double sum = 0;
        for(int i = 0;i < n; i++ ){
            mang[i] = sc.nextDouble();
            sum = sum + mang[i];    
        }
        System.out.println("Tong = "+ sum);
    }
    public static void main(String[] args) {
        Lab5 LAB = new Lab5();
        LAB.Nhap();
    }
        
}

