package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad : matrise)
		{
			for(int pos : rad) {
				System.out.print(pos + " ");
			}
			System.out.println(" ");

		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String utskrift = "";
		
		for(int[] array: matrise) {
			
			for(int i: array) {
				
				utskrift += i + " ";
			}
			utskrift += "\n";
		}
		
		return utskrift;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] newMatrix = new int[matrise.length][matrise[0].length];
		
		for(int y = 0; y < newMatrix.length; y++) {
			
			for(int x = 0; x < matrise[y].length; x++)
				
				newMatrix[y][x] = matrise[y][x] * tall;
		}
		return newMatrix;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		if(a.length != b.length) 
			return false;
		for(int i = 0; i < a.length; i++) {
			if(a[i].length != b[i].length) return false;
		}
		for(int i = 0; i < a.length; i++) {
			for(int y = 0; y < a[i].length; y++) {
				if(a[i][y] != b[i][y]) return false;
			}
		}
		return true;
	}
	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int [][] nyMatrise = new int[matrise.length][matrise[0].length];
		for(int i = 0; i < matrise.length; i++)
		{
			for(int j = 0; j < matrise[i].length; j++)
				{
				nyMatrise[j][i] = matrise[i][j];
				}
		}
		return nyMatrise;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

 		int[][] nyMatrise = new int[a.length][b.length];
		
		int sum = 0;
		int[][] nyMatrise1 = new int [3][3];
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				for(int k = 0; k < 4; k++)
				{
					sum = sum + a[i][k]*b[k][j];
					nyMatrise1[i][j] = sum;
				}
			}
		}
		for(int i=0; i <3; i++)
		{
			for(int j=0; j < 3;j++)
			{
				System.out.print(nyMatrise1[i][j] + " ");
			}
			System.out.println();
		}
	return nyMatrise;
	// var forsøk, men funket ikke :(
	
	}
		
}
