package system;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author emsi
 * @version 1.0
 * @created 02-janvier 2023
 */
public class Client {

	private static final Logger logger = Logger.getLogger(Client.class.getName());

	private String nomClient;
	private int numClient;
	private String prenomClient;
	protected  static final List<Compte> mCompte=new ArrayList<Compte>();
	
	
	public Client(String nomClient, int numClient, String prenomClient) {
		this.nomClient = nomClient;
		this.numClient = numClient;
		this.prenomClient = prenomClient;
	}
	public Client(){

	}



	public void afficherClient(){
		logger.info(" nom du client:"+getNomClient());
		logger.info("le nom du client:"+getNomClient());
		logger.info("le pr nom du client:"+getPrenomClient());
		logger.info("------- Les comptes bancaires associ s : --------");
		for (int i = 0; i < mCompte.size(); i++) {
			Compte compte = mCompte.get(i);
			if (compte != null) {
				logger.info(compte.toString());
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