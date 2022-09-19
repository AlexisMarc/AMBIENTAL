package ambiental.ambiental.Model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "publicacion")
public class Publicacion {
    @Id
    private int idPublicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario idUsuarioFK;

    @OneToMany(mappedBy = "publicacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Imagen> imagen;

    private String descrip_Public;

    private String titulo_Public;

    private Date fecha_Public;

    private Boolean estado_Public;

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Usuario getIdUsuarioFK() {
        return idUsuarioFK;
    }

    public void setIdUsuarioFK(Usuario idUsuarioFK) {
        this.idUsuarioFK = idUsuarioFK;
    }

    public List<Imagen> getImagen() {
        return imagen;
    }

    public void setImagen(List<Imagen> imagen) {
        this.imagen = imagen;
    }

    public String getDescrip_Public() {
        return descrip_Public;
    }

    public void setDescrip_Public(String descrip_Public) {
        this.descrip_Public = descrip_Public;
    }

    public String getTitulo_Public() {
        return titulo_Public;
    }

    public void setTitulo_Public(String titulo_Public) {
        this.titulo_Public = titulo_Public;
    }

    public Date getFecha_Public() {
        return fecha_Public;
    }

    public void setFecha_Public(Date fecha_Public) {
        this.fecha_Public = fecha_Public;
    }

    public Boolean getEstado_Public() {
        return estado_Public;
    }

    public void setEstado_Public(Boolean estado_Public) {
        this.estado_Public = estado_Public;
    }

    //constructor

    public Publicacion() {
    }

    public Publicacion(Usuario idUsuarioFK, List<Imagen> imagen, String descrip_Public, String titulo_Public,
            Date fecha_Public, Boolean estado_Public) {
        this.idUsuarioFK = idUsuarioFK;
        this.imagen = imagen;
        this.descrip_Public = descrip_Public;
        this.titulo_Public = titulo_Public;
        this.fecha_Public = fecha_Public;
        this.estado_Public = estado_Public;
    }

    public Publicacion(int idPublicacion, Usuario idUsuarioFK, List<Imagen> imagen, String descrip_Public,
            String titulo_Public, Date fecha_Public, Boolean estado_Public) {
        this.idPublicacion = idPublicacion;
        this.idUsuarioFK = idUsuarioFK;
        this.imagen = imagen;
        this.descrip_Public = descrip_Public;
        this.titulo_Public = titulo_Public;
        this.fecha_Public = fecha_Public;
        this.estado_Public = estado_Public;
    }
}
