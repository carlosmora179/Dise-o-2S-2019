package src.main.java.com.disenio.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Hotel", schema = "mydb", catalog = "")
public class HotelEntity {
    private int idHotel;
    private String nombre;
    private int recomendado;
    private int total;

    @Id
    @Column(name = "idHotel")
    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    @Basic
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "Recomendado")
    public int getRecomendado() {
        return recomendado;
    }

    public void setRecomendado(int recomendado) {
        this.recomendado = recomendado;
    }

    @Basic
    @Column(name = "Total")
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelEntity that = (HotelEntity) o;
        return idHotel == that.idHotel &&
                recomendado == that.recomendado &&
                total == that.total &&
                Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, nombre, recomendado, total);
    }
}
