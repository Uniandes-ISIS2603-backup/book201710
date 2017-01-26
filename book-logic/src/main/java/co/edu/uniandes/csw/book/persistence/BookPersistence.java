package co.edu.uniandes.csw.book.persistence;

import co.edu.uniandes.csw.book.entities.BookEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * @generated
 */
@Stateless
public class BookPersistence {

    @PersistenceContext(unitName = "BookBasicoPU")
    protected EntityManager em;

    public BookEntity create(BookEntity entity) {
        em.persist(entity);
        return entity;
    }

    public BookEntity update(BookEntity entity) {
        return em.merge(entity);
    }

    public void delete(Long id) {
        BookEntity entity = em.find(BookEntity.class, id);
        em.remove(entity);
    }

    public BookEntity find(Long id) {
        return em.find(BookEntity.class, id);
    }

    public List<BookEntity> findAll() {
        TypedQuery q = em.createQuery("select u from BookEntity u", BookEntity.class);
        return q.getResultList();
    }
}
