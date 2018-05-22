package clases;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class LotexConsumible{
        private static int counter=1;
        private int idLotexConsumible;
	private Consumible consumible;
        private Date fechaCaducidad;
	private int cantidad;

    /**
     * @return the idLotexConsumible
     */
    public int getIdLotexConsumible() {
        return idLotexConsumible;
    }

    /**
     * @param idLotexConsumible the idLotexConsumible to set
     */
    public void setIdLotexConsumible(int idLotexConsumible) {
        this.idLotexConsumible = idLotexConsumible;
    }

    /**
     * @return the consumible
     */
    public Consumible getConsumible() {
        return consumible;
    }

    /**
     * @param consumible the consumible to set
     */
    public void setConsumible(Consumible consumible) {
        this.consumible = consumible;
    }

    /**
     * @return the fechaCaducidad
     */
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public LotexConsumible(Consumible consumible,Date fechaCaducidad,int cantidad){
        this.consumible=consumible;
        this.fechaCaducidad=fechaCaducidad;
        this.cantidad=cantidad;
    }
    public LotexConsumible(){
        this.idLotexConsumible=counter++;
    }
}