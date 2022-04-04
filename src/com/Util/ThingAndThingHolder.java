package com.Util;

import com.gameobjects.Thing;
import com.gameobjects.ThingHolder;
import com.gameobjects.ThingList;

public class ThingAndThingHolder implements java.io.Serializable{

    private Thing t;
    private ThingHolder th;

    public ThingAndThingHolder(Thing aThing, ThingHolder aThingHolder) {
        t = aThing;
        th = aThingHolder;
    }

    public Thing getThing() {
        return t;
    }

    public void setThing(Thing aThing) {
        this.t = aThing;
    }

    public ThingHolder getThingHolder() {
        return th;
    }

    public void setThingHolder(ThingHolder aThingHolder) {
        this.th = aThingHolder;
    }

    public ThingList getList() {
        return th.getThings();
    }

}

