package edu.sjsu.cmpe275.lab3;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sponsor s1 = new Sponsor();
		s1.setName("Facebook");
		s1.setDescription("Sponser 1 is set");
		
		/*Address addr = new Address();
		addr.setCity("San Jose");
		addr.setState("California");
		addr.setStreet("North Market");
		addr.setZip("95110");
		
		s1.setAddress(addr);
		
		Player player1 = new Player();
		player1.setEmail("akanksha@gmail.com");
		player1.setFirstname("Akanksha");
		player1.setLastname("Nagpal");
		
		Player player2 = new Player();
		player2.setEmail("rajat@gmail.com");
		player2.setFirstname("Rajat");
		player2.setLastname("Nagpal");
		
		//s1.getPlayers().add(player1);
		//s1.getPlayers().add(player2);*/
		
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session 
		
		
		

	}

}
