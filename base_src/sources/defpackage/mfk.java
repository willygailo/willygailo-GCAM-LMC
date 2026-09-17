package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mfk {
    public static final String a = String.format("content://%s/publicvalue/lens_oem_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    public static final String b = String.format("content://%s/publicvalue/ar_stickers_availability", "com.google.android.googlequicksearchbox.GsaPublicContentProvider");
    public static final List c = Collections.unmodifiableList(Arrays.asList("Google"));
    private static final mfx i;
    public final Context d;
    public final PackageManager e;
    public final List f;
    public mfx g;
    public boolean h;

    static {
        poy poyVarM = mfx.f.m();
        if (poyVarM.c) {
            poyVarM.m();
            poyVarM.c = false;
        }
        mfx mfxVar = (mfx) poyVarM.b;
        int i2 = 1 | mfxVar.a;
        mfxVar.a = i2;
        mfxVar.b = "1.2.1";
        int i3 = i2 | 2;
        mfxVar.a = i3;
        mfxVar.c = "";
        mfxVar.d = -1;
        int i4 = i3 | 4;
        mfxVar.a = i4;
        mfxVar.e = -1;
        mfxVar.a = i4 | 8;
        i = (mfx) poyVarM.j();
    }

    public mfk(Context context) {
        PackageManager packageManager = context.getPackageManager();
        this.f = new ArrayList();
        this.d = context;
        this.e = packageManager;
        this.h = false;
        mfx mfxVar = i;
        this.g = mfxVar;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null) {
                poy poyVar = (poy) mfxVar.G(5);
                poyVar.o(mfxVar);
                String str = packageInfo.versionName;
                if (poyVar.c) {
                    poyVar.m();
                    poyVar.c = false;
                }
                mfx mfxVar2 = (mfx) poyVar.b;
                mfx mfxVar3 = mfx.f;
                str.getClass();
                mfxVar2.a |= 2;
                mfxVar2.c = str;
                this.g = (mfx) poyVar.j();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        new mfj(this).execute(new Void[0]);
    }

    public final void a(mfh mfhVar) {
        if (this.h) {
            mfhVar.a(this.g);
        } else {
            this.f.add(mfhVar);
        }
    }
}
