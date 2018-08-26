package Hibernate.Controller;

import Hibernate.Model.HibernateTblEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class main {
    public static void main(String[] args)
    {
        //creating configuration object
        Configuration cfg=new Configuration();
        cfg.configure("Hibernate/Hibernate_tbl.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Query query = session.createQuery("from HibernateTblEntity");
        List<HibernateTblEntity> list = query.list();
//	Employee e1=new Employee();
//	e1.setId(115);
//	e1.setFirstName("sonoo");
//	e1.setLastName("jaiswal");
//
//	session.persist(e1);//persisting the object
        t.commit();
        session.close();
        System.out.println("successfully saved");
    }
}
