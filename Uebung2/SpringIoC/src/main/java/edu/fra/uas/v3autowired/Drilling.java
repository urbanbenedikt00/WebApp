package edu.fra.uas.v3autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;



@Component
@Qualifier("drilling")
public class Drilling implements Work{
    private static final Logger LOGGER = LoggerFactory.getLogger(Drilling.class);

    public void doWork() {
        LOGGER.info(" --> drill a hole into the wall");
    }
}
