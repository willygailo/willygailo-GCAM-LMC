package defpackage;

import android.content.Context;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class ndd implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public ndd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public ndd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public ndd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public ndd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public ndd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public ndd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public ndd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                return new ndc(((emp) this.a).a(), ((pyw) this.b).get(), ((pyw) this.c).get());
            case 1:
                return new nct((Random) this.c.get(), (ncd) this.a.get(), (mdf) this.b.get());
            case 2:
                return new nds(((emp) this.a).a(), (ojc) ((pyt) this.b).a, ((ndp) this.c).get(), lzg.b());
            case 3:
                return new nnz((npf) this.a.get(), (mdf) this.b.get(), (nrm) this.c.get());
            case 4:
                return new noc((npz) this.c.get(), (noy) this.a.get(), (nrm) this.b.get());
            case 5:
                F250RoomDatabase f250RoomDatabase = (F250RoomDatabase) this.b.get();
                qbt qbtVar = (qbt) this.c.get();
                ohh ohhVar = (ohh) this.a.get();
                f250RoomDatabase.getClass();
                qbtVar.getClass();
                ohhVar.getClass();
                return new ohh();
            case 6:
                Context applicationContext = ((Context) ((ojc) ((pyt) this.b).a).a((ojc) ((pyt) this.c).a).a(((evv) this.a).a()).c()).getApplicationContext();
                applicationContext.getClass();
                return applicationContext;
            case 7:
                return new nsb(pyr.a(this.c), (nrm) this.b.get(), (mdf) this.a.get());
            default:
                return new odt((oed) this.c.get(), (oem) this.b.get(), ((odw) this.a).get());
        }
    }
}
