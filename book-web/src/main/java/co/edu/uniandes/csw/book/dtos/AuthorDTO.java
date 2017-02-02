package co.edu.uniandes.csw.book.dtos;

import co.edu.uniandes.csw.book.entities.AuthorEntity;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

public class AuthorDTO {

    private Long id;
    private String name;

    private Date birthDate;

    /**
     * @generated
     */
    public AuthorDTO() {
    }

    /**
     * Crea un objeto AuthorDTO a partir de un objeto AuthorEntity.
     *
     * @param entity Entidad AuthorEntity desde la cual se va a crear el nuevo
     * objeto.
     * @generated
     */
    public AuthorDTO(AuthorEntity entity) {
        if (entity != null) {
            this.id = entity.getId();
            this.name = entity.getName();
            this.birthDate = entity.getBirthDate();
        }
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Convierte un objeto AuthorDTO a AuthorEntity.
     *
     * @return Nueva objeto AuthorEntity.
     * @generated
     */
    public AuthorEntity toEntity() {
        AuthorEntity entity = new AuthorEntity();
        entity.setId(this.getId());
        entity.setName(this.getName());
        entity.setBirthDate(this.getBirthDate());
        return entity;
    }
}
