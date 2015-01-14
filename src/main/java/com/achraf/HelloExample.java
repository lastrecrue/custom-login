package com.achraf;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author GVLJ3568
 */
public class HelloExample {

    final static Logger logger = Logger.getLogger(HelloExample.class);

    public static void main(String[] args) {

        logger.log(CustomLog4jLevel.OUT, "I am OUT log");
        logger.log(Level.DEBUG, "I am a DEBUG message");

    }

}
