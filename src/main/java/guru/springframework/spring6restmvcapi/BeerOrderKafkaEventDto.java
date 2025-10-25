package guru.springframework.spring6restmvcapi;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class BeerOrderKafkaEventDto {

    private UUID id;
    private UUID beerOrderId;
    private BeerOrderEventType type;
    private String message;
}
