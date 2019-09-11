#if ARDUINO >= 100
#include "Arduino.h" // usr/share/arduino/hardware/arduino/cores/arduino/Arduino.h
#else
#endif
#include <Servo.h>

Servo colibatorServo;

void setup()
{
    Serial.begin(9600);
    colibatorServo.attach(9);
}

void loop()
{
    colibatorServo.write(90); //central
    digitalWrite(13,1);
    delay(100);
    digitalWrite(13,0);
    delay(1000);

    colibatorServo.write(0); //left
    digitalWrite(13,1);
    delay(100);
    digitalWrite(13,0);
    delay(100);
    digitalWrite(13,1);
    delay(100);
    digitalWrite(13,0);
    delay(1000);

    colibatorServo.write(180); //right
    digitalWrite(13,1);
    delay(100);
    digitalWrite(13,0);
    delay(100);
    digitalWrite(13,1);
    delay(100);
    digitalWrite(13,0);
    delay(100);
    digitalWrite(13,1);
    delay(100);
    digitalWrite(13,0);
    delay(1000);
}
