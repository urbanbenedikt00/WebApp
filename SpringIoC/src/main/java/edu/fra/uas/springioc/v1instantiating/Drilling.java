package edu.fra.uas.springioc.v1instantiating;

import edu.fra.uas.springioc.v2setter.Work;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Drilling {
    private static final Logger LOGGER = LoggerFactory.getLogger(edu.fra.uas.springioc.v2setter.Drilling.class);

    public void work() {
        LOGGER.info(" --> drill a hole into the wall");
    }
}
