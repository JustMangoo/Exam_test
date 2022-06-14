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
			{"2. Ko labāk lietot, lai pārbaudītu lietotāja ievīdus datus?","For","While","Do... While","Jebkuru","C"},
			{"3. Cik reizes Do... While cikls atkārtosies, ja nosacījums iznāks false?","1","0","Līdz tas būs true","Līdz tas būs false","A"},
			{"4. Kurš no šiem apgalvojumiem ir patiess?","While cikls ir Exit kontrolēta cikls","Do... While cikls ir Entry kontrolēta cikls","For cikls ir Exit kontrolēts cikls","Do... While cikls ir Exit kontrolēta cikls","D"},
			{"5. Cik reizes Do... While cikls atkārtosies, ja nosacījums iznāks true?","Līdz tas būs true","0","1","Līdz tas būs false","D"},
			{"6. Kurš būtu pareizi uzrakstīts Do... While cikls?","do{  }while();","do(){  }"," do{  }()"," while(){  }do","A"},
			{"7. Cik reižu do while cikls tiek garantēts?","Bezgalīgi","0","3","1","D"},
			{"8. Kurš no šiem apgalvojumiem par Do... While cikliem ir nepatiess?","Kods izpildas vismaz vienu reizi","Cikla beigās ir \";\" simbols","Cikls nevar atkārtoties bezgalīgi","Cikls ir Exit kontrolēts cikls","C"},
			{"9. Pēdēja izprintētā vērtība?"+"\nint i = 0;\r\n"
					+ "    do {\r\n"
					+ "      i++;\r\n"
					+ "      System.out.println(i);\r\n"
					+ "    }while (i < 5);","5","4","6","Cikls ir bezgalīgs","A"},
			{"10. Pēdēja izprintētā vērtība?"+"\nint j = 0, i = 0;\r\n"
					+ "    do {\r\n"
					+ "      j++;\r\n"
					+ "      System.out.println(j);\r\n"
					+ "    }while (i < 5);","5","4","6","Cikls ir bezgalīgs","D"}};
		
		System.out.println("\t-Tests par Do... While-\n(Izvēlies vienu pareizu atbildi )");
		//-------------------------------------------
		while(i<10) {
		System.out.println("\n "+jaut[i][0]+"\nA)"+jaut[i][1]+"\nB)"+jaut[i][2]+"\nC)"+jaut[i][3]+"\nD)"+jaut[i][4]);
		System.out.print("Atbilde: "); 
		atbilde = scan.next().toUpperCase();
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
