package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jxn {
    static final float a = jsa.b(80.0f);
    public static boolean b = false;
    public final GestureDetector c;
    public final ScaleGestureDetector d;
    public final jxg e;
    public final jxj f;
    public final olt g;
    public final lco h;
    public final View i;
    public final ddf j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public int o;
    public final epi p;
    public int q;
    public final jqr r;
    public final jqt s;
    public final jqs t;
    public final jqv u;
    private final GestureDetector.OnGestureListener v;

    public jxn(jqw jqwVar, jqr jqrVar, jqt jqtVar, jxg jxgVar, jxj jxjVar, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, jqv jqvVar, jqs jqsVar, lco lcoVar, View view, Context context, ddf ddfVar) {
        jxl jxlVar = new jxl(this);
        this.v = jxlVar;
        this.p = new jxm(this);
        this.c = new GestureDetector(jqwVar.a, jxlVar, jqwVar.b);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(jqwVar.a, new jxk(this, onScaleGestureListener, jxgVar), jqwVar.b);
        this.d = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.r = jqrVar;
        this.s = jqtVar;
        jxgVar.getClass();
        this.e = jxgVar;
        this.f = jxjVar;
        this.u = jqvVar;
        this.t = jqsVar;
        this.q = 1;
        this.g = oob.d(jxd.ZOOM, context.getResources().getString(R.string.preference_double_tap_zoom), jxd.SWITCH_CAMERA, context.getResources().getString(R.string.preference_double_tap_switch_camera), jxd.NONE, context.getResources().getString(R.string.preference_double_tap_none));
        this.j = ddfVar;
        this.h = lcoVar;
        this.i = view;
    }

    public static void c() {
        b = false;
    }

    public static void d() {
        b = true;
    }

    public static boolean e(float f) {
        return Math.abs(f) > a;
    }

    public final PointF a(MotionEvent motionEvent) {
        return new jtw(motionEvent, this.i).a();
    }

    public final jxf b() {
        int i = this.q;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
                return this.r;
            case 2:
                return this.s;
            default:
                return jxf.m;
        }
    }
}
