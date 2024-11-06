package Projeto.Matricula.Matricula_aluno.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;



@Configuration
public class DataConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSourc = new DriverManagerDataSource();
        dataSourc.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSourc.setUrl("jdbc:mysql://localhost:3306/Academia?useTimezone=true&serverTimezone=UTC");
        dataSourc.setUsername("root");
        dataSourc.setPassword("Roseli199702");

        return dataSourc;


    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapte = new HibernateJpaVendorAdapter();
        adapte.setDatabase(Database.MYSQL);
        adapte.setShowSql(true);
        adapte.setGenerateDdl(true);
        adapte.setDatabasePlatform("org.hibernate.dialect.MariaDBDialect");
        adapte.setPrepareConnection(true);
        return adapte;
    }
}
