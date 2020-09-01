import java.util.*;
public class creditcard {

    public static void main(String[] args) {
        
        Scanner obj1=new Scanner(System.in);
        int m;
        customer obj[]=new customer[5];
        for(int i=0;i<5;i++){
            System.out.println("enter name card number pin creditAmount paybalance");
            obj[i]=new customer();
        }
        for(int i=0;i<5;i++){
            System.out.println("enter 1 to change your pin number");
           
            int n=obj1.nextInt();
            if(n==1){
               m=obj1.nextInt();  
             
              System.out.println("enter pin");
              obj[i].changePin(m);
            }
           
        }
        for(int i=0;i<5;i++){
            System.out.println("pay balance of "+obj[i].name+" is");
            obj[i].payBalance();
        }
        for(int i=0;i<5;i++){
            System.out.println(obj[i].name+obj[i]);
           
        }
    }
   
}
interface CreditCardInterface{
   void viewCreditAmount();
   void viewPin();
   void changePin(int n);
   void payBalance();
}
class customer implements CreditCardInterface{
    String name;
    long cardNumber;
    int pin;
    double creditAmount;
    double pay;
    customer (){
        Scanner obj=new Scanner(System.in);
        name=obj.next();
        cardNumber=obj.nextLong();
        pin=obj.nextInt();
        creditAmount=obj.nextDouble();
        pay=obj.nextDouble();
    }
    public void viewCreditAmount(){
        System.out.println("CreditAmount:"+creditAmount);
    }
    public void viewPin(){
        System.out.println("your pin :"+pin);
       
    }
    public void changePin(int n){
        pin=n;
       
    }
    public void payBalance(){
        System.out.println(pay);
    }
    public String toString(){
       return " pin:"+pin;
    }
}

	
