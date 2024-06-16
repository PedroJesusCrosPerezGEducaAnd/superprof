package app.project.content.agreement.infrastructure.controller.dto.input;

import app.project.content.rate.infrastructure.controller.dto.input.RateInputDto;
import app.project.shared.enums.EPlace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AgreementInputDto {

    private String title;
    private String description;
    private String aboutMe;
    private Boolean isActive = true;

    private List<Long> idsSubjects;
    private List<EPlace> places;
    private List<Long> idsLanguages;
    private RateInputDto rate;
}
