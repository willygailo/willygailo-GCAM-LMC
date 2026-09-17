package defpackage;

import android.media.MediaCodec;
import android.util.Pair;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fse implements Runnable {
    public final /* synthetic */ fsf a;

    public /* synthetic */ fse(fsf fsfVar) {
        this.a = fsfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fsb fsbVar;
        fsf fsfVar = this.a;
        while (fsfVar.k.a() > 0) {
            fvp fvpVar = fsfVar.k;
            synchronized (fvpVar.a) {
                fsa fsaVar = (fsa) fvpVar.a.b();
                fsbVar = null;
                if (fsaVar != null && fsaVar.c()) {
                    fsa fsaVar2 = (fsa) fvpVar.a.c();
                    if (fsaVar2 != null && fsaVar2.c()) {
                        fsbVar = fsaVar2.a;
                    }
                }
            }
            if (fsbVar == null) {
                return;
            }
            boolean z = fps.a;
            List<mou> listB = fsbVar.f.isDone() ? (List) plk.ae(fsbVar.f) : fsfVar.d.b(fsbVar.b, (hjz) plk.ae(fsbVar.c));
            fcy.q(fsfVar.e, fsbVar.b);
            fcy.p(fsfVar.f, fsbVar.b);
            hkn hknVarD = fsfVar.b.d(fsbVar.b);
            if (hknVarD != null) {
                fsfVar.c.b(hknVarD.a);
            }
            if (hknVarD != null) {
                fsfVar.c.c(hknVarD.a);
            }
            fry fryVar = fsfVar.g;
            boolean zE = fryVar.b.e(fryVar.c.k());
            lic licVarA = fryVar.d.a();
            boolean z2 = licVarA == lic.CLOCKWISE_90 || licVarA == lic.CLOCKWISE_270;
            ArrayList arrayList = new ArrayList(listB.size());
            for (mou mouVar : listB) {
                if (zE) {
                    arrayList.add(mouVar.c(z2 ? mou.b : mou.a));
                } else {
                    arrayList.add(mouVar);
                }
            }
            boolean z3 = fps.a;
            boolean z4 = fps.a;
            obr.aQ(fsbVar.d.isDone());
            obr.aQ(fsbVar.c.isDone());
            try {
                fsg fsgVar = fsfVar.h;
                poy poyVarM = psm.h.m();
                float[] fArr = new float[arrayList.size() * 9];
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    float[] fArrD = ((mou) it.next()).d();
                    int i2 = 0;
                    while (i2 < 9) {
                        fArr[i] = fArrD[i2];
                        i2++;
                        i++;
                    }
                }
                List listK = oxh.K(fArr);
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psm psmVar = (psm) poyVarM.b;
                ppj ppjVar = psmVar.b;
                if (!ppjVar.c()) {
                    psmVar.b = ppd.v(ppjVar);
                }
                pnl.e(listK, psmVar.b);
                int i3 = fsbVar.a.a;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psm psmVar2 = (psm) poyVarM.b;
                int i4 = psmVar2.a | 1;
                psmVar2.a = i4;
                psmVar2.c = i3;
                int i5 = fsbVar.a.b;
                psmVar2.a = i4 | 2;
                psmVar2.d = i5;
                long jConvert = TimeUnit.MICROSECONDS.convert(fsbVar.b, TimeUnit.NANOSECONDS);
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psm psmVar3 = (psm) poyVarM.b;
                psmVar3.a |= 4;
                psmVar3.e = jConvert;
                int i6 = 1 != (((MediaCodec.BufferInfo) plk.ae(fsbVar.d)).flags & 1) ? 2 : 3;
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psm psmVar4 = (psm) poyVarM.b;
                psmVar4.f = i6 - 1;
                int i7 = psmVar4.a | 8;
                psmVar4.a = i7;
                switch (fsbVar.h - 1) {
                    case 1:
                        psmVar4.g = 2;
                        psmVar4.a = i7 | 64;
                        break;
                    default:
                        psmVar4.g = 1;
                        psmVar4.a = i7 | 64;
                        break;
                }
                fsgVar.a.g();
                byte[] bArrG = ((psm) poyVarM.j()).g();
                long jConvert2 = TimeUnit.MICROSECONDS.convert(fsbVar.b, TimeUnit.NANOSECONDS);
                int i8 = ((MediaCodec.BufferInfo) plk.ae(fsbVar.d)).flags;
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(0, bArrG.length, jConvert2, i8);
                Pair pairCreate = Pair.create(ByteBuffer.wrap(bArrG), bufferInfo);
                if (fsfVar.l != null) {
                    fsfVar.l.b((ByteBuffer) pairCreate.first, (MediaCodec.BufferInfo) pairCreate.second);
                }
            } catch (IOException e) {
                ((oug) ((oug) ((oug) fsf.a.b()).h(e)).G((char) 1945)).o("Cannot serialize gyro data.");
            }
        }
    }
}
