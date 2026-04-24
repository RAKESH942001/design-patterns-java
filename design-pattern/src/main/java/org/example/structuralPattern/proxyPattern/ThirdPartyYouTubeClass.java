package org.example.structuralPattern.proxyPattern;

import java.util.Arrays;
import java.util.List;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    @Override
    public List<String> listVideos() {
        System.out.println("[YouTube API] Fetching video list from server...");
        return Arrays.asList("video_1", "video_2", "video_3");
    }

    @Override
    public String getVideoInfo(String id) {
        System.out.println("[YouTube API] Fetching info for: " + id);
        return "Title: Proxy Pattern | ID: " + id + " | Duration: 15 mins";
    }

    @Override
    public void downloadVideo(String id) {
        System.out.println("[YouTube API] Downloading video: " + id);
    }
}
