package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.jni.microvideotonemap.MicrovideoToneMapNative;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fue {
    public static final ouj a = ouj.h("com/google/android/apps/camera/microvideo/tonemap/MeanVarianceToneMapParameterExtractor");
    public final pih b;

    public fue(Executor executor, final pht phtVar, final pht phtVar2, pih pihVar) {
        this.b = pihVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(phtVar);
        arrayList.add(phtVar2);
        plk.ab(arrayList).d(new Runnable() { // from class: fuc
            @Override // java.lang.Runnable
            public final void run() {
                fue fueVar = this.a;
                pht phtVar3 = phtVar;
                pht phtVar4 = phtVar2;
                mad madVar = (mad) plk.ae(phtVar3);
                Bitmap bitmap = (Bitmap) plk.ae(phtVar4);
                if (bitmap == null || madVar == null) {
                    ((oug) ((oug) fue.a.c()).G((char) 1954)).o("Skip tone mapping extraction, either shutter frame or postview bitmap is null.");
                    return;
                }
                poy poyVarM = psv.c.m();
                System.currentTimeMillis();
                int iC = madVar.c();
                int iB = madVar.b();
                mac macVar = (mac) madVar.g().get(0);
                mac macVar2 = (mac) madVar.g().get(1);
                mac macVar3 = (mac) madVar.g().get(2);
                ByteBuffer byteBufferC = enl.c(iC, iB, macVar);
                int i = iC / 2;
                int i2 = iB / 2;
                ByteBuffer byteBufferC2 = enl.c(i, i2, macVar2);
                ByteBuffer byteBufferC3 = enl.c(i, i2, macVar3);
                System.currentTimeMillis();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i3 = width * height;
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i3);
                int i4 = i3 / 4;
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i4);
                ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(i4);
                if (MicrovideoToneMapNative.argbToYuv(bitmap, byteBufferAllocateDirect, byteBufferAllocateDirect2, byteBufferAllocateDirect3) != 0) {
                    throw new IllegalStateException("MicrovideoToneMapNative.argbToYuv failed.");
                }
                System.currentTimeMillis();
                byte[] bArrExtractMeanVarianceMappingNative = MicrovideoToneMapNative.extractMeanVarianceMappingNative(iC, iB, byteBufferC, byteBufferC2, byteBufferC3, width, height, byteBufferAllocateDirect, byteBufferAllocateDirect2, byteBufferAllocateDirect3, 3, 4);
                poy poyVarM2 = psq.e.m();
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                psq psqVar = (psq) poyVarM2.b;
                int i5 = psqVar.a | 1;
                psqVar.a = i5;
                psqVar.b = 3;
                psqVar.a = i5 | 2;
                psqVar.c = 4;
                poc pocVarT = poc.t(bArrExtractMeanVarianceMappingNative);
                if (poyVarM2.c) {
                    poyVarM2.m();
                    poyVarM2.c = false;
                }
                psq psqVar2 = (psq) poyVarM2.b;
                psqVar2.a |= 4;
                psqVar2.d = pocVarT;
                psq psqVar3 = (psq) poyVarM2.j();
                System.currentTimeMillis();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                psv psvVar = (psv) poyVarM.b;
                psqVar3.getClass();
                psvVar.b = psqVar3;
                psvVar.a |= 1;
                fueVar.b.o((psv) poyVarM.j());
                madVar.close();
            }
        }, executor);
    }
}
