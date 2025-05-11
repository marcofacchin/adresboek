package be.poverello.adresboek;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersoonController {
    private final PersoonService persoonService;

    public PersoonController(PersoonService persoonService) {
        this.persoonService = persoonService;
    }

    @GetMapping("adresboek/aantalpersonen")
    long findAantal() {
        return persoonService.findAantal();
    }
}
