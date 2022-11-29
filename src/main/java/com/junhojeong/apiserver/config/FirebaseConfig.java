package com.junhojeong.apiserver.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;

@Configuration
public class FirebaseConfig {
    @PostConstruct
    public void init(){
        try{
            FileInputStream refreshToken = new FileInputStream("src/main/resources/credential.json");

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(refreshToken))
                    .setDatabaseUrl("https://chungbot-dxyu-default-rtdb.firebaseio.com")
                    .build();

            FirebaseApp.initializeApp(options);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
