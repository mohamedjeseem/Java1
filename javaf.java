import java.util.Scanner;
//Java program to find age
class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=obj.nextInt();
        if (age>=18)
           System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible");
    }
}