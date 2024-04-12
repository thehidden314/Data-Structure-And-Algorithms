import java.util.Scanner;

public class CalculOccurence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recherche de redondance d'un élément
        // Demande à l'utilisateur d'entrer la taille du tableau
        System.out.print("Entrez la taille du tableau: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Remplissage du tableau
        System.out.println("Entrez les éléments du tableau: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int maxCount = 0;
        int mostFrequentElement = array[0];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = array[i];
            }
        }

        System.out.println("L'élément le plus fréquent est le " + mostFrequentElement + " et sa fréquence d'apparition est " + maxCount + ".");
    scanner.close();
    }
}
