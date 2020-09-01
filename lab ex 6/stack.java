
import java.util.*;

public class newStack {

    public static void main(String[] args) {
        
        int choice;
        mystack container=new mystack();
        Scanner obj=new Scanner(System.in);
        do{
        System.out.println("enter the number 1 to push\t2 to pop\t3 to view");
        choice=obj.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter the number to push");
                int m=obj.nextInt();
                container.push(m);
                break;
            case 2:
                container.pop();
                break;
            case 3:
                container.view();
                break;
            default:
                System.out.println("enter the number 1 to push\t2 to pop\t3 to view");
                break;
        }
        System.out.println("enter the 1 to continue");
         choice=obj.nextInt();
         
        }while(choice==1) ;
    }
   
}
abstract class Stack{
    int max=2,top=-1;
    int[] a=new int[max];
    abstract void push(int n);
    abstract void pop();
    abstract void view();
    public boolean empty(){
        if(top==-1)
            return true;
         else
           return false;
    }
   
    public boolean overflow(){
        if(top==(max-1))
            return true;
        else
            return false;
    }
}
class mystack extends Stack{
   
    public void pop(){
        if(super.empty())
            System.out.println("your STACK is EMPTY can't pop ");
        else
           top--;
    }
    public void push(int n){
        if(super.overflow())
          System.out.println("your STACK is FULL can't add ");
           
        else{
        top++;
        a[top]=n;
        }
    }
    public void view(){
        if(super.empty())
            System.out.println("your STACK is empty ");
        else{
        System.out.println("your STACK  ");
        for(int i=0;i<=top;i++)
            System.out.printf("%d ",a[i]);
        System.out.println("<-top");
        }
    }
}

