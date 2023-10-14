import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String apresentacao = """
                ***********************
                Dados iniciais do cliente:
                                
                Nome: Jacqueline Oliveira
                Tipo conta: Corrente
                Saldo inicial: R$ 2500,00
                ***********************
                                
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        double saldo = 2500.00;
        System.out.println(apresentacao);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite a opção desejada: ");
            int operacao = leitura.nextInt();
            if (operacao == 1) {
                System.out.println("Seu saldo é de R$" + saldo);
            } else if (operacao == 2) {
                System.out.println("Quanto gostaria de depositar?");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Depósito de R$" + deposito + " concluído. Novo saldo: R$" + saldo);
            } else if (operacao == 3) {
                System.out.println("Quanto gostaria de sacar?");
                double retirada = leitura.nextDouble();
                if (saldo - retirada < 0) {
                    System.out.println("Saldo insuficiente");
                } else {saldo -= retirada;
                System.out.println("Saque de " + retirada + " concluído. Novo saldo: R$" + saldo);}
            } else if (operacao == 4) {
                System.out.println("Encerrando");
                continuar = false;
            } else System.out.println("Comando inválido, tente novamente");



        }
    }
}

