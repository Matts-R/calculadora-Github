
public class Calculos_f1 {

    public static void calculo(int escolha, double num1, double num2) {
        switch (escolha) {
            case 1:
                System.out.println("\nA operação escolhida foi ADIÇÃO");
                num1 += num2;
                System.out.printf("O resultado é %.2f ", num1);
                break;
            case 2:
                System.out.println("\nA operação escolhida foi SUBTRAÇÃO");
                num1 -= num2;
                System.out.printf("O resultado é %.2f ", num1);
                break;
            case 3:
                System.out.println("\nA operação escolhida foi MULTIPLICAÇÃO");
                num1 *= num2;
                System.out.printf("O resultado é %.2f ", num1);
                break;
            case 4:
                System.out.println("\nA operação escolhida foi DIVISÃO");
                num1 /= num2;
                System.out.printf("O resultado é %.2f ", num1);
                break;
            case 5:
                System.out.println("\nA operação escolhida foi POTENCIAÇÃO");
                num1 = Math.pow(num1, num2);
                System.out.printf("O resultado é %.2f " + num1);
                break;
            case 6:
                System.out.println("\nA operação escolhida foi RADICIAÇÃO");
                num1 = Math.sqrt(num1);
                System.out.printf("O resultado é %.2f ", num1);
                break;
            default:
                System.out.println("A operação matemática desejada ainda não foi adicionada");
        }
    }
}
