package defpackage;

import android.view.Surface;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes.dex */
final class fyt implements SurfaceHolder.Callback {
    final /* synthetic */ fyx a;

    public fyt(fyx fyxVar) {
        this.a = fyxVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        lnx lnxVar = this.a.g;
        Surface surface = surfaceHolder.getSurface();
        lig ligVarH = lig.h(i2, i3);
        this.a.f = ligVarH;
        if (lnxVar != null) {
            if (lnxVar.b().e().equals(ligVarH.e())) {
                try {
                    lnxVar.d(surface);
                    return;
                } catch (IllegalArgumentException e) {
                    this.a.b.e("Surface change failed!", e);
                    return;
                }
            }
            lis lisVar = this.a.b;
            String strValueOf = String.valueOf(lnxVar);
            String strValueOf2 = String.valueOf(lnxVar.b());
            String strValueOf3 = String.valueOf(ligVarH);
            int length = String.valueOf(strValueOf).length();
            StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
            sb.append("Ignoring surface changed: ");
            sb.append(strValueOf);
            sb.append(" is ");
            sb.append(strValueOf2);
            sb.append(" and the surface is ");
            sb.append(strValueOf3);
            lisVar.h(sb.toString());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        fyx fyxVar = this.a;
        fyxVar.f = null;
        lnx lnxVar = fyxVar.g;
        if (lnxVar != null) {
            lnxVar.d(null);
        }
    }
}
