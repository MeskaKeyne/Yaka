package be.ste.tunsajan.yaka.test;




import java.util.List;

import be.ste.tunsajan.yaka.beans.CategorieBeans;
import be.ste.tunsajan.yaka.beans.SousCategorieBeans;
import be.ste.tunsajan.yaka.dao.DaoYaka;




public class TestDao {
	

	public static void main(String[] args) {

		DaoYaka dao = new DaoYaka();
		List<CategorieBeans>  categories =dao.SQLQueryListerLesCategories();
		for (CategorieBeans c :categories) {
			System.out.println(c);	
		}
		
		List<SousCategorieBeans>  souscategories =dao.SQLQueryListerLesSousCategories();
		for (SousCategorieBeans c :souscategories) {
			System.out.println(c);	
		}
	}

}
