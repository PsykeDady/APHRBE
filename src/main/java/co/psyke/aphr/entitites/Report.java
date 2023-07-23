package co.psyke.aphr.entitites;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
/**
 * Report
 */
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id; 

	@ManyToOne
	@JoinColumn(name="employee_id", nullable = false)
	private Employee employee; 

	@ManyToOne
	@JoinColumn(name="project_id", nullable = false)
	private Project project; 

	private LocalDateTime date; 

	private Double hours; 

}