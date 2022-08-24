
import java.util.*;
public class Square 
{
    void Array(int arr[])
    {
        int sum=0;
        int i=0; 
         System.out.println("the sqaure is  ");
        for(i=0;i<10;i++)
        {
        sum =arr[i]+sum;
            arr[i]=arr[i]*arr[i];
            System.out.print(arr[i]+" ");

        }
        System.out.println("sum is "+sum);

        
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       {int[] arr=new int[10];
        System.out.println("Give the number to the array");
        
        for(int i=0;i<10;i++)
        {
          arr[i]=sc.nextInt();
            
        }
       Square ob =new Square();
        ob.Array(arr);
       
       }


    
    }
}
