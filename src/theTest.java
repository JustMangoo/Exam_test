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
		int punkti=0, i=0;
		String atbilde, pareizi;
		
		while(i<1) {
		String[][] jaut = 
			{{"1. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{},
			{},
			{},
			{},
			{},
			{},
			{},
			{},
			{}};
		
		System.out.println("\t-Tests par Do... While-\n(Izvēlies vienu pareizu atbildi )");
		
		System.out.print("Atbilde: "); atbilde = scan.next().toUpperCase();
		punkti = parbaude(punkti, atbilde, jaut[i][5]);
		i++;
		}
		
		System.out.println("Pareizi atbildēti "+punkti+"/10");
		
		scan.close();

	}

}
