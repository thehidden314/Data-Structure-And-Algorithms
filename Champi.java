import java.util.Scanner;

public class Champi {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);


System.out.println("Pensez à un champignon : amanite tue-mouches, pied bleu, girolle, cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
        
        System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
        boolean aDesLamelles = clavier.nextBoolean();
        
        if (!aDesLamelles) {
            System.out.println("==> Le champignon auquel vous pensez est le cèpe de Bordeaux.");
        } 
        else
        {
            System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
            boolean aUnAnneau = clavier.nextBoolean();
            
            if (aUnAnneau)
            {
                System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
                boolean vitEnForet = clavier.nextBoolean();
                
                if (vitEnForet) {
                    System.out.println("==> Le champignon auquel vous pensez est l'amanite tue-mouches.");
                } 
                else
                {
                    System.out.println("==> Le champignon auquel vous pensez est le coprin chevelu.");
                }
            }
            else
            {
                System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
                boolean chapeauConvexe = clavier.nextBoolean();
                
                if (chapeauConvexe) {
                    System.out.println("==> Le champignon auquel vous pensez est le pied bleu.");
                } 
                else
                {
                    System.out.println("==> Le champignon auquel vous pensez est la girolle.");
                }
            }
        }
        

		clavier.close();
	}
}