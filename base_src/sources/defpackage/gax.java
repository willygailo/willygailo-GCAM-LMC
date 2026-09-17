package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* JADX INFO: loaded from: classes.dex */
final class gax implements geo {
    final /* synthetic */ lwk a;
    final /* synthetic */ gfi b;
    final /* synthetic */ long c;
    final /* synthetic */ lzv d;
    final /* synthetic */ mad e;
    final /* synthetic */ mad f;
    final /* synthetic */ gex g;
    final /* synthetic */ lis h;
    final /* synthetic */ gay i;

    public gax(gay gayVar, lwk lwkVar, gfi gfiVar, long j, lzv lzvVar, mad madVar, mad madVar2, gex gexVar, lis lisVar) {
        this.i = gayVar;
        this.a = lwkVar;
        this.b = gfiVar;
        this.c = j;
        this.d = lzvVar;
        this.e = madVar;
        this.f = madVar2;
        this.g = gexVar;
        this.h = lisVar;
    }

    private final mad e(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        return this.i.a.b(new gcm(this.b.a, Long.valueOf(this.c), plk.V(this.d), this.b.b), hardwareBuffer, shotMetadata);
    }

    @Override // defpackage.geo
    public final void a(RuntimeException runtimeException) {
        this.a.l();
        this.f.close();
        this.h.e("Couldn't retrieve Rgb result from FastMomentsHdr", runtimeException);
        this.g.b(runtimeException);
    }

    @Override // defpackage.geo
    public final void b(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        this.a.l();
        mad madVarE = e(hardwareBuffer, shotMetadata);
        this.f.close();
        this.g.c(madVarE);
    }

    @Override // defpackage.geo
    public final void c(YuvImage yuvImage, ShotMetadata shotMetadata) {
        this.a.l();
        mad madVarA = this.i.a.a(new gcm(this.b.a, Long.valueOf(this.c), plk.V(this.d), this.b.b), yuvImage, this.e, shotMetadata);
        this.f.close();
        this.g.c(madVarA);
    }

    @Override // defpackage.geo
    public final void d(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        this.a.l();
        mad madVarE = e(hardwareBuffer, shotMetadata);
        this.f.close();
        this.g.c(madVarE);
    }
}
