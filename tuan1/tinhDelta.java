package tuan1;
import java.util.Scanner;
public class tinhDelta {
    public static void main(String[] args) {
        float a , b , c , tinhDelta;
        double Candelta ;
        System.out.println("nhap du lieu :");
        Scanner bien = new Scanner(System.in);
        a = bien.nextFloat();
        b = bien.nextFloat();
        c = bien.nextFloat();
        tinhDelta = b*b - 4*a*c ;
        Candelta = Math.sqrt(tinhDelta);
        System.out.println("delta co ket qua la " + tinhDelta);
        System.out.println("can delta co ket qua la " + Candelta);
    }
}
