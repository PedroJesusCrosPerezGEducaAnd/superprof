package app.project.user.application.impl;

import app.project.user.application.UpdateUserUseCase;
import app.project.user.domain.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

//    private final UpdateUserRepository updateUserRepository;


    @Override
    public User updateUser(User user) {
//        return updateUserRepository.updateUser(user);
        return new User();
    }
}