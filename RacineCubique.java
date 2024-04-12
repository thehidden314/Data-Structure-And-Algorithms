import java.util.Locale;
import java.util.Scanner;
public class RacineCubique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//Line below allows you to use english keybord
		scanner.useLocale(Locale.ENGLISH);
		
		double a0,a1,a2,q,r,d,ø;
		System.out.println("Entrer trois réels: ");
		a2 = scanner.nextDouble();
		a1 = scanner.nextDouble();
		a0= scanner.nextDouble();
		System.out.println("L'équation est : z³ + "+a2+"z² + "+a1+"z + "+a0+" = 0");
		q = (3*a1 - Math.pow(a2, 2))/9;
		r = (9*a1*a2 - 27*a0 -2*Math.pow(a2, 3))/54;
		d = Math.pow(q, 3) + Math.pow(r, 3);
		
		System.out.println("Q="+q+", R="+r+" et D="+d);
		
		if(d<0 && q<0)
		{
			double radicante = ((-q)*(-q)*(-q));
			double den = Math.sqrt(radicante);
			ø = Math.acos(r/(den));
			//System.out.println("qutient="+(r/den)+"ø="+ø);
			
			double z1, z2, z3;
			z2 = 2*((Math.sqrt(-q)))*Math.cos((ø+2*Math.PI)/3) - a2/3;
			z3 = 2*((Math.sqrt(-q)))*Math.cos((ø+4*Math.PI)/3) - a2/3;
			z1 = 2*((Math.sqrt(-q)))*Math.cos(ø/3) - a2/3;
			System.out.print("L'équation admet 3 solutions : z1 = "+z1+", z2 = "+z2+", z3 = "+z3);
		
		}
		else
		{
			//On calcule S & T
			double s, t, z1, z2;
			s = Math.pow((r + Math.sqrt(d)),(1/3));
			t = Math.pow((r - Math.sqrt(d)),(1/3));
			if(d==0 && (s+t) !=0)
			{
				z1 = s + t - (a2)/3;
				z2 = -(s+t)/2 - a2/3;
				System.out.print("L'équation admet 2 solutions : z1 = "+z1+", z2 = "+z2);
				
			}
			else
			{
				z1 = s + t - (a2)/3;
				System.out.print("L'équation admet une solution unique : z1 = "+z1);
				
			}
		}
		
	}

}
