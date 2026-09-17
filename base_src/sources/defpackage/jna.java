package defpackage;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;

/* JADX INFO: loaded from: classes2.dex */
public final class jna implements lie {
    private static int i = 0;
    public final lis a;
    public final SurfaceView b;
    public final ojc c;
    public final ljf d;
    public final jnl e;
    public boolean f = false;
    public pih g;
    public final ijs h;
    private final FrameLayout j;
    private final SurfaceHolder.Callback2 k;

    public jna(Context context, lir lirVar, jns jnsVar, CameraActivityTiming cameraActivityTiming, ijn ijnVar, jnl jnlVar, ddf ddfVar, ljf ljfVar, ojc ojcVar, jnb jnbVar) {
        FrameLayout frameLayout = jnsVar.d;
        this.j = frameLayout;
        SurfaceView surfaceView = new SurfaceView(context);
        this.b = surfaceView;
        this.e = jnlVar;
        this.d = ljfVar;
        this.h = (ijs) ijnVar.a();
        this.c = ojcVar;
        int i2 = i;
        i = i2 + 1;
        StringBuilder sb = new StringBuilder(23);
        sb.append("ViewfinderSV");
        sb.append(i2);
        this.a = lirVar.a(sb.toString());
        SurfaceHolder holder = surfaceView.getHolder();
        ojc ojcVar2 = jnlVar.c;
        this.g = pih.f();
        jmz jmzVar = new jmz(this);
        this.k = jmzVar;
        holder.addCallback(jmzVar);
        holder.addCallback(jnbVar);
        lig ligVar = jnlVar.a;
        holder.setFixedSize(ligVar.a, ligVar.b);
        if (ddfVar.k(ddl.aU) && jnlVar.b.equals(lhs.b)) {
            surfaceView.setBackground(context.getResources().getDrawable(R.drawable.viewfinder_rounded_background, null));
            surfaceView.setClipToOutline(true);
        }
        frameLayout.addView(surfaceView, new FrameLayout.LayoutParams(-1, -1));
        cameraActivityTiming.j(ijf.ACTIVITY_SURFACE_VIEW_CREATED, CameraActivityTiming.a);
    }

    public final void a(String str) {
        lar.a();
        pih pihVar = this.g;
        if (pihVar == null || pihVar.isDone()) {
            return;
        }
        lis lisVar = this.a;
        lisVar.getClass();
        lisVar.b(str.length() != 0 ? "Previous request exists, returning exception. Reason: ".concat(str) : new String("Previous request exists, returning exception. Reason: "));
        this.g.a(new llv(str));
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        lar.a();
        a("Closed");
        this.b.getHolder().removeCallback(this.k);
        this.j.removeView(this.b);
        this.f = true;
    }
}
