import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		 
	
		// TODO Auto-generated method stub
		try {
		MessComposite a = new MessComposite();
			IJournal journal1 = new AfficherMessEcran();
		    IJournal journal2 = new AfficherMessFichier();
		    IJournal journal3 = new DateMess();
			a.ajouter(journal1);
			a.ajouter(journal2);
			a.ajouter(journal3);
		
			IEtudiantRepository StudRep= new EtudiantRepository(a);
			IUniversiteRepository UnivRep= new UniversiteRepository(a);
			
			// Etudiant stud = new Etudiant(5, "Guendouziiiii", "wassila", "guen4@gmail.com","xxxx", 2);
			 EtudiantService serv=new EtudiantService(StudRep,UnivRep,a);
			serv.inscription(5, "Guendouziiiii", "wassila", "guen4@gmail.com","xxxx", 2);
			serv.inscription(6, "Lounis", "Lamia", "lounis4@gmail.com","xxx", 2);
		     
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
