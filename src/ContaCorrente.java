
public class ContaCorrente extends Conta {

	ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
