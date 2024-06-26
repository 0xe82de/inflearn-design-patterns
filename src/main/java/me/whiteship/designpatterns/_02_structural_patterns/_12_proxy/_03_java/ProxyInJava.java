package me.whiteship.designpatterns._02_structural_patterns._12_proxy._03_java;

import me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after.DefaultGameService;
import me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after.GameService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("ㅇ");
                        method.invoke(target, args);
                        System.out.println("ㅁ");
                        return null;
                    }
                });
    }
}
