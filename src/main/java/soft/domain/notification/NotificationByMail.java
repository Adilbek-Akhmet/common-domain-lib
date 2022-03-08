package soft.domain.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationByMail {
    private String recipient;
    private String subject;
    private String text;
}
