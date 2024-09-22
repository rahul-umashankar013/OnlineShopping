package com.shopping.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {
  private static SessionFactory sf;
  static {
	  sf=new Configuration().configure().buildSessionFactory();
	  
	  
  }
  
  public static SessionFactory getFactory()
  {
	  return sf;
  }
  
}
