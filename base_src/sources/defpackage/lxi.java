package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.libraries.camera.jni.graphics.HardwareBuffers;
import com.google.android.libraries.camera.jni.graphics.HardwarePixels;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lxi implements mad {
    public final long a;
    private final HardwareBuffer b;
    private final HardwarePixels c;
    private volatile Rect d;

    public lxi(HardwareBuffer hardwareBuffer, long j) {
        HardwarePixels hardwarePixels;
        hardwareBuffer.getClass();
        this.b = hardwareBuffer;
        if (HardwareBuffers.lockingIsSupported()) {
            obr.aR(HardwareBuffers.lockingIsSupported(), "Locking is not supported on this build!");
            hardwarePixels = new HardwarePixels(hardwareBuffer);
        } else {
            hardwarePixels = null;
        }
        this.c = hardwarePixels;
        this.a = j;
        this.d = new Rect(0, 0, hardwareBuffer.getWidth(), hardwareBuffer.getHeight());
    }

    @Override // defpackage.mad
    public final int a() {
        switch (this.b.getFormat()) {
            case 1:
            case 2:
                return 1;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 35;
            default:
                return 34;
        }
    }

    @Override // defpackage.mad
    public final int b() {
        return this.b.getHeight();
    }

    @Override // defpackage.mad
    public final int c() {
        return this.b.getWidth();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        HardwarePixels hardwarePixels = this.c;
        if (hardwarePixels != null) {
            hardwarePixels.close();
        }
        synchronized (this.b) {
            this.b.close();
        }
    }

    @Override // defpackage.mad
    public final long d() {
        return this.a;
    }

    @Override // defpackage.mad
    public final Rect e() {
        return new Rect(this.d);
    }

    @Override // defpackage.mad
    public final HardwareBuffer f() {
        synchronized (this.b) {
            if (this.b.isClosed()) {
                return null;
            }
            return HardwareBuffers.fork(this.b);
        }
    }

    @Override // defpackage.mad
    public final List g() {
        HardwarePixels hardwarePixels = this.c;
        if (hardwarePixels == null) {
            return oom.l();
        }
        int iNativePlaneCount = HardwarePixels.nativePlaneCount(hardwarePixels.b);
        if (iNativePlaneCount < 0) {
            throw new UnsupportedOperationException("This Android version does not support image plane access!");
        }
        ArrayList arrayList = new ArrayList(iNativePlaneCount);
        for (int i = 0; i < iNativePlaneCount; i++) {
            arrayList.add(new lxj(hardwarePixels, i, hardwarePixels.a.getHeight()));
        }
        return arrayList;
    }

    @Override // defpackage.mad
    public final void h(Rect rect) {
        this.d = new Rect(rect);
    }

    @Override // defpackage.mad
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.lzl
    public final kkm j() {
        return kkm.b();
    }
}
