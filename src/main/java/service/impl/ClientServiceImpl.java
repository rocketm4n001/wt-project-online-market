package service.impl;

import beans.UserAccount;
import dao.UserDao;
import dao.factory.DaoFactory;
import service.ClientService;

public class ClientServiceImpl implements ClientService 
{
    @Override
    public boolean signIn(String login,String password) 
	{
        DaoFactory daoObjectFactory = DaoFactory.getInstance();
        UserDao userDao = daoObjectFactory.getUserDao();

        return userDao.signIn(login, password);
    }

    @Override
    public void signOut(String login) 
	{
    }

    @Override
    public void registration(UserAccount user) 
	{
    }
}
