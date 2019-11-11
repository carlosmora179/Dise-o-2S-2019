package src.main.java.com.disenio.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Tipo_Habitacion", schema = "mydb", catalog = "")
public class TipoHabitacionEntity {
    private int idTipoHabitacion;
    private String tipoHabitacioncol;

    @Id
    @Column(name = "idTipo_Habitacion")
    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    @Basic
    @Column(name = "Tipo_Habitacioncol")
    public String getTipoHabitacioncol() {
        return tipoHabitacioncol;
    }

    public void setTipoHabitacioncol(String tipoHabitacioncol) {
        this.tipoHabitacioncol = tipoHabitacioncol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoHabitacionEntity that = (TipoHabitacionEntity) o;
        return idTipoHabitacion == that.idTipoHabitacion &&
                Objects.equals(tipoHabitacioncol, that.tipoHabitacioncol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoHabitacion, tipoHabitacioncol);
    }
}
