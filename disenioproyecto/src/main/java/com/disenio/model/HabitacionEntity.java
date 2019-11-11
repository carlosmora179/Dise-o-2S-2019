package src.main.java.com.disenio.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Habitacion", schema = "mydb", catalog = "")
public class HabitacionEntity {
    private int idHabitacion;
    private String disponibilidad;
    private Integer precio;

    @Id
    @Column(name = "idHabitacion")
    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    @Basic
    @Column(name = "Disponibilidad")
    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Basic
    @Column(name = "Precio")
    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HabitacionEntity that = (HabitacionEntity) o;
        return idHabitacion == that.idHabitacion &&
                Objects.equals(disponibilidad, that.disponibilidad) &&
                Objects.equals(precio, that.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHabitacion, disponibilidad, precio);
    }
}
