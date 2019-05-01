package com.lemon.framework.processing.textprocessing.text;

import com.lemon.framework.processing.textprocessing.Processor;

import java.util.ArrayList;
import java.util.List;

public class TextProcessorTest {
    private final Processor<String,String> processor;
    private final List<String> textList;

    public TextProcessorTest(Processor<String, String> processor) {
        this.processor = processor;
        textList=new ArrayList<>();
        textList.add("__DGHjdskhf_svdfh__UGIBHJjfdhgHGB");
        textList.add("myJava");
        textList.add("myJava  myJava");
        textList.add("my958t67Java");
        textList.add("my958t67Ja437va");
        textList.add("myJavaKAvvAVAvvA");
        textList.add("__my_Java__KAvvAV_AvvA___");
        textList.add("MYjavaAPPLICATION");
        textList.add("MY_java_application");
        textList.add("MY-java-application");
        textList.add("HJNFsbdfviuBJHFvb vfdjkvZKJHHLGB  cvnxskjvxbdfnjukGBKJFBkzxbjhkgfxJKGJKvbfdvikjNKJGHBKNv,msgfdnoirut8eyusnjkjghiUDRHJNKZ");
    }

    public void test() {
        textList.forEach(processor::process);
    }
}
