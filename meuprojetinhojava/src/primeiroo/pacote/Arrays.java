package primeiroo.pacote;

import java.util.Scanner;

public class Arrays {

	
	@SuppressWarnings("unused")
	public static void second(String[] args) {
		
		
//		Exemplo 1: Array de inteiros
		int[] arrayInt = {1, 2, 3, 4, 5};
		for (int i = 0; i < arrayInt.length; i++) {
		    System.out.println(arrayInt[i]);
		}
//		Exemplo 2: Array de strings
		String[] arrayStr = {"Java", "é", "divertido"};
		for (int i = 0; i < arrayStr.length; i++) {
		    System.out.println(arrayStr[i]);
		}
//		Exemplo 3: Array multidimensional (matriz)
		int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		for (int i = 0; i < matriz.length; i++) {
		    for (int j = 0; j < matriz[i].length; j++) {
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println();
		}
//		Exemplo 1: Acessando elementos de um array
		int[] arrayInt2 = {1, 2, 3, 4, 5};
		System.out.println(arrayInt[0]); // Imprime o primeiro elemento
		System.out.println(arrayInt[2]); // Imprime o terceiro elemento
		System.out.println(arrayInt[4]); // Imprime o quinto elemento
//		Exemplo 2: Modificando elementos de um array
		String[] arrayStr2 = {"Java", "é", "divertido"};
		arrayStr[1] = "é muito";
		System.out.println(arrayStr[0] + " " + arrayStr[1] + " " + arrayStr[2]);
//		Exemplo 3: Acessando elementos de um array multidimensional (matriz)
		
		int[][] matriz2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		System.out.println(matriz[0][0]); // Imprime o primeiro elemento da primeira linha
		System.out.println(matriz[1][1]); // Imprime o segundo elemento da segunda linha
		System.out.println(matriz[2][2]); // Imprime o terceiro elemento da terceira linha

		
	}
	

	public static void main(String[] args) {
		
//		Ternario em java
		
//		variável = (condição) ? valor1 : valor2;
		 
//		 por exemplo desconto de um produto.
		 
		 Scanner sc = new Scanner(System.in);
		 
		 double preco = 24.3;
		 double desconto = (preco > 20.0) ? preco * 0.1 : preco * 0.05;
		 
		 System.out.println("o preço do produto com desconto fica: " + desconto);
		 System.out.println("rodando normamente");
	}
	
}
