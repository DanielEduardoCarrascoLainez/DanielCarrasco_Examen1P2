/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GuiAesthetic;

public class Laptop extends PC{
    private String marca;
    private String defPantalla;
    private boolean RGB;

    public Laptop(String Ip, String Mascara, String hosting) {
        super(Ip, Mascara, hosting);
    }

    public Laptop(String marca, String defPantalla, boolean RGB, String Ip, String Mascara, String hosting) {
        super(Ip, Mascara, hosting);
        this.marca = marca;
        this.defPantalla = defPantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefPantalla() {
        return defPantalla;
    }

    public void setDefPantalla(String defPantalla) {
        this.defPantalla = defPantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return "Laptop" + 
                "Marca: " + marca + 
                "Definicion de la pantalla: " + defPantalla + 
                "RGB: " + RGB + '}';
    }
    
    
}
