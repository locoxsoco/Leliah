import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Computer{
    private int id;
	private String modelo;
	private int ram;
	private String procesador;
	private int discoDuro;

	public int getId(){
		return id;
	}

	public void setId (int _id){
		this.id=_id;
	}

	public String getModelo(){
		return modelo;
	}

	public void setModelo (String _modelo){
		this.modelo=_modelo;
	}

	public int getRam(){
		return ram;
	}

	public void setRam (int _ram){
		this.ram=_ram;
	}

	public String getProcesador(){
		return procesador;
	}

	public void setProcesador (String _procesador){
		this.procesador=_procesador;
	}

	public int getDiscoDuro(){
		return discoDuro;
	}

	public void setDiscoDuro (int _discoDuro){
		this.discoDuro=_discoDuro;
	}
	public Computer(int id,String modelo,int ram,String procesador,int discoDuro){
		this.id=id;
		this.modelo=modelo;
		this.ram=ram;
		this.procesador=procesador;
		this.discoDuro=discoDuro;
	}
}
