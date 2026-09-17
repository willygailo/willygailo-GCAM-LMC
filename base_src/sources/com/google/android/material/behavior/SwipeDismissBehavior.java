package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aae;
import defpackage.aca;
import defpackage.acb;
import defpackage.gl;
import defpackage.ha;
import defpackage.nxj;
import defpackage.nxk;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior extends aae {
    public acb a;
    private boolean f;
    public int b = 2;
    public float c = 0.5f;
    public float d = 0.0f;
    public float e = 0.5f;
    private final aca g = new nxj(this);

    public static float y(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // defpackage.aae
    public boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM = this.f;
        switch (motionEvent.getActionMasked()) {
            case 0:
                zM = coordinatorLayout.m(view, (int) motionEvent.getX(), (int) motionEvent.getY());
                this.f = zM;
                break;
            case 1:
            case 3:
                this.f = false;
                break;
        }
        if (!zM) {
            return false;
        }
        if (this.a == null) {
            this.a = acb.b(coordinatorLayout, this.g);
        }
        return this.a.j(motionEvent);
    }

    @Override // defpackage.aae
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (gl.d(view) != 0) {
            return false;
        }
        gl.M(view, 1);
        gl.C(view, 1048576);
        if (!x(view)) {
            return false;
        }
        gl.ab(view, ha.f, new nxk(this));
        return false;
    }

    @Override // defpackage.aae
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        acb acbVar = this.a;
        if (acbVar == null) {
            return false;
        }
        acbVar.e(motionEvent);
        return true;
    }

    public boolean x(View view) {
        return true;
    }
}
