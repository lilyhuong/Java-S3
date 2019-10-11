//Execise
// Ecrire in programme qui crée un tableau de 10 entier, fait saisir les valeurs au user puis déteminer les valeur Mase (et sous indice) 
//des élément au tbleau
import java.util.Scanner;
public class Maxtab //le nom de programme
    {
    public static void main (String[]args)
        {
            int[] notes = new int[10]; //tableau d'élément qui sont des int
            Scanner sc = new Scanner(System.in);
                                    //clavier
            int i;
            i = 0;
            While (i < 10)
                {
                    System.at.println ("Veuillez saisir la iéme valeur");
                    notes[i] = sc.nextInt();
                                    //lecture au clavier
                    i = i + 1;
                }

        }
    }