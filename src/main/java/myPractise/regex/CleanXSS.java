package myPractise.regex;

/**
 * @Description:
 * @Author: dyf
 * @Date: 2021/1/21 16:15
 */
public class CleanXSS {
    public static void main(String[] args) {

    }

    private static String cleanXSS(String valueP) {
        String value = valueP;
        if(value != null){
            // You'll need to remove the spaces from the html entities below
            value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
            value = value.replaceAll("'", "&#39;");
            value = value.replaceAll("eval\\((.*)\\)", "");
            value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
            value = value.replaceAll("script", "");
            value = value.replaceAll("#", "＃");
            value = value.replaceAll("&", "＆");
        }

        return value;
    }


}
