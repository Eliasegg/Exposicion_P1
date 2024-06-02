/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exposicion_p1;

/**
 *
 * @author User
 */
public class Libros {
    private String titulo;
    private String genero;
    private String fecha_pub;
    private String autor;
    private String editorial;
    private int cantidad_pag;

    public Libros() {
    }

    public Libros(String titulo, String genero, String fecha_pub, String autor, String editorial, int cantidad_pag) {
        this.titulo = titulo;
        this.genero = genero;
        this.fecha_pub = fecha_pub;
        this.autor = autor;
        this.editorial = editorial;
        this.cantidad_pag = cantidad_pag;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getFecha_pub() {
        return fecha_pub;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getCantidad_pag() {
        return cantidad_pag;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFecha_pub(String fecha_pub) {
        this.fecha_pub = fecha_pub;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setCantidad_pag(int cantidad_pag) {
        this.cantidad_pag = cantidad_pag;
    }
    
    
}
