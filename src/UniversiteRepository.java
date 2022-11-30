
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository implements IUniversiteRepository {
	
	private IJournal journal;
	public UniversiteRepository(IJournal journal) {
		
		this.journal= journal;
	}
	
	 
	
	public Universite GetById(int universityId) throws SQLException, IOException {
				
		DBConnection BD= DBConnection.getInstance();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		journal.outPut_Msg("LogBD : début recherche de id université dans la base de donnée");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		journal.outPut_Msg("LogBD : université récupérée");
		
		connect.close();
		return u;	
	 
		
	}	
	public int NbrLivreAutorise(int univId) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Universite univ= GetById(univId);
		AbstractFactory abs = new MakeAbstract();
		Package pack = abs.getPackage(univ.getPack()); 
		return pack.getNbrLivreAutorise();
	}
	public int NbrLivreBonus(int univId) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Universite univ= GetById(univId);
		AbstractFactory abs = new MakeAbstract();
		Package pack = abs.getPackage(univ.getPack()); 
		return pack.getNbrLivreBonus();
		
	}	
}
