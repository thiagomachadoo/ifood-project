package com.github.thiagomachadoo.ifood.cadastro.controller;

import com.github.thiagomachadoo.ifood.cadastro.model.Prato;
import com.github.thiagomachadoo.ifood.cadastro.model.Restaurante;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/pratos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PratoController {

    @GET
    @Path("{idRestaurante}/pratos")
    public List<Restaurante> buscarPratos(@PathParam("idRestaurante") Long idRestaurante){
       Optional<Restaurante> restauranteOp = Restaurante.findByIdOptional(idRestaurante);
       if(restauranteOp.isEmpty()){
           throw new NotFoundException("Restaurante não existe");
       }
       return Prato.list("restaurante", restauranteOp.get());
    }
}
