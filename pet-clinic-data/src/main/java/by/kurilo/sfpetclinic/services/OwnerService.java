package by.kurilo.sfpetclinic.services;

import by.kurilo.sfpetclinic.model.Owner;
import by.kurilo.sfpetclinic.model.Pet;
import by.kurilo.sfpetclinic.model.Vet;

import java.util.Set;

public interface OwnerService extends CrudService <Owner, Long> {
    Owner findByLastName (String lastName);
}
