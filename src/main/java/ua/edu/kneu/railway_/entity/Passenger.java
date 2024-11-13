package ua.edu.kneu.railway_.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("passengers")
public class Passenger {

    @Id
    private Long id;                // Унікальний ідентифікатор пасажира
    private String first_name;        // Ім'я
    private String last_name;         // Прізвище
    private String email;            // Email для зв'язку
    private String phone_number;      // Номер телефону
}
