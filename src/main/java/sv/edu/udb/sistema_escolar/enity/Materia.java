package sv.edu.udb.sistema_escolar.enity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "materia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    // Muchas materias pueden pertenecer a un profesor
    @ManyToOne

    // Define la llave foránea id_profesor
    @JoinColumn(name = "id_profesor", nullable = false)

    // Evita referencia circular al convertir a JSON
    @JsonIgnore
    private Profesor profesor;

    // Relación inversa muchos a muchos
    @ManyToMany(mappedBy = "materias")

    // mappedBy indica que la tabla intermedia ya está definida en Alumno
    @JsonIgnore
    private Set<Alumno> alumnos;
}