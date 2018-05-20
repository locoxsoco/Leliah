package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class LogIn{
	private String usuario;
	private String contrasena;

	public String getUsuario(){
		return usuario;
	}

	public void setUsuario (String _usuario){
		this.usuario=_usuario;
	}

	public String getContrasena(){
		return contrasena;
	}

	public void setContrasena (String _contrasena){
		this.contrasena=_contrasena;
	}

	public LogIn(String usuario,String contrasena){
		this.usuario=usuario;
		this.contrasena=contrasena;
	}
}