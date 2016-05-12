package system.utils;

import static java.lang.String.format;

public class HtmlUtils {

    //I would use some library e.g. JSOUP. But for now let's make it simple.
    public static String wrapWithTag(String text, String tag){
        return format("<%2$s>%s</%2$s>", text, tag);
    }

}
