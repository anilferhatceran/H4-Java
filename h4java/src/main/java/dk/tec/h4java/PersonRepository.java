package dk.tec.h4java;

import org.springframework.data.repository.CrudRepository;

import dk.tec.h4java.Person;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PersonRepository extends CrudRepository<Person, Long> {

}