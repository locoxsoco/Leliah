package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Persona extends Cliente{
	private String numDoc;
        private TipoDocumentoIdentidad tipoDoc;
	private String nombre;
	private String apPaterno;
	private String apMaterno;

	public String getNombre(){
		return nombre;
	}

	public void setNombre (String _nombre){
		this.nombre=_nombre;
	}

	public String getApPaterno(){
		return apPaterno;
	}

	public void setApPaterno (String _apPaterno){
		this.apPaterno=_apPaterno;
	}

	public String getApMaterno(){
		return apMaterno;
	}

	public void setApMaterno (String _apMaterno){
		this.apMaterno=_apMaterno;
	}

        public Persona(){
            super();
        }
}