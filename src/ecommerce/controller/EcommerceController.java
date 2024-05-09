package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Ecommerce;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {

    private ArrayList<Ecommerce> listaProdutos = new ArrayList<>();
    private int numero = 0;
    private Ecommerce produto;

    @Override
    public void procurarPorId(int numero) {
    }

    @Override
    public void listarTodos() {
        for (Ecommerce produto : listaProdutos) {
            produto.visualizar();
        }
    }

    @Override
    public void cadastrar() {
        listaProdutos.add(produto);
        System.out.println("\nO produto foi criado com sucesso!");
    }

    @Override
    public void atualizar() {
        var buscaProduto = BuscarNaCollection(produto.getNumero());
        if (buscaProduto != null) {
            listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
            System.out.println("\nO produto número " + produto.getNumero() + " foi atualizado com sucesso!");
        } else {
            System.out.println("\nO produto número " + produto.getNumero() + " não foi encontrado.");
        }
    }

    @Override
    public void deletar(int numero) {
        var produto = BuscarNaCollection(numero);
        if (produto != null) {
            if (listaProdutos.remove(produto)) {
                System.out.println("\nO produto número " + numero + " foi deletado com sucesso!");
            }
        } else {
            System.out.println("\nO produto número " + numero + " não foi encontrado.");
        }
    }

    public int gerarNumero() {
        return ++numero;
    }

    public Ecommerce BuscarNaCollection(int numero) {
        for (Ecommerce produto : listaProdutos) {
            if (produto.getNumero() == numero) {
                return produto;
            }
        }
        return null;
    }
}
