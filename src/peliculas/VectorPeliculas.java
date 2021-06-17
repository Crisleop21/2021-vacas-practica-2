package src.peliculas;

import src.tienda.IngresoDatos;

public class VectorPeliculas {
    private Peliculas [] peliculas = new Peliculas[50];
    private int siguienteCodigo;

    public VectorPeliculas(){
        siguienteCodigo =1;
    }

    //agregar peliculas
    public void agregarPeliculas(int id, String nombre, int anio, String categoria){
        if (siguienteCodigo > 50) {
            System.out.println("No se puede agregar mas pelculas");
            
        }
        else{
            peliculas[(siguienteCodigo-1)] = new Peliculas(id, nombre, anio, categoria);

        }
        siguienteCodigo++;
    }
    public void agregarPeliculas(){
        int id = IngresoDatos.getEntero("Es la posicion de la pelicula ", false);
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int anio = IngresoDatos.getEntero("Ingrese el anio de la pelicula ", false);
        String categoria = IngresoDatos.getTexto("Ingrese la categoria");
        agregarPeliculas(id, nombre, anio, categoria);

    }
    public void mostrarPeliculas(){
        System.out.println("\n\n Clientes de memorabilia");
        for (int i = 0; i < (siguienteCodigo-1); i++) {
            System.out.println("-"+i+") "+peliculas[i].getInformacion());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());
            
        }

        System.out.println("\n\n");
    }

    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) > 0 );
                else 
                    cambio= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Peliculas aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }
    
    
}
