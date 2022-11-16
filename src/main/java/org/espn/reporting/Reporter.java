package org.espn.reporting;

import org.tinylog.Logger;
public class Reporter {
    public Reporter() {
    }

    private static void info(String text) {
        Logger.info(text);
    }
    private static void error(String text) {
        Logger.error(text);
    }
}
