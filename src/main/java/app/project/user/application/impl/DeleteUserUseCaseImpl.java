package app.project.user.application.impl;

import app.project.user.application.DeleteUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

//    private final DeleteUserRepository deleteUserRepository;


    @Override
    public Boolean deleteByIdUser(Long idUser) {
//        return deleteUserRepository.deleteByIdUser(idUser);
        return false;
    }
}
