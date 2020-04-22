package com.fitcrew.FitCrewAppModel.domain.model;

import lombok.*;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class EmailModel {

    private String sender;
    private String recipient;
    private String subject;
    private String bodyOfMessage;
    private String filePathToAttachment;
}
