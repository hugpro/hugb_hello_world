package com.bangsapabbi.helloworld;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WorldTest {

    @Test
    public void greetContainsChuck() {
        World world = new World();
        assertTrue(world.greet().contains("Chuck"));
    }
}
