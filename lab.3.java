
import java.util.Scanner;

public class Lab3 {
    // đệ quy cho bài 3.
    public static void arr(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    private static void Xuat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("mang[%d] = %d \n", i, arr[i]);
        }
    }
    // Đệ quy cho bài 4.
    public static void diem1(float[] diem,String[] ten) {
        float temp1 = diem[0];
        for (int i = 0; i < diem.length; i++) {
            for (int j = i + 1; j < diem.length; j++) {    
                if (diem[i] > diem[j]) {
                    temp1 = diem[j];
                    diem[j] = diem[i];
                    diem[i] = temp1;
                    String st = ten[i];
                    ten[i] =ten [j];
                    ten[j]=st;       
                }
            }    
        }
    }
    public static void Xuat2(float[] diem, String[] ten) {
        for(int i = 0;i < diem.length;i++){
                    
                    System.out.println("-----------------------------");
                    System.out.println(" Ho va ten : " + ten[i]+"     ");
                    System.out.println(" Diem : " + diem[i]+"         ");
                }
            }
    public static void main(String[] args) {
        System.out.println("<========================================>");
        System.out.println("| Nhap 1 -> Bai 1 : Tim so nguyen to    |");
        System.out.println("| Nhap 2 -> Bai 2 : Bang cuu chuong     |");
        System.out.println("| Nhap 3 -> Bai 3 : Nhap mang so nguyen |");
        System.out.println("| Nhap 4 -> Bai 4 : Nhap mang ten, diem |");
        System.out.println("| Nhap 5 ->---KET THUC CHUONG TRINH-----|");
        System.out.println("<========================================>");
        try (Scanner sc = new Scanner(System.in)) {
            int chon;
            System.out.printf("Nhap so : ");
            do {
                chon = sc.nextInt();
            } while (chon < 0 || chon > 5);
            switch (chon) {
                case 1: {
                    System.out.println("CHUONG TRINH KIEM TRA SO NGUYEN TO : ");
                    System.out.print("Nhap mot so : ");
                    int N = sc.nextInt();
                    int dem = 0;
                    for (int i = 2; i < N - 1; i++) {
                        if (N % i == 0) {
                            dem++;
                        }
                    }
                    if (dem == 0) {
                        System.out.printf(" %d la so nguyen to", N);
                    } else {
                        System.out.printf(" %d khong phai la so nguyen to", N);
                    }
                    break;
                }
                case 2: {
                    System.out.println("CHUONG TRINH BANG CUU CHUONG : ");
                    System.out.println("BANG NHAN : 1");
                    for (int i = 1; i < 10; i++) {
                        for (int j = 1; j < 11; j++) {
                            System.out.printf(" %d * %d = %d \n", i, j, i * j);
                            if (j == 10) {
                                System.out.printf("BANG NHAN : %d \n", i + 1);
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("CHUONG TRINH SAP XEP MANG : ");
                    System.out.print("Nhap so luong phan tu : ");
                    int N;
                    float tong = 0;
                    float dem = 0;
                    N = sc.nextInt();
                    int arr[] = new int[N];
                    System.out.println("Nhap cac phan tu : ");
                    for (int i = 0; i < N; i++) {
                        System.out.printf("mang[%d]", i);
                        arr[i] = sc.nextInt();
                        if (arr[i] % 3 == 0) {
                            dem++;
                            tong = tong + arr[i];
                        }
                    }
                    System.out.println("Sap xep mang tang dan : ");
                    arr(arr);
                    Xuat(arr);
                    float kq = tong / dem;
                    System.out.println("Tbc cac so chia het cho 3 : " + kq);
                    System.out.println("Min = " + arr[0]);
                    break;
                }
                case 4: {
                    System.out.println("CHUONG TRINH NHAP HO TEN VA DIEM : ");
                    System.out.print("Nhap so luong sinh vien :");
                    int n;
                    n = sc.nextInt();
                    String ten[] = new String[n];
                    float diem[] = new float[n];
                    System.out.println("------------------------------------");
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.printf("Nhap ten SV %d : ", i);
                        ten[i] = sc.next();
                        System.out.println("--------------------------------");
                        System.out.printf("Nhap diem SV %d : ", i);
                        diem[i] = sc.nextFloat();
                        System.out.println("--------------------------------");
                    }     
                    diem1(diem,ten);
                    Xuat2(diem,ten);
                    break;
                }
                case 5: {
                    System.out.println("--------------KET THUC CHUONG TRINH---------------");
                    break;
                }
            }
        }
    }
}


