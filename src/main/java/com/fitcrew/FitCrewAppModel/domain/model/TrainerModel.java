package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class TrainerModel {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dateOfBirth;
    private String typeOfTraining;
    private String placeInTheRanking;
    private String somethingAboutYourself;
    private String password;
    private String trainerId;
    private String encryptedPassword;
}
