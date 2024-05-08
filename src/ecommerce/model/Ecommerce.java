package ecommerce.model;
//model
public abstract  class Ecommerce {

	private int  opcao;
	private int id;
	private int numero;
	private int tipo;
	private String nome;
	private float preco;
	
	//field
	public Ecommerce(int id, int numero, int tipo, String nome, float preco) {
		this.id = id;
		this.numero = numero;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
		
	}
	//gest and setts
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

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
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


	
	//metodo para exibir 
	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Planta viva";
		break;
		case 2:
			tipo = "Planta decoração";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("***********************************************************");
		System.out.println("ID do produto: " + this.id);
		System.out.println("Numero do produto: " + this.numero);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Preço do produto: " + this.preco);
		System.out.println("Tipo do produto: " + this.tipo);
	}
}
