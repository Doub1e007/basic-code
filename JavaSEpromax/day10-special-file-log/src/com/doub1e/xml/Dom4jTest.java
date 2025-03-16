package com.doub1e.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Dom4jTest {
    public static void main(String[] args) throws Exception {
        // 使用Dom4j解析XML文件
        // 1.创建一个SAXReader解析器对象
        SAXReader saxReader = new SAXReader();

        // 2.把xml文件读成一个Document文档对象
        Document document = saxReader.read("day10-special-file-log\\src\\Contact.xml");

        // 3.文档对象中包含了XML的全部数据 提供了方法获取数据
        Element rootElement = document.getRootElement();
        System.out.println("rootElement.getName() = " + rootElement.getName());

        // 4.提取子元素对象
        //List<Element> sonEles = rootElement.elements();
        List<Element> sonEles = rootElement.elements("contact");
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }

        //指定获取单个子元素对象
        Element userElm = rootElement.element("user");
        System.out.println(userElm.elementText("name"));

        Element contactElm = rootElement.element("contact"); // 默认拿第一个contact
        System.out.println(contactElm.elementText("name"));

        // 5.提取子元素的属性对象
        Attribute idAttr = contactElm.attribute("id");
        System.out.println(idAttr.getName());
        System.out.println(idAttr.getValue());

        // 直接拿属性值
        System.out.println(contactElm.attributeValue("id"));

        // 6.文本值
        // 通过父元素拿到子元素的文本值
        System.out.println(contactElm.elementText("name"));
        System.out.println(contactElm.elementTextTrim("name")); //去掉前后空格

        // 先拿到元素对象 再提取文本值
        Element emailElm = contactElm.element("email");
        System.out.println(emailElm.elementText("name"));
        System.out.println(emailElm.elementTextTrim("name"));
    }
}
