package sa.SpringWS_MultiConnectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sa.SpringWS_MultiConnectors.entities.Client;
import sa.SpringWS_MultiConnectors.repositories.ClientRepository;

@SpringBootApplication
public class SpringWsMultiConnectorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWsMultiConnectorsApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(ClientRepository clientRepository){
		return args -> {
			clientRepository.save(Client.builder().name("hassan").email("hasan@gmail.com").build());
			clientRepository.save(Client.builder().name("ali").email("ali@gmail.com").build());
			clientRepository.save(Client.builder().name("hamid").email("hamid@gmail.com").build());
		};
	}
}
