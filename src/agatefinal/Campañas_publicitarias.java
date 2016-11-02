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
public class Campañas_publicitarias {
    
    private String NombreCampaña;
    private String FechaIncioPlanificada;
    private String FechaFinalPlanificada;
    private String GradoFinalizacion;

    public Campañas_publicitarias(String NombreCampaña, String FechaIncioPlanificada, String FechaFinalPlanificada, String GradoFinalizacion) {
        this.NombreCampaña = NombreCampaña;
        this.FechaIncioPlanificada = FechaIncioPlanificada;
        this.FechaFinalPlanificada = FechaFinalPlanificada;
        this.GradoFinalizacion = GradoFinalizacion;
    }

    public String getNombreCampaña() {
        return NombreCampaña;
    }

    public void setNombreCampaña(String NombreCampaña) {
        this.NombreCampaña = NombreCampaña;
    }

    public String getFechaIncioPlanificada() {
        return FechaIncioPlanificada;
    }

    public void setFechaIncioPlanificada(String FechaIncioPlanificada) {
        this.FechaIncioPlanificada = FechaIncioPlanificada;
    }

    public String getFechaFinalPlanificada() {
        return FechaFinalPlanificada;
    }

    public void setFechaFinalPlanificada(String FechaFinalPlanificada) {
        this.FechaFinalPlanificada = FechaFinalPlanificada;
    }

    public String getGradoFinalizacion() {
        return GradoFinalizacion;
    }

    public void setGradoFinalizacion(String GradoFinalizacion) {
        this.GradoFinalizacion = GradoFinalizacion;
    }
    
    
    /*metodos
    Registrarcampaña():boolean
    VerCampaña():void
    */
    
    
    
    
}
