
import java.util.Locale;
import java.util.Scanner;

public class Calculadora_F0 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//DEFININDO O LOCAL COMO 
        Scanner leia = new Scanner(System.in);

        double num1, num2;
        int escolha;

        System.out.println("\tEsse é um programa teste para calculadora");
        System.out.println("\n\tEscolha a operação desejada");
        System.out.println("|Opção 1: Adição|\n|Opção 2: Subtração|\n|Opção 3: Multiplicação|\n|Opção 4: Divisão|\n"
                + "|Opção 5: Potenciação|\n|Opção 6: Radiciação|\n");
        System.out.print("Favor inserir o número da operação desejada: ");
        escolha = leia.nextInt();
        System.out.print("Agora insira o primeiro número da operação: ");
        num1 = leia.nextDouble();
        System.out.print("Agora o segundo número da operação: ");
        num2 = leia.nextDouble();

        Calculos_f1.calculo(escolha, num1, num2);

        leia.close();
    }
}
