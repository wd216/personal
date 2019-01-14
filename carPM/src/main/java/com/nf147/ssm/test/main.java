package com.nf147.ssm.test;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {
        String url = "http://www.zhsme.gov.cn/policy/getAllPolicyInfoByPolicyId?id=e2d41e70Meb2eM4fe0M9e8bM29a32753e56f#";
        Document document = Jsoup.connect(url).get();
        //System.out.println(document.title());
       // System.out.println(document.select("[href]"));
        Elements e = document.select("[class=policy-con] p");
        System.out.println(e.text());

//        int num = 0;
//
//        for (int i = 0; i <= 16; i++) {
//            num++;
//            String url = "http://www.zhsme.gov.cn/policy/getPolicyList?pageNum=" + num + "&NameOrWords=&areaSreachValue=&areaSreachId=areaSreach_all&scaleSreachValue=&scaleSreachId=&levelSreachValue=&levelSreachId=";
//
//            Document doc = Jsoup.connect(url)
//                    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")
//                    .timeout(8000)
//                    .get();
//
//            Elements elements = doc.select("div[class=list-txt left] a[href]");//.select("");
//            //Elements elements= doc.select("ul[class=pagination]").select("a[href]");
//            for (Element element : elements) {
//                //System.out.println(element.text());
//                System.out.println(element.attr("abs:href") + ":" + element.text() + "");
//            }


        }
    }

