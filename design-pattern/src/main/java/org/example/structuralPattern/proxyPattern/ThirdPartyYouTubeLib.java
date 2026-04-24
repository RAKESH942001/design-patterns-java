package org.example.structuralPattern.proxyPattern;

import java.util.List;

public interface ThirdPartyYouTubeLib {

    List<String> listVideos();
    String getVideoInfo(String id);
    void downloadVideo(String id);
}
