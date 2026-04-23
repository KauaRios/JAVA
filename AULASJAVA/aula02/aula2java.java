package aula02;
import java.util.Scanner;
import java.util.InputMismatchException;
public class aula2java {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);


    /*System.out.println("Digite Seu Nome : ");
    String NomeCompleto=scan.nextLine();


    System.out.println("Seu Nome Completo é:  "+ NomeCompleto);


    System.out.println("Digite Seu Primeiro Nome : ");
    String primeiroNome=scan.next();
    scan.nextLine();

    System.out.println("Seu primeiro nome é : " + primeiroNome);


    System.out.println("Digite sua Idade : ");
    int idade= scan.nextInt();
    System.out.println("Sua idade é : "+ idade);*/

        // 2. Inicializar a variável fora do try
        double altura = 0.0;
        boolean entradaValida=false;
        while(!entradaValida){
        try {
            System.out.println("Digite sua altura Exemplo(1,80) : ");

            altura = scan.nextDouble();

            entradaValida=true;
        } catch (InputMismatchException e) {
            System.out.println("O formato digitado deve ser Com virgula Ex: 1,80");
            scan.next();
        }

        }
        System.out.println("Sua altura é: " + altura);
        scan.close();
    }
}



