import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorVendedor {
	Collection <Vendedor> vendedores = new ArrayList<Vendedor>();
	
	public void cadastroVendedor(){
		
		Vendedor v = new Vendedor();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome do Vendedor: ");
		v.setNome(scanner.nextLine());
		System.out.println("Matricula do vendedor: ");
		v.setMatricula(scanner.nextLine());
		System.out.println("Data de contratação: ");
		v.setDataContratacao(scanner.nextLine());
		
		vendedores.add(v);
		
		
	}
	
	

}
