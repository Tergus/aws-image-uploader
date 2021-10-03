package com.tergus.awsimageupload.config;

import com.amazonaws.auth.*;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3() {
        InstanceProfileCredentialsProvider credentials = InstanceProfileCredentialsProvider.createAsyncRefreshingProvider(true);

        return AmazonS3ClientBuilder
                .standard()
                .withCredentials(credentials)
                .build();
    }
}
