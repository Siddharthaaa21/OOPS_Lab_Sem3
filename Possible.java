import java.util.Scanner;
class Possible
{
   void Number(int n)
    {int i=2;
        int a[]=new int[3];
        while(n!=0)
        {
         a[i]=n%10;
        n=n/10;
        i--;
        }
       initial(a);

    }
  
    void initial(int[] arr)
    {
System.out.println("The possible number are:");
System.out.println(arr[0]+""+arr[1]+""+arr[2]);
System.out.println(arr[0]+""+arr[2]+""+arr[1]);
System.out.println(arr[1]+""+arr[0]+""+arr[2]);
System.out.println(arr[1]+""+arr[2]+""+arr[0]);
System.out.println(arr[2]+""+arr[1]+""+arr[0]);
System.out.println(arr[2]+""+arr[0]+""+arr[1]);
    }

    public static void main(String[] args)
     {Scanner sc =new Scanner(System.in);
        {
        System.out.println("Give a three digit number to get the possible outcomes: ");
        int n=sc.nextInt();
        Possible ob=new Possible();
        ob.Number(n);
       
        
    }
}
    
    }
