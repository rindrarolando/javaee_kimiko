import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Book;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*SessionFactory sessionFactory = util.HibernateUtil.getSessionFactory();
        
		try (Session session = sessionFactory.openSession()) {
		    Transaction transaction = session.beginTransaction(); // Début de la transaction
		    
		    Book book = new Book(); // Création d'une instance de votre entité
		    book.setTitle("Sample Title");
		    book.setDescription("Sample Description");
		    book.setAvailability(false);
		    
		    session.save(book); // Sauvegarde de l'entité dans la base de données
		    
		    transaction.commit(); // Commit de la transaction
		    System.out.println("Table creation attempted.");
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    sessionFactory.close();
		}
		
        
		/*String jdbcUrl = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		
		try {
			
			Connection connection = DriverManager.getConnection(jdbcUrl,user,password);
			
			System.out.println("Connection established with h2");
			
			/*String sql = "INSERT INTO books VALUES ('0', 'title_sample', 'desc_sample', true)";
			
			Statement statement = connection.createStatement();
			
			int rows = statement.executeUpdate(sql);
			
			if(rows > 0) {
				System.out.println("inserted successfully");
			}
			
			String sql = "SELECT desc FROM TESTS";
			
			Statement statement = connection.createStatement();
			
			ResultSet res = statement.executeQuery(sql);
			
			while (res.next()) {
				String title = res.getString("desc");
				System.out.println(title);
			}
			
			connection.close();
			
		} catch (SQLException e){
			e.printStackTrace();
		}*/
	}

}
