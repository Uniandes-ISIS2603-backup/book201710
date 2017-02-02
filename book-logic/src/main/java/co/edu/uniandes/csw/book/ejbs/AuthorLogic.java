package co.edu.uniandes.csw.book.ejbs;

import co.edu.uniandes.csw.book.entities.AuthorEntity;
import co.edu.uniandes.csw.book.persistence.AuthorPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AuthorLogic {

    @Inject
    private AuthorPersistence persistence;

    /**
     * Obtiene la lista de los registros de Author.
     *
     * @return Colección de objetos de AuthorEntity.
     *
     */
    public List<AuthorEntity> getAuthors() {
        return persistence.findAll();
    }

    /**
     * Obtiene los datos de una instancia de Author a partir de su ID.
     *
     * @param id Identificador de la instancia a consultar
     * @return Instancia de AuthorEntity con los datos del Author consultado.
     *
     */
    public AuthorEntity getAuthor(Long id) {
        return persistence.find(id);
    }

    /**
     * Se encarga de crear un Author en la base de datos.
     *
     * @param entity Objeto de AuthorEntity con los datos nuevos
     * @return Objeto de AuthorEntity con los datos nuevos y su ID.
     *
     */
    public AuthorEntity createAuthor(AuthorEntity entity) {
        persistence.create(entity);
        return entity;
    }

    /**
     * Actualiza la información de una instancia de Author.
     *
     * @param entity Instancia de AuthorEntity con los nuevos datos.
     * @return Instancia de AuthorEntity con los datos actualizados.
     *
     */
    public AuthorEntity updateAuthor(AuthorEntity entity) {
        return persistence.update(entity);
    }

    /**
     * Elimina una instancia de Author de la base de datos.
     *
     * @param id Identificador de la instancia a eliminar.
     *
     */
    public void deleteAuthor(Long id) {
        persistence.delete(id);
    }

}
