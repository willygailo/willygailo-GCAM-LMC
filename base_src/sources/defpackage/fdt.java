package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fdt {
    public ArrayList a;
    public final feg b;
    public long c;
    public feh d;
    public final Point e;
    public int f = 0;
    public boolean g;
    public boolean h;
    public boolean i;

    public fdt(Context context, feg fegVar, int i, int i2) {
        this.g = false;
        this.h = false;
        this.i = false;
        try {
            this.d = new feh();
        } catch (fcq e) {
            e.printStackTrace();
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        int[] iArr = {R.drawable.focus_quadrant_4, R.drawable.focus_quadrant_1, R.drawable.focus_quadrant_2, R.drawable.focus_quadrant_3, R.drawable.focus_quadrant_4};
        this.a.clear();
        for (int i3 = 0; i3 < 5; i3++) {
            this.a.add(i3, new fct());
            ((fct) this.a.get(i3)).g(context, iArr[i3], 4.0f);
            ((fct) this.a.get(i3)).e = this.d;
        }
        this.b = fegVar;
        this.e = new Point((i / 2) - (((fct) this.a.get(0)).g.x / 2), (i2 / 2) - (((fct) this.a.get(0)).g.y / 2));
        this.h = false;
        this.g = false;
        this.i = true;
    }

    public final void a() {
        this.f = 0;
        if (this.g) {
            feg fegVar = this.b;
            int i = fegVar.i;
            float[] fArrE = fegVar.e();
            double dElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.c;
            Double.isNaN(dElapsedRealtimeNanos);
            fcz.w(fArrE, i, (int) (dElapsedRealtimeNanos / 1000000.0d));
            this.g = false;
        }
    }
}
