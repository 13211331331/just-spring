package cn.iszt.hhl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Administrator on 15-8-12.
 */
public class MyAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] objs = invocation.getArguments();
        String userName = (String) objs[0];

        // 在目标方法执行前调用
        System.out.println("正在对" + userName + "进行登录验证");
        // 通过反射调用执行方法
        Object obj = null;
        //obj = invocation.proceed();
        // 在目标方法执行之后调用
        System.out.println(userName + "登录成功");

        return obj;
    }

}
