package com.DanskeIt.HibernateWithXML.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.DanskeIt.HibernateWithXML.model.Employee;
import com.DanskeIt.HibernateWithXML.util.HibernateUtil;

public class EmployeeDAO {

	public void saveEmployee(Employee employee) {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// save object
			session.save(employee);

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			/*if (transaction != null)
				transaction.rollback();*/
		}
	}
}
