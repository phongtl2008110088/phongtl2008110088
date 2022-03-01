package tuan2;
import java.util.Scanner;
public class lad2bai2 {
    public static void main(String[] args) {
        float a,b,c;
        double delta,canDelta,x1,x2;
        System.out.println("Nhập hệ số a,b,c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if(a == 0)
        {
            if(b == 0)
            {
                if(c == 0)
                {
                    System.out.println("Phương trình có vô số nghiệm");
                }
                else
                {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            else
            {
                System.out.println("Phương trình có nghiệm -b/a =" + -b/a);
            }
        }
        else
        {
            delta = b*b - 4*a*c;
            canDelta = Math.sqrt(delta);
            if(delta == 0)
            {
                System.out.println("Phương trình có nghiệm kép:" + -b/2*a);
            }
            else if(delta < 0)
            {
                System.out.println("Phương trình vô nghiệm");
            }
            else
            {
                System.out.println("Phương trình có hai nghiệm phân biệt");
                System.out.println("x1" + (-b+canDelta)/2*a);
                System.out.println("x2" + (-b-canDelta)/2*a);
            }
        }
    }
}
