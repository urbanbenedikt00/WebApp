package edu.fra.uas.springioc.v1instantiating;

public class Journeyman {
    Drilling drilling = new Drilling();

    public void performWork() {
        drilling.work();
    }
}
