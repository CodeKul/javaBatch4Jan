package operators;

import java.util.Scanner;

/**
 * Created by rajan on 5/1/18.
 */
public class Operators {


    void arithmaticOperators()
    {
        int a,b,add,sub,mul,div,mod;
        System.out.println("enter the value of a and b : \n");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();

        add=a+b;
        System.out.println("addition is : "+add);

        sub=a-b;
        System.out.println("sub is : "+sub);

        mul=a*b;
        System.out.println("mul is : "+mul);

    }

    void uneryOperators()
    {
        int c=10;
        int d=(c++)+c;
        c=(++d)+(++d);
        d=(c++)+(d++);
        c=d+10;
        System.out.println(c);


        int k=21;
        int e=(k++)+(c++);
        d=(++e)+(k++);
        k=(d++)+(d++);
        System.out.println(k);
       // System.out.println(c);
    }

    public static void main(String[] args) {
        Operators operators=new Operators();
       // operators.arithmaticOperators();
        operators.uneryOperators();
    }

}
