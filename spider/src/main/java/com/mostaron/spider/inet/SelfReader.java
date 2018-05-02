package com.mostaron.spider.inet;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SelfReader {

    public static void main(String...args) throws  Exception{
        String protocol = "https://";
        String host = "www.cwems.com";
        String start_url = "/shu/231053/41506236.html";
        SelfReader self = new SelfReader();

        while (null != start_url && !start_url.isEmpty()) {
            start_url = self.getPageContent(protocol, host, start_url);

        }


    }

    public  String getPageContent(String protocol, String host, String surl) throws Exception{
        URL url = new URL(protocol + host + surl);
        URLConnection connection = url.openConnection();
        HttpURLConnection httpConnection;

        if(connection instanceof HttpURLConnection){
            httpConnection = (HttpURLConnection) connection;
        }else{
            return null;
        }

        int contentLength = httpConnection.getContentLength();

        ByteArrayOutputStream baos = new ByteArrayOutputStream(contentLength);
        byte[] buff = new byte[1024];

        InputStream is = httpConnection.getInputStream();
        while(is.read(buff) != -1){
            baos.write(buff);
        }

        byte[] result = baos.toByteArray();

//        System.out.println(new String(result, "GBK"));

        String content = new String(result, "GBK");
        Document doc = Jsoup.parse(content);

        System.out.print(doc.getElementsByClass("bookname").get(0).text());
        System.out.print(doc.getElementsByClass("chaptername").get(0).text());
        System.out.print(doc.select("pre.note").text().length());

        String nextUrl = null;
        String re = "var next_page = \".+\"";

        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(content);

        if(matcher.find()){
            nextUrl = matcher.group().replace("var next_page = \"","").replace("\"","");
        }

        System.out.println(nextUrl);

        return nextUrl;
    }
}
