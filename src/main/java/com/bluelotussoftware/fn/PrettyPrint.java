package com.bluelotussoftware.fn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * A class to handle an fn input of JSON and return a "pretty-print" output.
 *
 * @author John Yeary <jyeary@bluelotussoftware.com>
 * @version 1.0.0
 */
public class PrettyPrint {

    /**
     * fn Function to handle a JSON input and provide a "pretty-print" output.
     *
     * @param input The JSON to be formatted.
     * @return A "pretty-print" JSON string.
     */
    public String handleRequest(String input) {
        String json = (input == null || input.isEmpty()) ? "{}" : input;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(json);
        return gson.toJson(je);
    }

}
