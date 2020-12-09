import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld otherHelloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat otherCatBean = (Cat) applicationContext.getBean("cat");

        System.out.println("HelloWorld bean equality: " + (helloWorldBean == otherHelloWorldBean));
        System.out.println("Cat bean equality: " + (catBean == otherCatBean));
    }
}