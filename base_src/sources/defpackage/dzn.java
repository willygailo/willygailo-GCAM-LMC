package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes.dex */
final class dzn implements ebq {
    final /* synthetic */ ecp a;
    final /* synthetic */ dzu b;
    final /* synthetic */ dzr c;

    public dzn(dzr dzrVar, ecp ecpVar, dzu dzuVar) {
        this.c = dzrVar;
        this.a = ecpVar;
        this.b = dzuVar;
    }

    @Override // defpackage.ebq
    public final void a(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        this.c.i.e("RgbHardwareCallback");
        ecp ecpVar = this.a;
        ecpVar.c = hardwareBuffer;
        ecpVar.d = shotMetadata;
        this.c.b(this.b, ecpVar.a());
        this.c.i.f();
    }
}
