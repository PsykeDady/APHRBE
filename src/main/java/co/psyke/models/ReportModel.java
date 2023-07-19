package co.psyke.models;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public record ReportModel(
	@NotNull
	Long user, 

	@NotNull
	Long project, 

	@NotNull
	LocalDateTime date, 

	@NotNull
	Double hours

){}
