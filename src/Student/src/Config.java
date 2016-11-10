import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by Idel on 11/2/2016.
 */
public class Config {

    private SessionFactory session;

    public Config(){
        Configuration config = new Configuration();

        config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate");
        config.setProperty("hibernate.connection.username", "root");
        config.setProperty("hibernate.connection.password", "1d3lP4g4n");
        config.setProperty("hibernate.connection.pool_size", "10");
        config.setProperty("hibernate.connection.autocommit", "true");
        config.setProperty("hibernate.id.new_generator_mappings", "false");
        config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
        config.setProperty("hibernate.show_sql", "true");
        config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
        config.setProperty("hibernate.current_session_context_class", "thread");


        //NASTY PATH -- WRONG PORT #
        // config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:8801/hibernate");

        //NASTY PATH -- wrong username
        //config.setProperty("hibernate.connection.username", "wrong user");

        //NASTY PATH -- wrong password connection
        //config.setProperty("hibernate.connection.password", "wrong pass");

        config.addAnnotatedClass(Student.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

        session = config.buildSessionFactory(serviceRegistry);
    }
    public Session getCurrentSession() {
        return session.getCurrentSession();
    }
}
