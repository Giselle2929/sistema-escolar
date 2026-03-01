package sv.edu.udb.sistema_escolar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import sv.edu.udb.sistema_escolar.Repository.AlumnoRepository;
import sv.edu.udb.sistema_escolar.Repository.MateriaRepository;
import sv.edu.udb.sistema_escolar.Repository.ProfesorRepository;
import sv.edu.udb.sistema_escolar.enity.*;

import java.util.HashSet;

@SpringBootTest
class SistemaEscolarApplicationTests {

	@Autowired
	private ProfesorRepository profesorRepo;

	@Autowired
	private MateriaRepository materiaRepo;

	@Autowired
	private AlumnoRepository alumnoRepo;

	@Test
	@Commit
	void pruebaInsercion() {

		// Insertar profesores
		Profesor p1 = new Profesor(null, "miguel Dias", null);
		Profesor p2 = new Profesor(null, "Sandra Ruiz", null);

		profesorRepo.save(p1);
		profesorRepo.save(p2);

		// Insertar materias
		Materia m1 = new Materia(null, "Calculo", p1, null);
		Materia m2 = new Materia(null, "Programacion Web", p2, null);

		materiaRepo.save(m1);
		materiaRepo.save(m2);

		// Relacionar alumnos con materias
		HashSet<Materia> lista1 = new HashSet<>();
		lista1.add(m1);

		HashSet<Materia> lista2 = new HashSet<>();
		lista2.add(m2);

		// Insertar alumnos
		Alumno a1 = new Alumno(null, "Kevin", "Hernandez", lista1);
		Alumno a2 = new Alumno(null, "Paola", "Ramirez", lista2);

		alumnoRepo.save(a1);
		alumnoRepo.save(a2);

		// Verificación en consola
		System.out.println("Registros insertados correctamente.");
		System.out.println("Total profesores: " + profesorRepo.count());
		System.out.println("Total materias: " + materiaRepo.count());
		System.out.println("Total alumnos: " + alumnoRepo.count());
	}
}