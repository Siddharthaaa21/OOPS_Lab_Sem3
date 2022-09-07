import java.nio.file.FileStore;

import javax.sql.rowset.FilteredRowSet;

//Write a Java program to show that private member of a super class cannot be accessed from derivedclasses.
  class one
  {
     private int first =20;
    int second =40;
    static int third=60;
    private void method(int a,int b,int c)
    {
        int fl=a;
        int f2=b;
        int f3=c;
    
        display(f1,f2,f3);
    }
    void method_two(int a,int  b,int c)
    {
        int f1=a;
        int f2=b;
        int f3=c;
        display(f1,f2,f3);
        
    }
    void display(int f1,int f2,int f3)
    {
System.out.print(f1+""+f2+""+f3);
    }

  }
  class two extends one
  {
     int a=first;
     int b=second;
     int c=third;
  
  
void display(int a,int b,int c)
{
System.out.print(a+""+b+""+c);
}}
class main extends two{
public static void main(String args[])
{
    two ob=new two();
    int result=ob.method_two(first, second, third);
    System.out.println(result);
    int result_default=ob.method_two(first, second, third);
    System.out.println(result_default);


}
}
