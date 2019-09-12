package bruno.springframework.sftpetclinit.services;

import bruno.springframework.sftpetclinit.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
