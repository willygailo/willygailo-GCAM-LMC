package com.google.android.apps.camera.moments;

import android.hardware.HardwareBuffer;
import defpackage.gan;
import defpackage.geb;
import defpackage.hkg;
import defpackage.hla;
import defpackage.lmr;
import defpackage.pht;
import defpackage.pih;
import java.nio.ByteBuffer;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class MomentsUtils {
    public static pht a(lmr lmrVar) {
        pih pihVarF = pih.f();
        lmrVar.j(new geb(pihVarF));
        return pihVarF;
    }

    public static native HardwareBuffer allocateHardwareBuffer(int i, int i2, int i3, int i4, long j);

    public static boolean b(gan ganVar, hkg hkgVar, Collection collection) {
        if (!ganVar.f().g() && !ganVar.e().g()) {
            return false;
        }
        if (collection.size() <= 0) {
            return true;
        }
        if (ganVar.f().g()) {
            int length = ((hla) ganVar.f().c()).a.length;
        }
        return ganVar.a() >= 0.0f && hkgVar.a(ganVar.d(), collection, true).a > 0.07f;
    }

    public static boolean c(gan ganVar, float f, hkg hkgVar, Collection collection) {
        if (collection.size() < 2) {
            return true;
        }
        if (ganVar.f().g()) {
            int length = ((hla) ganVar.f().c()).a.length;
        }
        return ganVar.a() - f >= -0.02f && hkgVar.a(ganVar.d(), collection, false).a > 0.07f;
    }

    public static native long yuv2hwyuv(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, HardwareBuffer hardwareBuffer);
}
