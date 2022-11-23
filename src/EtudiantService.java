import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	IEtudiantRepository  iStudRep;
	IUniversiteRepository  iUnivRep;
	
	public void EtudiantServise(IEtudiantRepository StudRep, IUniversiteRepository UnivRep) {
		 iStudRep = StudRep;
		 iUnivRep = UnivRep;
		 
	}
	
	
	
	
	boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
	    Etudiant stud = new Etudiant(matricule, nom, pr�nom, email,pwd,id_universite);
	    Universite univ=iUnivRep.GetById(id_universite);
	    
	    System.out.println("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
	    if(email == null || email.length() == 0)
	    {
	    	return false;
	    }
	    
	    if (iStudRep.Exists(matricule))
	    {
	        return false;
	    }
	    
		if (iStudRep.Exists(email))
	    {
	        return false;
	    }
		
		
		
		 if (univ.getPack() == TypePackage.Standard)
	     {
	          stud.setNbLivreMensuel_Autorise(10);
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }                           
	     
		 iStudRep.add(stud);
		 System.out.println("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
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
