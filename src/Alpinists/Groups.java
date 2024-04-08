package Alpinists;

import java.util.Arrays;

public class Groups {
    private boolean isGroupOpen;
    private Alpinist[] group;
    private String mountainName;

    public Groups(boolean isGroupOpen, Alpinist[] group, String mountainName) {
        this.isGroupOpen = isGroupOpen;
        this.group = group;
        this.mountainName = mountainName;
    }

    public void addToGroup(Alpinist alpinist) {
        if (isGroupOpen) {
            for (int i = 0; i < group.length; i++) {
                if (group[i] == null) {
                    group[i] = alpinist;
                    System.out.println("Альпинист " + alpinist.getName() + " добавлен в группу");
                    return;
                }
            }
            System.out.println("группа заполнена.");
        } else {

            System.out.println("набор в группу закрыт");
        }
    }

}
