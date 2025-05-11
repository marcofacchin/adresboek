package be.poverello.adresboek;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PersoonService {
    private final PersoonRepository persoonRepository;

    public PersoonService(PersoonRepository persoonRepository) {
        this.persoonRepository = persoonRepository;
    }

    long findAantal() {
        return persoonRepository.findAantal();
    }
}
