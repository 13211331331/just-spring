import cn.iszt.hhl.MyHandler;
import cn.iszt.hhl.TestServer;
import cn.iszt.hhl.UserLogin;
import cn.iszt.hhl.UserLoginImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * Created by hhl on 2015/1/19.
 */

public class TestServerTest {



    @Test
    public void testSpring() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        TestServer testServer = (TestServer) ctx.getBean("testServer");
        System.out.println(testServer.sayHello("hhl"));
    }


    @Test
    public void testAop(){
        UserLoginImpl user = new UserLoginImpl(); // 得到实例对象
        MyHandler handler = new MyHandler(user); // 将对象传入自己的处理器中
        UserLogin proxy = (UserLogin) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass()
                .getInterfaces(), handler); // 得到代理对象
        proxy.login("张三"); // 代理调用login方法
    }

    @Test
    public void testAop1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean3.xml");
        UserLogin ul = (UserLogin) ctx.getBean("userlogin");
        ul.login("bbyshp");
    }




}
