package decorator.factory.calculator.logger.impl;

import decorator.factory.calculator.logger.Loggerable;

import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.logging.LogManager;

public class Logger implements Loggerable {
    public void log(String text) {
        System.err.println(LocalDateTime.now() + ": " + text);
    }
}
