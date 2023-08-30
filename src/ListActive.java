import java.util.Scanner;
import java.util.Stack;
public class ListActive {

    Scanner read = new Scanner(System.in);
    boolean rep = true;
    Front front = new Front();

    public ListActive(DataIn customerData, Customer customer, Stack <Customer> stack){

    while(rep){
        int option = front.menu();
        switch (option){
            case 1:
            stack.add(customerData.customerData(customer));
            break;
            case 2:
                if(stack.isEmpty() == true){
                    write("Nenhum usuário cadastrado");
                    write("");
                    break;
                }else
            stack.pop();
            break;
            case 3:
           boolean active =  customer.isActive();



               for(int i = 0; i < stack.size(); i++){
                   if(active == true) {
                       System.out.println("Nome: "+stack.get(i).getName());
                       System.out.println("E-mail: "+stack.get(i).getEmail());
                       System.out.println("Data de nasc.: "+stack.get(i).getBrithday());
                       System.out.println("Altura: "+stack.get(i).getHeight());

               }
                   else if(stack.isEmpty() == true)
                       write("Nenhum usuário cadastrado");
                   write("");
           }
               break;
            case 0:
                write("Obrigado!");
                rep = false;
        }




    }//while












    }//constructor









    public void write(String text){
        System.out.println(text);
    }//read

}//class
