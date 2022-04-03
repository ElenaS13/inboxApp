package io.javabrains;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="datastax.astra")
public class DataStaxAstraProperties {

    private File getSecureConnectBundle;

    public File getGetSecureConnectBundle() {
        return getSecureConnectBundle;
    }

    public void setGetSecureConnectBundle(File getSecureConnectBundle) {
        this.getSecureConnectBundle = getSecureConnectBundle;
    }

    

}
