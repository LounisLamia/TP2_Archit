package View;

public interface IViewInscription {
	public void ViewInscription();
	public void displayMessage(String Message);
	public void displayErrorMessage(String Error) ;
	public void R�nistialisation();
	public int getMat();
	public String getNom();
	public String getPrenom();
	public String getMail();
	public String getPassword();
	public int getUniv();
	public void addListener();

}
