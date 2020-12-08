package algoritmosia;

public class Colonia {

    private final int id;
    private final String nombre;
    private final float distancia;

    public Colonia(int id, String nombre, float distancia) {
        this.id = id;
        this.nombre = nombre;
        this.distancia = distancia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getDistancia() {
        return distancia;
    }
}
