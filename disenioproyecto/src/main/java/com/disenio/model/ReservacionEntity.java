package src.main.java.com.disenio.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Reservacion", schema = "mydb", catalog = "")
public class ReservacionEntity {
    private int idReservacion;
    private Date checkIn;
    private Date checkOut;

    @Id
    @Column(name = "idReservacion")
    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    @Basic
    @Column(name = "CheckIn")
    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    @Basic
    @Column(name = "CheckOut")
    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReservacionEntity that = (ReservacionEntity) o;
        return idReservacion == that.idReservacion &&
                Objects.equals(checkIn, that.checkIn) &&
                Objects.equals(checkOut, that.checkOut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReservacion, checkIn, checkOut);
    }
}
