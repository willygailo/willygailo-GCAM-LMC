package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class gut extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ OptionsMenuView a;
    private boolean b;

    public gut(OptionsMenuView optionsMenuView) {
        this.a = optionsMenuView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        OptionsMenuView optionsMenuView = this.a;
        this.b = optionsMenuView.getChildAt(optionsMenuView.getChildCount() + (-1)).getBottom() - (optionsMenuView.getHeight() + optionsMenuView.getScrollY()) == 0;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r3.getHeight() < ((r3.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.options_menu_internal_list).getHeight() + r3.getPaddingTop()) + r3.getPaddingBottom())) goto L24;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r3, android.view.MotionEvent r4, float r5, float r6) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L87
            if (r4 != 0) goto L7
            goto L87
        L7:
            jrz r1 = defpackage.jrz.PORTRAIT
            com.google.android.apps.camera.optionsbar.view.OptionsMenuView r1 = r2.a
            jrz r1 = r1.i
            int r1 = r1.ordinal()
            switch(r1) {
                case 1: goto L31;
                case 2: goto L23;
                default: goto L14;
            }
        L14:
            float r3 = r3.getY()
            float r4 = r4.getY()
            float r4 = r3 - r4
            float r3 = java.lang.Math.abs(r6)
            goto L3f
        L23:
            float r4 = r4.getX()
            float r3 = r3.getX()
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r5)
            goto L3f
        L31:
            float r3 = r3.getX()
            float r4 = r4.getX()
            float r4 = r3 - r4
            float r3 = java.lang.Math.abs(r5)
        L3f:
            r5 = 1117782016(0x42a00000, float:80.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L86
            r4 = 1133903872(0x43960000, float:300.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L86
            jrz r3 = defpackage.jrz.PORTRAIT
            com.google.android.apps.camera.optionsbar.view.OptionsMenuView r4 = r2.a
            jrz r4 = r4.i
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L79
            boolean r3 = r2.b
            if (r3 != 0) goto L79
            com.google.android.apps.camera.optionsbar.view.OptionsMenuView r3 = r2.a
            r4 = 2131427872(0x7f0b0220, float:1.8477373E38)
            android.view.View r4 = r3.findViewById(r4)
            int r4 = r4.getHeight()
            int r5 = r3.getHeight()
            int r6 = r3.getPaddingTop()
            int r4 = r4 + r6
            int r3 = r3.getPaddingBottom()
            int r4 = r4 + r3
            if (r5 >= r4) goto L79
            goto L86
        L79:
            r2.b = r0
            com.google.android.apps.camera.optionsbar.view.OptionsMenuView r3 = r2.a
            gug r3 = r3.m
            com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer r3 = r3.a
            r3.s()
            r3 = 1
            return r3
        L86:
            return r0
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gut.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
