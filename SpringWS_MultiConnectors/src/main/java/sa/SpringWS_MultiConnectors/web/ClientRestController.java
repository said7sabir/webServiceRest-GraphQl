package sa.SpringWS_MultiConnectors.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sa.SpringWS_MultiConnectors.entities.Client;
import sa.SpringWS_MultiConnectors.repositories.ClientRepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class ClientRestController {

    private ClientRepository clientRepository;

    @GetMapping("/clients")
    public List<Client>clientList(){
        return clientRepository.findAll();
    }
    @GetMapping("/clients/{id}")
    public Client clientById(@PathVariable Long id){
        return clientRepository.findById(id).get();
    }
    @PostMapping("/clients")
    public Client saveClient(@RequestBody Client client){
        return clientRepository.save(client);
    }
}
