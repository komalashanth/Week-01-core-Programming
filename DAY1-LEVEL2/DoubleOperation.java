import java.util.*;
public class DoubleOperation{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double result1=(a + b *c);
double result2=(a * b + c );
double result3=(c + a / b);
System.out.println("The results of Int Operations are " + result1);
System.out.println("The results of Int Operations are " + result2);
System.out.println("The results of Int Operations are " + result3);
}
}