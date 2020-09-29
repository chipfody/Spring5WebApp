package guru.springframework.spring5webapp.bootstrap;

import com.chipfody.Spring5WebApp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {


    private final PublisherRepository publisherRepository;

    public BootstrapData(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
