package com.shoulegia.test;

import com.shoulegia.proxy.Lenovo;
import com.shoulegia.proxy.SaleComputer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *描述:动态代理测试
 * @author wangjialing
 * @date 2019/6/28
 */
public class ProxyTest {
    public static void main(String[] args) {
        //创建真实对象
        Lenovo lenovo = new Lenovo();

        //动态代理增强Lenovo对象
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*
             *描述:代理逻辑编写的方法，代理对象调用的所有方法都会触发该方法执行
             * @author wangjialing
             * @date 2019/6/28
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj = method.invoke(lenovo, args);
                return obj;
            }
        });

        //调用方法
        String sale = proxy_lenovo.sale(6500.00);
        System.out.println(sale);
    }
}
