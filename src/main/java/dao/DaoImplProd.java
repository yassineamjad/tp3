package dao;

import java.util.logging.Logger;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daoProd")
@Profile("prod")
public class DaoImplProd implements IDao {
    private static final Logger LOGGER = Logger.getLogger(DaoImplProd.class.getName());

    @Override
    public double getValue() {
        LOGGER.info("Lecture depuis le DAO de production");
        return 100.0;
    }
}