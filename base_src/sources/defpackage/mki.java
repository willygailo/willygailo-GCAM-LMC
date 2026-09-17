package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class mki {
    public ojc a = oih.a;
    public Boolean b = false;
    public ojc c = oih.a;
    public ojc d = oih.a;
    public ojc e = oih.a;
    public ojc f = oih.a;
    public ojc g = oih.a;
    public ojc h = oih.a;
    public ojc i = oih.a;
    public ojc j = oih.a;

    public final ByteBuffer a() {
        ByteBuffer byteBufferAx;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        if (this.a.g()) {
            int iIntValue = ((Integer) this.a.c()).intValue();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(200);
            byteBufferAllocate2.putLong(iIntValue);
            byteBufferAx = mip.ax("mfhd", byteBufferAllocate2);
        } else {
            byteBufferAx = mip.ax("mfhd", byteBufferAllocate);
        }
        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(0);
        if (this.b.booleanValue()) {
            nak nakVar = new nak((char[]) null);
            if (this.c.g()) {
                nakVar.a = ojc.i(Integer.valueOf(((Integer) this.c.c()).intValue()));
            }
            if (this.d.g()) {
                nakVar.b = ojc.i(Integer.valueOf(((Integer) this.d.c()).intValue()));
            }
            if (this.e.g()) {
                long jLongValue = ((Long) this.e.c()).longValue();
                ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(200);
                byteBufferAllocate4.putInt(16777216);
                byteBufferAllocate4.putLong(jLongValue);
                byteBufferAllocate = mip.ax("tfdt", byteBufferAllocate4);
            }
            mkh mkhVar = new mkh();
            if (this.f.g()) {
                int iIntValue2 = ((Integer) this.f.c()).intValue();
                if (iIntValue2 != 0 && iIntValue2 != 1) {
                    throw new IllegalArgumentException("The trun version number must be 0 or 1.");
                }
                mkhVar.a = ojc.i(Integer.valueOf(iIntValue2));
            }
            if (this.h.g()) {
                mkhVar.c = ojc.i(Integer.valueOf(((Integer) this.h.c()).intValue()));
            }
            if (this.g.g()) {
                int iIntValue3 = ((Integer) this.g.c()).intValue();
                if (iIntValue3 < 0) {
                    throw new IllegalArgumentException("The trun sample count must be non-negative.");
                }
                mkhVar.b = ojc.i(Integer.valueOf(iIntValue3));
            }
            if (this.i.g()) {
                mkhVar.d = ojc.i((List) this.i.c());
            }
            if (this.j.g()) {
                mkhVar.e = ojc.i((List) this.j.c());
            }
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(200);
            if (!nakVar.a.g()) {
                nakVar.a = ojc.i(65536);
            }
            byteBufferAllocate5.putInt(((Integer) nakVar.a.c()).intValue());
            if (nakVar.b.g()) {
                byteBufferAllocate5.putInt(((Integer) nakVar.b.c()).intValue());
            }
            byteBufferArr[0] = mip.ax("tfhd", byteBufferAllocate5);
            byteBufferArr[1] = byteBufferAllocate;
            ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate((true != mkhVar.c.g() ? 0 : 4) + 8 + (mkhVar.d.g() ? ((Integer) mkhVar.b.c()).intValue() * 4 : 0) + (mkhVar.e.g() ? ((Integer) mkhVar.b.c()).intValue() * 4 : 0));
            if (!mkhVar.a.g()) {
                throw new IllegalArgumentException("Version field is required in a 'trun' box and must be set");
            }
            if (((Integer) mkhVar.a.c()).intValue() != 1 && ((Integer) mkhVar.a.c()).intValue() != 0) {
                throw new IllegalArgumentException("The trun version number must be 0 or 1.");
            }
            byteBufferAllocate6.putInt((((Integer) mkhVar.a.c()).intValue() << 24) | (mkhVar.c.g() ? 1 : 0) | (true != mkhVar.d.g() ? 0 : 256) | (true != mkhVar.e.g() ? 0 : 512));
            if (!mkhVar.b.g()) {
                throw new IllegalArgumentException("Sample count field is required in a 'trun' box and must be set");
            }
            if (((Integer) mkhVar.b.c()).intValue() < 0) {
                throw new IllegalArgumentException("The trun sample count must be non-negative.");
            }
            if (mkhVar.d.g() && ((List) mkhVar.d.c()).size() != ((Integer) mkhVar.b.c()).intValue()) {
                throw new IllegalArgumentException("Number of samples does not match number of sample durations");
            }
            if (mkhVar.e.g() && ((List) mkhVar.e.c()).size() != ((Integer) mkhVar.b.c()).intValue()) {
                throw new IllegalArgumentException("Number of samples does not match number of sample sizes");
            }
            byteBufferAllocate6.putInt(((Integer) mkhVar.b.c()).intValue());
            if (mkhVar.c.g()) {
                byteBufferAllocate6.putInt(((Integer) mkhVar.c.c()).intValue());
            }
            if (mkhVar.b.g()) {
                for (int i = 0; i < ((Integer) mkhVar.b.c()).intValue(); i++) {
                    if (mkhVar.d.g()) {
                        byteBufferAllocate6.putInt(((Integer) ((List) mkhVar.d.c()).get(i)).intValue());
                    }
                    if (mkhVar.e.g()) {
                        byteBufferAllocate6.putInt(((Integer) ((List) mkhVar.e.c()).get(i)).intValue());
                    }
                }
            }
            byteBufferArr[2] = mip.ax("trun", byteBufferAllocate6);
            byteBufferAllocate3 = mip.aw("traf", Arrays.asList(byteBufferArr));
        }
        return mip.aw("moof", Arrays.asList(byteBufferAx, byteBufferAllocate3));
    }
}
