package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	//essa implementação estática garante que não iremos expor a implementação
	//o tipo retornado e SellerDao, mas internamente devolvemos SellerDaoJDBC
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
