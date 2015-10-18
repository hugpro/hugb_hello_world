package com.bangsapabbi.chuckjoke;

import net.joningi.icndb.ICNDBClient;
import net.joningi.icndb.Joke;

public class ChuckJoke {
    final ICNDBClient client = new ICNDBClient();

    public String random() {
	Joke randomJoke = client.getRandom();
        return randomJoke.getJoke();
    }
}
