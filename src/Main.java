import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente();
		cl1.setNome("henrique");
		
		Conta cc = new ContaCorrente(cl1);
		Conta poupanca = new ContaPoupanca(cl1);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco bb = new Banco();
		ArrayList<Conta> contas = new ArrayList<>();

		contas.add(cc);
		contas.add(poupanca);


	}

}
