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
		int punkti=0, i=0, pagPunkti;
		String atbilde, nepar="";
		String[][] jaut = 
			{{"1. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{"2. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{"3. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{"4. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{"5. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{"6. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{"7. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{"8. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{"9. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"},
			{"10. Kāda ir galvenā atšķirība starp While un Do... While?","Garāks pieraksts","Nosacījumu pārbauda beigās","Mazāks izpildes laiks","Neviens","B"}};
		
		System.out.println("\t-Tests par Do... While-\n(Izvēlies vienu pareizu atbildi )");
		//-------------------------------------------
		while(i<10) {
		System.out.println("\n "+jaut[i][0]+"\nA)"+jaut[i][1]+"\nB)"+jaut[i][2]+"\nC)"+jaut[i][3]+"\nD)"+jaut[i][4]);
		System.out.print("Atbilde: "); atbilde = scan.next().toUpperCase();
		pagPunkti = punkti;
		punkti = parbaude(punkti, atbilde, jaut[i][5]);
		if(pagPunkti==punkti) {
			nepar=nepar+Integer.toString(i);
		}
		i++;
		}
		i=0;
		System.out.println("\nPareizi atbildēti "+punkti+"/10");
		
		System.out.println("Nepareizi atbildētie jautājumi:");
		while(i<nepar.length()) {
			System.out.println(jaut[Character.getNumericValue(nepar.charAt(i))][0]);
			i++;
		}
		
		scan.close();

	}

}
