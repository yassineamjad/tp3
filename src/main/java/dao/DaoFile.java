package dao;

import java.util.logging.Logger;
import org.springframework.stereotype.Component;

@Component("daoFile")
public class DaoFile implements IDao {
    private static final Logger LOGGER = Logger.getLogger(DaoFile.class.getName());

    @Override
    public double getValue() {
        LOGGER.info("Lecture depuis un fichier local");
        return 180.0;
    }
}