package vetores;

public class Vetor {

	public static void main(String[] args) {
		
		double[] notasAlunos = new double[3];
		
		//Atribuir vlores ao Vetor
		notasAlunos[0] = 10;
		notasAlunos[1] = 8;
		notasAlunos[2] = 6;
		
		System.out.println(notasAlunos[0]);
		System.out.println(notasAlunos[1]);
		System.out.println(notasAlunos[2]);
		
		System.out.println("Exibindo informações com o for");
		//For
		for(double nota : notasAlunos) {
			System.out.println(nota);
		}

	}

}
