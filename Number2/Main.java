import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = new SimpleLogger();
        logger.log("Простой логер с простым сообщение логирует");
        logger = new SmartLogger();
        logger.log("Сообщение сложного логера");
        logger.log("Сообщение сложного логера");
        logger.log("Сообщение сложного логера");
        logger.log("Сообщение сложного логера");
        logger.log("Сообщение сложного логера");
    }
}