package edu.wctc.isp;

import java.time.Duration;

public interface Album extends Product{
    String getArtist();
    Duration getPlayingTime();
}
