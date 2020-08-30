import java.util.*;
class Volume
{
    float volume(float s)
    {
        float v=s*s*s;
        return v;
    }
    double volume(double r)
    {
        double v=(4/3)*(22/7)*r*r*r;
        return v;
    }
    double volume(double l, double b, double h)
    {
        double v=l*b*h;
        return v;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of cube");
        float s=sc.nextInt();
        System.out.println("Enter radius of sphere");
        double r=sc.nextDouble();
        System.out.println("Enter length of rectangle");
        double l=sc.nextFloat();
        System.out.println("Enter breadth of rectangle");
        double b=sc.nextFloat();
        System.out.println("Enter height of rectangle");
        double h=sc.nextFloat();
        Volume obj=new Volume();
        float cube=obj.volume(s);
        double sphere=obj.volume(r);
        double cuboid=obj.volume(l,b,h);
        System.out.println("Volume of cube="+cube);
        System.out.println("Volume of sphere="+sphere);
        System.out.println("Volume of cuboid="+cuboid);
    }
}