package austral.triviago.triviagofrontchallengeapi.presentation;

import austral.triviago.triviagofrontchallengeapi.business.MessageService;
import austral.triviago.triviagofrontchallengeapi.persistence.domain.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public Page<Message> getMessages(Pageable pageable) {
        return messageService.findAll(pageable);
    }
}
