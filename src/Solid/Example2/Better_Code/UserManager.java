package Solid.Example2.Better_Code;

import Solid.Example2.Problematic_Code.User;

public class UserManager {

    // Responsibility 1 : CRUD Operation
    public void addUser(Solid.Example2.Problematic_Code.User user){
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User is not adult");
        }
    }


    // Responsibility 1 : CRUD Operation
    public void delete(Solid.Example2.Problematic_Code.User user){
        System.out.println("User deleted");
    }


    // Responsibility 1: CRUD Operation
    public void update(Solid.Example2.Problematic_Code.User user){
        if (user.getAge() < 18) {
            throw new IllegalArgumentException("User is not adult");
        }
        System.out.println("User updated");
    }

    // Responsibility 1: CRUD Operation (Read)
    public void get(Solid.Example2.Problematic_Code.User user){
        System.out.println("User returned");
    }

}
