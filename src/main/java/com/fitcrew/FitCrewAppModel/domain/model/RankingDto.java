package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor
@ToString
public class RankingDto implements Serializable {

    private static final long serialVersionUID = 3279928118402472051L;

    @NotNull(message = "First name of trainer cannot be null")
    @Size(min = 2, max = 20, message = "First name of trainer must be equal or grater than 2 characters and less than 20 character")
    private String trainerFirstName;

    @NotNull(message = "Last name of trainer cannot be null")
    @Size(min = 2, max = 20, message = "Last name of trainer must be equal or grater than 2 characters and less than 20 character")
    private String trainerLastName;

    @NotNull(message = "Place in the ranking cannot be null")
    private String placeInTheRanking;
}
