package ua.edu.kneu.railway_.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("tickets")
public class Ticket {

    @Id
    private Long id;                // Унікальний ідентифікатор квитка
    private Long passenger_id;        // Ідентифікатор пасажира
    private Long train_id;            // Ідентифікатор потяга
    private BigDecimal price;        // Ціна квитка
    private LocalDateTime issue_date; // Дата та час замовлення
}
