package com.designpattern.facade.code.pagemaker;

import android.util.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//シングルトンでもいい
public class PageMaker {
    private static String TAG = PageMaker.class.getSimpleName();

    private PageMaker() {   //インスタンスを作らない
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "のページへようこそ");
            writer.paragraph("please send mail");
            writer.mailto(mailaddr, username);
            writer.close();
            Log.e(TAG, filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
