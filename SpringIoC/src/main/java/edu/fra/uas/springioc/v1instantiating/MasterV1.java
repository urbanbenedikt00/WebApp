package edu.fra.uas.springioc.v1instantiating;

import org.springframework.stereotype.Component;

@Component
public class MasterV1 {
    Journeyman journeyman = new Journeyman();

    public void delegateWork() {
        journeyman.performWork();
    }
}
