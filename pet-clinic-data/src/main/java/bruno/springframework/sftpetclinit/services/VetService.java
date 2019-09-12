package bruno.springframework.sftpetclinit.services;

import bruno.springframework.sftpetclinit.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();

}
