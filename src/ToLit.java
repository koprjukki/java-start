/*Написать программу, которая читает с консоли три строки, потом выводит в консоль результат конкатенации:
первая строка с третьей
третья строка со второй и с первой
первая строка со второй и с третьей*/

import java.util.Scanner;

public class ToLit {
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("S1.Write here and press Enter");
        String str1 = s1.nextLine();
        System.out.println("S2.Write here and press Enter");
        String str2 = s1.nextLine();
        System.out.println("S3.Write here and press Enter");
        String str3 = s1.nextLine();
        System.out.println(str1 +" "+ str3);
        System.out.println(str3+" "+str2+" "+str1);
        System.out.println(str1+" "+str2+" "+str3);
    }
}
