package Services;
import java.io.IOException;
import java.sql.SQLException;

public interface IUniversiteRepository {
	
	public Universite GetById(int universityId) throws SQLException, IOException;
	public int NbrLivreAutorise(int univId) throws SQLException, IOException;
	public int NbrLivreBonus(int univId) throws SQLException, IOException;




}
