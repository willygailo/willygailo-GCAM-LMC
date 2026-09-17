package defpackage;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class adg {
    static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
        mediaMetadataRetriever.setDataSource(mediaDataSource);
    }

    public static final Object b(aii aiiVar, CancellationSignal cancellationSignal, Callable callable, qlh qlhVar) {
        if (aiiVar.l() && aiiVar.k()) {
            return callable.call();
        }
        aiz aizVar = (aiz) qlhVar.getContext().get(aiz.c);
        qlj qljVarB = aizVar == null ? null : aizVar.a;
        if (qljVarB == null) {
            qljVarB = agq.b(aiiVar);
        }
        qpo qpoVar = new qpo(qmd.c(qlhVar), 1);
        qpoVar.r();
        qpoVar.a(new ahw(cancellationSignal, qmd.l(qqz.a, qljVarB, new ahx(callable, qpoVar, null), 2)));
        Object objG = qpoVar.g();
        if (objG != qlp.COROUTINE_SUSPENDED) {
            return objG;
        }
        qlhVar.getClass();
        return objG;
    }

    public static final Object c(aii aiiVar, Callable callable, qlh qlhVar) {
        if (aiiVar.l() && aiiVar.k()) {
            return callable.call();
        }
        aiz aizVar = (aiz) qlhVar.getContext().get(aiz.c);
        qlj qljVarB = aizVar == null ? null : aizVar.a;
        if (qljVarB == null) {
            qljVarB = agq.b(aiiVar);
        }
        return qmd.k(qljVarB, new ahv(callable, null), qlhVar);
    }

    public static hss d(cle cleVar) {
        ojc ojcVarD = cleVar.d();
        return ojcVarD.g() ? ((hsg) ojcVarD.c()).d : hss.MEDIA_STORE;
    }
}
