package com.chenyy.ocp;

public class Windows {
    public AbstractSubject subject;
    public Windows(AbstractSubject subject) {
        this.subject = subject;
    }
    public void display() {
        subject.display();
    }
}
