package com.xworkz.update.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.update.dto.ProfileDto;

public class GetNameAndPhRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = eMF.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			List<ProfileDto> nameAndPh = em
					.createQuery("select pd from ProfileDto pd where pd.age>15",ProfileDto.class).getResultList();
			for(ProfileDto name:nameAndPh) {
			System.out.println("Names:"+name.getName()+"  "+"PhoneNumbers:"+name.getPhoneNumber());
			}
			et.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			eMF.close();
		}
	}

}
