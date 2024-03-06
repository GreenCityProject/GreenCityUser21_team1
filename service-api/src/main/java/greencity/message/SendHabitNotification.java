package greencity.message;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Message, that is used for sending emails about not marked habits.
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SendHabitNotification implements Serializable {
    @NotNull
    private String name;

    @Email(message = "Email is not valid")
    @NotEmpty(message = "Email cannot be empty")
    private String email;
}
