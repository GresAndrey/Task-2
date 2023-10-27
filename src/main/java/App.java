import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Cat;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld one =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld three =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(three.getMessage());


        Cat bean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.getMassage());
        System.out.println(one.getMessage());
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        Cat bean5 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getMassage());
        System.out.println(bean5.getMassage());
    }
}