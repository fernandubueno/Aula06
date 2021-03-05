import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		double total=0;
		double alunos[] = new double[10];
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0;i<alunos.length;i++) {
			System.out.println("Por favor, digite o consumo do " + (i+1) + "º aluno");
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];
		}
		
		for(int i=0;i<alunos.length;i++) {
			System.out.println("O total de consumo foi de R$" + total);
		}
			
			
		leitor.close();
		

	}

}
