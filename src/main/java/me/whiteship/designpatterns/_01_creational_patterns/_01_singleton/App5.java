package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App5 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings5 settings = Settings5.INSTANCE;

        Settings5 settings1 = null;

        // 리플렉션 불가
//        Constructor<Settings5> constructor = Settings5.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        settings1 = constructor.newInstance();

        // 모든 생성자로 리플렉션도 안 됨.
        Constructor<?>[] declaredConstructors = Settings5.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            settings1 = (Settings5) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings == settings1);
    }
}
