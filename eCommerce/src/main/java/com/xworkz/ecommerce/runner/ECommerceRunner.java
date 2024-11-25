package com.xworkz.ecommerce.runner;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ECommerceRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=eMF.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		if(eMF!=null) {
			System.out.println("connected");
		}
		else {
			System.out.println("not connected");
		}
		
		Products products=new Products();
		products.setProduct_id(5);
		products.setProduct_name("Refrigerator");
		products.setCategory("Home Appliances");
		products.setBrand("Whirlpool");
		products.setPrice(50000.60);
		products.setStock_quantity(12);
		products.setSupplier_name("Cool Appliances Suppliers");
		products.setSupplier_contact("9876543214");
		products.setDiscount_percentage(10.0);
		products.setIs_active(true);
		
		
		entityTransaction.begin();
		entityManager.persist(products);
		entityTransaction.commit();
		
		
		System.out.println("values are stored");
		
		entityManager.close();
		eMF.close();
	}

}
