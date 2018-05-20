import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Internet extends Servicio{
	private Computer computadora;

	public Computer getComputadora(){
		return computadora;
	}

	public void setComputadora (Computer _computadora){
		this.computadora=_computadora;
	}
	public Internet(String nombre,float precioxUnit,Computer computadora){
		super(nombre,precioxUnit);
		this.computadora=computadora;
	}
}