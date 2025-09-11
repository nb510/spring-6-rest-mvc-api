package guru.springframework.spring6restmvcapi.event;

import guru.springframework.spring6restmvcapi.BeerOrderLineDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DrinkPreparedEvent {

    private BeerOrderLineDto beerOrderLineDTO;
}
