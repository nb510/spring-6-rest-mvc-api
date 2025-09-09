package guru.springframework.spring6restmvcapi;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BeerOrderLineDto {
    private UUID id;
    private BeerDto beer;
    private Integer orderQuantity;
    private Integer quantityAllocated;
    private BeerOrderLineStatus status;
}
