package com.asiainfo.rty.utils;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

/**
 * 字符串处理类，继承自Spring的StringUtils
 */
public class StringUtil extends StringUtils {
    private static Log log = LogFactory.getLog(StringUtil.class);

    /**
     * 验证id是否合法
     *
     * @param id
     * @return
     */
    public static boolean validateId(String id) {

        Pattern pattern = Pattern.compile("^[a-zA-Z]{1}[0-9a-zA-Z_\\.]*$");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    /**
     * 格式化String
     *
     * @param str
     * @param def 出错后的默认值
     * @return
     */
    public static String parseString(String str, String def) {
        return StringUtils.isEmpty(str) ? def : str;
    }

    /**
     * 格式化int
     *
     * @param str
     * @param def 出错后的默认值
     * @return
     */
    public static int parseInt(String str, int def) {
        int v = def;
        if (str != null && str.length() > 0) {
            try {
                v = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                log.error(e.getMessage(), e);
            }
        }
        return v;
    }

    /**
     * 格式化long
     *
     * @param str
     * @param def
     * @return
     */
    public static long parseLong(String str, long def) {
        long v = def;
        if (str != null && str.length() > 0) {
            try {
                v = Long.parseLong(str);
            } catch (NumberFormatException e) {
                log.error(e.getMessage(), e);
            }
        }
        return v;
    }

    /**
     * 转义字符
     *
     * @param str   待转义字符串
     * @param chars key=要转义的字符，value=转义后的字符
     * @return
     */
    public static String escape(String str, Map<String, String> chars) {
        if (isEmpty(str) || chars == null || chars.size() == 0)
            return str;

        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            String v = chars.get(String.valueOf(c));
            if (isEmpty(v))
                sb.append(c);
            else
                sb.append(v);
        }
        return sb.toString();
    }

    /**
     * 转译html字符
     *
     * @param str
     * @return
     */
    public static String escapeHtml(String str) {
        if (!hasText(str))
            return str;

        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == '"')
                sb.append("&quot;");
            else if (c == '&')
                sb.append("&amp;");
            else if (c == '<')
                sb.append("&lt;");
            else if (c == '>')
                sb.append("&gt;");
            else
                sb.append(c);
        }
        return sb.toString();
    }

    public static String escapeJSON(String str) {
        if (!hasText(str))
            return str;

        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == '<')
                sb.append("&lt;");
            else if (c == '>')
                sb.append("&gt;");
            else
                sb.append(c);
        }
        return sb.toString();
    }

    /**
     * 转译特殊字符
     *
     * @param str
     * @return
     */
    public static String escapeSpecialCharacter(String str) {
        if (!hasText(str))
            return str;

        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == '$')
                sb.append("\\$");
            else
                sb.append(c);
        }
        return sb.toString();
    }

    /**
     * 判断是否为正整数!
     *
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str.trim());
        return isNum.matches();
    }

    public static String getGBStr(String str) {
        try {
            byte[] temp_t = str.getBytes("ISO8859-1");
            return new String(temp_t, "GBK");
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
        }
        return "NULL";
    }

    /**
     * 按字节码截取字符串长度
     *
     * @param str
     * @param length
     * @param charSet 编码格式，默认GBK
     * @return
     */
    public static String subString(String str, int length, String charSet) {

        if (str == null)
            return "";

        if (isEmpty(charSet))
            charSet = "GBK";

        int tempSubLength = length;// 截取字节数
        String subStr = str.substring(0, str.length() < length ? str.length() : length);// 截取的子串
        try {
            int subStrByetsL;
            subStrByetsL = subStr.getBytes(charSet).length;
            // 截取子串的字节长度
            // 说明截取的字符串中包含有汉字
            while (subStrByetsL > tempSubLength) {
                length--;
                subStr = str.substring(0, length > str.length() ? str.length() : length);
                subStrByetsL = subStr.getBytes(charSet).length;
            }
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
        }
        return subStr;

    }
}
