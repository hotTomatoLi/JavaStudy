package com.leegebe.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author leegebe
 * JDK的动态代理
 */
public class JdkProxy implements InvocationHandler {

    private Object target;

    public JdkProxy(Object target){
        this.target = target;
    }

    public void before(){
        System.out.println("before方法");
    }

    public void after(){
        System.out.println("after方法");
    }



    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    public static void main(String[] args){
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Hello hello = new HelloImpl();
        JdkProxy jdkProxy = new JdkProxy(hello);
        Hello proxyed = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(),hello.getClass().getInterfaces(),jdkProxy);
        proxyed.sayHello();
    }
}
