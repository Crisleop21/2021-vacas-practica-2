package src.peliculas;

public class Peliculas{
    private int id;
    private String nombre;
    private int anio;
    private String categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Peliculas(int id, String nombre, int anio, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.categoria = categoria;
    }
    

}