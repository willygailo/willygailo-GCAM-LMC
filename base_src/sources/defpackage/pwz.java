package defpackage;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class pwz {
    static final ozn a;
    static ozn b;
    public static final ozn c;

    static {
        poy poyVarM = ozn.u.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ozn oznVar = (ozn) poyVarM.b;
        int i = oznVar.a | 2;
        oznVar.a = i;
        oznVar.b = true;
        int i2 = i | 4;
        oznVar.a = i2;
        oznVar.c = true;
        int i3 = i2 | 512;
        oznVar.a = i3;
        oznVar.j = true;
        int i4 = i3 | 8;
        oznVar.a = i4;
        oznVar.d = true;
        int i5 = i4 | 16;
        oznVar.a = i5;
        oznVar.e = true;
        oznVar.f = 1;
        oznVar.a = i5 | 32;
        ozl ozlVar = ozl.a;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ozn oznVar2 = (ozn) poyVarM.b;
        ozlVar.getClass();
        oznVar2.g = ozlVar;
        int i6 = oznVar2.a | 64;
        oznVar2.a = i6;
        int i7 = i6 | 128;
        oznVar2.a = i7;
        oznVar2.h = true;
        int i8 = i7 | 256;
        oznVar2.a = i8;
        oznVar2.i = true;
        int i9 = i8 | 1024;
        oznVar2.a = i9;
        oznVar2.k = true;
        int i10 = i9 | 2048;
        oznVar2.a = i10;
        oznVar2.l = true;
        int i11 = i10 | 32768;
        oznVar2.a = i11;
        oznVar2.o = true;
        int i12 = i11 | 4096;
        oznVar2.a = i12;
        oznVar2.m = true;
        oznVar2.a = i12 | 8192;
        oznVar2.n = true;
        ozm ozmVar = ozm.a;
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        ozn oznVar3 = (ozn) poyVarM.b;
        ozmVar.getClass();
        oznVar3.p = ozmVar;
        int i13 = oznVar3.a | 65536;
        oznVar3.a = i13;
        int i14 = i13 | 262144;
        oznVar3.a = i14;
        oznVar3.r = true;
        int i15 = i14 | 131072;
        oznVar3.a = i15;
        oznVar3.q = true;
        int i16 = i15 | 524288;
        oznVar3.a = i16;
        oznVar3.s = true;
        oznVar3.a = i16 | 1048576;
        oznVar3.t = true;
        ozn.b(oznVar3);
        a = (ozn) poyVarM.j();
        poy poyVarM2 = ozn.u.m();
        if (poyVarM2.c) {
            poyVarM2.m();
            poyVarM2.c = false;
        }
        ozn oznVar4 = (ozn) poyVarM2.b;
        int i17 = oznVar4.a | 2;
        oznVar4.a = i17;
        oznVar4.b = false;
        int i18 = i17 | 4;
        oznVar4.a = i18;
        oznVar4.c = false;
        int i19 = i18 | 512;
        oznVar4.a = i19;
        oznVar4.j = false;
        int i20 = i19 | 8;
        oznVar4.a = i20;
        oznVar4.d = false;
        int i21 = i20 | 16;
        oznVar4.a = i21;
        oznVar4.e = false;
        oznVar4.f = 3;
        int i22 = i21 | 32;
        oznVar4.a = i22;
        int i23 = i22 | 128;
        oznVar4.a = i23;
        oznVar4.h = false;
        int i24 = i23 | 256;
        oznVar4.a = i24;
        oznVar4.i = false;
        int i25 = i24 | 1024;
        oznVar4.a = i25;
        oznVar4.k = false;
        int i26 = i25 | 2048;
        oznVar4.a = i26;
        oznVar4.l = false;
        int i27 = i26 | 32768;
        oznVar4.a = i27;
        oznVar4.o = false;
        int i28 = i27 | 4096;
        oznVar4.a = i28;
        oznVar4.m = false;
        int i29 = i28 | 8192;
        oznVar4.a = i29;
        oznVar4.n = false;
        int i30 = i29 | 262144;
        oznVar4.a = i30;
        oznVar4.r = false;
        int i31 = i30 | 131072;
        oznVar4.a = i31;
        oznVar4.q = false;
        int i32 = i31 | 524288;
        oznVar4.a = i32;
        oznVar4.s = false;
        oznVar4.a = i32 | 1048576;
        oznVar4.t = false;
        ozn.b(oznVar4);
        c = (ozn) poyVarM2.j();
    }

    public static ozn a(Context context) {
        synchronized (pwz.class) {
            ozn oznVar = b;
            if (oznVar != null) {
                return oznVar;
            }
            pwo pwoVarAi = plk.ai(context);
            poy poyVarM = pxg.d.m();
            ozn oznVar2 = a;
            if (poyVarM.c) {
                poyVarM.m();
                poyVarM.c = false;
            }
            pxg pxgVar = (pxg) poyVarM.b;
            oznVar2.getClass();
            pxgVar.c = oznVar2;
            int i = pxgVar.a | 2;
            pxgVar.a = i;
            pxgVar.a = i | 1;
            pxgVar.b = "1.218.0";
            ozn oznVarA = pwoVarAi.a((pxg) poyVarM.j());
            if (oznVarA == null) {
                Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
                oznVarA = c;
            } else {
                String.valueOf(String.valueOf(oznVarA)).length();
            }
            synchronized (pwz.class) {
                b = oznVarA;
            }
            pwoVarAi.e();
            return b;
        }
    }
}
