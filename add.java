import java.util.Scanner;

public class add 
{
  public static void main(String[] args) 
{
    int a, b, sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number");
    a = sc.nextInt();

    System.out.println("Enter Second Number");
    b = sc.nextInt();

    sum = a + b;
    System.out.println("Sum of two numbers is " + sum);
  }
} 
