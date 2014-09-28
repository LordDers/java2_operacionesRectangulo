/*
	Rectangulo
*/
public class RectanguloMejorado
{
	private double v_area;
	private double v_perimetro;
	private double v_base;
	private double v_altura;

	public void setBase (double base)
	{
		this.v_base = base;
	}

	public void setAltura (double altura)
	{
		this.v_altura = altura;
	}

	public double getBase()
	{
		return v_base;
	}

	public double getAltura()
	{
		return v_altura;
	}

	public double Area ()
	{
		v_area = v_base * v_altura;
		return v_area;
	}

	public double Perimetro ()
	{
		v_perimetro = v_base*2 + v_altura*2;
		return v_perimetro;
	}

}
