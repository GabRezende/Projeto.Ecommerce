package ecommerce.model;

public class Ecommerce2 extends Ecommerce {

	private String detalhes;
	public Ecommerce2(int id, int numero, int tipo, String nome, float preco, String detalhes) {
		super(id, numero, tipo, nome, preco);
		this.detalhes = detalhes;
		
		
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Esses são os detalhes do produto: " + this.detalhes);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}