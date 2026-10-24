package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import dao.DaoApi;
import dao.DaoFile;
import dao.DaoImpl2;
import dao.DaoImpl;
import dao.IDao;
import java.util.logging.Logger;

@Configuration
public class DynamicDaoConfig {

    private static final Logger LOGGER = Logger.getLogger(DynamicDaoConfig.class.getName());

    @Value("${dao.target}")
    private String daoTarget;

    @Bean
    @Primary
    public IDao dynamicDao() {
        String target = daoTarget == null ? "" : daoTarget.trim();
        LOGGER.info(() -> "Sélection de l'implémentation DAO : " + target);
        switch (target) {
            case "dao": return new DaoImpl();
            case "dao2": return new DaoImpl2();
            case "daoFile": return new DaoFile();
            case "daoApi": return new DaoApi();
            default:
                throw new IllegalArgumentException(
                        "Cible DAO inconnue : " + target
                                + ". Valeurs attendues : dao, dao2, daoFile ou daoApi");
        }
    }
}