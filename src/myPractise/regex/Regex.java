package myPractise.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static void testRegex(){
		Pattern p = Pattern.compile("^123+[0-9]*");
		
		String regex = "^this.*";
		String regex1 = "[a-zA-Z\\s]+";
		String regex2 = "[0-9]{1,}";
		String regex3 = "\\s+";
		String test = "this is a word";
		String test1 = "123353467";
		System.out.println(test.matches(regex));
		System.out.println(test.matches(regex1));
		System.out.println(test1.matches(regex2));
		System.out.println("  ".matches(regex3));
		System.out.println(p.matcher(test1).matches());
	}
	
	public static void compare(){
		String demo = "1\\2\\3\\4\\5";
		String[] str = demo.split("\\\\");
		for (String string : str) {
			System.out.print(string);
		}
		System.out.println(Arrays.asList(str));
	}
	
	public static String filterHtmlStr(String htmlStr){
		String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式 
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式 
        String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式 
         
        Pattern p_script=Pattern.compile(regEx_script); 
        Matcher m_script=p_script.matcher(htmlStr); 
        htmlStr = m_script.replaceAll(""); //过滤  
         
        Pattern p_style=Pattern.compile(regEx_style); 
        Matcher m_style=p_style.matcher(htmlStr); 
        htmlStr = m_style.replaceAll(""); //过滤style标签 
         
        Pattern p_html=Pattern.compile(regEx_html); 
        Matcher m_html=p_html.matcher(htmlStr); 
        htmlStr = m_html.replaceAll(""); //过滤html标签 
        
        //js的正则
//      let str = htmlStr.replace(/[ | ]*\n/g, "\n"); //去除行尾空白
//      str = str.replace(/\n[\s| | ]*\r/g, "\n"); //去除多余空行
//      str = str.replace(/&nbsp;/gi, ""); //去掉&nbsp;
//      str = str.replace(/\s/g, ""); //将空格去掉
//      str = str.replace(/(<style.*?>).*?(<\/style>)/g, ""); //将<style></style>标签内的内容去掉
//      str = str.replace(/<\/?[^>]*>/g, ""); //去除HTML tag
        return htmlStr.trim(); //返回文本字符串 
	}
	public static void main(String[] args) {
        
        String htmlStr = "<p>政策法规公告1</p><p>政策法规公告1</p><p>政策法规公告1</p><p>政策法规公告1</p><p>政策法规公告1</p><p>政策法规公告1</p><p>含图片附件</p>";
       
        System.out.println(filterHtmlStr(htmlStr));
	}
	
}
