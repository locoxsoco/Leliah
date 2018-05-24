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
	private String razonSocial;

	public String getRuc(){
		return ruc;
	}

	public void setRuc (String _ruc){
		this.ruc=_ruc;
	}

	public String getNombre(){
		return razonSocial;
	}

	public void setNombre (String _nombre){
		this.razonSocial=_nombre;
	}

        public Empresa(){
            super();
        }
}