package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class RankingModel {

    private String trainerFirstName;
    private String trainerLastName;
    private String placeInTheRanking;
}
