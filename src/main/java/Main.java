import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(AppConfig.class);
        context.refresh();

        try {
            LOGGER.info(() -> "Résultat du calcul : "
                    + context.getBean(metier.IMetier.class).calcul());
        } finally {
            context.close();
        }
    }
}