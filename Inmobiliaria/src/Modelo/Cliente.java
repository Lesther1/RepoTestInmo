
package Modelo;

import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String Nombre;
    private String telefono;
    private String Direccion;
    private String Profesion;
    private String Ltrabajo;
    private String Descripcion;
    private int salario;
    private String TCliente;

    public Cliente() {
        this.Nombre = null;
        this.telefono = null;
        this.Direccion = null;
        this.Profesion = null;
        this.Ltrabajo = null;
        this.Descripcion = null;
        this.salario = 0;
        this.TCliente = null;
    }
    public Cliente(String Nombre, String telefono, String Direccion,String Profesion,String Ltrabajo,String Descripcion, int salario,
                    String TCliente) {
        this.Nombre = Nombre;
        this.telefono = telefono;
         this.Direccion = Direccion;
        this.Profesion = Profesion;
        this.Ltrabajo = Ltrabajo;
        this.Descripcion = Descripcion;
        this.salario = salario;
        this.TCliente = TCliente;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String profesion) {
        this.Profesion = profesion;
    }

    public String getLugarTrabajo() {
        return Ltrabajo;
    }

    public void setLugarTrabajo(String Ltrabajo) {
        this.Ltrabajo = Ltrabajo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTipoCliente() {
        return TCliente;
    }

    public void setTipoCliente(String TCliente) {
        this.TCliente = TCliente;
    }


    public static Object[][] obtenerDatosParaTabla(List<Cliente> clientes) {
        Object[][] datos = new Object[clientes.size()][8];
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            datos[i][0] = cliente.getNombre();
            datos[i][1] = cliente.getTelefono();
            datos[i][2] = cliente.getDireccion();
            datos[i][3] = cliente.getProfesion();
            datos[i][4] = cliente.getLugarTrabajo();
            datos[i][5] = cliente.getDescripcion();
            datos[i][6] = cliente.getSalario();
            datos[i][7] = cliente.getTipoCliente();
        }
        return datos;
    }

}
