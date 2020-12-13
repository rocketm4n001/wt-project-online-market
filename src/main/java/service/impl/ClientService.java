package service.impl;

import beans.UserAccount;
import dao.SQLUserDao;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ClientService {

    public boolean signIn(String login,String password) 
	{
        return true;
    }

    public boolean isRegistered(String login, String password) 
	{
        SQLUserDao userDao = new SQLUserDao();

        boolean result = userDao.isUserExist(login,password);

        return result;
    }

    public boolean isPasswordsEqual(String pass1, String pass2)
    {
        return pass1.equals(pass2);
    }

    public static String Hash(String password)
	{
        MessageDigest digest = null;
        
		try 
		{
			digest = MessageDigest.getInstance("SHA-256");
        } 
		catch (NoSuchAlgorithmException e) 
		{
            e.printStackTrace();
        }
        
		byte[] encodedhash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
		
        return Base64.getEncoder().encodeToString(encodedhash);
    }



}