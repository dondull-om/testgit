/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dondull
 */
import java.util.Scanner;

public class dulieu {

    //duyệt qua bàng foreach : for (int num : array)
    //srs, sds, test
    //for :
    // do while dùng khi cần ít nahast 1 vòng lặp trc khi ktra
    //break, continue: bỏ qua lần lặp hiện tại và chuyển snag lặp tiếp
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //bufferReader: dữ liệu đầu vào alf string,
        //1 trong thuvien tương tác với file , txt, excel 
        System.out.println("Nhap so 1:");
        int a = sc.nextInt();
        System.out.println("Nhap so 2:");
        int b = sc.nextInt();
        System.out.println("1.tinh tong");
        System.out.println("2.tinh hieu");
        System.out.println("3.tinh tich");
        System.out.println("4.tinh thuong");
        System.out.println("5.thoat");

        
        
        //return 0: dừng chương trình # break 
        while (true) {
            System.out.println("nhập option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Tong = " + (a + b));
                    break;
                case 2:
                    System.out.println("Hieu = " + Math.abs(a - b));
                    break;
                case 3:
                    System.out.println("Tich = " + (a * b));
                    break;
                case 4: // check điều kiện của thương
                    System.out.println("Thuong = " + (double) (a / b));
                    break;
                case 5:
                    System.exit(0);// dừng ctrinh đang run, đóng cổng system
                    break;
                //khi để break luôn ctrinh tiếp tục chạy, 

            }

        }

        //switch case : default sử dụng khi ko có case khớp giá trị
//        int i = a; // in ra a và 5 số tiếp theo 
//        while ( i <= a + 5 ) { 
//            System.out.println(i);
//            i++;
//        }
    }

}
