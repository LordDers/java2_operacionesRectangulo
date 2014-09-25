import java.util.Scanner;

public class operacionesRectangulo 
{

	public static void main (String args[]) 
	{

		double alt, bs, resultadoArea, resultadoPerimetro;
		Rectangulo operaciones = new Rectangulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa la altura del rectangulo: ");
		alt = sc.nextDouble();
		
		System.out.print("\nIngresa la base del rectangulo: ");
		bs = sc.nextDouble();
		
		operaciones.setArea(alt, bs);
		operaciones.setPerimetro(alt, bs);

		resultadoArea = operaciones.getArea();
		resultadoPerimetro = operaciones.getPerimetro();

		System.out.println("\nEl AREA del rectangulo es: " + resultadoArea + "cm");
		System.out.println("\nEl PERIMETRO del rectangulo es: " + resultadoPerimetro + "cm");
	
		//System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
