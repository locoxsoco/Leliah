import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
enum TipoImprenta {Tipeo, Copia, Impresion, Escaneo}
enum TipoColor {BN,Color}
public class Imprenta extends Servicio{
	private TipoImprenta tipoImprenta;
	private TipoColor tipoColor;

	public TipoImprenta getTipoImprenta(){
		return tipoImprenta;
	}

	public void setTipoImprenta (TipoImprenta _tipoImprenta){
		this.tipoImprenta=_tipoImprenta;
	}

	public TipoColor getTipoColor(){
		return tipoColor;
	}

	public void setTipoColor (TipoColor _tipoColor){
		this.tipoColor=_tipoColor;
	}
		
	public Imprenta(String nombre,float precioxUnit,TipoImprenta tipoImprenta,TipoColor tipoColor){
		super(nombre,precioxUnit);
		this.tipoImprenta=tipoImprenta;
		this.tipoColor=tipoColor;
	}
}