package pe.Ep3.Ep3.worldcup_service.application.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.Ep3.Ep3.worldcup_service.domain.entity.URL;
import pe.Ep3.Ep3.worldcup_service.domain.entity.Player;
import pe.Ep3.Ep3.worldcup_service.domain.entity.Stadium;
import pe.Ep3.Ep3.worldcup_service.infrastructure.Repository.playerRepository;
import pe.Ep3.Ep3.worldcup_service.infrastructure.Repository.stadiumRepository;
import pe.Ep3.Ep3.worldcup_service.infrastructure.request.playerRequest;
import pe.Ep3.Ep3.worldcup_service.domain.entity.Country;
import pe.Ep3.Ep3.worldcup_service.infrastructure.Repository.countryCupRepository;
import pe.Ep3.Ep3.worldcup_service.infrastructure.response.BasicResponse;

import java.util.List;

@Service
public class worldcupServiceImp implements worldcupService {
    @Autowired
    private playerRepository PlayerRepository;
    @Autowired
    private countryCupRepository countryCupRepository;
    @Autowired
    private stadiumRepository StadiumRepository;





    @Override
    public List<Country> getCountries() {
        List<Country>myListCountries=countryCupRepository.findAll();
        return myListCountries;
    }

    @Override
    public List<Player> getPlayers() {
        List<Player>myListPlayers=PlayerRepository.findAll();
        return myListPlayers;
    }

    @Override
    public List<Stadium> getStadium() {
        List<Stadium>myListStadium=StadiumRepository.findAll();
        return myListStadium;
    }

    @Override
    public URL getURL() {
        URL URL=new URL("https://api-wc-ep3.herokuapp.com/api/v1/worldcup/countries","https://api-wc-ep3.herokuapp.com/api/v1/worldcup/players", "https://api-wc-ep3.herokuapp.com/api/v1/worldcup/stadiums");
        return URL;
    }

    @Override
    public BasicResponse registerPlayer(playerRequest playerRequest) {
        return null;
    }

}
