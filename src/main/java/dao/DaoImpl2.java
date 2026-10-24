package dao;

import java.util.logging.Logger;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    private static final Logger LOGGER = Logger.getLogger(DaoImpl2.class.getName());

    @Override
    public double getValue() {
        LOGGER.info("Lecture depuis la base de données (dev)");
        return 150.0;
    }
}