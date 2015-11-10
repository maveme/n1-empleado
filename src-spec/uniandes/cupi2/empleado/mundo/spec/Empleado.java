package uniandes.cupi2.pxxxx.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;


@Mundo
public class Empleado extends _Empleado
{
	@Atributo(genGet=true, genSet=true)
	private int sexo;
	@Atributo(genGet=true, genSet=true)
	private int salario;
	@Atributo(genGet=true, genSet=true)
	private String imagen;
	@Atributo(genGet=true, genSet=true)
	private String apellido;
	@Atributo(genGet=true, genSet=true)
	private String nombre;
	

	private Fecha fechaNacimiento;
	
	private Fecha fechaIngreso;
	
	

	public void inicializar(String pNombre, String pApellido, int pSexo, Fecha pFechaN, Fecha pFechaI, int pSalario)
	{
	
	}
	
	public int darAntiguedad()
	{
	
	}
	
	public double darPrestaciones()
	{
	
	}
	
	
}
