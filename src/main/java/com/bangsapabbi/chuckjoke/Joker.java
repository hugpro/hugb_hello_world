package com.bangsapabbi.chuckjoke;

import static spark.Spark.*;

public class Joker {
    public static void main(String[] args) {
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
	ChuckJoke chuck = new ChuckJoke();
        get("/random", (req, res) -> chuck.random());
    }
}
