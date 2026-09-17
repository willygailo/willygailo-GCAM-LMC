package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: loaded from: classes2.dex */
public final class nsp extends ani {
    final /* synthetic */ nsn a;
    final /* synthetic */ nrt b;

    public nsp(nsn nsnVar, nrt nrtVar) {
        this.a = nsnVar;
        this.b = nrtVar;
    }

    @Override // defpackage.ani
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        if (!qno.c(str, F250Worker.class.getName())) {
            if (!qno.c(str, F250AutoWorker.class.getName())) {
                return null;
            }
            nrt nrtVar = this.b;
            mdf mdfVar = (mdf) nrtVar.a.get();
            mdfVar.getClass();
            nrm nrmVar = (nrm) nrtVar.b.get();
            nrmVar.getClass();
            nnz nnzVar = (nnz) nrtVar.c.get();
            nnzVar.getClass();
            nsv nsvVar = ((nsw) nrtVar.d).get();
            nom nomVar = (nom) nrtVar.e.get();
            nomVar.getClass();
            nrk nrkVar = (nrk) nrtVar.f.get();
            nrkVar.getClass();
            qqf qqfVar = (qqf) nrtVar.g.get();
            qqfVar.getClass();
            Context context2 = (Context) nrtVar.h.get();
            context2.getClass();
            return new F250AutoWorker(mdfVar, nrmVar, nnzVar, nsvVar, nomVar, nrkVar, qqfVar, context2, workerParameters);
        }
        nsn nsnVar = this.a;
        mdf mdfVar2 = (mdf) nsnVar.a.get();
        mdfVar2.getClass();
        nou nouVar = (nou) nsnVar.b.get();
        nouVar.getClass();
        noq noqVar = (noq) nsnVar.c.get();
        noqVar.getClass();
        nth nthVar = (nth) nsnVar.d.get();
        nthVar.getClass();
        nrm nrmVar2 = (nrm) nsnVar.e.get();
        nrmVar2.getClass();
        nsr nsrVar = ((nss) nsnVar.f).get();
        Integer num = (Integer) nsnVar.g.get();
        num.getClass();
        int iIntValue = num.intValue();
        qqf qqfVar2 = (qqf) nsnVar.h.get();
        qqfVar2.getClass();
        Context context3 = (Context) nsnVar.i.get();
        context3.getClass();
        return new F250Worker(mdfVar2, nouVar, noqVar, nthVar, nrmVar2, nsrVar, iIntValue, qqfVar2, context3, workerParameters);
    }
}
