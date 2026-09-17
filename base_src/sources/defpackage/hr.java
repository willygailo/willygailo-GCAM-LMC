package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public final class hr {
    public static void a(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void b(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "LOCAL";
            case 2:
                return "REMOTE";
            case 3:
                return "DATA_DISK_CACHE";
            case 4:
                return "RESOURCE_DISK_CACHE";
            case 5:
                return "MEMORY_CACHE";
            default:
                return "null";
        }
    }
}
