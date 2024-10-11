import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Olá, para começarmos digite seu nome: ");
        String cliente = scanner.nextLine();
        
        System.out.print(cliente + " por favor, digite o número da agência com o digito onde vai guardar seu dinheiro: ");
        String agencia = scanner.nextLine();

        System.out.print(cliente + " agora digite o número da conta que gostaria de criar: ! ");
        int conta = scanner.nextInt();

        System.out.print(cliente + " qual valor que quer guardar em sua nova conta? ");
        double saldo = scanner.nextDouble();

        System.out.print(" Obrigado por criar uma conta em nosso banco " + cliente + ", a partir de hoje sua agencia é " + agencia + 
        " e sua conta será a " + conta + " seu saldo inicial é de: " + saldo + " e já está disponível para saque!");
        
        scanner.close();
    }
}


