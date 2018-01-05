package controlStatements;

import java.util.Scanner;

/**
 * Created by rajan on 5/1/18.
 */
public class IfElseDemo {

    void ifElse()
    {
        int num;
        System.out.println("enter the number : ");
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();

        if (num%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }

    }

    void elseIFDemo()
    {
        int percentage;
        System.out.println("enter the percentage : ");
        Scanner scanner=new Scanner(System.in);
        percentage=scanner.nextInt();

        if (percentage<35)
        {
            System.out.println("fail");
        }
        else if (percentage>=35 && percentage<60)
        {
            System.out.println("pass");
        }
        else if (percentage>=60 && percentage<=100)
        {
            System.out.println("firstclass");
        }
        else
        {
            System.out.println("invalid");
        }



    }

    public static void main(String[] args) {
        IfElseDemo ifElseDemo=new IfElseDemo();
        ifElseDemo.elseIFDemo();
    }
}
