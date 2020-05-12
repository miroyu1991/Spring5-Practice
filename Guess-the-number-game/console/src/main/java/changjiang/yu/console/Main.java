package changjiang.yu.console;

import changjiang.yu.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    //private static final Logger log = LoggerFactory.getLogger(Main.class);

    //private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("Guess the number name!");

        //create context(container)
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(GameConfig.class);

        /*//get number generator bean from context(container)
        NumberGenerator numberGenerator
                = context.getBean(NumberGenerator.class);

        //call method next() to get a random number
        int number = numberGenerator.next();

        //log generated number
        log.info("number = {}", number);

        //get message generator bean from context (container)
        MessageGenerator messageGenerator =
                context.getBean(MessageGenerator.class);

        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage = {}", messageGenerator.getResultMessage());*/

        //close context (container)
        context.close();
    }
}
