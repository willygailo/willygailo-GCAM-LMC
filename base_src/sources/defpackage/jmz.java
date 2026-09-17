package defpackage;

import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes2.dex */
final class jmz implements SurfaceHolder.Callback2 {
    final /* synthetic */ jna a;

    public jmz(jna jnaVar) {
        this.a = jnaVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        obr.aQ(!this.a.f);
        this.a.d.e("surfaceChanged");
        lig ligVar = new lig(i2, i3);
        Surface surface = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        lhs lhsVarE = lhs.e(ligVar);
        lis lisVar = this.a.a;
        String strValueOf = String.valueOf(ligVar);
        String strValueOf2 = String.valueOf(lhsVarE);
        int iWidth = surfaceFrame.width();
        int iHeight = surfaceFrame.height();
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 91 + String.valueOf(strValueOf2).length());
        sb.append("SurfaceEvent: surfaceChanged (newSize: ");
        sb.append(strValueOf);
        sb.append(", newRatio: ");
        sb.append(strValueOf2);
        sb.append(", surfaceFrame: ");
        sb.append(iWidth);
        sb.append("x");
        sb.append(iHeight);
        sb.append(")");
        lisVar.b(sb.toString());
        if (!this.a.g.isDone()) {
            jna jnaVar = this.a;
            if (surface.isValid()) {
                lhs lhsVarE2 = lhs.e(ligVar);
                lhs lhsVarD = jnaVar.e.b.d();
                if (obr.bc(lhsVarE2, lhsVarD)) {
                    jna jnaVar2 = this.a;
                    lis lisVar2 = jnaVar2.a;
                    String strValueOf3 = String.valueOf(jnaVar2.e.a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf3).length() + 29);
                    sb2.append("Surface request is set. size=");
                    sb2.append(strValueOf3);
                    lisVar2.f(sb2.toString());
                    this.a.h.i(ijz.VIEWFINDER_SURFACE_READY);
                    this.a.d.e("surfaceRequest.set");
                    this.a.g.o(new jnj(surface, i, new lig(i2, i3).c()));
                    this.a.d.f();
                } else {
                    lis lisVar3 = jnaVar.a;
                    String strValueOf4 = String.valueOf(lhsVarE2.d());
                    String strValueOf5 = String.valueOf(lhsVarD.d());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf4).length() + 47 + String.valueOf(strValueOf5).length());
                    sb3.append("Aspect ratios do not match! surface: ");
                    sb3.append(strValueOf4);
                    sb3.append(" preview: ");
                    sb3.append(strValueOf5);
                    lisVar3.g(sb3.toString());
                }
            }
        }
        this.a.d.f();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        obr.aQ(!this.a.f);
        this.a.h.i(ijz.VIEWFINDER_SURFACE_CREATED);
        this.a.a.b("SurfaceEvent: surfaceCreated");
        if (this.a.g.isDone()) {
            jna jnaVar = this.a;
            lis lisVar = jnaVar.a;
            String strValueOf = String.valueOf(mip.bY(jnaVar.g));
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 55);
            sb.append("surfaceChanged was already called or cancelled? Value: ");
            sb.append(strValueOf);
            lisVar.h(sb.toString());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        obr.aQ(!this.a.f);
        this.a.a.b("SurfaceEvent: surfaceDestroyed");
        jna jnaVar = this.a;
        jnaVar.a("Surface has been destroyed.");
        jnaVar.g = pih.f();
        this.a.h.close();
        if (this.a.c.g()) {
            eur eurVar = ((eua) this.a.c.c()).a;
            if (!eurVar.T.f() || eurVar.T.g()) {
                return;
            }
            eurVar.E = true;
            eurVar.o.p();
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        obr.aQ(!this.a.f);
        this.a.a.b("SurfaceEvent: surfaceRedrawNeeded");
    }
}
