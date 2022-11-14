package pe.Ep3.Ep3.worldcup_service.infrastructure.response;

import lombok.Builder;
import lombok.Data;
import pe.Ep3.Ep3.worldcup_service.domain.entity.URL;

import java.util.List;

@Builder
@Data
public class UrlResponse {
    public List<URL> apisURL;
}
