package spring_hibernate;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages="spring_hibernate")
public class Product_Configuration {
	
	
	String hbmDialectProperty = "hibernate.dialect";
    String hbmShowSqlProperty = "hibernate.show_sql";
    String hbmFormatSqlProperty = "hibernate.format_sql";
    String hbmDdlAutoProperty = "hibernate.hbm2ddl.auto";
    
	
	@Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] { "spring_hibernate" });
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
     }

    @Bean 
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("rinkesh@84");
        return dataSource;
    }
	
	 private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put(hbmDialectProperty,  "org.hibernate.dialect.MySQLDialect");
        properties.put(hbmShowSqlProperty,"true");
        properties.put(hbmFormatSqlProperty,"true");
        properties.put(hbmDdlAutoProperty,"create-drop");
        return properties;        
    }

}
