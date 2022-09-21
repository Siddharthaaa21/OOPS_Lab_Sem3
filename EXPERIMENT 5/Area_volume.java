//Question 3
import java.lang.Math;
import java.util.Scanner;
interface shape{
    float pi= 3.142f;
    public float area(float r,float h);
    public float volume (float r,float h);
}
class Cylinder implements shape{
    public float area(float r, float h) {
        return ((2*pi*r*h) + (2*pi*r*r));
    }
    
    public float volume(float r, float h) {
        return pi*r*r*h;
    }
}
class Cone implements shape{
    public float area(float r, float h) {
        return (float) (pi*r *(r+ Math.sqrt(r*r+h*h)));
    }
    
    public float volume(float r, float h) {
        return pi*r*r*(h/3);
    }
}
public class Area_volume5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("radius ");
            float r=sc.nextFloat();
            System.out.println("height ");
            float h=sc.nextFloat();
            Cylinder cyn=new Cylinder();
            float area=cyn.area(r, h);
            System.out.println("Area of cylinder: " +area);
            float volume= cyn.volume(r, h);
            System.out.println("volume cylinder: "+volume);
            Cone con=new Cone();
            float areac=con.area(r, h);
            System.out.println("Area of cone: " +areac);
            float vol= cyn.volume(r, h);
            System.out.println("Volume of cone: "+vol);
        }
    }
}
