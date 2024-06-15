package Modelo;

import java.util.List;

public class Propiedad {
    private String Matricula;
    private String Direccion;
    private String Telefono;
    private String Barrio;
    private String Zona;
    private int Precio;
    private String Descripcion;
    private String Estado;

    public Propiedad(String matricula, String direccion, String telefono, String barrio, String zona, String precio, String descripcion, String estado) {
        this.Matricula = null;
        this.Direccion = null;
        this.Telefono = null;
        this.Barrio = null;
        this.Zona = null;
        this.Precio = 0;
        this.Descripcion = null;
        this.Estado = null;
    }

    public Propiedad(String matricula, String direccion, String telefono, String barrio, String zona, int precio, String descripcion, String estado) {
        this.Matricula = matricula;
        this.Direccion = direccion;
        this.Telefono = telefono;
        this.Barrio = barrio;
        this.Zona = zona;
        this.Precio = precio;
        this.Descripcion = descripcion;
        this.Estado = estado;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        this.Barrio = barrio;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String zona) {
        this.Zona = zona;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        this.Precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

    public static Object[][] obtenerDatosParaTabla(List<Propiedad> propiedades) {
        Object[][] datos = new Object[propiedades.size()][8];
        for (int i = 0; i < propiedades.size(); i++) {
            Propiedad propiedad = propiedades.get(i);
            datos[i][0] = propiedad.getMatricula();
            datos[i][1] = propiedad.getTelefono();
            datos[i][2] = propiedad.getDireccion();
            datos[i][3] = propiedad.getBarrio();
            datos[i][4] = propiedad.getZona();
            datos[i][5] = propiedad.getDescripcion();
            datos[i][6] = propiedad.getPrecio();
            datos[i][7] = propiedad.getEstado();
        }
        return datos;
    }
}
