import java.util.*;
public class celsiusToFahenheit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Celsius: ");
int celsius=sc.nextInt();
double farenheit = (celsius * 9.0 / 5) + 32; 
System.out.println("The " + celsius + "celsius" + "is" + farenheit + "Fahrenheit");
}
}

