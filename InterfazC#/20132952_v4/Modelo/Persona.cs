using System;
public enum genero {F,M};
public abstract class Persona{
	private string nombre;
	private string appMat;
	private string appPat;
	private int DNI;
	private int telefono;
	private int edad;
	private genero sexo;
	private string direccion;
	
	public Persona(string nombre,string appMat,string appPat,int DNI,int telefono,int edad,genero sexo,string direccion){
		this.nombre= nombre;
		this.appMat= appMat;
		this.appPat= appPat;
		this.DNI= DNI;
		this.telefono= telefono;
		this.edad= edad;
		this.sexo= sexo;
		this.direccion= direccion;
	}
	
	//gets y sets
	public string Nombre{
		set{
			this.nombre = value;
		}
		get{
			return nombre;
		}
	}
	
	public string AppellidoMat{
		set{
			this.appMat = value;
		}
		get{
			return appMat;
		}
	}
	
	public string AppellidoPat{
		set{
			this.appPat = value;
		}
		get{
			return appPat;
		}
	}
	
	public int _DNI{
		set{
			this.DNI = value;
		}
		get{
			return DNI;
		}
	}
	
	public int Telefono{
		set{
			this.telefono = value;
		}
		get{
			return telefono;
		}
	}
	
	public int Edad{
		set{
			this.edad = value;
		}
		get{
			return edad;
		}
	}
	
	public genero Sexo{
		set{
			this.sexo = value;
		}
		get{
			return sexo;
		}
	}
	
	public string Direccion{
		set{
			this.direccion = value;
		}
		get{
			return direccion;
		}
	}
	
	
	
	//mostrar Datos
	public virtual void mostrarDatos(){
		
	}
}