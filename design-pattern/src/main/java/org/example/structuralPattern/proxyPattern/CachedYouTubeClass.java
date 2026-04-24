package org.example.structuralPattern.proxyPattern;

import java.util.*;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib{

    private ThirdPartyYouTubeLib service;
    private List<String> listCache = null;
    private Map<String, String> videoCache = new HashMap<>();
    public boolean needReset = false;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public List<String> listVideos() {
        if (listCache == null || needReset) {
            System.out.println("[Proxy] Cache MISS — fetching video list...");
            listCache = service.listVideos();
        } else {
            System.out.println("[Proxy] Cache HIT — returning cached video list");
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(String id) {

        if (!videoCache.containsKey(id) || needReset) {
            System.out.println("[Proxy] Cache MISS — fetching info for: " + id);
            String info = service.getVideoInfo(id);
            videoCache.put(id, info);
        } else {
            System.out.println("[Proxy] Cache HIT — returning cached info for: " + id);
        }
        return videoCache.get(id);
    }

    @Override
    public void downloadVideo(String id) {
        if (!downloadExists(id) || needReset) {
                                            System.out.println("[Proxy] Downloading video: " + id);
            service.downloadVideo(id);
        } else {
            System.out.println("[Proxy] Video already downloaded: " + id);
        }
    }

    private boolean downloadExists(String id) {
        // Simulates checking if video is already downloaded locally
        return videoCache.containsKey(id);
    }
}
