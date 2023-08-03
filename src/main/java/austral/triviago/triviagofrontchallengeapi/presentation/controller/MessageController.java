package austral.triviago.triviagofrontchallengeapi.presentation.controller;

import austral.triviago.triviagofrontchallengeapi.business.service.impl.MessageServiceImpl;
import austral.triviago.triviagofrontchallengeapi.persistence.domain.Message;
import austral.triviago.triviagofrontchallengeapi.presentation.dto.CreateMessageDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageServiceImpl messageServiceImpl;

    public MessageController(MessageServiceImpl messageServiceImpl) {
        this.messageServiceImpl = messageServiceImpl;
    }

    @GetMapping
    public Page<Message> getMessages(Pageable pageable) {
        return messageServiceImpl.findAll(pageable);
    }

    @PostMapping
    public Message createMessage(@RequestBody CreateMessageDto dto) {
        return messageServiceImpl.create(dto);
    }
}
