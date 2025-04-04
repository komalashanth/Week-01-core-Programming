import java.util.*;
public class NumberOfHandShakes {
public static int calculatorShakeHand(int n){
return (n*(n-1))/2;
}
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of students:");
    int n=sc.nextInt();
    int handshakes=calculatorShakeHand(n);
    System.out.println("The maximun number of handshakes possible among" + n + "students is:" + handshakes);
    sc.close();
  }  
}
