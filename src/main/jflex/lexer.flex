package com.chrisvega;

import java_cup.runtime.*;

%%
%public
%class IdLexer
%unicode
%cup
%line
%column

%{
    StringBuffer string = new StringBuffer();

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}

Digit = [0-9]
Letter = [a-zA-Z]
WhiteSpace = {LineTerminator} | [ \t\f]
LineTerminator = \r|\n|\r\n
Number = {Digit}+(\.{Digit}+)?
Identifier = {Letter}({Letter}|{Digit}|[_])*

%eofval{
    return symbol(ParserSym.EOF);
%eofval}

%%

"defineSpace"        { return symbol(ParserSym.DEFINE_SPACE, yytext()); }
"defineCar"          { return symbol(ParserSym.DEFINE_CAR, yytext()); }
"useSpace"           { return symbol(ParserSym.USE_SPACE, yytext()); }
"useCar"             { return symbol(ParserSym.USE_CAR, yytext()); }
"setDirectionVector" { return symbol(ParserSym.SET_DIRECTION, yytext()); }
"moveForward"        { return symbol(ParserSym.MOVE_FORWARD, yytext()); }
"stop"               { return symbol(ParserSym.STOP, yytext()); }
"rotate"             { return symbol(ParserSym.ROTATE, yytext()); }
"moveForwardAndStop" { return symbol(ParserSym.MOVE_FORWARD_STOP, yytext()); }

"="                  { return symbol(ParserSym.ASSIGN, yytext()); }
"("                  { return symbol(ParserSym.LPAREN, yytext()); }
")"                  { return symbol(ParserSym.RPAREN, yytext()); }
","                  { return symbol(ParserSym.COMMA, yytext()); }
";"                  { return symbol(ParserSym.SEMICOLON, yytext()); }

{Identifier}         { return symbol(ParserSym.IDENTIFIER, yytext()); }
{Number}             { return symbol(ParserSym.NUMBER, Integer.parseInt(yytext())); }

{WhiteSpace}+        { /* ignore */ }
"#".*                { /* ignore */ }
[^]                  { throw new Error("Illegal character <" + yytext() + ">"); }