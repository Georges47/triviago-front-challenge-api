package austral.triviago.triviagofrontchallengeapi.business.service;

import austral.triviago.triviagofrontchallengeapi.persistence.domain.Message;
import austral.triviago.triviagofrontchallengeapi.presentation.dto.CreateMessageDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MessageService {
    Page<Message> findAll(Pageable pageable);

    Message create(CreateMessageDto dto);
}
