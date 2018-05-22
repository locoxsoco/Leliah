package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Cliente{
	private int idCliente;
        private static int counter=1;
	private String direccion;
	private String correo;
	private String telefono;

	public int getIdCliente(){
		return idCliente;
	}

	public void setIdCliente (int _idCliente){
		this.idCliente=_idCliente;
	}

	public String getDireccion(){
		return direccion;
	}

	public void setDireccion (String _direccion){
		this.direccion=_direccion;
	}

	public String getCorreo(){
		return correo;
	}

	public void setCorreo (String _correo){
		this.correo=_correo;
	}

	public String getTelefono(){
		return telefono;
	}

	public void setTelefono (String _telefono){
		this.telefono=_telefono;
	}

	public Cliente(String direccion,String correo,String telefono){
		this.idCliente=counter++;
		this.direccion=direccion;
		this.direccion=direccion;
		this.telefono=telefono;
		this.correo=correo;
	}
        public Cliente(){
            
        }
}