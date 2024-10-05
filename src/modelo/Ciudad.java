package modelo;

public class Ciudad {

    private Integer idCiud;
    private Integer idDepa;
    private String nombre;

    public Ciudad() {
        this.idCiud = null;
        this.idDepa = null;
        this.nombre = null;
    }

    public Ciudad(Integer idCiud, Integer idDepa, String nombre) {
        this.idDepa = idDepa;
        this.idCiud = idCiud;
        this.nombre = nombre;
    }

    public Integer getIdCiud() {
        return idCiud;
    }

    public void setIdCiud(Integer idCiud) {
        this.idCiud = idCiud;
    }

    public Integer getIdDepa() {
        return idDepa;
    }

    public void setIdDepa(Integer idDepa) {
        this.idDepa = idDepa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "idCiud=" + idCiud +
                ", idDepa=" + idDepa +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}