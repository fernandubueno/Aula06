import java.util.Scanner;

public class EntendendoVetores {

	//Se for necess�rio aceitar mais ou menos entradas, mude o valor abaixo.
	public static final int TAMANHO = 10;
	public static void main(String[] args) {
		int vetor[] = new int[TAMANHO];
		Scanner leitor = new Scanner(System.in);
		System.out.println("O tamanho do vetor � " + vetor.length);
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Digite um valor");
			vetor[i] = leitor.nextInt();
		}
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println("No �ndice " + i + " foi armazenado o valor" + vetor[i]);
		}

	}

}
