package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class ClientModel {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String dateOfBirth;
    private String password;
    private String clientId;
    private String encryptedPassword;
}
