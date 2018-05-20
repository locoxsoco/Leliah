package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Empresa extends Cliente{
	private String ruc;
	private String nombre;

	public String getRuc(){
		return ruc;
	}

	public void setRuc (String _ruc){
		this.ruc=_ruc;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre (String _nombre){
		this.nombre=_nombre;
	}

	public Empresa(int idCliente,String direccion,String correo,String telefono,int dni,String nombre,String apPaterno,String apMaterno){
		super(idCliente,direccion,correo,telefono);
		this.ruc=ruc;
		this.nombre=nombre;
	}
}