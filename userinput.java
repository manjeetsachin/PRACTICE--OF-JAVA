import java.util.Scanner;
public class userinput {
    public static void main (String args[]){
        System.out.println("taking user input");
        Scanner sc = new Scanner (System.in);

        System.out.println("enter number one");
        int a = sc.nextInt();
        System.out.println("enter second number ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("sum = "+ sum);

    }
    
    
}
