package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
final class lsv extends lsu {
    private final lzx a;

    public lsv(lui luiVar, Surface surface, OutputConfiguration outputConfiguration) {
        super(luiVar, plk.V(surface));
        this.a = outputConfiguration == null ? null : new lvl(outputConfiguration);
    }

    public static lsv b(lui luiVar, Surface surface) {
        return new lsv(luiVar, surface, lsw.a(luiVar, surface));
    }

    @Override // defpackage.lsu
    public final lzx a() {
        return this.a;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 15);
        sb.append("SurfaceConfig<");
        sb.append(strValueOf);
        sb.append(">");
        return sb.toString();
    }
}
