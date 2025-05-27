package mx.unam.aragon.ico.te.crud_mhw.models;

import java.util.Objects;

public class Monstruo {
    private int id;
    private String nombre;
    private String clase;
    private String elementos;
    private String estados;
    private String elementosdebil;
    private String habitat;
    private String parientes;
    private String generacion;

    public Monstruo(){

    }

    public Monstruo(int id, String nombre, String clase, String elementos, String estados, String elementosdebil, String habitat, String parientes, String generacion) {
        this.id = id;
        this.nombre = nombre;
        this.clase = clase;
        this.elementos = elementos;
        this.estados = estados;
        this.elementosdebil = elementosdebil;
        this.habitat = habitat;
        this.parientes = parientes;
        this.generacion = generacion;
    }

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

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getElementos() {
        return elementos;
    }

    public void setElementos(String elementos) {
        this.elementos = elementos;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }

    public String getElementosdebil() {
        return elementosdebil;
    }

    public void setElementosdebil(String elementosdebil) {
        this.elementosdebil = elementosdebil;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getParientes() {
        return parientes;
    }

    public void setParientes(String parientes) {
        this.parientes = parientes;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Monstruo monstruo = (Monstruo) o;
        return id == monstruo.id && Objects.equals(nombre, monstruo.nombre) && Objects.equals(clase, monstruo.clase) && Objects.equals(elementos, monstruo.elementos) && Objects.equals(estados, monstruo.estados) && Objects.equals(elementosdebil, monstruo.elementosdebil) && Objects.equals(habitat, monstruo.habitat) && Objects.equals(parientes, monstruo.parientes) && Objects.equals(generacion, monstruo.generacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, clase, elementos, estados, elementosdebil, habitat, parientes, generacion);
    }

    @Override
    public String toString() {
        return "Monstruo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", elementos='" + elementos + '\'' +
                ", estados='" + estados + '\'' +
                ", elementosdebil='" + elementosdebil + '\'' +
                ", habitat='" + habitat + '\'' +
                ", parientes='" + parientes + '\'' +
                ", generacion='" + generacion + '\'' +
                '}';
    }
}
