package ru.gerasimov.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ClientBean {

    @Bean
    public DollClientImpl dollClient(
            @Value("${catalog_service_url}") String url
    ) {
        return new DollClientImpl(RestClient.builder()
                .baseUrl(url)
                .build());
    }

}
