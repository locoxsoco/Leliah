using System.Collections.Generic;
using System.Text;
using System;
using System.Globalization;
using System.ComponentModel;
using Modelo;

public class Venta{
    public static int i = 0;
    private int _idVenta;
    private DateTime _fechaVenta;
    private Double _monto;
    private TipoRecibo _tipoDocumentoPago;
    private TipoPago _tipoPago;
    private Double _IGV;
    private Cliente cliente;
    private BindingList<Detalle_Venta> _detalles_venta;
    private BindingList<Detalle_Venta_Servicio> _detalles_servicio;
    private string estado;

    public Venta()
    {

    }
    public Venta(int idVenta, DateTime fechaVenta, double montoTotal, TipoRecibo tipoDocumentoPago, TipoPago tipoPago, Cliente cliente)
    {
        this._idVenta = idVenta;
        this._fechaVenta = fechaVenta;
        this._monto = montoTotal;
        this._tipoDocumentoPago = tipoDocumentoPago;
        this._tipoPago = tipoPago;
        this.cliente = cliente;
    }

    


    public int idVenta{
		get{
			return _idVenta;
		}
		set{
			_idVenta = value;
		}		
	}
	public DateTime fechaVenta{
		get{
			return _fechaVenta;
		}
		set{
			_fechaVenta = value;
		}		
	}
    public TipoRecibo tipoDocumentoPago{
		get{
			return _tipoDocumentoPago;
		}
		set{
            _tipoDocumentoPago = value;
		}		
	}

    
    public Double Monto { get => _monto; set => _monto = value; }
    //public int Anticipada { get => _anticipada; set => _anticipada = value; }
    public TipoPago TipoPago { get => _tipoPago; set => _tipoPago = value; }
    public Cliente Cliente { get => cliente; set => cliente = value; }
    public double IGV { get => _IGV; set => _IGV = value; }
    public BindingList<Detalle_Venta> Detalles_venta { get => _detalles_venta; set => _detalles_venta = value; }
    public BindingList<Detalle_Venta_Servicio> Detalles_servicio { get => _detalles_servicio; set => _detalles_servicio = value; }
    public string Estado { get => estado; set => estado = value; }


    //setter especiales
    //   public void setFechaEntregaString(string fecha){
    //	this.fechaEntrega = DateTime.ParseExact(fecha,"dd/MM/yy",CultureInfo.InvariantCulture);
    //}
    //public void setFechaVentaString(string fecha){
    //	this.fechaVenta = DateTime.ParseExact(fecha,"dd/MM/yyyy",CultureInfo.InvariantCulture);
    //}
    ////getter especiales
    //public string getFechaEntregaString(){
    //	return this.fechaEntrega.ToString("dd/MM/yy");
    //}
    //public string getFechaVentaString(){
    //	return this.fechaVenta.ToString("dd/MM/yyyy");
    //}






}