/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agatefinal;

/**
 *
 * @author oscar
 */
public class Director {
    
    private String NombreDirector;
    private String ApellidoDirector;
    private String TelefonoDirector;

    public Director(String NombreDirector, String ApellidoDirector, String TelefonoDirector) {
        this.NombreDirector = NombreDirector;
        this.ApellidoDirector = ApellidoDirector;
        this.TelefonoDirector = TelefonoDirector;
    }

    public String getNombreDirector() {
        return NombreDirector;
    }

    public void setNombreDirector(String NombreDirector) {
        this.NombreDirector = NombreDirector;
    }

    public String getApellidoDirector() {
        return ApellidoDirector;
    }

    public void setApellidoDirector(String ApellidoDirector) {
        this.ApellidoDirector = ApellidoDirector;
    }

    public String getTelefonoDirector() {
        return TelefonoDirector;
    }

    public void setTelefonoDirector(String TelefonoDirector) {
        this.TelefonoDirector = TelefonoDirector;
    }
    
    /*
    VerDirectordeCampaña():boolean
    AsignarDirector():boolean
    */
}
