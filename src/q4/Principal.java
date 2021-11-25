package q4;

public class Principal {
    public static void main(String[] args) {
        LivroNotas ln = new LivroNotas("ADS");
        ln.mostraMensagem();
        ln.calculaMediaClasse();
        char conceito = ln.calculaConceito(75f);
        System.out.println("\nO conceito é: " + conceito);
    }    
}
