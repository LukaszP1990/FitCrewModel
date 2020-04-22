package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

import java.util.List;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class TrainingModel {

    private String trainingName;
    private String description;
    private String training;
    private String trainerEmail;
    private List<String> clients;
}
