class Account {
   public double balance;
   public Account(){
       balance=89;
   }
public Account(double b){
   balance=b;}
public double deposit(double amount){
       balance+=amount;
   return balance;}
public double withdraw(double amount){
   balance=-amount;
   return balance;}}
public class xyz {
    public static void main(String[] args){
        Account a1=new Account();
        System.out.println(a1.balance);
        System.out.println(a1.deposit(78));
        Account a2=new Account();
        System.out.println(a2.balance);
        System.out.println(a2.withdraw(99));

    }
}