package co.edu.uniandes.csw.book.ejbs;

import co.edu.uniandes.csw.book.entities.BookEntity;
import co.edu.uniandes.csw.book.persistence.BookPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class BookLogic {

    @Inject
    private BookPersistence persistence;

    /**
     * Obtiene la lista de los registros de Book.
     *
     * @return Colección de objetos de BookEntity.
     *
     */
    public List<BookEntity> getBooks() {
        return persistence.findAll();
    }

    /**
     * Obtiene los datos de una instancia de Book a partir de su ID.
     *
     * @param id Identificador de la instancia a consultar
     * @return Instancia de BookEntity con los datos del Book consultado.
     *
     */
    public BookEntity getBook(Long id) {
        return persistence.find(id);
    }

    /**
     * Se encarga de crear un Book en la base de datos.
     *
     * @param entity Objeto de BookEntity con los datos nuevos
     * @return Objeto de BookEntity con los datos nuevos y su ID.
     *
     */
    public BookEntity createBook(BookEntity entity) {
        persistence.create(entity);
        return entity;
    }

    /**
     * Actualiza la información de una instancia de Book.
     *
     * @param entity Instancia de BookEntity con los nuevos datos.
     * @return Instancia de BookEntity con los datos actualizados.
     *
     */
    public BookEntity updateBook(BookEntity entity) {
        return persistence.update(entity);
    }

    /**
     * Elimina una instancia de Book de la base de datos.
     *
     * @param id Identificador de la instancia a eliminar.
     *
     */
    public void deleteBook(Long id) {
        persistence.delete(id);
    }

}
