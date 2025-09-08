package guru.springframework.spring6restmvcapi;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class BeerOrderDto {

    private UUID id;

    @NotEmpty
    private String customerRef;

    private BeerOrderShipmentDto beerOrderShipment;
    private List<BeerOrderLineDto> beerOrderLines;
    private BigDecimal paymentAmount;

}
