package ru.gerasimov.client;

import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestClient;
import ru.gerasimov.model.Doll;

import java.util.List;

@RequiredArgsConstructor
public class DollClientImpl implements DollClient {

    private static final ParameterizedTypeReference<List<Doll>> PARAMETERIZED_TYPE_REFERENCE =
            new ParameterizedTypeReference<>() {
            };

    private final RestClient restClient;

    @Override
    public List<Doll> getAllDolls() {
        return restClient
                .get()
                .uri("admin/dolls")
                .retrieve()
                .body(PARAMETERIZED_TYPE_REFERENCE);
    }

    @Override
    public Doll getDollById(int dollId) {
        return restClient
                .get()
                .uri("admin//dolls/{dollId}", dollId)
                .retrieve()
                .body(Doll.class);
    }
}
