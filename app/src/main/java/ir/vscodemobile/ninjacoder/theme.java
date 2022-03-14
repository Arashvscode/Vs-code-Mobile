package ir.vscodemobile.ninjacoder;


import io.github.rosemoe.sora.widget.EditorColorScheme;

public class theme extends EditorColorScheme {

    @Override
    public void applyDefault() {
        super.applyDefault();
        setColor(ANNOTATION, 0xFFFFF881);
        setColor(FUNCTION_NAME, 0xFF02C4FF);
        setColor(IDENTIFIER_NAME, 0xFFE5C31A);
        setColor(IDENTIFIER_VAR, 0xFF3AA374);
        setColor(LITERAL, 0xFF02FF41);
        setColor(OPERATOR, 0xFFFFFF00);
        setColor(COMMENT, 0xFFFF00D2);
        setColor(KEYWORD, 0xFFFF0270);
        setColor(WHOLE_BACKGROUND, 0xFF000027);
        setColor(TEXT_NORMAL, 0xFF83FFFD);
        setColor(LINE_NUMBER_BACKGROUND, 0xFF000027);
        setColor(LINE_NUMBER, 0xFFFF8800);
        setColor(LINE_DIVIDER, 0xFFFF8800);
        setColor(SCROLL_BAR_THUMB, 0xFF02AFFF);
        setColor(SCROLL_BAR_THUMB_PRESSED, 0xFFF7FF02);
        setColor(SELECTED_TEXT_BACKGROUND, 0xff3676b8);
        setColor(MATCHED_TEXT_BACKGROUND, 0xFFFFC402);
        setColor(CURRENT_LINE, 0x74FF9C00);
        setColor(SELECTION_INSERT, 0xFFDCFF9D);
        setColor(SELECTION_HANDLE, 0xFFDCFF9D);
        setColor(BLOCK_LINE, 0xD5FD2A2D);
        setColor(BLOCK_LINE_CURRENT, 0xFF00D4FF);
       /// setColor(DEX , 0xFFFF00A6 );
        setColor(NON_PRINTABLE_CHAR, 0xFF4582D7);
    }

}
