package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iuf {
    private final AccessibilityManager a;

    public iuf(AccessibilityManager accessibilityManager) {
        this.a = accessibilityManager;
    }

    public final boolean a() {
        if (!this.a.isTouchExplorationEnabled()) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.a.getEnabledAccessibilityServiceList(-1);
            if (enabledAccessibilityServiceList == null) {
                return false;
            }
            Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
            while (it.hasNext()) {
                String id = it.next().getId();
                if (enabledAccessibilityServiceList.size() == 1 && id.endsWith("com.google.android.accessibility.accessibilitymenu.AccessibilityMenuService")) {
                    return false;
                }
                if (id == null || id.startsWith("com.google.android.apps.userpanel") || !id.startsWith("com.google")) {
                }
            }
            return false;
        }
        return true;
    }
}
