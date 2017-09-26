package be.ste.tunsajan.yaka.beans;

import java.io.Serializable;

public class PaysBean implements Serializable {
	private String _abr;
	private String _nom;
	private Long _port; 

	public PaysBean(String abr, String nom, Long port) {
		this._abr = abr;
		this._nom = nom;
		this._port = port;
	}
}
