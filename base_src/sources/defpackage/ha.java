package defpackage;

import android.R;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class ha {
    public static final ha a;
    public static final ha b;
    public static final ha c;
    public static final ha d;
    public static final ha e;
    public static final ha f;
    public static final ha g;
    public static final ha h;
    final Object i;
    public final int j;
    public final Class k;
    public final hj l;

    static {
        new ha(1);
        new ha(2);
        new ha(4);
        new ha(8);
        a = new ha(16);
        new ha(32);
        new ha(64);
        new ha(128);
        new ha(256, hc.class);
        new ha(512, hc.class);
        new ha(1024, hd.class);
        new ha(2048, hd.class);
        b = new ha(4096);
        c = new ha(8192);
        new ha(16384);
        new ha(32768);
        new ha(65536);
        new ha(131072, hh.class);
        d = new ha(262144);
        e = new ha(524288);
        f = new ha(1048576);
        new ha(2097152, hi.class);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, hf.class);
        g = new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        h = new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, hg.class);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, he.class);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        try {
            new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, R.id.accessibilityActionPressAndHold, null, null, null);
        } catch (Throwable unused) {
        }
        try {
            new ha(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, R.id.accessibilityActionImeEnter, null, null, null);
        } catch (Throwable unused2) {
        }
    }

    public ha(int i) {
        this(null, i, null, null, null);
    }

    private ha(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public ha(Object obj, int i, CharSequence charSequence, hj hjVar, Class cls) {
        this.j = i;
        this.l = hjVar;
        this.i = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.k = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.i).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.i).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof ha) && this.i.equals(((ha) obj).i);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }
}
