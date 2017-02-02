/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.book.dtos;

import co.edu.uniandes.csw.book.entities.AuthorEntity;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @generated
 */
@XmlRootElement
public class AuthorDetailDTO extends AuthorDTO {


    /**
     * @generated
     */
    public AuthorDetailDTO() {
        super();
    }

    /**
     * Crea un objeto AuthorDetailDTO a partir de un objeto AuthorEntity
     * incluyendo los atributos de AuthorDTO.
     *
     * @param entity Entidad AuthorEntity desde la cual se va a crear el nuevo
     * objeto.
     * @generated
     */
    public AuthorDetailDTO(AuthorEntity entity) {
        super(entity);

    }

    /**
     * Convierte un objeto AuthorDetailDTO a AuthorEntity incluyendo los
     * atributos de AuthorDTO.
     *
     * @return Nueva objeto AuthorEntity.
     * @generated
     */
    @Override
    public AuthorEntity toEntity() {
        AuthorEntity entity = super.toEntity();
        return entity;
    }

}
