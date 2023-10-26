package sa.SpringWS_MultiConnectors.web;


import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import sa.SpringWS_MultiConnectors.dtos.ClientRequest;
import sa.SpringWS_MultiConnectors.entities.Client;
import sa.SpringWS_MultiConnectors.mappers.ClientMapper;
import sa.SpringWS_MultiConnectors.repositories.ClientRepository;

import java.util.List;

@Controller
@AllArgsConstructor
public class ClientGraphQl {
private ClientRepository clientRepository;
private ClientMapper clientMapper;

@QueryMapping
public List<Client>allClients(){
    return clientRepository.findAll();
}
    @QueryMapping
    public Client clientById(@Argument Long id){
        Client client = clientRepository.findById(id).orElse(null);
        if(client==null)throw new RuntimeException(String.format("client n'existe pas", id));
        return client;
    }

    @MutationMapping
    public Client saveClient(@Argument ClientRequest client){
    Client c =  clientMapper.from(client);
       return clientRepository.save(c);
    }
}
