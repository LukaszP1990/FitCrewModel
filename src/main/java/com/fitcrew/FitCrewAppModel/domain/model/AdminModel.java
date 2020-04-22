package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class AdminModel {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String adminId;
    private String encryptedPassword;
}
