public class Proveedor{
	private int id;
	private string nombre;
	private string ruc;
	private int telefono;
	private string visita;
	
	public Proveedor(int _id, string _nombre, string _ruc, int telef, string _vis){
		this.id = _id;
		this.nombre = _nombre;
		this.ruc = _ruc;
		this.telefono = telef;
		this.visita = _vis;
	}
	
	public int ID{
		get{
			return id;
		}
		set{
			id = value;
		}
	}
	
	public string Nombre{
		get{
			return nombre;
		}
		set{
			nombre = value;
		}
	}	
	
	public string RUC{
		get{
			return ruc;
		}
		set{
			ruc = value;
		}
	}
	
	public int Telef{
		get{
			return telefono;
		}
		set{
			telefono = value;
		}
	}
	
	public string Vis{
		get{
			return visita;
		}
		set{
			visita = value;
		}
	}
	
	public void MostrarDatos(){
		System.Console.WriteLine(Nombre+ "\t\t"+ RUC +"\t\t"+ Telef +"\t\t"+ Vis);
	}
}