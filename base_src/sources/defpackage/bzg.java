package defpackage;

import android.content.SharedPreferences;
import android.support.constraint.ConstraintLayout;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class bzg {
    public final lce a;
    public final bzo b;
    public final cae c;
    public final bzn d;
    public final ifn e;
    private final SharedPreferences f;
    private final caa g;

    public bzg(SharedPreferences sharedPreferences, lce lceVar, bzo bzoVar, cae caeVar, bzn bznVar, caa caaVar, ifn ifnVar) {
        this.f = sharedPreferences;
        this.a = lceVar;
        this.b = bzoVar;
        this.c = caeVar;
        this.d = bznVar;
        this.g = caaVar;
        this.e = ifnVar;
    }

    public final void a() {
        caa caaVar = this.g;
        if (caaVar.g) {
            caaVar.e.post(new bzz(caaVar, 1));
        }
    }

    public final void b() {
        this.f.edit().putBoolean("autotimer_tutorial_shown", true).apply();
    }

    public final void c() {
        if (f() && g()) {
            caa caaVar = this.g;
            if (!caaVar.g) {
                caaVar.e = (ConstraintLayout) caaVar.b.c(R.id.camera_app_root);
                caaVar.c = new cac(caaVar.a);
                caaVar.d = new bzy(caaVar.a);
                caaVar.e.addView(caaVar.c);
                caaVar.e.addView(caaVar.d);
                jcb jcbVar = (jcb) caaVar.c.getLayoutParams();
                jcbVar.Z = 2;
                caaVar.c.setLayoutParams(jcbVar);
                jcb jcbVar2 = (jcb) caaVar.d.getLayoutParams();
                jcbVar2.Z = 3;
                caaVar.d.setLayoutParams(jcbVar2);
                caaVar.c.setOnTouchListener(caaVar.f);
                caaVar.g = true;
            }
            caaVar.e.post(new bzz(caaVar, 0));
            caa caaVar2 = this.g;
            caaVar2.f = new View.OnTouchListener() { // from class: bzf
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    bzg bzgVar = this.a;
                    bzgVar.b();
                    bzgVar.a();
                    return false;
                }
            };
            if (caaVar2.g) {
                caaVar2.c.setOnTouchListener(caaVar2.f);
            }
        }
    }

    public final void d(bzp bzpVar) {
        Object obj = this.a.d;
        this.a.fB(bzpVar);
    }

    public final boolean e() {
        return this.a.d == bzp.CAPTURING;
    }

    public final boolean f() {
        return this.a.d != bzp.DISABLED;
    }

    public final boolean g() {
        return !this.f.getBoolean("autotimer_tutorial_shown", false);
    }
}
