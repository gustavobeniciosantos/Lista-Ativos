import java.util.Scanner;
public class Front {
    Scanner read = new Scanner(System.in);



    public int menu(){

        write("1. Adicionar Cliente");
        write("2. Remover último cliente");
        write("3.Verificar cadastros ativos");
        write("0. Sair");


     return read.nextInt();
    }//menu


    public void write(String text){
        System.out.println(text);
    }

}
