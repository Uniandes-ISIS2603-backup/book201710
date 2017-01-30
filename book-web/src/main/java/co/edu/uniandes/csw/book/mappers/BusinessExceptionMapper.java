/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.book.mappers;

import co.edu.uniandes.csw.book.exceptions.BusinessException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 *
 * @author Diego F. Ruiz S.
 */
public class BusinessExceptionMapper implements ExceptionMapper<BusinessException> {

    /**
     * Generador de una respuesta a partir de una excepción
     *
     * @param ex excecpión a convertir a una respuesta REST
     */
    @Override
    public Response toResponse(BusinessException ex) {
        return Response
                .status(Response.Status.NOT_FOUND) // estado HTTP 404
                .entity(ex.getMessage()) // mensaje adicional
                .type("text/plain")
                .build();
    }
}
