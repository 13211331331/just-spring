import cn.iszt.hhl.TestServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hhl on 2015/1/19.
 */

public class TestServerTest {



    public static void main(final String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        TestServer testServer = (TestServer) ctx.getBean("testServer");
        System.out.println(testServer.sayHello("hhl"));
    }

}
