package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor
@ToString
public class LoginDto {

	@NotNull(message = "Login cannot be null")
    private String email;

	@NotNull(message = "Password cannot be null")
    private String password;
}
