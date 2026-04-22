package org.example.creational.proxyPattern;

import java.util.*;

public class YouTubeManager {

    private ThirdPartyYouTubeLib service;  // talks to interface only

    public YouTubeManager(ThirdPartyYouTubeLib service) {  // dependency injection
        this.service = service;
    }

    public void renderVideoPage(String id) {
        String info = service.getVideoInfo(id);
        System.out.println("[Manager] Rendering video page: " + info);
    }

    public void renderListPanel() {
        List<String> list = service.listVideos();
        System.out.println("[Manager] Rendering video list: " + list);
    }

    public void reactOnUserInput(String id) {
        renderVideoPage(id);
        renderListPanel();
    }
}
