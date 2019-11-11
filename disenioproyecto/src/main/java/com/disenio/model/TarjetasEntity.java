package src.main.java.com.disenio.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Tarjetas", schema = "mydb", catalog = "")
public class TarjetasEntity {
    private int idTarjetas;
    private String numero;

    @Id
    @Column(name = "idTarjetas")
    public int getIdTarjetas() {
        return idTarjetas;
    }

    public void setIdTarjetas(int idTarjetas) {
        this.idTarjetas = idTarjetas;
    }

    @Basic
    @Column(name = "Numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarjetasEntity that = (TarjetasEntity) o;
        return idTarjetas == that.idTarjetas &&
                Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarjetas, numero);
    }
}
