import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

    public static void main(String[] args) {

//        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                .configure("hibernate.cfg.xml").build();
//        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
//        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
//
//        Session session = sessionFactory.openSession();
//
//        Course course = session.get(Course.class, 1);
//        System.out.println(course.getName());
//        sessionFactory.close();

        try (SessionFactory sessionFactory = DatabaseConnect.getConnect()) {
            Session session = sessionFactory.openSession();

            Course course = session.get(Course.class,1);
            System.out.println(course.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
