package com.joantolos.kata.fizz.buzz

import spock.lang.Specification

class GameSpec extends Specification {

    def 'Should match the one hundred expected numbers'() {

        given: "The fizz buzz game"
        Game fizzBuzz = new Game()

        expect: 'Should match the expected result'
        String expectedResult = ""
        new File("src/test/resources/expectedOutput.txt").eachLine {
            expectedResult += "\n" << it
        }
        expectedResult == fizzBuzz.play()
    }
}
