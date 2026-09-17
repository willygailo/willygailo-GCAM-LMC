package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class fqf implements fqd {
    public final lis a;
    private final pih g = pih.f();
    public final HashMap b = new HashMap();
    private final List h = new ArrayList();
    public long c = 0;
    public long d = -1;
    private long i = 0;
    public long e = 0;
    public boolean f = false;

    public fqf(lis lisVar, String str) {
        String strC = oje.c(str);
        this.a = lisVar.a(strC.length() != 0 ? "CCTrack".concat(strC) : new String("CCTrack"));
    }

    @Override // defpackage.mln
    public final void a(pht phtVar) {
        this.g.e(phtVar);
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        lis lisVar = this.a;
        long j = bufferInfo.presentationTimeUs;
        StringBuilder sb = new StringBuilder(38);
        sb.append("writesampledata <");
        sb.append(j);
        sb.append(">");
        lisVar.g(sb.toString());
        mss mssVarA = mss.a(byteBuffer, bufferInfo);
        synchronized (this) {
            this.c = mssVarA.b.presentationTimeUs;
            long j2 = this.e;
            this.e = 1 + j2;
            this.b.put(Long.valueOf(j2), mssVarA);
            for (fqe fqeVar : this.h) {
                if (bufferInfo.presentationTimeUs >= fqeVar.a && bufferInfo.presentationTimeUs <= fqeVar.b) {
                    fqeVar.c(mssVarA, j2);
                }
                fqeVar.b();
            }
        }
    }

    @Override // defpackage.fqd
    public final synchronized void c() {
        String string = this.g.isDone() ? this.g.isCancelled() ? "CANCELLED" : ((MediaFormat) plk.ae(this.g)).getString("mime") : "WAITING";
        lis lisVar = this.a;
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = string;
        objArr[1] = Integer.valueOf(this.b.size());
        objArr[2] = this.b.isEmpty() ? "n/a" : this.b.get(Long.valueOf(this.d + 1));
        objArr[3] = this.b.isEmpty() ? "n/a" : this.b.get(Long.valueOf(this.e - 1));
        objArr[4] = Long.valueOf(this.c);
        lisVar.b(String.format(locale, "mime %s, %d entries, span: <%s> - <%s> available to %d", objArr));
        for (fqe fqeVar : this.h) {
            lis lisVar2 = this.a;
            Locale locale2 = Locale.US;
            Object[] objArr2 = new Object[4];
            objArr2[0] = Long.valueOf(fqeVar.c);
            objArr2[1] = Long.valueOf(fqeVar.b);
            objArr2[2] = true != fqeVar.e ? "NO" : "YES";
            objArr2[3] = true != fqeVar.d ? "NO" : "YES";
            lisVar2.b(String.format(locale2, "   tr: wrote to index <%d>  can write <%d>  closed %s  willclose %s", objArr2));
        }
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f = true;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((fqe) it.next()).b();
        }
    }

    @Override // defpackage.fqd
    public final synchronized void d(long j) {
        while (true) {
            long j2 = this.d + 1;
            if (j2 == this.e) {
                break;
            }
            HashMap map = this.b;
            Long lValueOf = Long.valueOf(j2);
            mss mssVar = (mss) map.get(lValueOf);
            mssVar.getClass();
            if (mssVar.b.presentationTimeUs > j) {
                break;
            }
            this.b.remove(lValueOf);
            this.i = mssVar.b.presentationTimeUs;
            this.d++;
        }
        ArrayList arrayList = new ArrayList();
        for (fqe fqeVar : this.h) {
            if (fqeVar.e) {
                arrayList.add(fqeVar);
            }
        }
        this.h.removeAll(arrayList);
    }

    @Override // defpackage.fqd
    public final synchronized fqe e(mln mlnVar, long j) {
        fqe fqeVar;
        obr.aR(j >= this.i, "Requesting packets that were dropped already");
        fqeVar = new fqe(this, mlnVar, j);
        mlnVar.a(this.g);
        this.h.add(fqeVar);
        return fqeVar;
    }
}
