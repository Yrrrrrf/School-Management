package database;

import java.util.List;

import database.crud.UserCrudReposiroty;
import database.entity.User;

public class UserRepository {
    private UserCrudReposiroty userCrudReposiroty;


    public List<User> getAll() {
        // Cast this iterable as a <User> list
        return (List<User>) userCrudReposiroty.findAll();
    }


    public static void main(String[] args) {
        new UserRepository().getAll().forEach(System.out::println);
    }
}
