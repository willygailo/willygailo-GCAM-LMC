package defpackage;

import android.content.Context;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase;
import java.io.File;
import java.util.Random;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class naf implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public naf(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return new nae(this.a);
            case 1:
                return ope.H((mxo) this.a.get());
            case 2:
                ojc ojcVar = (ojc) ((pyt) this.a).a;
                nak nakVar = new nak((byte[]) null);
                return (nal) ojcVar.e(new nal(nakVar.a, nakVar.b));
            case 3:
                return new ncd((Random) this.a.get());
            case 4:
                Object objH = nds.c((ojc) ((pyt) this.a).a) ? ope.H(lzg.b()) : orx.a;
                qmd.ae(objH);
                return objH;
            case 5:
                return new nnu((nrm) this.a.get());
            case 6:
                return new noq((noc) this.a.get());
            case 7:
                return new ohh(this.a);
            case 8:
                File file = (File) this.a.get();
                file.getClass();
                return new nov(file);
            case 9:
                Context context = (Context) this.a.get();
                context.getClass();
                File filesDir = context.getFilesDir();
                filesDir.getClass();
                return qnm.c(filesDir, "f250");
            case 10:
                return new nox(this.a);
            case 11:
                F250RoomDatabase f250RoomDatabase = (F250RoomDatabase) this.a.get();
                f250RoomDatabase.getClass();
                noy noyVarR = f250RoomDatabase.r();
                qmd.ae(noyVarR);
                return noyVarR;
            case 12:
                F250RoomDatabase f250RoomDatabase2 = (F250RoomDatabase) this.a.get();
                f250RoomDatabase2.getClass();
                npf npfVarS = f250RoomDatabase2.s();
                qmd.ae(npfVarS);
                return npfVarS;
            case 13:
                F250RoomDatabase f250RoomDatabase3 = (F250RoomDatabase) this.a.get();
                f250RoomDatabase3.getClass();
                nql nqlVarU = f250RoomDatabase3.u();
                qmd.ae(nqlVarU);
                return nqlVarU;
            case 14:
                F250RoomDatabase f250RoomDatabase4 = (F250RoomDatabase) this.a.get();
                f250RoomDatabase4.getClass();
                npz npzVarT = f250RoomDatabase4.t();
                qmd.ae(npzVarT);
                return npzVarT;
            case 15:
                kfq kfqVar = (kfq) this.a.get();
                kfqVar.getClass();
                return new nrf(kfqVar);
            case 16:
                return (qqf) ((ojc) ((pyt) this.a).a).e(qqq.b);
            case 17:
                qqf qqfVar = (qqf) this.a.get();
                qqfVar.getClass();
                qqx qqxVar = qqfVar instanceof qqx ? (qqx) qqfVar : null;
                Executor qqpVar = qqxVar == null ? new qqp(qqfVar) : qqxVar.c();
                qmd.ae(qqpVar);
                return qqpVar;
            case 18:
                Executor executor = (Executor) this.a.get();
                executor.getClass();
                return qka.a(executor);
            case 19:
                Context context2 = (Context) this.a.get();
                context2.getClass();
                return aof.e(context2);
            default:
                return new ohh((plk) this.a.get(), null, null, null);
        }
    }
}
