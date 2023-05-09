package co.edu.co.login.model.repository;

import co.edu.co.login.model.beans.User;

import java.sql.SQLException;

public class TestUserRepositoryImp {

    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();



        System.out.println("==========saveObj Insert =========="); //insert

        User userInsert = new User();
        userInsert.setUser_firstname("Carlos");
        userInsert.setUser_lastname("rojas");
        userInsert.setUser_email("carlos@loquesea.com");
        userInsert.setUser_password("asd12345");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("pEpE");
        userInsert.setUser_lastname("perez");
        userInsert.setUser_email("PEPE@correo.com");
        userInsert.setUser_password("67890qwerty");
        repository.saveObj(userInsert);


        System.out.println("==========saveObj listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== SaveObj ==========");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_lastname("jorge");
        userUpdate.setUser_lastname("palacios");
        userUpdate.setUser_email("jorge@xample.com");
        userUpdate.setUser_password("123456asdfg");
        repository.listAllObj().forEach(System.out::println);
        System.out.println("========== deleteObj ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach((System.out::println));
    }
} //TestUserRepositoryImpl
