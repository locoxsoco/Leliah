
package clases;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Anticipada extends Venta{
        private  static int counter=1;
        private int idAnticipada;
	private float adelanto;
	private Date fechaEntrega;
	private float saldoPendiente;
        
        public int getIdAdministrador(){
		return idAnticipada;
	}

	public void setIdAnticipada (int _idAnticipada){
		this.idAnticipada= _idAnticipada;
	}

	public float getAdelanto(){
		return adelanto;
	}

	public void setAdelanto (float _adelanto){
		this.adelanto=_adelanto;
	}

	public Date getFechaEntrega(){
		return fechaEntrega;
	}

	public void setFechaEntrega (Date _fechaEntrega){
		this.fechaEntrega=_fechaEntrega;
	}

	public float getSaldoPendiente(){
		return saldoPendiente;
	}

	public void setSaldoPendiente (float _saldoPendiente){
		this.saldoPendiente=_saldoPendiente;
	}
	public Anticipada(int idVenta,Date fechaVenta,float montoTotal,ArrayList<LineaxServicio> listLineaxServicio,ArrayList<LineaxVenta> listLineaxProducto,TipoDocumento tipoDocumento,TipoPago tipoPago,Cliente cliente,float adelanto,Date fechaEntrega,float saldoPendiente){
		super(idVenta,fechaVenta,montoTotal,listLineaxServicio,listLineaxProducto,tipoDocumento,tipoPago,cliente);
		this.adelanto=adelanto;
		this.fechaEntrega=fechaEntrega;
		this.saldoPendiente=saldoPendiente;
                this.idAnticipada=counter++;
	}
        public Anticipada(){
            
            
        }
	public void cancelarSaldoPendiente(float montoPago){
		
	}
	
}