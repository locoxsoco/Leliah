using System;
public enum perPago {SEMANAL, MENSUAL}
public class Vendedor: Persona{
	private float sueldo;
	private int horasxSem;
	private perPago periodoPago;
	
	public Vendedor(String nombre,String appMat,String appPat,int DNI,int telefono,int edad,genero sexo,String direccion,float sueldo,int horasxSem,perPago periodoPago): base(nombre,appMat,appPat,DNI,telefono,edad,sexo,direccion){
			this.sueldo= sueldo;
			this.horasxSem= horasxSem;
			this.periodoPago= periodoPago;
	}
	
	public float Sueldo{
		set{
			this.sueldo = value;
		}
		get{
			return sueldo;
		}
	}
	
	public int HorasxSemana{
		set{
			this.horasxSem = value;
		}
		get{
			return horasxSem;
		}
	}
	
	public perPago PeriodoPago{
		set{
			this.periodoPago = value;
		}
		get{
			return periodoPago;
		}
	}
	
	
	//mostrar Datos
	public override void mostrarDatos(){
		System.Console.Write("Vendedor	");
		System.Console.WriteLine(Nombre +" "+ AppellidoPat+" "+ _DNI+" "+ sueldo);
	}
}