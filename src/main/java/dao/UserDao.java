package dao;

import beans.UserAccount;

public interface UserDao
{

    boolean singIn(String login,String password);

    boolean registration(UserAccount user);

}