/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GuiAesthetic;

public class Escritorio extends PC{
    private String RAMcapacidad;
    private String capacidadAlmacenamiento;
    private String tipoAlmacenamiento;
    private boolean targetaGraf;

    public Escritorio(String Ip, String Mascara, String hosting, String RAMcapacidad, String capacidadAlmacenamiento, String tipoAlmacenamiento, boolean targetaGraf) {
        super(Ip, Mascara, hosting);
    }

    public Escritorio(String RAMcapacidad, String capacidadAlmacenamiento, String tipoAlmacenamiento, boolean targetaGraf, String Ip, String Mascara, String hosting) {
        super(Ip, Mascara, hosting);
        this.RAMcapacidad = RAMcapacidad;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.targetaGraf = targetaGraf;
    }

    public String getRAMcapacidad() {
        return RAMcapacidad;
    }

    public void setRAMcapacidad(String RAMcapacidad) {
        this.RAMcapacidad = RAMcapacidad;
    }

    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public boolean isTargetaGraf() {
        return targetaGraf;
    }

    public void setTargetaGraf(boolean targetaGraf) {
        this.targetaGraf = targetaGraf;
    }

    @Override
    public String toString() {
        return super.toString()+ "Escritorio" + 
                "RAMcapacidad: " + RAMcapacidad + 
                "CapacidadAlmacenamiento:" + capacidadAlmacenamiento + 
                "TipoAlmacenamiento=" + tipoAlmacenamiento + 
                "TargetaGraf=" + targetaGraf;
    }
    
    
}
