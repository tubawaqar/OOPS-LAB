class Circle {
    public double radius;
    public Circle(){
        radius=23;
    }
public Circle(double r){
    radius=r;}
public double calculateCircumference(){
    return (2*Math.PI* radius);
}}
public class abc{
    public static void main(String[] args){
        Circle c1=new Circle();
        System.out.println(c1.calculateCircumference());
        Circle c2=new Circle(89);
        System.out.println(c2.calculateCircumference());
    }
}