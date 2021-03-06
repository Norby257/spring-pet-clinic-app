package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerservice;
    private final VetService vetService;

    public DataLoader(OwnerService ownerservice, VetService vetService) {
        this.ownerservice = ownerservice;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();

        owner1.setFirstName("Michael");
        owner1.setLastName("Scott");
        ownerservice.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerservice.save(owner2);

        System.out.println("Loaded owners....");

        Vet vet1 = new Vet();

        vet1.setFirstName("Ted");
        vet1.setLastName("Mulens");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Sam");
        vet2.setLastName("Axe");

        vetService.save(vet2);

        System.out.println("Loaded vets.....");

    }
}
