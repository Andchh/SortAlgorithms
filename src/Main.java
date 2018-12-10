import java.util.Scanner;

/**
 * 
 */

/**
 * @author Anderson Frazão 11221885
 * UFPB - Análise e Projeto de Algorítmo
 * 
 *
 */
public final class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a quantidade de elementos:\n");
		int n = s.nextInt();
		int[] entry = new int[n];
		System.out.print("Digite os numeros que serao organizados:\n");
		
		for(int i = 0; i < n; i++){  //vai lendo e salvando no array os valores
			entry[i] = s.nextInt();
		}
		selectionSort(entry);
		System.out.println("Organizado, imprimindo array:\n");
		
		for(int j = 0; j < entry.length; j++){
			System.out.print(entry[j]+"\n");
		}
		s.close();

	}
	
	public static void selectionSort(int[] list){
		
		
		for(int fixed = 0; fixed < list.length; fixed++){  //faz com o que o fixo vá andando de um por um até o fim do array
			int smaller = fixed; //variável onde o menor valor será salvo ao ser encontrado
			
			for(int i = smaller + 1; i < list.length; i++){ //irá percorrer a partir do index depois do fixo, para comparar
				if(list[i] < list[smaller]){ //se o valor na posição i do array for menor que o da posição smaller
					smaller = i;  //smaller é subistituido por i. Ou seja, encontrou-se um valor menor que o fixo;
				}
			}
			if(smaller != fixed){ 
				int subs = list [fixed]; //
				list[fixed] = list[smaller];  
				list[smaller] = subs;   //troca-se o fixo atual pelo menor que foi encontrado	
			}
		}
		
		
		
	}

}
