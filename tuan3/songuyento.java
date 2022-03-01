package tuan3;

import java.util.Scanner;
import java.util.Scanner;
public class songuyento {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         if(soNguyenTo(n)){
            System.out.println(" là số nguyên tố" + n);
        }else{
            System.out.println("khong phai la so nguyen to" + n);
        }
    }
public static boolean soNguyenTo(int n){
if(n <= 1){
    return false;
}
    for(int i = 2 ; i <= n-1 ; i++){
        if(n % i == 0 ){
            return false;
        }
    }
    return true;
}
}
