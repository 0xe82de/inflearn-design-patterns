package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

public class Settings4 implements Serializable {

    private Settings4() {
    }

    private static class SettingsHolder {

        private static final Settings4 INSTANCE = new Settings4();
    }

    /**
     * 이 메서드가 호출될 때 SettingsHolder 클래스가 로딩된다. -> 레이지 로딩
     */
    public static Settings4 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
