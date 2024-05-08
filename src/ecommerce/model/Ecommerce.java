package ecommerce.model;
//model
public class Ecommerce {
	
	private int  opcao;
	private int id;
	private int numero;
	private String nome;
	private float preco;
	
	//construct using fields
	public Ecommerce(int opcao, int id, int numero, String nome, float preco) {
		//super();
		this.opcao = opcao;
		this.id = id;
		this.numero = numero;
		this.nome = nome;
		this.preco = preco;
	}
	
	
	//gets and setters
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	

}
