package com.doub1e.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工具类 中介 专门负责创建代理对象并返回给别人使用
 */
public class ProxyUtil {
    // 创建一个明星对象的代理对象返回
    public static StarService createProxy(Star s) {
        /**
         * 参数一：用于指定用哪个类加载器去加载生成的代理类
         * 参数二：用于指定代理类需要实现的接口 明星类实现了哪些接口 代理类就需要实现哪些接口
         * 参数三：用于指定代理类需要如何代理（代理要做的事情
         */
        StarService proxy = (StarService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                s.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //声明代理对象要做的事情
                        //参数一：proxy接收到代理对象本身(暂时用处不大
                        //参数二：method代表正在被代理的方法
                        //参数三：args代表正在被代理的方法的参数
                        String methodName = method.getName();
                        if("sing".equals(methodName)){
                            System.out.println("准备话筒 收费30w");
                        } else if ("dance".equals(methodName)) {
                            System.out.println("准备场地 收费100w");
                        }
                        // 真正干活（把真正的明星对象叫过来正式干活
                        // 找真正的明星对象来执行被代理的行为：method方法
                        Object result = method.invoke(s, args);
                        return result;
                    }
                });
        return proxy;
    }
}
