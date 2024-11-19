import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletcrud","root","");	
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	public static Model logincheck(Model m)
	{
		Model m2 = null;
		
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from info where email=? and password=?");
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPass());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				String email = set.getString(4);
				String pass = set.getString(5);
			
				m2 = new Model();
				m2.setId(id);
				m2.setName(name);
				m2.setSurname(surname);
				m2.setEmail(email);
				m2.setPass(pass);
			}
			
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;
		
	}
}
