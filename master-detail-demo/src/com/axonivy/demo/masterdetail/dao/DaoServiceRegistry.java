package com.axonivy.demo.masterdetail.dao;

public class DaoServiceRegistry {

	private static ProductRepoDAO productRepoDAO = null;

	public static ProductRepoDAO getProductRepoDAO() {
		if(productRepoDAO == null) {
			productRepoDAO = new ProductRepoDAO();
		}
		return productRepoDAO;
	}
}
