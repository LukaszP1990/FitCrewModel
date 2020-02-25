package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor
@ToString
public class EmailDto implements Serializable {

    private static final long serialVersionUID = 4470120338928967887L;

    @NotNull(message = "Email sender name cannot be null")
    @Size(min = 2, max = 20, message = "Email sender name must be equal or grater than 2 characters and less than 20 character")
    private String sender;

    @NotNull(message = "Email recipient name cannot be null")
    @Size(min = 2, max = 50, message = "Email recipient name must be equal or grater than 2 characters and less than 20 character")
    private String recipient;

    @NotNull(message = "Email subject cannot be null")
    @Size(min = 2, max = 20, message = "Email subject must be equal or grater than 2 characters and less than 20 character")
    private String subject;

    @NotNull(message = "Email message cannot be null")
    private String bodyOfMessage;

    private String filePathToAttachment;
}
