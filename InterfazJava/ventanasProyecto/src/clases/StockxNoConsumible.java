package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class StockxNoConsumible{
	private int stock;
	private NoConsumible noConsumible;

	public int getStock(){
		return stock;
	}

	public void setStock (int _stock){
		this.stock=_stock;
	}

	public NoConsumible getNoConsumible(){
		return noConsumible;
	}

	public void setNoConsumible (NoConsumible _noConsumible){
		this.noConsumible=_noConsumible;
	}

	public StockxNoConsumible(int stock,NoConsumible noConsumible){
		this.stock=stock;
		this.noConsumible=noConsumible;
		
	}
        public StockxNoConsumible(){
            
        }
}