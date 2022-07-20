package com.sofka.co.tour.usecase;
import com.sofka.co.tour.collections.Biker;
import com.sofka.co.tour.dto.BikerDTO;
import com.sofka.co.tour.mapper.BikerMapper;
import com.sofka.co.tour.repository.BikerRepository;
import com.sofka.co.tour.repository.TennisTeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreateBikerUseCase {
    private final BikerRepository bikerRepository;
    private final TennisTeamRepository tennisTeamRepository;
    private final BikerMapper bikerMapper;


    public Mono<BikerDTO> createBiker(BikerDTO bikerDTO){
        /*System.out.println(bikerDTO);
        System.out.println("capacity "+bikerRepository.countByIdTeam(bikerDTO.getIdTeam()));


        System.out.println(bikerRepository.countByIdTeam(bikerDTO.getIdTeam()).map(cantidad -> {
            System.out.println(cantidad);
            return cantidad;
        }));*/
        return tennisTeamRepository.findTennisTeamByCode(bikerDTO.getIdTeam()).flatMap(team->{
                    /**/System.out.println(bikerRepository.findBikerByCode(bikerDTO.getCode()));

            /**/return  bikerRepository.save(bikerMapper.toBikerEntity(bikerDTO));
                    /*Mono<Biker> bici= bikerRepository.findBikerByCode(bikerDTO.getCode()).flatMap(bike-> {
                        System.out.println(bike);

                        return null;
                    }).switchIfEmpty(bikerRepository.save(bikerMapper.toBikerEntity(bikerDTO)));
                    System.out.println(bici);
                    return bici;*/
        }).map(bikerMapper::toBikerDTO)
                .switchIfEmpty(Mono.error(new IllegalArgumentException("Team "+bikerDTO.getIdTeam()+" not found.")));
    }
}
