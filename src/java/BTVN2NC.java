

import java.util.Scanner;

public class BTVN2NC {
    
    static void dk (int a, int b){
        if (a == b)  System.out.println("Failed");
        if ( a % 2 == 0 && a > b ) System.out.println(a + b);
        else {
            int c = a > b? (a - b):(b-a);
            System.out.println(c);
                     
        }
             
    }
/*  scanner.closed(): đóng system.in k thể tái sử dụng 
    scanner đóng trong hàm main để k tiêu tốn tài nguyên 
    math.abs(): in ra giá trị tuyệt đối của phép tính
    enterNumber() : gọi pthuc > gọi hàm nextInt 
    array.length()
    duyệt qua mnarg bằng foreach 
    */
    
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập vào số thứ nhất: ");
        int a = scan.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scan.nextInt();

        dk (a, b);
              

}

}
