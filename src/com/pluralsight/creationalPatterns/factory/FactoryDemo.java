package com.pluralsight.creationalPatterns.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebiste(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebiste(WebsiteType.SHOP);

        System.out.println(site.getPages());
    }
}
