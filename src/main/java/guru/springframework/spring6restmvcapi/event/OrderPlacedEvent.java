package guru.springframework.spring6restmvcapi.event;

import guru.springframework.spring6restmvcapi.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {

    private BeerOrderDto beerOrderDto;
}
