
import java.util.Scanner;

public class BTVN2 {
    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập vào số thứ nhất: ");
        int a = scan.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scan.nextInt();
        
 
        
        
        int tinhTong = a + b;
        int tinhHieu = a - b;
        int tinhTich = a * b;

        float tinhThuong = (float) a / b;
        int tinhDu = a % b;
        
        System.out.println(a + " + " + b + " = " + tinhTong);
        System.out.println(a + " - " + b + " = " + tinhHieu);
        System.out.println(a + " * " + b + " = " + tinhTich);
        System.out.println(a + " / " + b + " = " + tinhThuong);
        System.out.println(a + " % " + b + " = " + tinhDu);

    }

}
