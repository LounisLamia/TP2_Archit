import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		
	
		// TODO Auto-generated method stub
	
		EtudiantService serv=new EtudiantService();
		
		
		try {
			MessComposite a = new MessComposite();
			IJournal journal1 = new AfficherMessEcran();
			IJournal journal2 = new AfficherMessFichier();
			IJournal journal3 = new DateMess();
			a.ajouter(journal1);
			a.ajouter(journal2);
			a.ajouter(journal3);
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
