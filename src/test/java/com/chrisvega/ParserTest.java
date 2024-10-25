package com.chrisvega;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class ParserTest {
    @Test
    public void parserAnalysis() throws Exception {
        String expression = "2*4+3*6";
        IdLexer lexer = new IdLexer(new StringReader(expression));
        Parser p = new Parser(lexer);
        Integer result = (Integer) p.parse().value;
    }
}
