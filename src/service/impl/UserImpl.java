package service.impl;

import databasa.Databasa;
import model.User;
import model.Userid;
import model.enums.Gender;
import service.UserService;

import java.util.Arrays;
import java.util.Scanner;

public class UserImpl implements UserService {
    @Override
    public void registr(User newuser) {
        Scanner scanner = new Scanner(System.in);
        newuser.setUserid(Userid.geneteId());
        System.out.println("Введите имя: ");
        newuser.setFullname(scanner.nextLine());
        System.out.println("Фамилия: ");
        newuser.setFullname(scanner.nextLine());
        System.out.println("Введите пол: m or f");
        String gender = scanner.nextLine();
        if (gender.equalsIgnoreCase("m")){
            newuser.setGender(Gender.MALE);
        }else if (gender.equalsIgnoreCase("f")){
            newuser.setGender(Gender.FEMALE);
        }else {
            System.out.println("Поля не должны быть пустыми!");
        }


        System.out.println("Введите Email:");
        newuser.setEmail(scanner.nextLine());
        if (newuser.getEmail().isEmpty() || newuser.getFullname().isEmpty() || newuser.getFullname().isEmpty()) {
            System.out.println("Поля не могут быть пустыми!");}
        else if (!newuser.getEmail().contains("@gmail.com")) {
            System.out.println("Некорректный адрес электронной почты!");
        } else {
            System.out.println("Введите пароль: ");
            newuser.setPassword(scanner.nextLine());
            if (newuser.getPassword().length() < 4 ) {
                System.out.println("""
                        Пароль должен быть не менее 4 символа!" +
                                                  
                        """);
                }
            else {
Databasa.users = Arrays.copyOf(Databasa.users,Databasa.users.length+1);
Databasa.users[Databasa.users.length-1] = newuser;
                System.out.println(newuser);

            }}

    }

    @Override
    public void Voiti(User newUser) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите адресс эл.почты:");
        String email = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();
        if (email.equalsIgnoreCase(newUser.getEmail())&&password.equalsIgnoreCase(newUser.getPassword())){
            System.out.println("Добро пожаловать!");
            System.out.println(newUser);

        }else {
            System.out.println("Похоже вы забыли пароль!");
        }



    }

    @Override
    public void GetUserByEmail(User[] users) {
        System.out.println("Введите имя :");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        for (int i = 0; i < Databasa.users.length; i++) {
            if (email.equalsIgnoreCase(Databasa.users[i].getEmail())){
                System.out.println(Databasa.users[i]);
            }
            System.out.println("Не существует!");

        }

    }

}
