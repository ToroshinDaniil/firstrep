package foo.bar1;

/**
 * Created by Данил on 24.02.2016.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.krb5.*;

public class HelloApp1 {
    public static void main(String[] args) {
     /*   ApplicationContext context = new ClassPathXmlApplicationContext("spring-config1.xml");
        Konf konf= (Konf) context.getBean("konf");
        konf.perfCollectives();*/
        ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        Konf konf=ctx.getBean(Konf.class);
        konf.perfCollectives();
    }

}
