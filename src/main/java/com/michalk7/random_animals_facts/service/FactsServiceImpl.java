package com.michalk7.random_animals_facts.service;

import com.michalk7.random_animals_facts.model.Fact;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class FactsServiceImpl implements FactsService {

    private final WebClient webClient;

    public FactsServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://cat-fact.herokuapp.com/facts/random").build();
    }

    @Override
    public List<Fact> callApiForFacts(String animalType, int factsAmount) {
        Mono<List<Fact>> factsStream = this.webClient.get().uri(uriBuilder -> uriBuilder
                .queryParam("animal_type", animalType)
                .queryParam("amount", factsAmount)
                .build()
        ).retrieve().bodyToMono(new ParameterizedTypeReference<List<Fact>>() {});

        List<Fact> factList = factsStream.block();

        return factList;
    }

}
