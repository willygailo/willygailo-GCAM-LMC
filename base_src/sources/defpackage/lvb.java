package defpackage;

import android.hardware.camera2.CaptureResult;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lvb implements lzr {
    private final CaptureResult a;
    private final Map b = new ConcurrentHashMap();

    public lvb(CaptureResult captureResult) {
        this.a = captureResult;
    }

    @Override // defpackage.lzr
    public final int a() {
        return this.a.getSequenceId();
    }

    @Override // defpackage.lzr
    public final long b() {
        return this.a.getFrameNumber();
    }

    @Override // defpackage.lzr
    public final lzq c() {
        return new luy(this.a.getRequest());
    }

    @Override // defpackage.lzr
    public final Object d(CaptureResult.Key key) {
        lva lvaVar = (lva) this.b.get(key);
        if (lvaVar == null) {
            synchronized (this.b) {
                lvaVar = (lva) this.b.get(key);
                if (lvaVar == null) {
                    lvaVar = new lva(this.a, key);
                    this.b.put(key, lvaVar);
                }
            }
        }
        Object obj = lvaVar.d;
        if (obj == lva.a) {
            synchronized (lvaVar) {
                obj = lvaVar.d;
                if (obj == lva.a) {
                    obj = lvaVar.b.get(lvaVar.c);
                    lvaVar.d = obj;
                }
            }
        }
        return obj;
    }

    @Override // defpackage.lzr
    public final String e() {
        try {
            return (String) CaptureResult.class.getDeclaredMethod("getCameraId", new Class[0]).invoke(this.a, new Object[0]);
        } catch (ReflectiveOperationException e) {
            return null;
        }
    }

    @Override // defpackage.lzr
    public final List f() {
        return this.a.getKeys();
    }
}
