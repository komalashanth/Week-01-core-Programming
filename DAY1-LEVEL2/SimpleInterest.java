import java.util.*;
public class SimpleInterest{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter principle:");
int principle=sc.nextInt();
System.out.println("Enter rate:");
int rate=sc.nextInt();
System.out.println("Enter time:");
int time=sc.nextInt();
double simpleInterest=(principle*rate*time)/100;
System.out.println(" The Simple Interest is" + simpleInterest + "for Principal"+ principle+ "Rate of Interest" + rate + "and Time" + time);
}
}
