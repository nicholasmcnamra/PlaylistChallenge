package io.zipcoder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer n = playList.length;
        Integer forward = (-1 - startIndex + n) % n;
        Integer backward = (startIndex + 1 + n) % n;

        if (forward > backward) {
            return forward;
        }
        else {
            return backward;
        }
    }

}
