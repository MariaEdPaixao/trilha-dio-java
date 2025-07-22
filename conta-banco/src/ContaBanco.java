import java.math.BigDecimal;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    ContaBanco(int numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia.trim();
        this.nomeCliente = nomeCliente.trim();
        this.saldo = saldo;
    }

    public void exibirMensagemDeBoasVindas() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo
                + " já está disponível para saque.");
    }
}
