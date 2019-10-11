//conversion Décimale vers binaire
//Ecrire une classe "utilitaire" comprenant une methode 
    //public int[] dec2bin(int b)
//qui retourne un Octet binaire correspendant au nombre entré en parametre
//ecrire aussi une fonction qui affiche un octet
public class Utilbinaires {
    public int[] dec2bin (int b) {
        int i = 7; // variable locale car octet 8 valeur
        int[] octet = new int[8];
        while (b > 0) {
            octet[i] = b % 2;
            i = i - 1; //i--
            b = b/2;
        }
        return octet;
    }
public void afficheOctet (int[8] octet) {
        for(int i = 0; i < 8; i++) {
            system.out.println (octet[i] + "|");
            Utilbinaires ub = new Utilbinaires();
            octet = ub.dec2bin(N);
            ub.afficheOctet(octet);
            System.out.println("");
            syso (N); //=>> 225
        }
public static void main(String[]args) {
    int N = 225; 
    int[] octet;
    octet = dec2bin();
    affiche Octet(octet);


}  
    }
}