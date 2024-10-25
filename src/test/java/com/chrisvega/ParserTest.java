package com.chrisvega;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {
    @Test
    public void parserAnalysis() throws Exception {
        String expression = "x = 5;";
        IdLexer lexer = new IdLexer(new StringReader(expression));
        Parser p = new Parser(lexer);
        Integer result = (Integer) p.parse().value;

        assertEquals(5, result);
    }
}
