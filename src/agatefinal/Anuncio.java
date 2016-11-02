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
public class Anuncio {
    
    private String titulo;
    private String detalles;

    public Anuncio(String titulo, String detalles) {
        this.titulo = titulo;
        this.detalles = detalles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    
    
}
