package guru.springframework.petclinicspring.services;

import guru.springframework.petclinicspring.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
