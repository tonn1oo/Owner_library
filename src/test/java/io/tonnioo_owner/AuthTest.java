package io.tonnioo_owner;

import io.tonnioo_owner.config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthTest {

    @Test
    public void testClasspath(){
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

        assertThat(config.username()).isEqualTo("tonnioo");
        assertThat(config.password()).isEqualTo("123456");
    }

    @Test
    public void testLocalFile() throws IOException {
        String content = "username=secret-user\npassword=secret-pass";
        Path propsPath = Paths.get("/tmp/secret.properties");
        Files.write(propsPath, content.getBytes(StandardCharsets.UTF_8));

        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

        assertThat(config.username()).isEqualTo("secret-user");
        assertThat(config.password()).isEqualTo("secret-pass");

        Files.delete(propsPath);
    }
}
