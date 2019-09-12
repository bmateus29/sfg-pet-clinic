package bruno.springframework.sftpetclinit.services;

import bruno.springframework.sftpetclinit.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();

}
