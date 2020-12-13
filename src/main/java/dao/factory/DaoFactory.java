package dao.factory;

import dao.UserDao;
import dao.impl.SQLUserDao;

public final class DaoFactory 
{
    private static final DaoFactory instance = new DaoFactory();

    private final UserDao sqlUserImpl = new SQLUserDao();

    private DaoFactory()
	{
		
	}

    public static DaoFactory getInstance()
	{
        return instance;
    }

    public UserDao getUserDao()
	{
        return sqlUserImpl;
    }

}
