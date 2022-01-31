package Test;

import Dominio.Cliente;
import Dominio.Conta;
import Dominio.ContaCorrente;
import Dominio.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente Lucas = new Cliente();
        Lucas.setNome("Lucas");
        Conta cc = new ContaCorrente<>(Lucas);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(Lucas);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();;
        poupanca.imprimirExtrato();



    }

}
