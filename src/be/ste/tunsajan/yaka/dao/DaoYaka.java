package be.ste.tunsajan.yaka.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.sql.DataSource;

import be.ste.tunsajan.yaka.beans.CategorieBeans;
import be.ste.tunsajan.yaka.beans.ProduitBeans;
import be.ste.tunsajan.yaka.beans.SousCategorieBeans;

public class DaoYaka {
	protected javax.persistence.EntityManager em;
	
	private List<CategorieBeans> categories;
	private List<SousCategorieBeans> sousCategories;
	private List<ProduitBeans> produits;
	
	public DaoYaka() {
		super();
		
		this.em = Persistence.createEntityManagerFactory("yaka_db").createEntityManager();
		this.categories = this.SQLQueryListerLesCategories();
		this.sousCategories =this.SQLQueryListerLesSousCategories();
		this.produits = this.SQLQueryListerLesProduits();
		
		
	}
	public List<CategorieBeans> SQLQueryListerLesCategories(){
		System.out.println("QUERY: ListerLesCategories");
			return this.em.createNamedQuery("SQLQueryListerLesCategories", CategorieBeans.class).getResultList();
	}
	public List<SousCategorieBeans> SQLQueryListerLesSousCategories(){
		System.out.println("QUERY: ListerLesSousCategories");
			return this.em.createNamedQuery("SQLQueryListerLesSousCategories", SousCategorieBeans.class).getResultList();
	}
	public List<ProduitBeans> SQLQueryListerLesProduits(){
		System.out.println("QUERY: ListerLesProduits");
		return this.em.createNamedQuery("SQLQueryListerLesProduits", ProduitBeans.class).getResultList();
		
	}
	

}
