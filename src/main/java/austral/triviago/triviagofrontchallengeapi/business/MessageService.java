package austral.triviago.triviagofrontchallengeapi.business;

import austral.triviago.triviagofrontchallengeapi.persistence.domain.Message;
import austral.triviago.triviagofrontchallengeapi.persistence.repository.MessageRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Page<Message> findAll(Pageable pageable) {
        return messageRepository.findAll(pageable);
    }
}
