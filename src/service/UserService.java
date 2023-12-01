package service;

import model.User;

public interface UserService {
    void registr(User newUser);
    void Voiti(User newUser);
    void  GetUserByEmail(User[] users);
}
