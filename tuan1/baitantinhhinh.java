package tuan1;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.swing.InputMap;
public class baitantinhhinh {
   public static void main(String[] args) {
       float chieuDai,chieuRong,chuVi,DienTich ,canhNhoNhat ;
       System.out.println(" nhap chieu dai chieu rong : ");
       java.util.Scanner  Input = new Scanner(System.in);
       chieuDai = Input.nextFloat();
       chieuRong = Input.nextFloat();
       chuVi = (chieuDai+chieuRong)*2;
       DienTich = chieuDai *chieuRong;
       canhNhoNhat = Math.min(chieuDai,chieuRong);
       System.out.println(" chu vi la " + chuVi + " dien tich la" + DienTich +  "canh nho nhat la" + canhNhoNhat);
   } 
}
