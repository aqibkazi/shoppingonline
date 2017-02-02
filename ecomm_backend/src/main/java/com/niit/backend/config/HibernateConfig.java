package com.niit.backend.config;

import java.util.Properties;

import javax.sql.DataSource;

public class HibernateConfig {
@Bean
public DataSource getDataSource() {
	BasicDataSource dataSource = new BasicDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/Project Name");
	dataSource.setUsername("sa");
	dataSource.setPassword("sa");
	return dataSource;
}
@Bean
public SessionFactory getSessionFactory(DataSource dataSource) {
	LocalSessionFactoryBuilder sessionFactoryBuilder = new LocalSessionFactoryBuilder(dataSource);
	sessionFactoryBuilder.addProperties(getHibernateProperties());
	sessionFactoryBuilder.scanPackages("com.niit.backend.entity");
	return sessionFactoryBuilder.buildSessionFactory();
}
private Properties getHibernateProperties() {
	Properties properties = new Properties();
	properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	properties.put("hibernate.show_sql","true");
	properties.put("hibernate.format_sql","true");
	//properties.put("hibernate.hbm2ddl.auto", "update");

	return properties;
}
@Bean
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	return transactionManager;
}
}

