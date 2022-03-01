package tuan2;
import java.util.Scanner;
public class menutoan {
    public static void main(String[] args) {
        int luachon = 0 ;
        System.out.println("===========menu=======");
        System.out.println("1. phuong trinh bac 1 ");
        System.out.println("2 . phuong trinh bac 2 ");
        System.out.println("3 . tinh tien dien");
        /* System.out.println(" 4 out " ); */
        System.out.println("nhap lua chon 1-3");
        Scanner sc = new Scanner(System.in);
        luachon = sc.nextInt();
        switch(luachon){
            case 1 : ptbac1();
            case 2 : ptbac2();
            case 3 : tinhtiendien();

        }
    while(luachon !=0);
    System.out.println("khong thuc thi");
}
    static void ptbac1() 
    {
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
static void ptbac2(){
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
static void tinhtiendien(){
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
  
       
