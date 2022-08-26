package com.victor.strategyjava.adapters;

import com.victor.strategyjava.interfaces.SocialActions;

public class InstagramAdapter implements SocialActions {
    @Override
    public void share(String content) {
        System.out.println("Your content " + content + " has been shared on Instagram succesfully!");
    }
}
