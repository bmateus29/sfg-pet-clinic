package bruno.springframework.sftpetclinit.services.map;

import bruno.springframework.sftpetclinit.model.Pet;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet owner) {
        super.delete(owner);
    }

    @Override
    public Pet save(Pet owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

}
