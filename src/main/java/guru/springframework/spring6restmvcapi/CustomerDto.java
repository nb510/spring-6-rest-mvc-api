package guru.springframework.spring6restmvcapi;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class CustomerDto {
    private UUID id;
    private String customerName;
    private Integer age;
    private Integer version;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDat;
}
