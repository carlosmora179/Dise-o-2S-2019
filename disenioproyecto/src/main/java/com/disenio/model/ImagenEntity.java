package src.main.java.com.disenio.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Imagen", schema = "mydb", catalog = "")
public class ImagenEntity {
    private int idImagen;
    private String url;

    @Id
    @Column(name = "idImagen")
    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    @Basic
    @Column(name = "URL")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImagenEntity that = (ImagenEntity) o;
        return idImagen == that.idImagen &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idImagen, url);
    }
}
