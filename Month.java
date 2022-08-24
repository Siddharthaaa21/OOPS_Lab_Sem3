import java.util.*;
public class Month {
    String Number (int n)
    {
String a[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November" ,"December"};
return (a[n-1]);
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    {
        System.out.println("Enter the number for the month you want");
    int num = sc.nextInt();
    Month ob=new Month();

    String b = ob.Number(num);
System.out.println("is to "+b ) ;  }
}
    
}
