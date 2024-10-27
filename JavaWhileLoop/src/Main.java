import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// while loop continua ad esegue il codice finche la condizione rimane vera
		Scanner scanner = new Scanner(System.in);
		String nome= "";
		//condizione del ciclo è che il nome sia vuoto
		while(nome.isBlank()) {
			System.out.println("Inserisci un nome");
			//chiedo di inserire il nome, una volta inserito il ciclo si interrompe
			nome=scanner.nextLine();
		}
		//inserito il nome la condizione nome.isBlank() diventa falsa ed esco dal ciclo
		System.out.println("Il tuo nome è "+nome);
		
	}

}
