package defpackage;

import android.content.Context;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class knu extends kij {
    private static final kif a;
    private static final mip b;

    static {
        knt kntVar = new knt();
        b = kntVar;
        a = new kif("ClientTelemetry.API", kntVar, null, null, null, null, null);
    }

    public knu(Context context, knn knnVar) {
        super(context, a, knnVar, kii.a);
    }

    public final void a(final knm knmVar) {
        kli kliVarA = klj.a();
        kliVarA.b = new khk[]{khh.a};
        kliVarA.b();
        kliVarA.a = new klb() { // from class: kns
            @Override // defpackage.klb
            public final void a(Object obj, Object obj2) {
                knm knmVar2 = knmVar;
                knr knrVar = (knr) ((knv) obj).u();
                Parcel parcelA = knrVar.a();
                bmp.c(parcelA, knmVar2);
                knrVar.A(1, parcelA);
                ((kvm) obj2).b(null);
            }
        };
        m(kliVarA.a());
    }
}
