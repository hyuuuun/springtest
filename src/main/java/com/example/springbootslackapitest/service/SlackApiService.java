package com.example.springbootslackapitest.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

public interface SlackApiService {
    void sendMessage(String message);

}




