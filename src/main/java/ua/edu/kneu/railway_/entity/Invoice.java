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
@Table("invoices")
public class Invoice {

    @Id
    private Long id;                    // Унікальний ідентифікатор рахунку
    private Long ticket_id;               // Ідентифікатор квитка
    private BigDecimal total_amount;      // Загальна сума для оплати
    private LocalDateTime due_date;       // Термін дії рахунку
    private boolean paid;                // Статус оплати
}
