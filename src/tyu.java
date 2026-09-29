class Distance {
    public int feet;
    public int inches;
    public Distance(){
        feet=55;
        inches=90;
    }
public Distance(int f,int inch){
    feet=f;
    inches=inch;}
public void display(){
    System.out.println(feet+inches);}
}
public class tyu{
    public static void main(String[] args){
        Distance d1=new Distance();
        System.out.println("distance 1");
    d1.display();
    Distance d2=new Distance(10,30);
        System.out.println("distance 2");
    d2.display();}
}