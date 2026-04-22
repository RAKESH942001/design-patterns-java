package org.example.creational.proxyPattern;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        // Step 1 — Create the real service (heavy, slow)
        ThirdPartyYouTubeLib realService = new ThirdPartyYouTubeClass();

        // Step 2 — Wrap it with the proxy
        CachedYouTubeClass proxy = new CachedYouTubeClass(realService);

        // Step 3 — Pass proxy to manager (manager doesn't know it's a proxy)
        YouTubeManager manager = new YouTubeManager(proxy);

        System.out.println("======= FIRST REQUEST =======");
        manager.reactOnUserInput("video_1");

        System.out.println("\n======= SAME REQUEST AGAIN =======");
        manager.reactOnUserInput("video_1");

        System.out.println("\n======= DIFFERENT VIDEO =======");
        manager.reactOnUserInput("video_2");

        System.out.println("\n======= FORCE RESET (stale cache) =======");
        proxy.needReset = true;
        manager.reactOnUserInput("video_1");
    }

}
