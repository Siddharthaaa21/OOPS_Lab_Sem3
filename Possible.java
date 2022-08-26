import java.util.Scanner;
public class Possible
{
    int Number(int n)
    {int i=0;
        int a[]={0,0,0};
        while(n!=0)
        {
         a[i]=n%10;
        n=n/10;
        i++;
        }
        return a;

    }
    void initial(int a[])
    {
System.out.println("The possible number are:");
System.out.println(a[0]+a[1]+a[2]);
System.out.println(a[0]+a[2]+a[1]);
System.out.println(a[1]+a[0]+a[2]);
System.out.println(a[1]+a[2]+a[0]);
System.out.println(a[2]+a[1]+a[0]);
System.out.println(a[2]+a[0]+a[1]);
    }

    public static void main(String[] args)
     {Scanner sc =new Scanner(System.in);
        {
        System.out.println("Give a three digit number to get the possible outcomes: ");
        int n=sc.nextInt();
        Possible ob=new Possible();
        int a[]=ob.Number(n);
        ob.initial(a);
        
    }
}
}