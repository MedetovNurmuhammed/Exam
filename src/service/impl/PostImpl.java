package service.impl;

import databasa.Databasa;
import model.Post;
import model.Postid;
import service.PostService;

import java.util.Arrays;
import java.util.Scanner;

public class PostImpl implements PostService {
    @Override
    public void addpost() {
        Post post = new Post();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя админа:");
        String name = scanner.nextLine();
        for (int i = 0; i < Databasa.users.length; i++) {
            if (Databasa.users[i].getFullname().equalsIgnoreCase(name)){
                System.out.println("Введите описания:");
                String dis = scanner.nextLine();
                post.setDiscription(dis);
                post.setId(Postid.geneteId());
                Databasa.users[i].posts = Arrays.copyOf(Databasa.users[i].posts, Databasa.users[i].posts.length + 1);
                Databasa.users[i].posts[Databasa.users[i].posts.length - 1] = post;
                System.out.println(post); }
            else {
                System.out.println("Пользователь не существует");


        }

        }

    }

    @Override
    public void DeletePostById() {

        System.out.println("Введите id пост:");
        Scanner scanner = new Scanner(System.in);
        long id = scanner.nextLong();
            for (int i = 0; i < Databasa.users.length; i++) {
                for (int l = 0; l < Databasa.users[i].posts.length; l++) {
                    if (Databasa.users[i].posts[l].getId() == id){
                        Databasa.users[i].posts[l] = Databasa.users[i].posts[l+1];

                    }
                    Databasa.users[i].posts = Arrays.copyOf(Databasa.users[i].posts,Databasa.users[i].posts.length - 1);
                }


            }
//        }//public static Product[] deleteProduct(Product[] products,long id){
//        for (int i = 0; i < products.length; i++) {
//        if (products[i].getId() == id){
//            for (int j = i; j < products.length-1; j++) {
//                products[j] = products[j+1];
//
//            }
//        }
//
//    }
//        return  Arrays.copyOf(products,products.length-1);
//
//}
//

    }
}
