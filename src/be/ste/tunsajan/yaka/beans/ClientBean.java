package be.ste.tunsajan.yaka.beans;

import java.io.Serializable;

public class ClientBean implements Serializable{
	
	private String _id;
	private String _nom;
	private String _prenom;
	private String _adresse;
	private String _cp;
	private String _localite;
	private String _pays;
	private String _telephone;
	private String _carteDeCredit;
	private java.sql.Date _dateEcheance;
	private String _email;
	
	public ClientBean() {};
}

