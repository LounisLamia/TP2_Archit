import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	private IEtudiantRepository  iStudRep;
	private IUniversiteRepository  iUnivRep;
	private IJournal journal;
	
	public EtudiantService(IEtudiantRepository iStudRep, IUniversiteRepository iUnivRep,IJournal journal) {
		this.iStudRep = iStudRep;
		this.iUnivRep = iUnivRep;
		this.journal = journal;
		 
	}
	 
boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException, IOException{	
	    Etudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
	    journal.outPut_Msg("Log: début de l'opération d'ajout de l'étudiant avec matricule "+stud.getMatricule());
	    
	     if(iStudRep.VerifEmailMat(stud)) {
	    	return false;
	   }
	   int nbrlivreAutorisé = iUnivRep.NbrLivreAutorise(stud.getId_universite());
		  stud.setNbLivreMensuel_Autorise(nbrlivreAutorisé);
	     
		 iStudRep.add(stud);
	    
	                
	     
		 iStudRep.add(stud);
		
	    
		
	
		 journal.outPut_Msg("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+stud.getMatricule());
		 return true;
	    
		
	}

	
	
	 

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}





	
}


	

