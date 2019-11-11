package src.main.java.com.disenio.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class HabitacionHasReservacionEntityPK implements Serializable {
    private int habitacionIdHabitacion;
    private int reservacionIdReservacion;

    @Column(name = "Habitacion_idHabitacion")
    @Id
    public int getHabitacionIdHabitacion() {
        return habitacionIdHabitacion;
    }

    public void setHabitacionIdHabitacion(int habitacionIdHabitacion) {
        this.habitacionIdHabitacion = habitacionIdHabitacion;
    }

    @Column(name = "Reservacion_idReservacion")
    @Id
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
        HabitacionHasReservacionEntityPK that = (HabitacionHasReservacionEntityPK) o;
        return habitacionIdHabitacion == that.habitacionIdHabitacion &&
                reservacionIdReservacion == that.reservacionIdReservacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitacionIdHabitacion, reservacionIdReservacion);
    }
}
