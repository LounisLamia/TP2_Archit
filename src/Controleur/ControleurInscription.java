package Controleur;
import Services.EtudiantService;
import View.ViewInscription;

import java.io.IOException;
import java.sql.SQLException;


public class ControleurInscription {
	private EtudiantService EService;
	private ViewInscription View;
	
 public  ControleurInscription(EtudiantService eService,ViewInscription view) {
	 EService=eService;
	 View=view;
 }
 public void inscription() throws SQLException, IOException {
 if(EService.inscription(View. getMat(),View.getNom(),View.getPrenom(),View.getMail(),View.getPassword(),View.getUniv() )){
	 View.displayMessage("Etudiant ajouté avec succés !");
	 View.Rénistialisation();
	}else {
		View.displayErrorMessage(" Matricule ou Email existe déja !");
	}				


}
}
