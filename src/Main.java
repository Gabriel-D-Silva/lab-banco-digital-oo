
public class Main {

	public static void main(String[] args) {
		Banco BB = new Banco("Banco do Brasil");
		BB.cadastrarCliente(new Cliente("Venilton"), "C");
		Conta Venilton = BB.getContas().get(0);
		BB.cadastrarCliente(new Cliente("Lucas"), "C");
		Conta Lucas = BB.getContas().get(1);
		BB.cadastrarCliente(new Cliente("Danilo"), "P");
		@SuppressWarnings("unused")
		Conta Danilo = BB.getContas().get(2);

		
		Venilton.transferir(100, Lucas);;
		
		Venilton.imprimirExtrato();
		Lucas.imprimirExtrato();
		
		BB.toString();
	}

}
