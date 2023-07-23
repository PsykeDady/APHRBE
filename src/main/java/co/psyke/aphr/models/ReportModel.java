package co.psyke.aphr.models;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public record ReportModel(
	Long id, 

	@NotNull
	Long employee, 

	@NotNull
	Long project, 

	@NotNull
	LocalDateTime date, 

	@NotNull
	Double hours

){}
