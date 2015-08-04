package cl.monsoon.s1next.util;

import android.os.Looper;

import com.google.common.base.Preconditions;

public final class LooperUtil {

    /**
     * Enforce the method caller on main thread.
     */
    public static void enforceOnMainThread() {
        Preconditions.checkState(Looper.myLooper() == Looper.getMainLooper(),
                "Must be called on the main thread.");
    }
}