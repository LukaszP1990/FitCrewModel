package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor
@ToString
public class TrainingDto implements Serializable {

	private static final long serialVersionUID = -3255126230685615683L;

	@NotNull(message = "Name of training cannot be null")
	@Size(min = 2, max = 20, message = "Name of training must be equal or grater than 2 characters and less than 20 character")
	private String trainingName;

	@NotNull(message = "Short description of training cannot be null")
	@Size(min = 2, max = 400, message = "Short description of training must be equal or grater than 2 characters and less than 20 character")
	private String description;

	@NotNull(message = "Training cannot be null")
	@Size(min = 2, message = "Training must be equal or grater than 2 characters and less than 20 character")
	private String training;

	private String trainerEmail;

	private List<String> clients;
}
