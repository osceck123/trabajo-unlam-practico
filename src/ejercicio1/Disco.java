package ejercicio1;

public class Disco {
	
	private Double radioInteriorDelDisco;
	private Double radioExteriorDelDisco;
	
	
	
	public void radioInterior( Double radiointerior)
	{
		radioInteriorDelDisco=radiointerior;
	}
	public void radioExterior(Double radioexterior)
	{
		radioExteriorDelDisco=radioexterior;
	}
	public double perimetroInterior()
	{
		double perimetrointeriordeldisco;
		
		perimetrointeriordeldisco=2*Math.PI*radioInteriorDelDisco;
		return perimetrointeriordeldisco;
	}
	public double perimetroExterior()
	{
		double perimetroExteriordeldisco;
		perimetroExteriordeldisco=2*Math.PI*radioExteriorDelDisco;
		return perimetroExteriordeldisco;
	}
	public double superficieDelDisco()
	{
				
		
		double superficieDelDisc;
		superficieDelDisc=superficieTotalDeLaCircunferenciaCompletaDelDisco() -superficieInteriorDeldisco();
		
		return superficieDelDisc;
		
	}
	
	public Double superficieInteriorDeldisco()
	{
        double superficieInterior;
		
		superficieInterior=Math.PI*Math.pow(radioInteriorDelDisco, 2);
		return superficieInterior;
	}
	
	public Double RadioTotalDeLaCircunferencia()
	{
        double radioTotal;
		
		radioTotal=radioExteriorDelDisco+radioInteriorDelDisco;
		return radioTotal;
	}
	
	public Double superficieTotalDeLaCircunferenciaCompletaDelDisco()
	{
        double superficieTotalDeLaCircunferencia;
		
		superficieTotalDeLaCircunferencia=Math.PI*Math.pow(RadioTotalDeLaCircunferencia(), 2);
		return superficieTotalDeLaCircunferencia;
	}
	

}
