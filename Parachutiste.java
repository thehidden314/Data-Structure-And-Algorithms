import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);
        final double g = 9.81;
        double v0 = 0.0; 
        double t0 = 0.0; 
        double surface = 2.0; 
        double hauteur = h0; 
        double vitesse = v0; 
        double accel = g; 
        double t = t0; 
        boolean parachuteOuvert = false;
        boolean vitesseMax = false;
        boolean limiteAccel = false;
        
        /*
         * parachuteOuvert conditionne l'ouverture du parachute
         * vitesseMax """ l'affichage du message : "## Felix depasse la vitesse du son"
         * limiteAccel """ l'affichage du message : "## Felix a atteint sa vitesse maximale"
         */

        System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);

        while (hauteur > 0) {
            t += 1;
            double s, q;
            
            s = surface / masse;
            q = Math.exp(-s * (t - t0));
            vitesse = (g / s) * (1 - q) + v0 * q;
            hauteur = h0 - ((g / s) * (t - t0)) - ((v0 - g / s) / s) * (1 - q);
            accel = g - s * vitesse;

            if (hauteur > 2500) {
            	if(vitesse > 343 && !vitesseMax) {
                    System.out.println("## Felix depasse la vitesse du son");
                    vitesseMax = true;
                }
                if(accel < 0.5 && !limiteAccel) {
                    System.out.println("## Felix a atteint sa vitesse maximale");
                    limiteAccel = true;
                }
            } else {
                
                if(!parachuteOuvert) {
                	System.out.println("## Felix ouvre son parachute");
                    parachuteOuvert = true; 
                }
                
                t0 = t;
                h0 = hauteur;
                v0 = vitesse;
                surface = 25.0;
                
                if(vitesse > 343 && !vitesseMax) {
                    System.out.println("## Felix depasse la vitesse du son");
                    vitesseMax = true;
                }
                if(accel < 0.5 && !limiteAccel) {
                    System.out.println("## Felix a atteint sa vitesse maximale");
                    limiteAccel = true;
                }
                
            }
            if (hauteur > 0) {
                System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
            }
        }

        clavier.close();
    }
}
