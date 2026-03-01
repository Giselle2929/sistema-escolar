package sv.edu.udb.sistema_escolar.enity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

// Indica que esta clase es una entidad de la base de datos
@Entity

// Especifica el nombre de la tabla en la BD
@Table(name = "alumno")

// Lombok genera getters y setters automáticamente
@Getter
@Setter

// Constructor vacío
@NoArgsConstructor

// Constructor con todos los atributos
@AllArgsConstructor

// Permite crear objetos usando el patrón Builder
@Builder
public class Alumno {

    // Llave primaria
    @Id

    // Hace que el id se genere automáticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // No permite valores nulos
    @Column(nullable = false)
    private String nombre;

    // No permite valores nulos
    @Column(nullable = false)
    private String apellido;

    // Relación muchos a muchos con Materia
    @ManyToMany

    // Define la tabla intermedia que conecta alumno y materia
    @JoinTable(
            name = "alumno_materia",
            joinColumns = @JoinColumn(name = "id_alumno"),
            inverseJoinColumns = @JoinColumn(name = "id_materia")
    )
    private Set<Materia> materias;
}