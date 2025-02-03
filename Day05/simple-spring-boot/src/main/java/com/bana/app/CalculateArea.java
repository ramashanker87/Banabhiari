package com.bana.app;

import org.springframework.stereotype.Component;

@Component
public class CalculateArea {

    public double Circlearea(float radius) {

        return 3.4f * radius * radius;
    }

    public double square(float side) {

        return side * side;

    }
}
