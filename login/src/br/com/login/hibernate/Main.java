package br.com.login.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
private static final SessionFactory sessionFactory;
	
	static
	{
		Configuration configuration = new Configuration();
		configuration.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
		configuration.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.driver");
		configuration.setProperty("hibernate.connection.url","jdbc:mysql://localhost/login");
		configuration.setProperty("hibernate.connection.username","root");
		configuration.setProperty("hibernate.connection.password","root");
		configuration.setProperty("hibernate.c3p0.min_size","1");
		configuration.setProperty("hibernate.c3p0.max_size","20");
		configuration.setProperty("hibernate.c3p0.timeout","300");
		configuration.setProperty("hibernate.c3p0.max_statements","50");
		configuration.setProperty("hibernate.c3p0.idle_test_period","300");
		configuration.setProperty("hibernate.current_session_context_class","thread");
		configuration.setProperty("hibernate.show_sql", "true");
		configuration.setProperty("hibernate.format_sql", "true");
		sessionFactory = configuration.buildSessionFactory();
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}