class Marks {
    public int A;
    public int B;
    public int C;
    public Marks(){
        A=56;
        B=99;
        C=56;
    }
public Marks(int a,int b, int c){
    A=a;
    B=b;
    C=c;}
public int calculateSum(){
    return (A+B+C);}
}
public class uio {
    public static void main(String[] args){
        Marks m1=new Marks();
        System.out.println(m1.calculateSum());
        m1.calculateSum();
        Marks m2=new Marks(23,45,67);
        System.out.println(m2.calculateSum());

        }
    }

