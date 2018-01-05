/**
 * Created by rajan on 4/1/18.
 */
public class FirstDemo {

    static int a=20;


     void getData()
     {
         int a;
         a=10;
         System.out.println("a: "+a);
     }

    static void showData()
     {
         System.out.println(a);
     }

     static
     {
         System.out.println("inside static block");
     }

    public static void main(String[] args) {

         FirstDemo firstDemo=new FirstDemo();
         firstDemo.getData();
         FirstDemo.showData();
    }
}
