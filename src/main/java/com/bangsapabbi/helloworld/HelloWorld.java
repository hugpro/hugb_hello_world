package com.bangsapabbi.helloworld;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        World world = new World();
        get("/random", (req, res) -> world.greet());
    }
}
