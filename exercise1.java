import java.util.Scanner;

public class exercise1 {
    public static void main (String args[]){
        System.out.println("Calculate your marks % ");

        Scanner sc = new Scanner (System.in);
        System.out.println("enter your marks in english");
        int a = sc.nextInt();
        System.out.println("enter yur marks in math");
        int b =sc.nextInt();
        System.out.println("enter your marks in hindi");
        int c =sc.nextInt();
        System.out.println("enter your marks in science");
        int  d =sc.nextInt();
        System.out.println("enter your marks in yooga");
        int e =sc.nextInt();
        System.out.println("enter max total no of marks of  all subjects ");
        int f=sc.nextInt();
        float m= (a+b+c+d+e); 
        float n = (m/f)*100;
        System.out.println("total percantage of your marks = " +n);
    }
    
}
