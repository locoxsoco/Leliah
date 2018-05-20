import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class LotexConsumible{
	private String descripcion;
	private String categoria;

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion (String _descripcion){
		this.descripcion=_descripcion;
	}

	public String getCategoria(){
		return categoria;
	}

	public void setCategoria (String _categoria){
		this.categoria=_categoria;
	}

	public LotexConsumible(String descripcion,String categoria){
		this.descripcion=descripcion;
		this.categoria=categoria;
		
	}
}