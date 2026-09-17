package androidx.window.layout;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public interface ExtensionInterfaceCompat {

    /* JADX INFO: loaded from: classes2.dex */
    public interface ExtensionCallbackInterface {
        void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo);
    }

    void onWindowLayoutChangeListenerAdded(Activity activity);

    void onWindowLayoutChangeListenerRemoved(Activity activity);

    void setExtensionCallback(ExtensionCallbackInterface extensionCallbackInterface);

    boolean validateExtensionInterface();
}
