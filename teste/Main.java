package teste;

import java.util.Stack;


public class Main {
    public static void main(String[] args){
        Stack<Customer> a = new Stack<>();

        while(true){
            Customer bilomba = new Customer();
            a.push(bilomba);
            for(Customer i : a){
                System.out.println(i.name);
            }
        }
       
    }
 

    

}
