package com.victor.strategyjava.designPattern;

import com.victor.strategyjava.adapters.*;
import com.victor.strategyjava.context.SocialActivity;

public class Main {
    public static void main(String[] args) {
        try {
            shareURLOnSocialMedia("https://myawesomelink.com");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void shareURLOnSocialMedia(String URL) throws Exception {
        SocialActivity socialActivityContext = new SocialActivity();

        socialActivityContext.useAdapter(new FacebookAdapter()).shareLink(URL);
        socialActivityContext.useAdapter(new TwitterAdapter()).shareLink(URL);
        socialActivityContext.useAdapter(new LinkedinAdapter()).shareLink(URL);
        socialActivityContext.useAdapter(new WhatsAppAdapter()).shareLink(URL);
        socialActivityContext.useAdapter(new InstagramAdapter()).shareLink(URL);
    }
}
