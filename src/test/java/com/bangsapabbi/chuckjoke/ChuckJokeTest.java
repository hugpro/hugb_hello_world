package com.bangsapabbi.chuckjoke;

import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ChuckJokeTest {

    @Test
    public void chuckNorrisNameInRandomJoke() {
	ChuckJoke chuck = new ChuckJoke();
	assertThat(chuck.random(), containsString("Chuck Norris");
    }
}
