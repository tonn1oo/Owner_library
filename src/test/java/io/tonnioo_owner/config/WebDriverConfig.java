package io.tonnioo_owner.config;


import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl") // зачитываем данные из командной строки
    @DefaultValue("https://github.com") // обрабатывает дефолтное значение

    String getBaseUrl(); // конвертируем в возращаемый тип
    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("remoteUrl")
    @DefaultValue("http://localhost:4444/ws/hub")
    URL getRemoteUrl();



}

