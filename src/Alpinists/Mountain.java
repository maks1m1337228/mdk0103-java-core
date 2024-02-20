package Alpinists;

import Alpinists.Alpinist;

public class Mountain {
    boolean isGroupOpen;
    String name;
    String country;
    double height;
    Alpinists.Alpinist[] group;

    public Mountain(String name, String country, double height, boolean isGroupOpen, Alpinists.Alpinist[] alpinists) {
        this.name = name;
        this.country = country;
        this.height = height;
        this.isGroupOpen = isGroupOpen;
        this.group = alpinists;
    }

    public void addToGroup(Alpinists.Alpinist alpinist) {
        if (isGroupOpen) {
            Alpinists.Alpinist[] newGroup = new Alpinists.Alpinist[group.length + 1];
            System.arraycopy(group, 0, newGroup, 0, group.length);
            newGroup[group.length] = alpinist;
            group = newGroup;
        } else {
            System.out.println("Набор в группу закрыт!");
        }
    }
}
