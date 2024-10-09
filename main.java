package funcoesuteis;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
	
	


	    // soma os dois numeros inteiros
	    public static int Soma(int a, int b) {
	        return a + b;
	    }

	    // exibe o triangulo
	    public static void Triangulo(int altura) {
	        for (int i = 1; i <= altura; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("x");
	            }
	            System.out.println();
	        }
	    }

	    // imprimir o conteudo de um arquivo
	    public static void printArquivo(String arquivo) {
	        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
	            String linha;
	            while ((linha = br.readLine()) != null) {
	                System.out.println(linha);
	            }
	        } catch (IOException e) {
	            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        // faz a soma 
	        System.out.println("Soma: " + Soma(5, 10));

	        // testa o triangulo
	        System.out.println("Triângulo com altura 5:");
	        Triangulo(5);

	        // faz a leitura do arquivo
	        String caminhoArquivo = "src"; 
	        System.out.println("Conteúdo do arquivo:");
	        printArquivo(caminhoArquivo);
	    }
	}



