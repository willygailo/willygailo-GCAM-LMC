package com.google.android.apps.camera.bottombar;

/* JADX INFO: loaded from: classes.dex */
public interface AnimatedImageButton {
    int getState();

    void setOnPreChangeListener(OnStateChangeListener onStateChangeListener);

    void setOnStateChangeListener(OnStateChangeListener onStateChangeListener);

    void setState(int i, boolean z);

    void setStateAnimated(int i, boolean z);
}
