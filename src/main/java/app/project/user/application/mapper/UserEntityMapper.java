package app.project.user.application.mapper;

import app.project.user.domain.entity.User;
import app.project.user.infrastructure.controller.dto.input.UserCreateInputDto;
import app.project.user.infrastructure.repository.jpa.entity.UserJpa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")//, uses = {PersonEntityMapper.class})
public interface UserEntityMapper {

    UserEntityMapper INSTANCE = Mappers.getMapper(UserEntityMapper.class);

    @Mappings({
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "surname", target = "surname"),
    })
    User toEntity(UserJpa userJpa);

    @Mappings({
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "password", target = "password"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "surname", target = "surname"),
    })
    User toEntity(UserCreateInputDto userCreateInputDto);

    List<User> toEntityList(List<UserJpa> userJpaList);

    UserJpa toEntityJpa(User user);
}
