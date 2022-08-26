package com.victor.strategyjava.adapters;

import com.victor.strategyjava.interfaces.SocialActions;

public class FacebookAdapter implements SocialActions {
    @Override
    public void share(String content) {
        // May contain code to authenticate and access/invoke Facebook APIs to share content
        // for the sake of simplicity and brevity let's skip the above and just print the following text on console
        System.out.println("Your content " + content + " has been shared on Facebook succesfully!");
    }
}
