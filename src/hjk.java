class Time  {
    public int hours;
    public int minute;
    public int sec;
    public Time(){
        hours=6;
        minute=88;
        sec=90;
    }
public Time(int hr,int min,int se) {
    if (hr >= 0 && hr < 24)
        hours = hr;
    else
        hours = 0;
    if (min >= 0 && min < 60)
        minute = min;
    else
        minute = 0;
    if (se >= 0 && se < 60)
        sec = se;
    else
        sec = 0;
}
public void display(){
    System.out.println(hours+":"+minute+":"+sec);}
}
public class hjk {
    public static void main(String[] args){
        Time t1=new Time();
        t1.display();
        Time t2=new Time(56,78,33);
        t2.display();
    }
}