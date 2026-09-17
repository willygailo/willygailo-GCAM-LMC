package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lvl implements lzx {
    private final Object a = new Object();
    private final OutputConfiguration b;

    public lvl(OutputConfiguration outputConfiguration) {
        this.b = outputConfiguration;
    }

    @Override // defpackage.lzx
    public final List a() {
        List<Surface> surfaces;
        synchronized (this.a) {
            surfaces = this.b.getSurfaces();
        }
        return surfaces;
    }

    @Override // defpackage.lzl
    public final kkm j() {
        kkm kkmVar;
        synchronized (this.a) {
            kkmVar = new kkm(this.b);
        }
        return kkmVar;
    }

    public final String toString() {
        String string;
        synchronized (this.a) {
            ojb ojbVarBa = obr.ba("AndroidOutputConfiguration");
            ojbVarBa.b("outputConfiguration", this.b);
            string = ojbVarBa.toString();
        }
        return string;
    }
}
