package dk.tec.h4java;

public class PersonNotFoundException extends RuntimeException{
    PersonNotFoundException(Long id){
        super("Could not find person" + id);
    }
}
