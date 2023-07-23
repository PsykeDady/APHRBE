package co.psyke.aphr.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
/**
 * Project
 */
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id; 
	@NotBlank
	private String name;
}