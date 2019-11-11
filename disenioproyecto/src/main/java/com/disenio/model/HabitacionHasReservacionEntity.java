package src.main.java.com.disenio.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Habitacion_has_Reservacion", schema = "mydb", catalog = "")
@IdClass(HabitacionHasReservacionEntityPK.class)
public class HabitacionHasReservacionEntity {
    private int habitacionIdHabitacion;
    private int reservacionIdReservacion;

    @Id
    @Column(name = "Habitacion_idHabitacion")
    public int getHabitacionIdHabitacion() {
        return habitacionIdHabitacion;
    }

    public void setHabitacionIdHabitacion(int habitacionIdHabitacion) {
        this.habitacionIdHabitacion = habitacionIdHabitacion;
    }

    @Id
    @Column(name = "Reservacion_idReservacion")
    public int getReservacionIdReservacion() {
        return reservacionIdReservacion;
    }

    public void setReservacionIdReservacion(int reservacionIdReservacion) {
        this.reservacionIdReservacion = reservacionIdReservacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HabitacionHasReservacionEntity that = (HabitacionHasReservacionEntity) o;
        return habitacionIdHabitacion == that.habitacionIdHabitacion &&
                reservacionIdReservacion == that.reservacionIdReservacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitacionIdHabitacion, reservacionIdReservacion);
    }
}
