
//question 2
interface A{
    final int a=10;

     void meth1(int b);
     void meth2(int a);

}
class Myclass implements A{
     public void meth1(int b){

       System.out.println(b);
    }
    
     public void meth2(int a){

        System.out.println(a);
    }
}
    public class Example {
        public static void main (String  args[])
        {
           Myclass ob =new Myclass();
          ob.meth1(50);
       
          ob.meth2(50);
        }
}