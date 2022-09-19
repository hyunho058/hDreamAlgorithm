package com.example.hdreamalgorithm.khh.evenorodd;

public class EvenAndOdd {
    public EvenOddStatus isEven(int number) {
        if (number % 2 == 0)
            return EvenOddStatus.Even;

        return EvenOddStatus.Odd;
    }
}
