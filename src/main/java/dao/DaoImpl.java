package dao;

import java.util.logging.Logger;
import org.springframework.stereotype.Component;

/**
 * Implémentation DAO par défaut, sélectionnable avec {@code dao.target=dao}.
 */
@Component("dao")
public class DaoImpl implements IDao {

    private static final Logger LOGGER = Logger.getLogger(DaoImpl.class.getName());

    @Override
    public double getValue() {
        LOGGER.info("Lecture depuis le DAO par défaut");
        return 100.0;
    }
}
