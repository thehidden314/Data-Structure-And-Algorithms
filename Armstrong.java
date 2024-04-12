import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner clavier = new Scanner (System.in);
		System.out.print("Donner un nombre : ");
		int number = clavier.nextInt();
		
		int somme = decomposeNumber(number);
		
		if(number == somme) {
        	System.out.println(number+" is a Armstrong number!");
    	}else {
    	System.out.println(number+" isn't a Armstrong number!");
    	}
	  clavier.close();
	}
	
	public static int decomposeNumber(int number) {
		String numberString = String.valueOf(number);
		int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
        	int entier = numberString.charAt(i) - '0';
        	sum += Math.pow(entier, numberString.length());
        }
        
        return sum;
	}
	
}
