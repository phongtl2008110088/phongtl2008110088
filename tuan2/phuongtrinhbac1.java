package tuan2;
import java.util.Scanner;
public class phuongtrinhbac1 {
    public static void main(String[] args) {
        float a, b ;
        double nghiem_x ;
        System.out.println("nhap gia tri a , b");
        Scanner bien = new Scanner(System.in);
        a = bien.nextFloat();
        b = bien.nextFloat();
        nghiem_x = -b/a ;
        if (a == 0)
        {   
            System.out.println("phuong trnh vo so nghiem");
        if( b == 0 ){
            System.out.println("phuong trinh vo nghiem");
        }

        }
        else{
            System.out.println("phuong trinh co nghiem " + nghiem_x);
        }

    }
}
