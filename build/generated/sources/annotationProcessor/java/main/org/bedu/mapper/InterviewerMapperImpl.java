package org.bedu.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.bedu.dto.CreateInterviewerDTO;
import org.bedu.dto.InterviewerDTO;
import org.bedu.model.Interviewer;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-24T20:16:50-0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class InterviewerMapperImpl implements InterviewerMapper {

    @Override
    public List<InterviewerDTO> toDTO(List<Interviewer> model) {
        if ( model == null ) {
            return null;
        }

        List<InterviewerDTO> list = new ArrayList<InterviewerDTO>( model.size() );
        for ( Interviewer interviewer : model ) {
            list.add( toDTO( interviewer ) );
        }

        return list;
    }

    @Override
    public InterviewerDTO toDTO(Interviewer model) {
        if ( model == null ) {
            return null;
        }

        InterviewerDTO interviewerDTO = new InterviewerDTO();

        interviewerDTO.setId( model.getId() );
        interviewerDTO.setName( model.getName() );
        interviewerDTO.setEmail( model.getEmail() );

        return interviewerDTO;
    }

    @Override
    public Interviewer toModel(CreateInterviewerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Interviewer interviewer = new Interviewer();

        interviewer.setName( dto.getName() );
        interviewer.setEmail( dto.getEmail() );

        return interviewer;
    }
}
