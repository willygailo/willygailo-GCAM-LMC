package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fey implements ImageProxy {
    private final mad a;

    public fey(mad madVar) {
        this.a = madVar;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final Rect getCropRect() {
        return this.a.e();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final int getFormat() {
        return this.a.a();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final HardwareBuffer getHardwareBuffer() {
        return this.a.f();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final int getHeight() {
        return this.a.b();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final List getPlanes() {
        List listG = this.a.g();
        ooh oohVar = new ooh();
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            oohVar.g(new fex((mac) it.next()));
        }
        return oohVar.f();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final long getTimestamp() {
        return this.a.d();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final int getWidth() {
        return this.a.c();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final void setCropRect(Rect rect) {
        this.a.h(rect);
    }
}
