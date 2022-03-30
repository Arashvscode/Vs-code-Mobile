
package io.github.rosemoe.sora.langs.desc;

import io.github.rosemoe.sora.langs.universal.LanguageDescription;


public class KotlinDescription implements LanguageDescription {

    @Override
    public boolean isOperator(char[] characters, int length) {
        if (length == 1) {
            char c = characters[0];
            return (c == '+' || c == '-' || c == '{' || c == '}' || c == '[' || c == ']' ||
                    c == '(' || c == ')' || c == '|' || c == ':' || c == '.' || c == ',' ||
                    c == ';' || c == '*' || c == '/' || c == '&' || c == '^' || c == '%' ||
                    c == '!' || c == '~' || c == '<' || c == '>' || c == '=' || c == '\\' ||
                    c == '#');
        }
        return false;
    }

    @Override
    public boolean isLineCommentStart(char a, char b) {
        return a == '<' && b == '!';
    }

    @Override
    public boolean isLongCommentStart(char a, char b) {
        return a == '<' && b == '-';
    }

    @Override
    public boolean isLongCommentEnd(char a, char b) {
        return a == '-' && b == '>';
    }

    @Override
    public String[] getKeywords() {
        //noinspection SpellCheckingInspection
        return new String[]{
                "as","class","break","continue","do","else",
"for","fun","false","true","if","in","interface","super",
"return","object","package", "null", "is", "try",
"throw","this","typeof","typealias","when","while","val","var"
        };
    }

    @Override
    public boolean useTab() {
        return false;
    }

    @Override
    public int getOperatorAdvance(String operator) {
        switch (operator) {
            case "{":
                return 4;
            case "}":
                return -4;
        }
        return 0;
    }

    @Override
    public boolean isSupportBlockLine() {
        return true;
    }

    @Override
    public boolean isBlockStart(String operator) {
        return operator.equals("{");
    }

    @Override
    public boolean isBlockEnd(String operator) {
        return operator.equals("}");
    }
}
