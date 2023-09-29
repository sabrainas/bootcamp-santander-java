package main.java.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qtd){
        itemList.add(new Item(nome, preco, qtd));
    }

    public void removerItem(String nome){
        if(!itemList.isEmpty()){
            List<Item> itemParaRemover = new ArrayList<>();
            for(Item i : itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll((itemParaRemover));
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem = item.getPreco() * item.getQtd();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(itemList);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lapis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Borracha", 1d, 3);
        carrinhoDeCompras.adicionarItem("Caneta", 3d, 4);
        carrinhoDeCompras.adicionarItem("Apontador", 1d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lapis");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());
    }
}
