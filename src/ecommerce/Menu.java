package ecommerce;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerce.model.Ecommerce;
import ecommerce.model.Ecommerce2;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		int opcao, id, numero, tipo;
		String nome;
		float preco;
	
		
		while(true) {
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("                JASMIM FLORICULTURA               ");
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
				
				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();
				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				System.out.println("Digite o preço do produto: ");
				preco = leia.nextFloat();
				System.out.println("Digite o tipo do produto (1 - Planta Viva ou 2 - Planta de Plastico): ");
				tipo = leia.nextInt();
                System.out.println("\nProduto cadastrado!");
				continuar();
				break;
		
			case 2:
				System.out.println("Veja todos os produtos cadastrados\n\n");
				continuar();
				break;
				
			case 3:
				System.out.println("Pesquisar produto por id\n\n");
				continuar();
				break;
				
			case 4:
				System.out.println("Atualizar dados do produto\n\n");
				continuar();
				break;
				
			case 5:
				System.out.println("Apagar produto\n\n");
				continuar();
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



public static void continuar() {
	try {

		System.out.println("\n\nPressione Enter para Continuar...");
		System.in.read();

	} catch (IOException e) {

		System.out.println("Você pressionou uma tecla diferente de enter!");

	}
}
}