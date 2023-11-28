package com.jpa.demo;

import java.util.*;

import javax.persistence.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
	  private static EntityManager em;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaPU");
			em = emf.createEntityManager();
	        EntityTransaction etrans=em.getTransaction();
	       // etrans.begin();
	        
		       
		   

	     // Create Entity

//	      Movie movie1=new Movie("singam");
//	        Movie movie2=new Movie("singam2");
//	        Movie movie3=new Movie("singam3");
//	        Movie movie4=new Movie("singam4");
//	        
//	        
//	        
//	        
//	        em.persist(movie1);
//	        em.persist(movie2);
//	        em.persist(movie3);
//	        em.persist(movie4);
	        
//	        Query q=em.createQuery("select movie from Movie movie");
//        List<Movie> result=q.getResultList();
//        for(Movie m:result) {
//        	System.out.println("movie_id:"+m.getMovieId());
//        	System.out.println("movie_name:"+m.getMovieName());
//        	System.out.println("==============================");
//        	
        
        
        //delete opertaion
        
//        em.getTransaction().begin();
//        Query q1=em.createQuery("delete from Movie movie where movie.movieId>3");
//        int nor=q1.executeUpdate();
//        System.out.println("deleted:"+nor);
//        em.getTransaction().commit();/
       // etrans.commit();
        //em.getTransaction().begin();
//        
        //orderby
//        	Query q2=em.createQuery("from Movie movie where movie.movieId>3");
//        	List<Movie> ordering=q2.getResultList();
//        	System.out.println(ordering);
     	
        	
        	//named parameters
        	
        //	
        	
        	em.getTransaction().begin();
        	
        	Query q4=em.createQuery("Select movie from  Movie movie where movie.movieId > :mid");
        	q4.setParameter("mid",3);
       	
//        	
        	List<Movie> results=q4.getResultList();
//        	
        	Query q5=em.createQuery("select movie from Movie movie where movie.movieId>?1");
        	q5.setParameter(1,2);
        	List<Movie> results1=q5.getResultList();
        	System.out.println(results1);
           	Query q6=em.createQuery("Select movie from Movie movie where movie.movieId in :mid");
//        	
//        
  
	    
        	
        	em.getTransaction().commit();
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
		
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        //customer.setCustomerName("daya");
	        
//	        Customer customer1=new Customer();
//	        customer1.setCustomerName("riya");
//	        
//	        
//	        Orders orders=new Orders();
//	        orders.setOrderDiscripton("Shirts");
//	        
//	        Orders orders1=new Orders();
//	        orders1.setOrderDiscripton("pants");
//	        
//	        Set<Orders> orderSet=new HashSet<Orders>();
//	        orderSet.add(orders);
//	        orderSet.add(orders1);
//	        
//	        
//	        Set<Customer> customerSet=new HashSet<Customer>();
//	        customerSet.add(customer);
//	        customerSet.add(customer1);
//	        
//	        //add customer object to order
//	        orders.setCustomer(customerSet);
//	        orders1.setCustomer(customerSet);
//	        
//	        //add orders obbject to custoemr
//	        customer.setOrders(orderSet);
//	        customer1.setOrders(orderSet);

	        
	        
	       
	        
	        
	        
	       // etrans.commit();
	        
	       
	        //
	        
	     // Retrieve entity

//	        cx = em.find(Customer.class, 10);
////
//        System.out.println(cx);
//	        
//	        
//	        
//	        
//	        //
//	        
//	        etrans.begin();
//	        //employee.setAddress("blore");
//
//	        System.out.println("Updated Employee is: " + employee);
//
//	        em.getTransaction().commit();
//	        
//	        
//	        
//	        cx = new Customer("klmnnn","sbd");
//	        etrans.begin();
//	        em.merge(cx);
//	        
//	        em.getTransaction().commit();
////	        
//	        System.out.println("Merged :"+cx);
		
//		
//		
		
		
}


