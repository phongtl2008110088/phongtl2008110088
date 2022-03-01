package tuan2;
import java.util.Scanner;
public class tiendien {
    public static void main(String[] args) {
        float soDien;
        double soTien;
        System.out.println("nhap so tien su dung ");
        Scanner tien = new Scanner(System.in);
        soDien = tien.nextFloat();

        if(soDien <= 50){
            soTien = soDien*1000;
            System.out.println("so tien can dong : " + soTien);  
        }
        else{
            soTien = soDien*1200;
            System.out.println("so tien can thanh toan :" + soTien);
        }

    }
}
