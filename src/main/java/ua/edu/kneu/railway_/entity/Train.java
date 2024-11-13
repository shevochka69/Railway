package ua.edu.kneu.railway_.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("trains")
public class Train {

    @Id
    private Long id;                     // Унікальний ідентифікатор потяга
    private String name;                 // Назва потяга
    private String departure_station;     // Станція відправлення
    private String arrival_station;       // Станція прибуття
    private LocalDateTime departure_time; // Час відправлення
    private LocalDateTime arrival_time;   // Час прибуття
    private int available_seats;          // Кількість доступних місць
}
