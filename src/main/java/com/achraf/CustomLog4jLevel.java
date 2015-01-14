package com.achraf;

import org.apache.log4j.Level;

/**
 *
 * @author GVLJ3568
 */
public class CustomLog4jLevel extends Level {

    public static final int OUT_INT = DEBUG_INT - 10;

    /**
     * Level representing my log level
     */
    public static final Level OUT = new CustomLog4jLevel(OUT_INT, "OUT", 10);

    /**
     * Constructor
     */
    protected CustomLog4jLevel(int arg0, String arg1, int arg2) {
        super(arg0, arg1, arg2);

    }

    /**
     * Checks whether logArgument is "OUT" level. If yes then returns OUT}, else
     * calls CustomLog4jLevel#toLevel(String, Level) passing it Level#DEBUG as
     * the defaultLevel.
     */
    public static Level toLevel(String logArgument) {
        if (logArgument != null && logArgument.toUpperCase().equals("OUT")) {
            return OUT;
        }
        return (Level) toLevel(logArgument);
    }

    /**
     * Checks whether val is CustomLog4jLevel#OUT_INT. If yes then returns
     * CustomLog4jLevel#OUT, else calls CustomLog4jLevel#toLevel(int, Level)
     * passing it Level#DEBUG as the defaultLevel
     *
     */
    public static Level toLevel(int val) {
        if (val == OUT_INT) {
            return OUT;
        }
        return (Level) toLevel(val, Level.DEBUG);
    }

    /**
     * Checks whether val is CustomLog4jLevel#OUT_INT. If yes then returns
     * CustomLog4jLevel#OUT, else calls Level#toLevel(int,
     * org.apache.log4j.Level)
     *
     */
    public static Level toLevel(int val, Level defaultLevel) {
        if (val == OUT_INT) {
            return OUT;
        }
        return Level.toLevel(val, defaultLevel);
    }

    /**
     * Checks whether logArgument is "OUT" level. If yes then returns
     * CustomLog4jLevel#OUT, else calls Level#toLevel(java.lang.String,
     * org.apache.log4j.Level)
     *
     */
    public static Level toLevel(String logArgument, Level defaultLevel) {
        if (logArgument != null && logArgument.toUpperCase().equals("OUT")) {
            return OUT;
        }
        return Level.toLevel(logArgument, defaultLevel);
    }
}
