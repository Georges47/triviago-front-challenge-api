package austral.triviago.triviagofrontchallengeapi.business.service.impl;

import austral.triviago.triviagofrontchallengeapi.business.service.MessageService;
import austral.triviago.triviagofrontchallengeapi.persistence.domain.Message;
import austral.triviago.triviagofrontchallengeapi.persistence.repository.MessageRepository;
import austral.triviago.triviagofrontchallengeapi.presentation.dto.CreateMessageDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Page<Message> findAll(Pageable pageable) {
        return messageRepository.findAll(pageable);
    }

    public Message create(CreateMessageDto dto) {
        final Message message = new Message(dto.getContent());
        return messageRepository.save(message);
    }
}
