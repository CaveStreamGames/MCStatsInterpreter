package com.cavestreamgames;

import java.io.File;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URI;

import org.json.*;


public class interpret {
    PrimaryController controller = new PrimaryController();

    File file = controller.getFile();

    String fileName = file.getName();
    
    public void interpretFile() {
        
    }

    private String call() {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://minecraft-api.com/api/pseudo/" + fileName))
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
        HttpResponse<String> response = null;

        try {
            HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String username = response.body();

        return username;
    }
}

