package com.example.android.jokesprovider;

import java.util.Random;

public class Jokes {

    private static String[] allJokes = {"Can a kangaroo jump higher than a house? \n\n Of course, a house doesn't jump at all." ,
            "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\" \n\n Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\" \n\n Doctor: \"Nine.\"",
    "A man asks a farmer near a field, \"Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.\"\n" +
            "\n" + "The farmer says, \"Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.\"", " Anton, do you think I am a bad mother?\n" +
            "\n" + "My name is Paul.", "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away."};


    public String getJoke() {
        Random r = new Random();
        return allJokes[r.nextInt(allJokes.length)];
    }

}
