package be.poverello.adresboek;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersoonController {
    private final PersoonService persoonService;

    public PersoonController(PersoonService persoonService) {
        this.persoonService = persoonService;
        System.out.println("PersoonController opgestart...");
        System.out.println("username: " + System.getProperty("user.name"));
        System.out.println("OS: " + System.getProperty("os.name"));
    }

    @GetMapping("adresboek/aantalpersonen")
    long findAantal() {
        return persoonService.findAantal();
    }
}
