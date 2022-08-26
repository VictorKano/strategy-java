package com.victor.strategyjava.context;

import com.victor.strategyjava.interfaces.SocialActions;

public class SocialActivity {
    private SocialActions socialMediumContext;

    public SocialActivity useAdapter(SocialActions socialActionsAdapter) {
        this.socialMediumContext = socialActionsAdapter;
        return this;
    }

    public void shareLink(String link) throws Exception {
        if(this.socialMediumContext == null) {
            throw new Exception("Social adapter must be specified");
        }
        socialMediumContext.share(link);
    }
}
