package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class jdy {
    public final List h;

    public jdy() {
        this.h = new ArrayList();
    }

    public jdy(ddf ddfVar, Context context) {
        this();
        this.h.add(new jdz(esn.ACTION, context.getResources().getString(R.string.moblur_action_title), context.getResources().getString(R.string.moblur_action_acc_desc)));
        ddi ddiVar = ddt.a;
        ddfVar.b();
        this.h.add(new jdz(esn.LANDSCAPE, context.getResources().getString(R.string.moblur_landscape_title), context.getResources().getString(R.string.moblur_landscape_acc_desc)));
    }

    public jdy(ghx ghxVar) {
        List listS = ghxVar.s();
        this.h = listS;
        obr.aQ(listS.contains(new lig(0, 0)));
    }

    public jdy(List list) {
        this.h = list;
    }

    public jdy(jrl jrlVar) {
        if (kcz.k != null) {
            this.h = oom.m(mip.be(kcz.k, Integer.valueOf(jrlVar == jrl.IMAGE_INTENT ? 0 : 1)));
        } else {
            this.h = oom.l();
        }
    }

    public jdy(lco lcoVar, jrl jrlVar) {
        lwc lwcVar = (lwc) ((lct) lcoVar).a;
        ooh oohVar = new ooh();
        ope opeVarU = fvq.u(jrlVar);
        if (opeVarU.isEmpty()) {
            int i = 1;
            if (lwcVar != lwc.FULL && lwcVar != lwc.SIMPLE && lwcVar != lwc.EXTENDED) {
                i = 0;
            }
            oohVar.g(mip.be(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(i)));
        } else {
            oohVar.h(opeVarU);
        }
        this.h = oohVar.f();
    }

    public jdy(byte[] bArr) {
        this.h = new ArrayList();
    }

    public jdy(byte[] bArr, byte[] bArr2) {
        this.h = new ArrayList();
    }

    public jdy(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.h = new ArrayList();
    }

    public jdy(byte[] bArr, char[] cArr) {
        this.h = new ArrayList();
    }

    public jdy(char[] cArr) {
        this.h = new ArrayList();
    }

    public jdy(char[] cArr, byte[] bArr) {
        this.h = new ArrayList();
    }

    public jdy(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.h = new ArrayList();
    }

    public jdy(short[] sArr) {
        this.h = new ArrayList();
    }

    public jdy(short[] sArr, byte[] bArr) {
        this.h = new ArrayList();
    }

    public final boolean b(CaptureResult.Key key, Object obj) {
        return c(key, obj);
    }

    @SafeVarargs
    public final boolean c(CaptureResult.Key key, Object... objArr) {
        obr.aF(objArr.length > 0);
        HashSet hashSet = new HashSet(Arrays.asList(objArr));
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(((lzv) it.next()).d(key))) {
                return false;
            }
        }
        return true;
    }

    public final synchronized List d() {
        return Collections.unmodifiableList(this.h);
    }

    public final synchronized void e(mlq mlqVar) {
        this.h.add(mlqVar);
    }

    public final synchronized lie f(final fmp fmpVar) {
        final byte[] bArr;
        final byte[] bArr2;
        final byte[] bArr3;
        this.h.add(fmpVar);
        bArr = null;
        bArr2 = null;
        bArr3 = null;
        return new lie(fmpVar, bArr, bArr2, bArr3) { // from class: fmn
            public final /* synthetic */ fmp a;

            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                jdy jdyVar = this.b;
                fmp fmpVar2 = this.a;
                synchronized (jdyVar) {
                    jdyVar.h.remove(fmpVar2);
                }
            }
        };
    }

    public final synchronized ojc g() {
        return ojc.h((fmp) ohh.u(this.h, null));
    }

    public final void h() {
        synchronized (this.h) {
            for (bwt bwtVar : this.h) {
                bwtVar.a.fB(bwtVar.b);
            }
        }
    }

    public final void i(lda ldaVar) {
        synchronized (this.h) {
            this.h.add(new bwt(ldaVar));
        }
    }

    public final synchronized azw j(Class cls) {
        azw azwVar;
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            bkn bknVar = (bkn) this.h.get(i);
            if (bknVar.a.isAssignableFrom(cls)) {
                azwVar = bknVar.b;
            }
        }
        azwVar = null;
        return azwVar;
    }

    public final synchronized void k(Class cls, azw azwVar) {
        this.h.add(new bkn(cls, azwVar));
    }

    public final synchronized List l() {
        return this.h;
    }

    public final synchronized void m(azg azgVar) {
        this.h.add(azgVar);
    }

    public final synchronized aze n(Class cls) {
        aze azeVar;
        for (bki bkiVar : this.h) {
            if (bkiVar.a.isAssignableFrom(cls)) {
                azeVar = bkiVar.b;
            }
        }
        azeVar = null;
        return azeVar;
    }

    public final synchronized void o(Class cls, aze azeVar) {
        this.h.add(new bki(cls, azeVar));
    }

    public final synchronized bjg p(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return bji.a;
        }
        for (bjh bjhVar : this.h) {
            if (bjhVar.a(cls, cls2)) {
                return bjhVar.c;
            }
        }
        String strValueOf = String.valueOf(cls);
        String strValueOf2 = String.valueOf(cls2);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47 + String.valueOf(strValueOf2).length());
        sb.append("No transcoder registered to transcode from ");
        sb.append(strValueOf);
        sb.append(" to ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final synchronized List q(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (bjh bjhVar : this.h) {
            if (bjhVar.a(cls, cls2) && !arrayList.contains(bjhVar.b)) {
                arrayList.add(bjhVar.b);
            }
        }
        return arrayList;
    }

    public final synchronized void r(Class cls, Class cls2, bjg bjgVar) {
        this.h.add(new bjh(cls, cls2, bjgVar));
    }
}
