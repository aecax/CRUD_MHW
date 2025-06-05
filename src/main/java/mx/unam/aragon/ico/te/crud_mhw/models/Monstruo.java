package mx.unam.aragon.ico.te.crud_mhw.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Monstruo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String imagen;
    private String clase;
    private String elementos;
    private String estados;
    private String elementos_debil;
    private String habitat;
    private String parientes;
    private String generacion;

    public Monstruo() {

    }

    @Override
    public String toString() {
        return "Monstruo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", imagen='" + imagen + '\'' +
                ", clase='" + clase + '\'' +
                ", elementos='" + elementos + '\'' +
                ", estados='" + estados + '\'' +
                ", elementos_debil='" + elementos_debil + '\'' +
                ", habitat='" + habitat + '\'' +
                ", parientes='" + parientes + '\'' +
                ", generacion='" + generacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Monstruo monstruo = (Monstruo) o;
        return id == monstruo.id && Objects.equals(nombre, monstruo.nombre) && Objects.equals(imagen, monstruo.imagen) && Objects.equals(clase, monstruo.clase) && Objects.equals(elementos, monstruo.elementos) && Objects.equals(estados, monstruo.estados) && Objects.equals(elementos_debil, monstruo.elementos_debil) && Objects.equals(habitat, monstruo.habitat) && Objects.equals(parientes, monstruo.parientes) && Objects.equals(generacion, monstruo.generacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, imagen, clase, elementos, estados, elementos_debil, habitat, parientes, generacion);
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public String getElementos_debil() {
        return elementos_debil;
    }

    public void setElementos_debil(String elementos_debil) {
        this.elementos_debil = elementos_debil;
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

    public Monstruo(int id, String nombre, String imagen, String clase, String elementos, String estados, String elementos_debil, String habitat, String parientes, String generacion) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.clase = clase;
        this.elementos = elementos;
        this.estados = estados;
        this.elementos_debil = elementos_debil;
        this.habitat = habitat;
        this.parientes = parientes;
        this.generacion = generacion;
    }
}
