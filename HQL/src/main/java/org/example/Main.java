package org.example;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HQLPRACTICE H  = new HQLPRACTICE();
        H.setLatopId(3);
        H.setlModel("NZ0");
        H.setlName("ThinkPad");




        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.HQLPRACTICE.class)
                .configure()
                .buildSessionFactory();
        Session s = sf.openSession();
//        Query q=s.createQuery("from HQLPRACTICE where lName ='ThinkPad'");
//        List<HQLPRACTICE> laptops=q.getResultList();
        HQLPRACTICE H1 = s.getReference(HQLPRACTICE.class,3);
        System.out.println(H1);
        sf.close();
        s.close();

    }
}