package ir.vscodemobile.ninjacoder;



import io.github.rosemoe.sora.widget.EditorColorScheme;

/**
 * ColorScheme for HTML Language for editor
 */
public class htmltheme extends EditorColorScheme {

    @Override
    public void applyDefault() {
        super.applyDefault();
        setColor(OPERATOR, 0xff4fc3f7);
        setColor(BLOCK_LINE, 0xff717171);
        setColor(BLOCK_LINE_CURRENT, 0xffffffff);
        setColor(NON_PRINTABLE_CHAR, 0xffdddddd);
        setColor(CURRENT_LINE, 0xff464646);
        setColor(SELECTION_INSERT, 0xffffffff);
        setColor(SELECTION_HANDLE, 0xffffffff);
        setColor(LINE_NUMBER, 0xff2b9eaf);
        setColor(LINE_DIVIDER, 0xff2b9eaf);
        setColor(LINE_NUMBER_BACKGROUND, 0xFF000027);
        setColor(WHOLE_BACKGROUND, 0xFF000027);
        setColor(ATTRIBUTE_VALUE, 0xff8bc34a);
        setColor(ATTRIBUTE_NAME, 0x7A000000);
        setColor(HTML_TAG, 0xFFFF0040);
	//	setColor(HSII , 0xFF00FF2F);
        setColor(TEXT_NORMAL, 0xFF0ECAFF);
        setColor(IDENTIFIER_NAME, 0xfff0be4b);
        setColor(COMMENT, 0xFFFFC800);
        setColor(TEXT_SELECTED, 0xffffffff);
        setColor(SELECTED_TEXT_BACKGROUND, 0xFF9E9E9E);
    }

}
