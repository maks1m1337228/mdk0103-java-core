package Alpinists;

import java.util.Arrays;
import java.util.Objects;

public class Groups {
    private boolean isGroupOpen;
    private Alpinists.Alpinist[] group;
    private String MountainName;

    public Groups(boolean isGroupOpen, Alpinist[] group, String mountainName) {
        this.isGroupOpen = isGroupOpen;
        this.group = group;
        MountainName = mountainName;
    }
    public void addToGroup () {
        if (isGroupOpen) {
            for (int i = 0; i < group.length; i++) {
                group[i] =      ;
            }
        }
    }

}







