//Execise
// Ecrire in programme qui cr�e un tableau de 10 entier, fait saisir les valeurs au user puis d�teminer les valeur Mase (et sous indice) 
//des �l�ment au tbleau
import java.util.Scanner;
public class Maxtab //le nom de programme
    {
    public static void main (String[]args)
        {
            int[] notes = new int[10]; //tableau d'�l�ment qui sont des int
            Scanner sc = new Scanner(System.in);
                                    //clavier
            int i;
            i = 0;
            while (i < 10)
                {
                    System.out.println ("Veuillez saisir la i�me valeur");
                    notes[i] = sc.nextInt();
                                    //lecture au clavier
                    i = i + 1;
                }
            Max = notes[0];
            Imax = 0;
            

        }
    }