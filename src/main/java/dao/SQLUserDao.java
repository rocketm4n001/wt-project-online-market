package dao;

import beans.UserAccount;
import dao.ConnectionPool;

import java.sql.*;

public class SQLUserDao 
{
    private  String jdbcURL ="jdbc:mysql://localhost:3306/shop_db";
    private  String jdbcUsername = "root";
    private  String jdbcPassword = "Root1234";

    public boolean isUserExist (String login, String password) 
	{
        boolean isExsist = false;
        
		try (Connection conn = ConnectionPool.getInstance().connect()) 
		{
            PreparedStatement st = conn.prepareStatement ("SELECT * FROM users WHERE users.login = ? and users.password = ?;");

            st.setString(1, login);
            st.setString(2, password);

            ResultSet resultSet = st.executeQuery();

            if (!resultSet.next()) 
			{
                isExsist = false;
            } 
			else 
			{
                isExsist = true;
            }

        } 
		catch (SQLException e) 
		{
            e.printStackTrace();
        }
		
        return isExsist;
    }

    public UserAccount getRegisteredUser(String login, String hashPassword) 
	{
        UserAccount user = null;
		
        try (Connection connection = ConnectionPool.getInstance().connect();
		{
            PreparedStatement st = connection.prepareStatement("")) 

			st.setString(2,hashPassword);
			st.setString(1,login);

			ResultSet result = st.executeQuery();
				
			if(!result.next()) 
			{
				return null;
			}

			user = new UserAccount(result);
		} 
		catch (SQLException e) 
		{
            e.printStackTrace();
        }

        return user;
    }

    protected Connection getConnection() 
	{
        Connection connection = null;
        
		try 
		{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } 
		catch (SQLException e) 
		{
            e.printStackTrace();
        } 
		catch (ClassNotFoundException e) 
		{
            e.printStackTrace();
        }

        return connection;
    }


    protected UserAccount FillUserAccount(PreparedStatement preparedStatement) 
	{
        UserAccount userAccount = null;
        
		try 
		{
            ResultSet rs = preparedStatement.executeQuery();
            
			while (rs.next()) 
			{
                int id = Integer.parseInt(rs.getString("id"));
                String login = rs.getString("login");
                String password = rs.getString("password");

                userAccount = new UserAccount(login, password);
            }
        }
        catch (Exception e) 
		{
			
		}
		
        return userAccount;
    }

    public UserAccount GetUserAccount(int id) 
	{
        try 
		{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM `users` WHERE `id` = ?");
            preparedStatement.setInt(1, id);
			
            return FillUserAccount(preparedStatement);
        }
        catch (Exception e) 
		{
			
		}
		
        return null;
    }

    public boolean singIn(String login,String password)
	{
        boolean isSignedIn=false;
        
		try 
		{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM `users` WHERE `login` = ? AND `password` = ?");
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (!resultSet.next())
			{
                isSignedIn = false;				
			}
            else
			{
                isSignedIn = true;				
			}
        }
		
        catch (Exception e) 
		{
			
        }

        return isSignedIn;
    }

    public boolean registration(UserAccount user) 
	{
        boolean canRegistrate = true;
		
        try 
		{
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM `users` WHERE `login` = ? ");
            preparedStatement.setString(1, user.getLogin());

            ResultSet resultSet= preparedStatement.executeQuery();
			
            if (!resultSet.next())
			{ 
				canRegistrate = true; 
			}
            else
			{ 
				canRegistrate = false;
			}
            if (canRegistrate) 
			{
                PreparedStatement preparedStatement2 = connection.prepareStatement ("INSERT INTO `users` (login, password) VALUES (?,?)");

                preparedStatement2.setString(1, user.getLogin());
                preparedStatement2.setString(2, user.getLogin());

                int row = preparedStatement.executeUpdate();
            }
        }

        catch (Exception e) 
		{
			
		}
		
        return  canRegistrate;
    }
}
