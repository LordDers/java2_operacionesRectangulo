import java.util.Scanner;

public class operacionesRectangulo 
{

	public static void main (String args[]) 
	{

		double alt, bs, resultadoArea, resultadoPerimetro;
		Rectangulo operaciones = new Rectangulo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngresa la altura: ");
		alt = sc.nextDouble();
		
		System.out.println("\nIngresa la base: ");
		bs = sc.nextDouble();
		
		operaciones.setArea(alt, bs);
		operaciones.setPerimetro(alt, bs);

		resultadoArea = operaciones.getArea();
		resultadoPerimetro = operaciones.getPerimetro();

		System.out.println("\nEl resultado del AREA es: " + resultadoArea + "cm");
		System.out.println("\nEl resultado del PERIMETRO es: " + resultadoPerimetro + "cm");
	
		//System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}