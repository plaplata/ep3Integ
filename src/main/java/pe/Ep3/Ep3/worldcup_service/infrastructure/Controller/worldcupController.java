package pe.Ep3.Ep3.worldcup_service.infrastructure.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.Ep3.Ep3.worldcup_service.domain.entity.URL;
import pe.Ep3.Ep3.worldcup_service.domain.entity.Country;
import pe.Ep3.Ep3.worldcup_service.application.Service.worldcupService;
import pe.Ep3.Ep3.worldcup_service.domain.entity.Player;
import pe.Ep3.Ep3.worldcup_service.domain.entity.Stadium;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class worldcupController {
    @Autowired
    private worldcupService worldcupService;
    @GetMapping
    @RequestMapping("/worldcup")
    public URL getRes()
    {
        return worldcupService.getURL();
    }

    @GetMapping
    @RequestMapping("/worldcup/countries")
    public List<Country> getCountry()
    {
        return worldcupService.getCountries();
    }
    @GetMapping
    @RequestMapping("/worldcup/players")
    public List<Player> getPlayers()
    {
        return worldcupService.getPlayers();
    }
    @GetMapping
    @RequestMapping("/worldcup/stadium")
    public List<Stadium> getStadium()
    {
        return worldcupService.getStadium();
    }
    
}
