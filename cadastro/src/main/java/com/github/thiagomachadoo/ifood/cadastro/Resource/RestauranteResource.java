package com.github.thiagomachadoo.ifood.cadastro.Resource;

import com.github.thiagomachadoo.ifood.cadastro.entity.Restaurante;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/restaurantes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestauranteResource {

    @GET
    public List<Restaurante> buscar(){
        return Restaurante.listAll();
    }

    @POST
    public void adicionar(Restaurante dto){
    dto.persist();
    }

}
