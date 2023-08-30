import java.util.Scanner;


public class DataIn {

    Scanner read = new Scanner(System.in);

     public Customer customerData (Customer customer){

         boolean rep = true;

         write("Digite o nome do cliente");
         customer.setName(read.next());

         write("Digite o e-mail do cliente");
         customer.setEmail(read.next());

         write("Digite a a data de nascimento");
         customer.setBrithday(read.next());

         write("Digite a altura do cliente");
         customer.setHeight(read.nextDouble());

         while (rep){
             write("Este cliente está ativo? (Sim/Não)");
            if(read.next().equalsIgnoreCase("Sim")){
                customer.setActive(true);
            rep = false;
            }//if
           else if(read.next().equalsIgnoreCase("Não") || read.next().equalsIgnoreCase("Nao")) {
                customer.setActive(false);
                rep = false;
            }//if
            else {
                write("Opção incorreta");

          } //else
         }//while

         return customer;//retorna o objeto com os dados
     }




    public void write(String text){
        System.out.println(text);
    }//read

}//dataIn

