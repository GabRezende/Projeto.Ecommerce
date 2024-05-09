package ecommerce.repository;
import ecommerce.model.Ecommerce;

public interface EcommerceRepository {
	// CRUD da Conta
	public void procurarPorId(int numero);
	public void listarTodos();
	public void cadastrar();
	public void atualizar();
	public void deletar(int numero);
	
	
}
