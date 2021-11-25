package q5;

import java.util.Scanner;

public class ProcessoCompra {

    private int totalDeContas;
    private int totalDeProdutos;
    private Cliente[] vetorCliente;
    private Produto[] vetorProduto;
    private Scanner texto;

    public ProcessoCompra() {
        this.totalDeContas = 0;
        this.vetorCliente = new Cliente[10];
        this.vetorProduto = new Produto[10];
        this.texto = new Scanner(System.in);
    }

    public void cadastroCliente() {

        System.out.print("\nDigite o nome do cliente: ");
        String nome = texto.nextLine();
        System.out.print("\n Digite o cpf do cliente: ");
        String cpf = texto.nextLine();
        System.out.print("\nDigite o e-mail do cliente: ");
        String email = texto.nextLine();
        System.out.print("\nDigite o endereco do cliente: ");
        String endereco = texto.nextLine();
        Cliente cl = new Cliente(this.totalDeContas + 1, nome, cpf, email, endereco);
        this.vetorCliente[this.totalDeContas] = cl;
        // this.totalDeContas = this.totalDeConta + 1;
        this.totalDeContas++;

    }

    public void cadastroProduto() {
        System.out.print("\nDigite o nome do Produto: ");
        String nome = texto.nextLine();
        System.out.print("\n Digite a quantidade do Produto: ");
        int quantidade = texto.nextInt();
        System.out.print("\nDigite o preço do Produto: ");
        float preco = texto.nextFloat();
        texto.nextLine();
        Produto p = new Produto(nome, quantidade, preco);
        this.vetorProduto[this.totalDeProdutos] = p;
        this.totalDeProdutos++;
    }

    public Cliente buscarCliente(String nome) {
        for (int i = 0; i < this.vetorCliente.length; i++) {
            if (this.vetorCliente[i].getNome().equals(nome)) {
                return this.vetorCliente[i];
            }
        }
        return null;
    }

    public Produto buscarProduto(String nome) {
        for (int i = 0; i < this.vetorProduto.length; i++) {
            if (this.vetorProduto[i].getNome().equals(nome)) {
                return this.vetorProduto[i];
            }
        }
        return null;
    }

    public void adicionaProduto() {
        System.out.print("\nDigite o nome do cliente: ");
        String nome = texto.nextLine();
        Cliente cl = this.buscarCliente(nome);
        if (cl != null) {
            System.out.print("\nDigite o nome do Produto: ");
            String nomeP = texto.nextLine();
            Produto p = this.buscarProduto(nomeP);
            if (p != null) {
                cl.adicionaProduto(p);
            } else {
                System.out.println("Produto não foi encontrado!");
            }
        } else {
            System.out.println("Cliente não encontrado!");
        }

    }

    public void excluirProduto() {
        System.out.print("\nDigite o nome do cliente: ");
        String nome = texto.nextLine();
        Cliente cl = this.buscarCliente(nome);
        if (cl != null) {
            cl.excluirProduto();
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public void geraNotaFiscal() {
        System.out.print("\nDigite o nome do cliente: ");
        String nome = texto.nextLine();
        Cliente cl = this.buscarCliente(nome);
        if (cl != null) {
            cl.geraNotaFiscal();
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    public int getTotalDeContas() {
        return totalDeContas;
    }

    public void setTotalDeContas(int totalDeContas) {
        this.totalDeContas = totalDeContas;
    }

    public Cliente[] getVetorCliente() {
        return vetorCliente;
    }

    public void setVetorCliente(Cliente[] vetorCliente) {
        this.vetorCliente = vetorCliente;
    }

    public Produto[] getVetorProduto() {
        return vetorProduto;
    }

    public void setVetorProduto(Produto[] vetorProduto) {
        this.vetorProduto = vetorProduto;
    }

    public int getTotalDeProdutos() {
        return totalDeProdutos;
    }

    public void setTotalDeProdutos(int totalDeProdutos) {
        this.totalDeProdutos = totalDeProdutos;
    }

}
