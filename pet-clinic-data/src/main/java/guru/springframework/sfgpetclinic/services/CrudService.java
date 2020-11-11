package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    //find all: return a set
    Set<T> findAll();

    //find by Id - return type
    //use T as the generics - this is abstract but details can be determined at runtime
    T findById(ID id);

    T save(T object);

    // input T as generic input
    void delete(T object);

    void deleteById(ID id);
}
