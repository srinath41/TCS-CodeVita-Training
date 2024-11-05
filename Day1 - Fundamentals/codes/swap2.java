// package codevita.TCS-CodeVita-Training;
import java.util.Scanner;
public class swap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt();
        //using 3rd variable
        // int c;
        // c=a;
        // a=b;
        // b=c;

        //without using 3rd variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        sc.close();
    }
}
