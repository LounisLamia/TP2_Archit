package View;
import java.sql.SQLException;

import Journal.AfficherMessEcran;
import Journal.AfficherMessFichier;
import Journal.DateMess;
import Journal.MessComposite;
import Repository.EtudiantRepository;
import Repository.UniversiteRepository;
import Services.EtudiantService;
import Services.IEtudiantRepository;
import Services.IJournal;
import Services.IUniversiteRepository;

public class MainAppMvc {

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
			
			
			 EtudiantService serv=new EtudiantService(StudRep,UnivRep,a);
			serv.inscription(7, "Lounis", "kenza", "kenza123@gmail.com", "yyy", 3);
			
			IViewInscription f = new ViewInscription();
			f.addListener();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

