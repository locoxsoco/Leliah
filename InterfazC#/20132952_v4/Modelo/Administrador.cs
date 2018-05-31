using System;
public class Administrador: Persona{
	private string usuario;
	private string clave;
	
	public Administrador(string nombre,string appMat,string appPat,int DNI,int telefono,int edad,genero sexo,string direccion,string usuario, string clave): base(nombre, appMat, appPat, DNI, telefono, edad, sexo, direccion){
			this.usuario= usuario;
			this.clave= clave;
	}
	
	public string Usuario{
		set{
			this.usuario = value;
		}
		get{
			return usuario;
		}
	}

	public override void mostrarDatos(){
		System.Console.Write("Administrador	");
		System.Console.WriteLine(Nombre+" "+AppellidoPat+" "+_DNI+" "+usuario);
	}
}