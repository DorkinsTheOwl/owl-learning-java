package com.company;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        try {
//            URI uri = new URI("db://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
//            URI uri = new URI("hello");
//            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");
            URI baseUri = new URI("http://username:password@mynewserver.com:5000");
            URI uri = new URI("/catalogue/phones?os=android#samsung");
            URI uri2 = new URI("/catalogue/tv?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=12345");

            URI resolvedUri = baseUri.resolve(uri);
            URI resolvedUri2 = baseUri.resolve(uri2);
            URI resolvedUri3 = baseUri.resolve(uri3);

            URL url = resolvedUri.toURL();
            System.out.println("Url = " + url);

            URL url2 = resolvedUri2.toURL();
            System.out.println("Url 2 = " + url2);

            URL url3 = resolvedUri3.toURL();
            System.out.println("Url 3 = " + url3);

            URI relativizedURI = baseUri.relativize(resolvedUri2);
            System.out.println("Relative URI = " + relativizedURI);

//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
//            System.out.println("Authority = " + uri.getAuthority());
//            System.out.println("User info = " + uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Path = " + uri.getPath());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());

        } catch (URISyntaxException e) {
            System.out.println("Bad URI Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL malformed: " + e.getMessage());
        }
    }
}
