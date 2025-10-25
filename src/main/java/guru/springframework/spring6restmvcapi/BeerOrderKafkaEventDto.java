package guru.springframework.spring6restmvcapi;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerOrderKafkaEventDto {

    private UUID id;
    private UUID beerOrderId;
    private BeerOrderEventType type;
    private String message;
}
