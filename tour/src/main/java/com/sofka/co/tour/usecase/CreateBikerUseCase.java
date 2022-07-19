package com.sofka.co.tour.usecase;
import com.sofka.co.tour.dto.BikerDTO;
import com.sofka.co.tour.mapper.BikerMapper;
import com.sofka.co.tour.repository.BikerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CreateBikerUseCase {
    private final BikerRepository bikerRepository;
    private final BikerMapper bikerMapper;

    public Mono<BikerDTO> createBiker(BikerDTO bikerDTO){
        return bikerRepository.save(
                        bikerMapper.toBikerEntity(bikerDTO))
                .map(bikerMapper::toBikerDTO);
    }
}
