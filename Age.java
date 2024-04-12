import java.util.Scanner;
import java.time.LocalDate;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dt = LocalDate.now();
		Scanner scanner = new Scanner(System.in);
		int age;
		int anneeEncours = dt.getYear();
		int anneeNaissance;
		
		System.out.println("Donner votre age : ");
		age = scanner.nextInt();
		anneeNaissance = anneeEncours-age;
		System.out.println("Votre année de naissance est : "+anneeNaissance);
		scanner.close();
	}

}
