package Controlador;

public class Cotizante extends EntidadCSV {
    public Cotizante() {
        campos.put("nombre", "");
        campos.put("apellido", "");
        campos.put("cedula", "");
        campos.put("telefono", "");
        campos.put("correo", "");
        campos.put("direccion", "");
        campos.put("fechaNacimiento", "");
        campos.put("genero", "");
        campos.put("embargo", "");
    }
}