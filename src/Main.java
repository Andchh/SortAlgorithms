import java.util.Scanner;

/**
 * 
 */

/**
 * @author Anderson Fraz�o 11221885
 * UFPB - An�lise e Projeto de Algor�tmo
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
		System.out.println("Organizado com Selection Sort e imprimindo array:\n");
		for(int j = 0; j < entry.length; j++){
			System.out.print(entry[j]+"\n");
		}
		insectionSort(entry);
		System.out.println("Organizado com Insection Sort e imprimindo array:\n");

		for(int j = 0; j < entry.length; j++){
			System.out.print(entry[j]+"\n");
		}
		s.close();

	}
	
	public static void selectionSort(int[] list){
		
		
		for(int fixed = 0; fixed < list.length; fixed++){  //faz com o que o fixo v� andando de um por um at� o fim do array
			int smaller = fixed; //vari�vel onde o menor valor ser� salvo ao ser encontrado
			
			for(int i = smaller + 1; i < list.length; i++){ //ir� percorrer a partir do index depois do fixo, para comparar
				if(list[i] < list[smaller]){ //se o valor na posi��o i do array for menor que o da posi��o smaller
					smaller = i;  //smaller � subistituido por i. Ou seja, encontrou-se um valor menor que o fixo;
				}
			}
			if(smaller != fixed){ 
				int subs = list [fixed]; //
				list[fixed] = list[smaller];  
				list[smaller] = subs;   //troca-se o fixo atual pelo menor que foi encontrado	
			}
		}
		
		
		
	}

	public static void insectionSort(int[] list){
		
		int i, j, pri;  // pri � o elemento atual a ser analisado para ser realocado para organiza��o
		
		for(j = 1; j < list.length; j++){ //percorre o vetor da esquerda para a direita, come�ando do segundo.
			
			pri = list[j]; //pri recebe o valor da segunda variavel da lista, para trocar futuramente
			
			for(i = j -1; (i >= 0) && (list[i] > pri); i--){ //for para comparar o elemento atual com os anteriores
				
				list[i+1] = list[i]; // caso encontre um valor > pri que esta sendo comparado, ent�o ocorre a atribui��o
				
			}
		list[i+1] = pri; //troca o valor que tinhamos na casa analisada pela casa que foi trocada;
			
		}
		
	}
	
	
}
