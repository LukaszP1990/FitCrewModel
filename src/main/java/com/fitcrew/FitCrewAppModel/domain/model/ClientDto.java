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
public class ClientDto implements Serializable {

    private static final long serialVersionUID = 2118331620631970477L;

    @NotNull(message = "First name of client cannot be null")
    @Size(min = 2, max = 20, message = "First name of client must be equal or grater than 2 characters and less than 20 character")
    private String firstName;

    @NotNull(message = "Last name of client cannot be null")
    @Size(min = 2, max = 20, message = "Last name of client must be equal or grater than 2 characters and less than 20 character")
    private String lastName;

    @NotNull(message = "Client email address cannot be null")
    private String email;

    @NotNull(message = "Client phone number cannot be null")
    private String phone;

    @NotNull(message = "Date of birth cannot be null")
    @Size(min = 2, max = 20, message = "Date of birth must be equal or grater than 2 characters and less than 20 character")
    private String dateOfBirth;

    @NotNull(message = "Password cannot be null")
    private String password;

    private String clientId;

    private String encryptedPassword;
}
