/*Написать программу, которая читает с консоли два целых числа, потом выводит в консоль результат:
сложения чисел
вычитания первого числа из второго
деления второго числа на первое
умножения второго числа на второе
остаток от деления суммы первого числа и второго на первое число*/

import java.util.Scanner;

public class ToGal{
    public static void main (String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.println("№1.Write any number here.");
        int num1 = Integer.parseInt(s1.nextLine());
        System.out.println("№2.Write any number here.");
        int num2 = Integer.parseInt(s1.nextLine());

        System.out.println(num2 - num1);
        System.out.println(num1/num2);
        System.out.println(num2*num2 );
        System.out.println((num1+num2)% num1 );

    }
}
