
import java.util.Scanner;
public class btvn2DEF {
    
    static void tinhTong(int a, int b){
        System.out.println("Tong = " + (a + b));
    }
    
    static void tinhHieu(int a, int b){
        System.out.println("Hieu = " + (a - b));
    }
    static void tinhTich(int a, int b){
        System.out.println("Tich = " + (a * b));
    }
    static void tinhThuong(int a, int b){
        float c = (float) a / b;
        System.out.println("Thuong = " + c);
    }
    static void tinhDu(int a, int b){
        System.out.println("Phan Du = " + (a % b));
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập vào số thứ nhất: ");
        int a = scan.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scan.nextInt();
       
      tinhTong(a, b);
      tinhHieu(a, b);
      tinhTich(a, b);
      tinhThuong(a, b);
      tinhDu(a, b);

    }

}


