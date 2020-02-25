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
public class TrainerDto implements Serializable {

    private static final long serialVersionUID = -3255126230685615683L;

    @NotNull(message = "First name of trainer cannot be null")
    @Size(min = 2, max = 20, message = "First name of trainer must be equal or grater than 2 characters and less than 20 character")
    private String firstName;

    @NotNull(message = "Last name of trainer cannot be null")
    @Size(min = 2, max = 20, message = "Last name of trainer must be equal or grater than 2 characters and less than 20 character")
    private String lastName;

    @NotNull(message = "Trainer email address cannot be null")
    private String email;

    @NotNull(message = "Trainer phone number cannot be null")
    private String phone;

    @NotNull(message = "Date of birth cannot be null")
    @Size(min = 2, max = 20, message = "Date of birth must be equal or grater than 2 characters and less than 20 character")
    private String dateOfBirth;

    @NotNull(message = "Short description about trainer cannot be null")
    @Size(min = 2, max = 200, message = "Last trainingName of trainer must be equal or grater than 2 characters and less than 200 character")
    private String somethingAboutYourself;

    @NotNull(message = "Password cannot be null")

    private String password;


    private String trainerId;


    private String encryptedPassword;
}
