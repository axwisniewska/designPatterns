package com.pluralsight.creationalPatterns.factory;

public class WebsiteFactory {

    public static Website getWebiste(WebsiteType siteType){
        switch (siteType){
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }

            default: {
                return null;
            }
        }
    }
}
