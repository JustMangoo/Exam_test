import java.util.Scanner;

public class theTest {
	
	static int parbaude(int rez, String atb, String par){
		if(atb.equals(par)){
			System.out.println("✔️");
			rez++;
		}else{
			System.out.println("❌");
		}
		return rez;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int punkti=0;
		String atbilde, pareizi;
		
		System.out.println("\t-Tests par Do... While-\n(Izvēlies vienu pareizu atbildi )");
		
		//Jautājums 1
		System.out.println("\n\n 1. Kāda ir galvenā atšķirība starp While un Do.. While?"
						+"\nA) Garāks pieraksts"
						+"\nB) Nosacījumu pārbauda beigās"
						+"\nC) Mazāks izpildes laiks"
						+"\nD) Neviens");
		pareizi = "B";
		System.out.print("Atbilde: "); atbilde = scan.next().toUpperCase();
		punkti = parbaude(punkti, atbilde, pareizi);
		
		scan.close();

	}

}
