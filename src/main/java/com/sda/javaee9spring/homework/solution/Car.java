package com.sda.javaee9spring.homework.solution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Car {
    private final Wheel rightFront;
    private final Wheel leftFront;
    private final Wheel rightRear;
    private final Wheel leftRear;
    private final CarBody carBody;
    private final Engine engine;

    public Car(Wheel rightFront, Wheel leftFront, Wheel rightRear, Wheel leftRear, CarBody carBody, Engine engine) {
        this.rightFront = rightFront;
        this.leftFront = leftFront;
        this.rightRear = rightRear;
        this.leftRear = leftRear;
        this.carBody = carBody;
        this.engine = engine;

        log.info("Car was created");
    }
}
