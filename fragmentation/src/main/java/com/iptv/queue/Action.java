package com.iptv.queue;

import android.support.v4.app.FragmentManager;

/**
 * Created by YoKey on 17/12/28.
 */

public abstract class Action {
    public static final int BUFFER_TIME = 60;

    public static final int ACTION_NORMAL = 0;
    public static final int ACTION_POP = 1;
    public static final int ACTION_POP_MOCK = 2;
    public static final int ACTION_BACK = 3;

    public FragmentManager fragmentManager;
    public int action = ACTION_NORMAL;
    public long duration = 0;

    public Action() {
    }

    public Action(int action) {
        this.action = action;
        if (action == ACTION_POP_MOCK) {
            duration = BUFFER_TIME;
        }
    }

    public Action(int action, FragmentManager fragmentManager) {
        this(action);
        this.fragmentManager = fragmentManager;
    }

    public abstract void run();
}
