interface Shape{
final float pi=3.14f;
int area(int ,int );
int volume(int ,int );
}
class Cylinder implements Shape{
    float pi=3.14f;
    int area (int  r, int h){
        //cylinder = 2πrh
        int area =(int) (2*pi*r*h);
        return area;
    }
    int volume(int r,int R){
        //: V = π (R2 – r2) h 
        int volume=(int)pi*(R*R-r*r);
        return volume;
    }}
    class Show extends Cylinder{

    
    void display(){
        System.out.println("The area is: ");
        System.out.println(area(10,20));
        System.out.println("The volume is : ");
        System.out.println(volume(10,15));

    }}

class Cone implements Shape{
    final float pi=3.14f;
    int area (int r,int h){
     //πr(r+h2+r2)
      
        int area =(int) (pi*r*(r+Math.sqrt(h*h+r*r)));
        return area;
    }
    int volume(int r,int h){
        //: V = π (R2 – r2) h 
        int volume=(int)pi*(r*r)*h/3;
        return volume;
    }}
    class Show extends Cone {
        void display(){
        System.out.println("The area is: ");
        System.out.println(area(10,20));
        System.out.println("The volume is : ");
        System.out.println(volume(10,15));

    }

}
public class Example2 {
    public static void main (String args[]){
        Cylinder ob=new Cylinder();
        Cone obj=new Cone();
        ob.display();
        obj.display();
        

    }
    
}
