/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GuiAesthetic;

public class PC {
    private String Ip;
    private String Mascara;
    private String hosting;

    public PC() {
    }

    public PC(String Ip, String Mascara, String hosting) {
        this.Ip = Ip;
        this.Mascara = Mascara;
        this.hosting = hosting;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public String getMascara() {
        return Mascara;
    }

    public void setMascara(String Mascara) {
        this.Mascara = Mascara;
    }

    public String getHosting() {
        return hosting;
    }

    public void setHosting(String hosting) {
        this.hosting = hosting;
    }

    @Override
    public String toString() {
        return "PC hosting: " + hosting + 
                "Ip:" + Ip + 
                "Mascara:" + Mascara + '}';
    }
    
    
}
