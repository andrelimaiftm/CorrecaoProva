package q4;

import java.util.Scanner;

public class LivroNotas {

    private String nomeCurso;
    private Scanner texto;

    public LivroNotas(String nomeCurso){
        this.nomeCurso = nomeCurso;
        this.texto = new Scanner(System.in);
    }

    public void mostraMensagem(){
        System.out.println("Seja bem vindo!!");
        System.out.println("Esse e o livro de notas do curso de " + this.nomeCurso);
    }

    public void calculaMediaClasse(){
        float[] vetorNotas = new float[10];
        float soma = 0f;
        float media = 0f;
        
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.printf("\n Nota %d: ",i+1);
            vetorNotas[i] = this.texto.nextFloat();
            soma += vetorNotas[i];
        }
        media = soma/vetorNotas.length;
        System.out.println(vetorNotas.length);
        System.out.println("A media das Notas:");
        System.out.printf("Media: %.2f",media);
    }

    public char calculaConceito(float nota){
        if(nota <= 100.0 && nota >=95.0){
            return 'A';
        }else if(nota <= 94.0 && nota >=80.0){
            return 'B';
        }else if(nota <= 79.0 && nota >= 60.0){
            return 'C';
        }else if(nota <= 59.0 && nota >= 40.0){
            return 'D';
        }else if(nota <= 39.0 && nota >= 20.0){
            return 'E';
        }else{
            return 'F';
        }
    }
    
}
