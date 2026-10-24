package dao;

import java.util.logging.Logger;
import org.springframework.stereotype.Component;

@Component("daoApi")
public class DaoApi implements IDao {
    private static final Logger LOGGER = Logger.getLogger(DaoApi.class.getName());

    @Override
    public double getValue() {
        LOGGER.info("Appel à l'API REST externe");
        return 220.0;
    }
}