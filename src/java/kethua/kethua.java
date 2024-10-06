/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// PUBLIC: truy cập k giới hạn, có thể từ bất kì đâu
//private: chỉ truy cập trong class đó
// protected truy cập trong package, có thể truy cập từ cá class con 
//dèault: truy cập chỉ trong cùng package



package kethua;
import animal.Horse;
/**
 // 
 * @author dondull
 */
public class kethua {
    public static void main(String[] args){
        Horse h = new Horse();
        h.setMau_long_mao("Đen");
        String color = h.getMau_long_mao ();
        System.out.println(color);
    }
}
