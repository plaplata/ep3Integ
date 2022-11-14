package pe.Ep3.Ep3.worldcup_service.application.Service;

import pe.Ep3.Ep3.worldcup_service.domain.entity.URL;
import pe.Ep3.Ep3.worldcup_service.domain.entity.Country;
import pe.Ep3.Ep3.worldcup_service.domain.entity.Player;
import pe.Ep3.Ep3.worldcup_service.domain.entity.Stadium;
import pe.Ep3.Ep3.worldcup_service.infrastructure.request.playerRequest;
import pe.Ep3.Ep3.worldcup_service.infrastructure.response.BasicResponse;

import java.util.List;

public interface worldcupService {

    public List<Country> getCountries();
    public List<Player> getPlayers();
    public List<Stadium> getStadium();
    public URL getURL();
    public BasicResponse registerPlayer(playerRequest playerRequest);
}
