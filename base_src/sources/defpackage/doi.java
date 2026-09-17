package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class doi implements dot {
    public final Executor a;
    private final ddf b;
    private final lis c;
    private final mpi d;
    private long e = 0;
    private final gjw f;

    public doi(gjw gjwVar, Executor executor, jtx jtxVar, ddf ddfVar, lis lisVar, byte[] bArr, byte[] bArr2) {
        this.f = gjwVar;
        this.a = executor;
        this.b = ddfVar;
        this.d = jtxVar.h("vesper");
        this.c = lisVar.a("GpuFBCtrl");
    }

    @Override // defpackage.dot
    public final pht a(dos dosVar) {
        return !dosVar.b.b() ? plk.V(new dod(dosVar.a)) : this.f.a(new doh(this, dosVar));
    }

    public final synchronized dor b(dos dosVar) {
        int i;
        long jCreateRetoucher = this.e;
        if (jCreateRetoucher == 0) {
            htf htfVar = dosVar.b;
            ddf ddfVar = this.b;
            ddi ddiVar = dda.a;
            ddfVar.e();
            htf htfVar2 = htf.OFF;
            switch (htfVar.ordinal()) {
                case 1:
                case 2:
                case 3:
                    i = 1;
                    break;
                default:
                    i = 0;
                    break;
            }
            jCreateRetoucher = GpuRetoucherNative.createRetoucher(true, i);
            this.e = jCreateRetoucher;
        }
        obr.aQ(jCreateRetoucher != 0);
        HardwareBuffer hardwareBufferF = dosVar.a.f();
        try {
            hardwareBufferF.getClass();
            boolean z = hardwareBufferF.getFormat() == 1;
            hardwareBufferF.close();
            dov dovVarA = dov.a(dosVar.c);
            if (dovVarA.a.isEmpty()) {
                return new dod(dosVar.a);
            }
            HardwareBuffer hardwareBufferF2 = dosVar.a.f();
            try {
                hardwareBufferF2.getClass();
                lis lisVar = this.c;
                int iC = dosVar.a.c();
                int iB = dosVar.a.b();
                StringBuilder sb = new StringBuilder(70);
                sb.append("Running GPU face retouch on an image of size ");
                sb.append(iC);
                sb.append(" x ");
                sb.append(iB);
                lisVar.g(sb.toString());
                long j = this.e;
                boolean z2 = !z;
                int iC2 = dosVar.a.c();
                int iB2 = dosVar.a.b();
                Object[] array = dovVarA.a.toArray();
                float f = dovVarA.b;
                htf htfVar3 = dosVar.b;
                htfVar3.getClass();
                GpuRetoucherNative.process(j, hardwareBufferF2, z2, hardwareBufferF2, z2, iC2, iB2, array, f, htfVar3.f);
                hardwareBufferF2.close();
                return new doc(dosVar.a, null, dosVar.b);
            } catch (Throwable th) {
                if (hardwareBufferF2 == null) {
                    throw th;
                }
                try {
                    hardwareBufferF2.close();
                    throw th;
                } catch (Throwable th2) {
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (hardwareBufferF == null) {
                throw th3;
            }
            try {
                hardwareBufferF.close();
                throw th3;
            } catch (Throwable th4) {
                throw th3;
            }
        }
    }

    public final synchronized void c() {
        long j = this.e;
        if (j != 0) {
            GpuRetoucherNative.releaseRetoucher(j);
            this.e = 0L;
        }
        this.d.close();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.a.execute(new Runnable() { // from class: dof
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c();
            }
        });
    }
}
