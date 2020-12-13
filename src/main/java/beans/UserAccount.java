package beans;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAccount 
{
    private int id;
    private String name;
    private String surname;
    private String login;
    private String email;

    public UserAccount(String Login,String Password)
    {
		
    }

    public UserAccount(ResultSet set)
	{
        try 
		{
            id = set.getInt("iduser");
            name = set.getString("name");
            surname = set.getString("surname");
            login = set.getString("login");
            email= set.getString("email");

        } 
		catch (SQLException e) 
		{
            e.printStackTrace();
        }
    }

    public int getId() 
	{ 
		return id; 
	}
    
	public void setId(int id) 
	{
		this.id = id;
	}

    public String getLogin() 
	{ 
		return login; 
	}
	
    public void setLogin(String login) 
	{ 
		this.login = login; 
	}

    public String getName() 
	{ 
		return name; 
	}
    
	public void setName(String name) 
	{ 
		this.name = name; 
	}

    public String getSurname() 
	{ 
		return surname; 
	}
    
	public void setSurname(String surname) 
	{
		this.surname = surname;
	}

    public String getEmail() 
	{ 
		return email; 
	}
    
	public void setEmail(String email) 
	{
		this.email = email;
	}
}
