import java.util.Scanner;
public class Lab4_main {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("------------------");
            System.out.println("| Chon 1 : Bai 1 -> Lop San Pham ");
            System.out.println("| Chon 2 : Bai 2 -> Nang cap lop San Pham");
            System.out.println("| Chon 3 : Bai 3 -> Nang cap lop bang getter va setter");
            System.out.println("------------------");
            int chon;
            System.out.print("Nhap so : ");
            do {
               chon = sc.nextInt();
            } while (chon < 0 || chon > 4);
            switch(chon){
                case 1 :{
            SanPham SP1 = new SanPham();
            SP1.Nhap();
            SP1.Xuat();
            System.out.println("---------------------------------------------------------");
            SanPham SP2;
            SP2 = new SanPham(); 
            SP2.Nhap();
            SP2.Xuat();
                    break;
                }
                case 2 : {
                SanPham_Bai3 sp1 = new SanPham_Bai3("San pham 1", 200000, 200000);
                sp1.Xuat();
                SanPham_Bai3 sp2 = new SanPham_Bai3("San pham 2", 500000);
                sp2.Xuat();
                    break;
                }
                
                case 3 :{
                SanPham_Bai4 Sp = new SanPham_Bai4();
                Sp.settenSP("San pham 6");
                Sp.setdonGia(1100000);
                Sp.setgiamgia(100000);
                Sp.Xuat();
                }
            }
        }
    }
}

