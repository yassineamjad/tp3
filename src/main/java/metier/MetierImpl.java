package metier;

import dao.IDao;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Service
public class MetierImpl implements IMetier {
    private static final Logger LOGGER = Logger.getLogger(MetierImpl.class.getName());
    private final IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @PostConstruct
    public void init() {
        LOGGER.info(() -> "Implémentation DAO injectée : " + dao.getClass().getSimpleName());
    }

    @Override
    public double calcul() {
        return dao.getValue() * 2.0;
    }
}