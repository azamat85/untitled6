package lesson15;

import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.trace("Наша ошибка trace");

        LOGGER.info("Наша ошибка info");

        LOGGER.warn("Наша ошибка warn");

    }
}
