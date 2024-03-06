package greencity.message;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public final class SendChangePlaceStatusEmailMessage implements Serializable {

    @NotNull
    private String authorFirstName;

    @NotNull
    private String placeName;

    @NotNull
    private String placeStatus;

    @Email
    private String authorEmail;
}
