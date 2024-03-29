package bruno.springframework.sftpetclinit.services.map;

import bruno.springframework.sftpetclinit.model.Vet;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet owner) {
        super.delete(owner);
    }

    @Override
    public Vet save(Vet owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

}
