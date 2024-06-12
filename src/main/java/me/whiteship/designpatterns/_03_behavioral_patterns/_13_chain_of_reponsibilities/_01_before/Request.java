package me.whiteship.designpatterns._03_behavioral_patterns._13_chain_of_reponsibilities._01_before;

public class Request {

    private String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
