import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco contaBanco; 

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Por favor, digite o número da Agência: ");
            int numeroAgencia = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Digite o nome da sua agência: ");
            String nomeAgencia = scanner.nextLine();
    
            System.out.print("Digite o seu nome: ");
            String nomeCliente = scanner.nextLine();
    
            System.out.print("Digite seu saldo: ");
            BigDecimal saldo = scanner.nextBigDecimal();
    
            contaBanco = new ContaBanco(numeroAgencia, nomeAgencia, nomeCliente, saldo);
    
            contaBanco.exibirMensagemDeBoasVindas();
        }
        catch(Exception exception){
            System.out.println("Digite um valor correto. ");
        }
    }
}
