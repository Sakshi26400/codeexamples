package test.springintegration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: xaoc
 * Date: 30.11.11
 * Time: 17:20
 */
public class Main         //class named main
{
    public static void main(String[] args)
    {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:/META-INF/application-context-root.xml");      //creating object
     }
}
