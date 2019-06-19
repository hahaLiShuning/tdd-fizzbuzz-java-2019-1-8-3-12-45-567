package com.thoughtworks.tdd;

public class Game {

    public void startGame() {
        for (int i = 1; i <= 120; i++) {
            String result = generateResult(i);
            System.out.println(result);
        }
    }

    public String generateResult(int i) {
        String fizzStr = fizz(i);
        String buzzStr = buzz(i);
        String whizzStr = whizz(i);
        String result;

        if (fizzStr.equals("") && buzzStr.equals("") && whizzStr.equals("")) {
            result = String.valueOf(i);
        } else {
            result = fizzStr.concat(buzzStr).concat(whizzStr);
        }
        return result;
    }

    public String fizz(int i) {
        return i % 3 == 0 ? "Fizz" : "";
    }

    public String buzz(int i) {
        return i % 5 == 0 ? "Buzz" : "";
    }

    public String whizz(int i) {
        return i % 7 == 0 ? "Whizz" : "";
    }
}
