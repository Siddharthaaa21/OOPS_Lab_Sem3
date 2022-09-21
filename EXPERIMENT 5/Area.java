//QUESTION 1
interface test{
    public int square(int a); 
}
class ToTestInt implements test{
    public int square (int a)
    {
        return a*a;
    }
}
public class Area{
    public static void main(String[] args) {
        ToTestInt a=new ToTestInt();
        int area=a.square(19);
        System.out.println(area);
    }
}