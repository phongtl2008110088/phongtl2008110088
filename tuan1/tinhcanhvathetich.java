package tuan1;
import java.util.Scanner;
public class tinhcanhvathetich {
    public static void main(String[] args) {
        float canh, thetich;
        System.out.println("nhap canh khoi lap phuong");
        java.util.Scanner Canh = new java.util.Scanner(System.in);
        canh = Canh.nextFloat();
        thetich = (canh*canh*canh);
        System.out.println("canh khoi lap phuong la :" +canh );
        System.out.println("the tich khoi lap phuong la " +thetich);
    }
}
