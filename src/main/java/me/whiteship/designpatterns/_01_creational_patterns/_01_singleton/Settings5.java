package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public enum Settings5 {

    INSTANCE;

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
