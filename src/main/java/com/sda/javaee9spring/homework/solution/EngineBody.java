package com.sda.javaee9spring.homework.solution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EngineBody {

    public EngineBody() {
        log.info("EngineBody was created");
    }
}
