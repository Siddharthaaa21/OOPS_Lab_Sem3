interface A{
    int sum(int a,int b);
}
interface B{
    int sum(int a,int b);
}
class C implements A,B{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
public class Multiple_inheritance {
    public static void main(String[] args) {
        C obj=new C();
        System.out.println(obj.sum(5,70));
    }
}
