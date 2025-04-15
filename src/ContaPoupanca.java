
public class ContaPoupanca extends Conta {

	ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
