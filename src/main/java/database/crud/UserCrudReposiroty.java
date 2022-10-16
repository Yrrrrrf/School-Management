package database.crud;

import org.springframework.data.repository.CrudRepository;

import database.entity.User;



public interface UserCrudReposiroty extends CrudRepository<User, Integer> {
    // extends CrudRepository <Entity, PrimaryKey>
    


}
