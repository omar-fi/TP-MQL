package system;

import java.util.ArrayList;
import java.util.List;
/**
 * @author emsi
 * @version 1.0
 * @created 02-janvier 2023
 */
public class Client {



	private String nomClient;
	private int numClient;
	private String prenomClient;
	public List<Compte> mCompte=new ArrayList<Compte>();
	
	
	public Client(String nomClient, int numClient, String prenomClient) {
		this.nomClient = nomClient;
		this.numClient = numClient;
		this.prenomClient = prenomClient;
	}
	public Client(){

	}

	public void finalize() throws Throwable {

	}

	public void afficherClient(){
		System.out.println(" nom du client:"+getNomClient());
		System.out.println("le nom du client:"+getNomClient());
		System.out.println("le pr nom du client:"+getPrenomClient());
		System.out.println("------- Les comptes bancaires associ s : --------");
		for(int i=0;i<mCompte.size();i++)
		System.out.println(mCompte.get(i).toString());

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