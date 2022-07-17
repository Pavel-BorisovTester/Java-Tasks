1.	Печать сумы всех целых чисел от 100 до 500 с отображением операций внутри цикла
public class HelloWorld{

     public static void main(String []args){
       int sum = 0;
       for (int i = 100; i <= 500; i++)
       {
        System.out.println("==========================");
        System.out.println("i = " + i);
        System.out.println("Before: i = " + sum);
        System.out.println("Operation: sum =  i + " + sum);
        sum = sum + i;
        System.out.println("After: i = " + sum);
        System.out.println("==========================");
       }
       System.out.println("Sum of range is " + sum);
     }
}

2.	Посчитать среднее арифметическое вещественных чисел от а до n
import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = 8;
        double sum = 0;
        int counter = 0;
        
        for(int i = 0; i <= n; i++)
        {
            double temp = sc.nextDouble();
            sum = sum + temp;
            counter++;
            System.out.println(temp + " ");
        }
        System.out.println();
        System.out.println("Sum is " + sum +"; Count is " + counter);
        
        Double avg = sum / counter;
        System.out.println();
        System.out.println("Averege is " + avg);
     }
}

3.	Найти сумму множества целых чисел, которое заканчивается нулём. Найти количество чисел до 0

import java.util.Scanner;
public class HelloWorld{
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int sum = 0;
        int counter = 0;

          while (temp != 0)
          {
              System.out.print(temp + " ");
              temp = sc.nextInt();
              sum = sum + temp;
              counter++;
          }
            System.out.print("\n");
            System.out.print("Sum is " + sum);
            System.out.print("\n");
            System.out.print("Count is " + counter);
     }
}

4.	Напечатать множество чисел с нулем, посчитать сумму множества и счётчик чисел в множестве без 0

import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         
        int temp = sc.nextInt();
        int sum = 0;
        int counter = 0;
        int counterZero = 0;
        
        
          while (temp != 0)
          {
              System.out.print(temp + " ");
              temp = sc.nextInt();
              sum = sum + temp;
              counter++;
          }
              if (temp == 0)
              {
                  counterZero++;
                  System.out.print(temp + " ");
              }
              
            System.out.print("\n");
            System.out.print("Sum is " + sum);
            System.out.print("\n");
            System.out.print("Count is " + counter);
            System.out.print("\n");
            System.out.print("Counter of Zero is " + counterZero);
     }
}

