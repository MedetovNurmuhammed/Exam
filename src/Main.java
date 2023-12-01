import databasa.Databasa;
import model.User;
import service.PostService;
import service.UserService;
import service.impl.PostImpl;
import service.impl.UserImpl;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user  = new User();
        UserService userService = new UserImpl();
        PostService postService =  new PostImpl();
        Outerloop:
        while (true){
            System.out.println("""
                    1.Регистрация
                    2.войти
                    3.Выйти
                    Выберите команду:""");

            switch (scanner.nextLine()){
                case "1"->{
                    userService.registr(user);
                }
                case "2"->{
                    userService.Voiti(user);
                    while (true){
                        System.out.println("""
                                1. GetUserByEmail
                           
                                2. AddPostToUser
                                3. DeletePostById
                                4. GetAllPostByUserId
                                5. GetUsers""");
                        switch (scanner.nextLine()){
                            case "1"->{
                                userService.GetUserByEmail(Databasa.users);
                            }
                            case "2"->{
                                postService.addpost();


                            }
                            case "3"->{
                                postService.DeletePostById();
                            }
                            case "5"->{
                                System.out.println(Arrays.toString(Databasa.users));
                            }
                        }

                }
            }

                }

                }


                        }
                    }
