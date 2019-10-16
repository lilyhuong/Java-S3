import java.util.Scanner;
public class Maxmat
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int [][] notes = new int [3][3];
			Scanner sc = new Scanner(System.in);
			int i;
			int j;
			int Max, Imax; int n = 3;
			int Jmax;
			Jmax = 0;
			Imax = 0;
			Max = notes[0][0];
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				{ 
				if (notes[i][j] > Max)
					{
					Max = notes[i][j];
					Imax = i;
					Jmax = j;
					}
				}
				}
			System.out.println("le maximum de la matric rst " + Max + "et son indice est [" + Imax+ "]");
			
			
		}
	

	
	}

}
