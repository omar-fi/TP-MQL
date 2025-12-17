package system;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author emsi
 * @version 1.0
 * @created 02-janvier 2023
 */
public class Client {

	private final Logger logger = Logger.getLogger(Client.class.getName());

	private String nomClient;
	private int numClient;
	private String prenomClient;
	protected final List<Compte> mCompte=new ArrayList<Compte>();
	
	
	public Client(String nomClient, int numClient, String prenomClient) {
		this.nomClient = nomClient;
		this.numClient = numClient;
		this.prenomClient = prenomClient;
	}
	public Client(){

	}



	public void afficherClient() {
		logger.info("Nom du client : " + getNomClient());
		logger.info("Prénom du client : " + getPrenomClient());
		logger.info("------- Les comptes bancaires associés : --------");

		// Utilisation d'une boucle for-each pour plus de clarté
		for (Compte compte : mCompte) {
			if (compte != null) {
				// Correction de l'alerte SonarQube : on passe l'objet au logger
				// au lieu d'appeler explicitement .toString()
				logger.log(Level.INFO, "{0}", compte);
			}
		}
	}

	public String getNomClient(){
		return nomClient;
	}

	public int getNumClient(){
		return numClient;
	}

	public String getPrenomClient(){
		return prenomClient;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNomClient(String newVal){
		nomClient = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNumClient(int newVal){
		numClient = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPrenomClient(String newVal){
		prenomClient = newVal;
	}

}