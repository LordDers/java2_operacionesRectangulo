import java.util.Scanner;

public class operacionesRectanguloMejorado
{

	public static void main (String args[]) 
	{

		double alt, bs;
		RectanguloMejorado operaciones = new RectanguloMejorado();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa la altura del rectangulo: ");
		alt = sc.nextDouble();
		
		System.out.print("\nIngresa la base del rectangulo: ");
		bs = sc.nextDouble();
		
		operaciones.setBase(bs);
		operaciones.setAltura(alt);

		System.out.println("\nEl AREA del rectangulo es: " + operaciones.Area() + "cm");
		System.out.println("\nEl PERIMETRO del rectangulo es: " + operaciones.Perimetro() + "cm");
	
		//System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
