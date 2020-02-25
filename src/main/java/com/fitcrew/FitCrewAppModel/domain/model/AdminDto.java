package com.fitcrew.FitCrewAppModel.domain.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor
@ToString
public class AdminDto implements Serializable {

	private static final long serialVersionUID = 2118331620631970477L;

	@NotNull(message = "First name of admin cannot be null")
	@Size(min = 2, max = 20, message = "First name of admin must be equal or grater than 2 characters and less than 20 character")
	private String firstName;

	@NotNull(message = "Last name of admin cannot be null")
	@Size(min = 2, max = 20, message = "Last name of admin must be equal or grater than 2 characters and less than 20 character")
	private String lastName;

	@NotNull(message = "Admin email address cannot be null")
	private String email;

	@NotNull(message = "Password cannot be null")
	private String password;

	private String adminId;

	private String encryptedPassword;
}
