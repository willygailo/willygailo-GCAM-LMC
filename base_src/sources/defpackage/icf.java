package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class icf {
    public static final /* synthetic */ int d = 0;
    private static final ope e = ope.I(idn.a.getPackageName(), idn.b.getPackageName());
    public final idt a;
    public final Context b;
    public final bue c;
    private final hnx f;
    private final boolean g;
    private final ddf h;
    private final Map i = new ArrayMap();
    private final Map j = new ArrayMap();
    private final hub k;
    private final huf l;
    private final hug m;

    public icf(idt idtVar, Context context, hnx hnxVar, boolean z, bue bueVar, ddf ddfVar, hub hubVar, huf hufVar, hug hugVar) {
        this.a = idtVar;
        this.b = context;
        this.f = hnxVar;
        this.g = z;
        this.c = bueVar;
        this.h = ddfVar;
        this.k = hubVar;
        this.l = hufVar;
        this.m = hugVar;
    }

    public static Predicate a(Function function) {
        return new idg(new ConcurrentHashMap(), function, 1);
    }

    public static String b(bty btyVar) {
        String strI = btyVar.a().i();
        if (!TextUtils.isEmpty(strI)) {
            return strI;
        }
        bua buaVar = bua.CAMERA_PREVIEW;
        switch (btyVar.b().ordinal()) {
            case 1:
            case 5:
                return "image/*";
            case 2:
                return "video/*";
            case 3:
            case 4:
            default:
                return "*/*";
        }
    }

    public final boolean c(String str) {
        hub hubVar = this.k;
        idm idmVar = (idm) this.a.a().get(str);
        idmVar.getClass();
        return hubVar.m(idmVar.b());
    }

    public final ResolveInfo d(int i) {
        ice iceVar = new ice(this, i);
        ((ResolveInfo) iceVar).activityInfo = new ActivityInfo();
        ((ResolveInfo) iceVar).activityInfo.packageName = this.b.getPackageName();
        ActivityInfo activityInfo = ((ResolveInfo) iceVar).activityInfo;
        ddf ddfVar = this.h;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        activityInfo.name = "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity";
        return iceVar;
    }

    final int e(bty btyVar) {
        boolean z = false;
        if (!((Boolean) this.l.c(htu.B)).booleanValue() && !((Boolean) this.l.c(htu.C)).booleanValue()) {
            ojc ojcVarH = ojc.h((Boolean) this.j.get("image/*"));
            ojc ojcVarH2 = ojc.h((Boolean) this.j.get("video/*"));
            if (!ojcVarH.g()) {
                ojcVarH = ojc.i(Boolean.valueOf(this.a.j("image/*")));
                this.j.put("image/*", (Boolean) ((ojj) ojcVarH).a);
            }
            if (!ojcVarH2.g()) {
                ojcVarH2 = ojc.i(Boolean.valueOf(this.a.j("video/*")));
                this.j.put("video/*", (Boolean) ((ojj) ojcVarH2).a);
            }
            if (((Boolean) ojcVarH.c()).booleanValue() || ((Boolean) ojcVarH2.c()).booleanValue()) {
                this.m.e(htu.z, true);
                z = true;
            } else {
                this.m.e(htu.z, false);
            }
        }
        if (!((Boolean) this.l.c(htu.z)).booleanValue() || btyVar == null) {
            return 2;
        }
        if (!z) {
            String strB = b(btyVar);
            Boolean boolValueOf = (Boolean) this.i.get(strB);
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(this.a.i(strB));
                this.i.put(strB, boolValueOf);
            }
            if (!boolValueOf.booleanValue()) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009d A[Catch: ActivityNotFoundException -> 0x00a3, TRY_LEAVE, TryCatch #0 {ActivityNotFoundException -> 0x00a3, blocks: (B:19:0x008f, B:21:0x0093, B:22:0x009d), top: B:28:0x008f }] */
    final int f(ResolveInfo resolveInfo, bty btyVar) {
        Uri uriC = btyVar.a().c();
        String strB = b(btyVar);
        Context context = this.b;
        ddf ddfVar = this.h;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        boolean z = false;
        int i = 1;
        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) && "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity".equals(resolveInfo.activityInfo.name)) {
            z = true;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (this.h.k(ddl.aJ) && e.contains(resolveInfo.activityInfo.packageName) && this.b.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.internal.camera.imageobfuscator") != null) {
            intent.setClassName("com.google.android.apps.internal.camera.imageobfuscator", ".activities.SharingActivity");
        } else {
            intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (z) {
            intent.putExtra("pref_open_setting_page", "pref_category_social_share");
            intent.putExtra("pref_make_setting_page_root", true);
            i = 3;
        } else {
            intent.setType(strB);
            intent.putExtra("android.intent.extra.STREAM", uriC);
            intent.addFlags(268435457);
        }
        if (z) {
            try {
                if (this.g) {
                    this.f.g(intent);
                } else {
                    ((Activity) this.b).startActivityForResult(intent, 1000);
                }
            } catch (ActivityNotFoundException e2) {
                return 2;
            }
        } else {
            this.f.g(intent);
        }
        return i;
    }
}
