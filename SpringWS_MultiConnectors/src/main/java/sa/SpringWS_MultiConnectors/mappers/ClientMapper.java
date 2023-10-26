package sa.SpringWS_MultiConnectors.mappers;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import sa.SpringWS_MultiConnectors.dtos.ClientRequest;
import sa.SpringWS_MultiConnectors.entities.Client;

@Component
public class ClientMapper {
    private ModelMapper modelMapper=new ModelMapper();

public Client from(ClientRequest clientRequest){
    //Client client = new Client();
    //client.setName(clientRequest.name());
    //client.setEmail(clientRequest.email());
    return modelMapper.map(clientRequest,Client.class);
   // return client;
}

}
