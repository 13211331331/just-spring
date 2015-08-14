package cn.iszt.hhl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Administrator on 15-8-12.
 */
public class MyAroundAdvice1 implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] objs = invocation.getArguments();
        BaseModel b = (BaseModel) objs[0];
        b.setIsS(100);
        User u = (User) b;

        // 在目标方法执行前调用
        System.out.println("正在对" + u.getUserName() + "进行登录验证");
        //System.out.println(u);
        u.setUserName("李四");
        // 通过反射调用执行方法
        Object obj = null;
        obj = invocation.proceed();
        // 在目标方法执行之后调用
        System.out.println(u.getUserName() + "保存");

        return obj;
    }

}
