package com.newmaa.othtech.utils;

import static net.minecraft.util.StatCollector.translateToLocalFormatted;

import java.util.HashMap;
import java.util.Map;

import com.newmaa.othtech.OTHTechnology;

public class TextHandler {

    public static Map<String, String> LangMap;
    public static Map<String, String> LangMapNeedToWrite = new HashMap<>();

    public static String texter(String aTextLine, String aKey) {
        if (aTextLine == null || aKey == null) {
            return "texterError: null input";
        }

        /**
         * If not in Dev mode , return vanilla forge method directly.
         */
        if (OTHTechnology.isInDevMode) {
            if (LangMap == null || LangMap.get(aKey) == null) {
                OTHTechnology.LOG.info("Texter get a new key - TextLine: " + aKey + " - " + aTextLine);
                LangMapNeedToWrite.put(aKey, aTextLine);
                return aTextLine;
            } else {
                return translateToLocalFormatted(aKey);
            }
        } else if (null != translateToLocalFormatted(aKey)) {
            return translateToLocalFormatted(aKey);
        }
        return "texterError: " + aTextLine;
    }

    public static String texterButKey(String aTextLine, String aKey) {
        if (aTextLine == null || aKey == null) {
            return "texterError: null input";
        }
        if (OTHTechnology.isInDevMode) {
            if (LangMap == null || LangMap.get(aKey) == null) {
                OTHTechnology.LOG.info("Texter get a new key - TextLine: " + aKey + " - " + aTextLine);
                LangMapNeedToWrite.put(aKey, aTextLine);
            }
        }
        return aKey;
    }

    /**
     * Auto generate the Key of textLine
     * {@link TextHandler#texter(String aTextLine, String aKey)}
     *
     * @param aTextLine The default String to where you use.
     * @return The localized text or error message
     */
    public static String texter(String aTextLine) {
        if (aTextLine == null) {
            return "texterError: null input";
        }
        String aKey = "Auto." + aTextLine + ".text";
        return texter(aTextLine, aKey);
    }
}
