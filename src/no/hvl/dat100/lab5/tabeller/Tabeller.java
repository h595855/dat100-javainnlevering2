package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int r = 0; r <= tabell.length - 1; r++) {
			
			System.out.print(tabell[r] + " ");
		
		}
	}
	
	// b)
	
	public static String tilStreng(int[] tabell) {
		
		String streng = ("[");
		
		for(int i = 0; i < tabell.length; i++) {
			
			if (i != tabell.length - 1) {
				streng += (tabell[i] + ",");
			} else {
				streng += (tabell[i]);
			}
		}
		streng += ("]");
		return streng;
	
		
	}

	// c)
	public static int summer(int[] tabell) {

		  int total = 0;
		    for (int i : tabell){
		       total += i;
		    }
			return total;
		
	}
	public static int summer2(int[] tabell) {
		
		int total = 0;
		int i = 0;
		while(i < tabell.length) {
			total += tabell[i];
			i++;
		}
		return total;	
	}
	
	public static int summer3(int[] tabell) {
		int total = 0;
		for(int i = 0; i < tabell.length; i++) {
			total += tabell[i];
		}
		return total;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++ ) {
			
			if (tall == tabell[i])
				
				return true;
			}
		
		return false;
		} 
		

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
			for(int i = 0; i < tabell.length; i++) {	
				if(tabell[i] == tall)
				return i;
			}
			return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int nyTabell[] = new int[tabell.length];


        for (int i = 0, j = tabell.length-1; i < tabell.length; i++, j--) {


            nyTabell[i] = tabell[j];

        }

        skrivUt(nyTabell);


        return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
	
		for(int i = 1; i < tabell.length; i++) {
			
			if(tabell[i] < tabell[i - 1]) 
				
			return false;
			
			}
		
			return true;
			
}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int kombotab[] = new int[tabell1.length + tabell2.length];
			
		for(int i = 0; i < tabell1.length; i++) {
			kombotab[i] = tabell1[i];
		}
		for(int j = 0; j <tabell2.length; j++) {
			kombotab[tabell1.length + j] = tabell2[j];
		}
		skrivUt(kombotab);
		return kombotab;

}
	
}
