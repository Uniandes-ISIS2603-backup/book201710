package co.edu.uniandes.csw.book.resources;

import co.edu.uniandes.csw.book.ejbs.AuthorLogic;
import co.edu.uniandes.csw.book.dtos.AuthorDTO;
import co.edu.uniandes.csw.book.converters.AuthorConverter;
import co.edu.uniandes.csw.book.entities.AuthorEntity;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/authors")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthorResource {

    @Inject
    private AuthorLogic authorLogic;

    /**
     * Crea un registro de Author y retorna la instancia de este registro.
     * @param entity Instancia de AuthorEntity con los datos a guardar
     * @return Instancia de AuthorDTO con los nuevos datos y el ID.
     */
    @POST
    public AuthorDTO createAuthor(AuthorDTO dto) {
        AuthorEntity authorEntity = authorLogic.createAuthor(AuthorConverter.basicDTO2Entity(dto));
        return AuthorConverter.basicEntity2DTO(authorEntity);
    }

    /**
     * Obtiene una colecci�n de instancias de AuthorDTO existentes.
     * @return Colecci�n de instancias de AuthorDTO.
     */
    @GET
    public List<AuthorDTO> getAuthors() {
        return AuthorConverter.listEntity2DTO(authorLogic.getAuthors());
    }

    /**
     * Obtiene una instancia de AuthorDTO a partir de su identificador.
     * @param id Identificador de la instancia de Author
     * @return Instancia de AuthorDTO asociada al id provisto.
     */
    @GET
    @Path("{authorId: \\d+}")
    public AuthorDTO getAuthor(@PathParam("authorId") Long id) {
        return AuthorConverter.basicEntity2DTO(authorLogic.getAuthor(id));
    }

    /**
     * Actualiza los datos de un registro de Author
     * @param id Identificador del registro de Author a actualizar
     * @param entity Instancia de AuthorEntity con los datos nuevos.
     * @return Instancia de AuthorDTO con los datos nuevos.
     */
    @PUT
    @Path("{authorId: \\d+}")
    public AuthorDTO updateAuthor(@PathParam("authorId") Long id, AuthorDTO dto) {
        dto.setId(id);
        AuthorEntity authorEntity = authorLogic.updateAuthor(AuthorConverter.basicDTO2Entity(dto));
        return AuthorConverter.basicEntity2DTO(authorEntity);
    }

    /**
     * Elimina un registro de Author a partir de su identificador.
     * @param id Identificador de la instancia de Author
     */
    @DELETE
    @Path("{authorId: \\d+}")
    public void deleteAuthor(@PathParam("authorId") Long id) {
        authorLogic.deleteAuthor(id);
    }

}
