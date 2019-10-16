import java.util.Scanner;
public class Matric {
     public static void main(String[]args){
        int P = 0;
        int i = 2;
        int cpt = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre votre nombre: ");
        P = scan.nextInt();
        for (i = 2; i < P; i++ ){
            if (P % i == 0){
                cpt++;
                break; 
            }  
            }
        if (cpt == 0) {
        	System.out.println("Ce premier est nombre premier");
        }
        else {
        	System.out.println("Ce nombre n'est pas un nombre premier");
        }
    }
}
