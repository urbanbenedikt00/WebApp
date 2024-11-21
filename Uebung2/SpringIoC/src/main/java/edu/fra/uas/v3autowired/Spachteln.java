package edu.fra.uas.v3autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;



@Component
@Qualifier("spachteln")
public class Spachteln implements Work{
    private static final Logger LOGGER = LoggerFactory.getLogger(Spachteln.class);

    public void doWork() {
        LOGGER.info(" --> spachtel dir Skyr ins Maul");
    }
}
