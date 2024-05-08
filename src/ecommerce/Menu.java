package ecommerce;
//memu
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.model.Ecommerce;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao, id, numero;
		String nome, tipo;
		float preco;
		
		while(true) {
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("               BANCO DO BRAZIL COM Z              ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("          1 - Cadastrar produto                   ");
			System.out.println("          2 - Veja todos os produtos cadastrados  ");
			System.out.println("          3 - Pesquisar produto por id            ");
			System.out.println("          4 - Atualizar dados do produto          ");
			System.out.println("          5 - Apagar produto                      ");
			System.out.println("          9 - Sair                                ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("Entre  com a opção desejada:                      ");
			System.out.println("                                                  ");				
						
			try {
				opcao = leia.nextInt();
				
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println("\nJASMIM FLORICULTURA");
				MetodoSobre();
                 		leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar produto\n\n");

				break;
			case 2:
				System.out.println("Veja todos os produtos cadastrados\n\n");

				break;
			case 3:
				System.out.println("Pesquisar produto por id\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados do produto\n\n");

				break;
			case 5:
				System.out.println("Apagar produto\n\n");

				break;
			
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
		}
		
		
		}

}


private static void MetodoSobre() {
	System.out.println("\n************************************************************************");
	System.out.println("Projeto Desenvolvido por: Gabriel Francisco Rezende de Camargo dos Santos");
	System.out.println("contatogabrezende@gmail.com                                              ");
	System.out.println("github.com/GabRezende/Atividade.Conta.git                                ");
	System.out.println("*************************************************************************");
}
}