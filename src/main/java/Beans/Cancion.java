package Beans;

public class Cancion {
    private int idcancion;
    private String nombre_cancion;
    private String banda;

    public Cancion(int idreproduccion, String nombre_tour, int nombre_ciudad) {
        this.idreproduccion = idreproduccion;
        this.fecha = nombre_tour;
        this.cancion_idcancion = nombre_ciudad;
    }

    public int getIdreproduccion() {
        return idreproduccion;
    }

    public void setIdreproduccion(int idreproduccion) {
        this.idreproduccion = idreproduccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCancion_idcancion() {
        return cancion_idcancion;
    }

    public void setCancion_idcancion(int cancion_idcancion) {
        this.cancion_idcancion = cancion_idcancion;
    }
}
