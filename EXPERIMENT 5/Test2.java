//Question 4

interface A{
    int division(int a,int b);
    int modulus (int a,int b);
}
class B implements A{
    
    public int division(int a,int b) {
        return (int)(a/b);
    }
    public int module(int a, int b) {
        return (int)(a%b);        
    }
}
public class Test2 {
    public static void main(String[] args) {
        
    B obj=new B();
    int div=obj.division(15,4);
    int mod=obj.module(15,4);
    System.out.println("Division= "+div+"\nModulus= "+mod);
}
}
