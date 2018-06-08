
public class Produto {
	
	double peso;
	String nome;
	int estoqueMinimo;
	int estoqueAtual;
	double preco;
	
	
	
	
	public void setNome(String novoNome)
	{
		this.nome = novoNome; 		
	}
	
	public void setEstoqueAtual(int estoque)
	{
		this.estoqueAtual =  estoque;
	}
	
	public void setEstoqueMinimo(int estoqueMinimo)
	{
		this.estoqueMinimo = estoqueMinimo;
	}
	
	public void setPeso(double novoPeso)
	{
		this.peso = novoPeso;
	}
	
	public void setPreco(double novoPreco)
	{
		this.preco = novoPreco;		
	}
	
	public void status()
	{
		System.out.println("Produto: " + this.nome);
		System.out.println("Peso: " + this.peso);
		System.out.println("Preço: " + this.preco);
		System.out.println("Estoque: " + this.estoqueAtual);		
	}

}
