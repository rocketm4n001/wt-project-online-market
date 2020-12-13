package service;

import beans.UserAccount;

public interface ClientService 
{
    boolean signIn(String login, String password);
    void signOut(String login);
    void registration(UserAccount user);
}
