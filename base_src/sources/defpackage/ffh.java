package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.util.Log;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.libraries.lens.lenslite.api.KeyguardDismisser;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import com.google.android.libraries.lens.lenslite.api.LinkConfig;
import com.google.android.libraries.lens.lenslite.api.LinkEventListener;
import com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion;
import com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffh {
    public final /* synthetic */ fgb a;
    public final /* synthetic */ iay b;

    public /* synthetic */ ffh(fgb fgbVar, iay iayVar) {
        this.a = fgbVar;
        this.b = iayVar;
    }

    public final void a(final jch jchVar) {
        final fgb fgbVar = this.a;
        final iay iayVar = this.b;
        fgbVar.d.execute(new Runnable() { // from class: ffl
            /* JADX WARN: Code duplicated, block: B:23:0x008d  */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                boolean z;
                boolean z2;
                boolean zJ;
                final fgb fgbVar2 = fgbVar;
                jch jchVar2 = jchVar;
                final iay iayVar2 = iayVar;
                final LinkConfig.Builder builder = LinkConfig.builder();
                mgp mgpVar = (mgp) builder;
                mgpVar.s = 2;
                mgpVar.l = 10;
                final int i2 = 1;
                final int i3 = 0;
                if (fgbVar2.c.k(ddp.f)) {
                    i = 1;
                } else {
                    fgbVar2.c.d();
                    i = 0;
                }
                mgpVar.g = Integer.valueOf(i ^ 1);
                mgpVar.o = true;
                mgpVar.q = Boolean.valueOf(fgbVar2.c.k(ddp.h) && jchVar2.a);
                mgpVar.f = jchVar2.b;
                if (fgbVar2.c.k(ddp.i)) {
                    mhy mhyVarC = fgbVar2.c();
                    if (mhyVarC == mhy.PLAYGROUND_ONLY) {
                        zJ = khx.j(fgbVar2.C.i(), 2, 10);
                    } else if (mhyVarC == mhy.ARCORE_ONLY) {
                        zJ = khx.j(fgbVar2.C.h("com.google.ar.core"), 1, 18);
                    } else {
                        z = false;
                    }
                    z = zJ;
                } else {
                    z = false;
                }
                mgpVar.D = Boolean.valueOf(z);
                mgpVar.E = Boolean.valueOf(fgbVar2.c.k(ddp.m));
                mgpVar.a = Boolean.valueOf(fgbVar2.c.k(ddp.g));
                if (fgbVar2.c.k(ddp.z)) {
                    z2 = fgbVar2.g();
                } else {
                    fgbVar2.c.d();
                    z2 = false;
                }
                mgpVar.v = Boolean.valueOf(!z2);
                mgpVar.m = Boolean.valueOf(fgbVar2.c.k(ddp.j));
                mgpVar.c = Boolean.valueOf(fgbVar2.h);
                mgpVar.n = fgbVar2.j.fM();
                mgpVar.F = Boolean.valueOf(fgbVar2.g);
                mgpVar.p = true;
                mgpVar.r = true;
                builder.a(fgbVar2.c());
                mgpVar.t = Boolean.valueOf(fgbVar2.c() == mhy.ARCORE_ONLY);
                mgpVar.y = Long.valueOf(fgbVar2.c.a(ddp.a).g() ? ((Integer) fgbVar2.c.a(ddp.a).c()).intValue() : 0L);
                try {
                    Context context = fgbVar2.a;
                    mgr mgrVar = new mgr() { // from class: ffw
                        @Override // defpackage.mgr
                        public final LinkConfig a() {
                            return builder.build();
                        }
                    };
                    mhr mhrVar = new mhr();
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    mhrVar.a = applicationContext;
                    mhrVar.b = mgrVar;
                    qmd.ad(mhrVar.a, Context.class);
                    qmd.ad(mhrVar.b, mgr.class);
                    Context context2 = mhrVar.a;
                    mgr mgrVar2 = mhrVar.b;
                    pys pysVarA = pyt.a(context2);
                    mhq mhqVar = new mhq(pyt.a(mgrVar2), 0);
                    pys pysVar = pyw.a;
                    List listAh = qmd.ah(1);
                    List listAh2 = qmd.ah(0);
                    qmd.ac(mhqVar, listAh);
                    pyw pywVarAa = qmd.aa(listAh, listAh2);
                    String[] strArr = mhw.a;
                    mhu mhuVar = new mhu(context2, new mhm(pysVarA, pywVarAa), mgrVar2);
                    ArrayList arrayList = new ArrayList();
                    mhy mhyVar = ((mgq) mgrVar2.a()).a;
                    ojc ojcVarI = oih.a;
                    if (mhyVar == mhy.ARCORE_ONLY) {
                        Collections.addAll(arrayList, mhw.a);
                        arrayList.add("com.google.ar.core");
                    } else if (mhyVar == mhy.PLAYGROUND_ONLY) {
                        Collections.addAll(arrayList, mhw.a);
                        arrayList.add("com.google.vr.apps.ornament");
                    } else if (mhyVar == mhy.ENABLED) {
                        Collections.addAll(arrayList, mhw.a);
                        arrayList.add("com.google.vr.apps.ornament");
                        arrayList.add("com.google.ar.core");
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                Log.w("EngineApiLoaderContr", "All remote package attempts fail.");
                                ojcVarI = oih.a;
                                break;
                            }
                            String str = (String) it.next();
                            try {
                                ojcVarI = ojc.i(mhv.a(mhuVar.a(str), str));
                                String.format("EngineApi loaded from %s", str);
                                break;
                            } catch (mho e) {
                                String.format("No package found: %s.", str);
                            } catch (mhn e2) {
                                String.format("Failed to load engine api from remote package: %1$s. %2$s. ", str, e2.getMessage());
                            }
                        }
                    }
                    if (!ojcVarI.g()) {
                        try {
                            ojcVarI = ojc.i(mhv.a(mhuVar.a(context2.getPackageName()), context2.getPackageName()));
                        } catch (mhn e3) {
                        }
                    }
                    if (!ojcVarI.g()) {
                        Log.w("EngineApiLoaderContr", "EngineApi implementation not found");
                    }
                    if (!ojcVarI.g()) {
                        throw new RuntimeException("No engine implementation found");
                    }
                    fgbVar2.n = new mgs(((mhv) ojcVarI.c()).a, context.getApplicationContext(), ((mhv) ojcVarI.c()).b);
                    String str2 = "";
                    if (fgbVar2.c.k(ddp.n)) {
                        mgs mgsVar = fgbVar2.n;
                        mgsVar.getClass();
                        fgbVar2.v = String.valueOf(mgsVar.a() >= ((long) ApiVersion.VERSION_8.getVersionCode()) ? mgsVar.a.startLinkLogging("", 6) : null);
                    }
                    fjs fjsVar = fgbVar2.l;
                    poy poyVarM = pco.f.m();
                    String str3 = fgbVar2.v;
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pco pcoVar = (pco) poyVarM.b;
                    str3.getClass();
                    pcoVar.a |= 8;
                    pcoVar.e = str3;
                    poy poyVarM2 = pcp.f.m();
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pcp pcpVar = (pcp) poyVarM2.b;
                    pcpVar.b = 1;
                    pcpVar.a |= 1;
                    int i4 = true != fgbVar2.c.k(ddp.i) ? 3 : 2;
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pcp pcpVar2 = (pcp) poyVarM2.b;
                    pcpVar2.c = i4 - 1;
                    int i5 = 2 | pcpVar2.a;
                    pcpVar2.a = i5;
                    mgs mgsVar2 = fgbVar2.n;
                    String str4 = mgsVar2.c;
                    pcpVar2.a = i5 | 4;
                    pcpVar2.d = str4;
                    try {
                        str2 = mgsVar2.b.getPackageManager().getPackageInfo(mgsVar2.c, 0).versionName;
                    } catch (PackageManager.NameNotFoundException e4) {
                        Object[] objArr = new Object[0];
                        if (Log.isLoggable("LinkEngineApi", 6)) {
                            Log.e("LinkEngineApi", mip.D("Read host package version name failure", objArr), e4);
                        }
                    }
                    if (poyVarM2.c) {
                        poyVarM2.m();
                        poyVarM2.c = false;
                    }
                    pcp pcpVar3 = (pcp) poyVarM2.b;
                    str2.getClass();
                    pcpVar3.a |= 8;
                    pcpVar3.e = str2;
                    pcp pcpVar4 = (pcp) poyVarM2.h();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pco pcoVar2 = (pco) poyVarM.b;
                    pcpVar4.getClass();
                    pcoVar2.b = pcpVar4;
                    pcoVar2.a |= 1;
                    fjsVar.t((pco) poyVarM.h());
                    fgbVar2.n.a.setKeyguardDismisser(new KeyguardDismisser() { // from class: ffv
                        @Override // com.google.android.libraries.lens.lenslite.api.KeyguardDismisser
                        public final void dismissKeyguard(KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
                            fgb fgbVar3 = fgbVar2;
                            fgbVar3.k.b(fgbVar3.f, keyguardDismissCallback);
                        }
                    });
                    mgs mgsVar3 = fgbVar2.n;
                    Activity activity = fgbVar2.f;
                    if (mgsVar3.a() >= ApiVersion.VERSION_7.getVersionCode()) {
                        mgsVar3.a.setActivity(activity);
                        mgsVar3.a.setAlertDialogBuilder(new AlertDialog.Builder(activity, R.style.AlertDialogTheme));
                    }
                    fgbVar2.n.a.setEventListener(new LinkEventListener() { // from class: ffx
                        @Override // com.google.android.libraries.lens.lenslite.api.LinkEventListener
                        public final void onEvent(final int i6, int i7) {
                            final fgb fgbVar3 = fgbVar2;
                            fgbVar3.d.execute(new Runnable() { // from class: ffj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    fgb fgbVar4 = fgbVar3;
                                    if (i6 == 1) {
                                        fgbVar4.s = true;
                                    } else {
                                        fgbVar4.s = false;
                                    }
                                }
                            });
                        }
                    }, null);
                    mgs mgsVar4 = fgbVar2.n;
                    mgv mgvVar = new mgv() { // from class: ffy
                        @Override // defpackage.mgv
                        public final void a(mgu mguVar) {
                            final Runnable onChipClickListener;
                            final fgb fgbVar3 = fgbVar2;
                            iay iayVar3 = iayVar2;
                            final mhe mheVar = mguVar.a;
                            if ((mheVar.a & 4) != 0) {
                                ArrayMap arrayMap = new ArrayMap();
                                mhb mhbVar = mheVar.d;
                                if (mhbVar == null) {
                                    mhbVar = mhb.b;
                                }
                                for (mha mhaVar : mhbVar.a) {
                                    mgz mgzVar = mhaVar.c;
                                    if (mgzVar == null) {
                                        mgzVar = mgz.b;
                                    }
                                    if (!mgzVar.a.isEmpty()) {
                                        mgz mgzVar2 = mhaVar.c;
                                        if (mgzVar2 == null) {
                                            mgzVar2 = mgz.b;
                                        }
                                        for (mgy mgyVar : mgzVar2.a) {
                                            arrayMap.put(mgyVar.a, Float.valueOf(mgyVar.b));
                                        }
                                    }
                                }
                                if (!arrayMap.isEmpty()) {
                                    dbr dbrVar = fgbVar3.j;
                                    mhd mhdVar = mheVar.b;
                                    if (mhdVar == null) {
                                        mhdVar = mhd.b;
                                    }
                                    dbrVar.fL(mhdVar.a, arrayMap);
                                }
                            }
                            mhc mhcVar = mheVar.c;
                            if (mhcVar == null) {
                                mhcVar = mhc.d;
                            }
                            if ((mhcVar.a & 4) != 0) {
                                ArrayMap arrayMap2 = new ArrayMap();
                                mhc mhcVar2 = mheVar.c;
                                if (mhcVar2 == null) {
                                    mhcVar2 = mhc.d;
                                }
                                nwh nwhVar = mhcVar2.c;
                                if (nwhVar == null) {
                                    nwhVar = nwh.b;
                                }
                                for (nwg nwgVar : nwhVar.a) {
                                    nwi nwiVar = nwgVar.a;
                                    if (nwiVar == null) {
                                        nwiVar = nwi.b;
                                    }
                                    ppj ppjVar = nwiVar.a;
                                    if (!ppjVar.isEmpty()) {
                                        arrayMap2.put(Long.valueOf(nwgVar.b), ppjVar);
                                    }
                                }
                                if (!arrayMap2.isEmpty()) {
                                    dbg dbgVar = fgbVar3.i;
                                    mhd mhdVar2 = mheVar.b;
                                    if (mhdVar2 == null) {
                                        mhdVar2 = mhd.b;
                                    }
                                    dbgVar.g(mhdVar2.a, arrayMap2);
                                }
                            }
                            mhc mhcVar3 = mheVar.c;
                            if (mhcVar3 == null) {
                                mhcVar3 = mhc.d;
                            }
                            nvu nvuVar = mhcVar3.b;
                            if (nvuVar == null) {
                                nvuVar = nvu.b;
                            }
                            if (nvuVar.a.size() <= 0 || !fgbVar3.g()) {
                                List list = mguVar.b;
                                mgw mgwVar = mguVar.c;
                                if (list.isEmpty()) {
                                    return;
                                }
                                final int i6 = 0;
                                final LinkChipResult linkChipResult = (LinkChipResult) list.get(0);
                                final ojc ojcVarI2 = mgwVar.a.size() > 0 ? ojc.i((pmh) mgwVar.a.get(0)) : oih.a;
                                linkChipResult.getClass();
                                switch (linkChipResult.getActionType()) {
                                    case 0:
                                        break;
                                    case 3:
                                        if (fgbVar3.w.g() && ((LinkChipResult) fgbVar3.w.c()).getId() == linkChipResult.getId()) {
                                            fgbVar3.w = oih.a;
                                            iayVar3.a();
                                            break;
                                        }
                                        break;
                                    default:
                                        iaw iawVarA = iax.a();
                                        if (linkChipResult.getText() != null) {
                                            String text = linkChipResult.getText();
                                            text.getClass();
                                            iawVarA.b = text;
                                        }
                                        if (linkChipResult.getIcon() != null) {
                                            Drawable icon = linkChipResult.getIcon();
                                            icon.getClass();
                                            iawVarA.c = icon;
                                        }
                                        final int i7 = 1;
                                        if (linkChipResult.getActionType() == 1) {
                                            onChipClickListener = linkChipResult.getOnChipClickListener();
                                        } else if (linkChipResult.getActionType() == 2) {
                                            final LinkChipResult.BitmapProvider bitmapProvider = linkChipResult.getBitmapProvider();
                                            bitmapProvider.getClass();
                                            onChipClickListener = new Runnable() { // from class: ffq
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    fgb fgbVar4 = fgbVar3;
                                                    LinkChipResult linkChipResult2 = linkChipResult;
                                                    ojc ojcVar = ojcVarI2;
                                                    mhe mheVar2 = mheVar;
                                                    LinkChipResult.BitmapProvider bitmapProvider2 = bitmapProvider;
                                                    fga fgaVar = new fga(fgbVar4, linkChipResult2, ojcVar, mheVar2);
                                                    if (linkChipResult2.getResultType() == 22) {
                                                        ((hzq) fgbVar4.z.get()).a(fgaVar);
                                                    } else {
                                                        fgaVar.a(bitmapProvider2.getBitmap());
                                                    }
                                                }
                                            };
                                        } else {
                                            onChipClickListener = null;
                                        }
                                        if (onChipClickListener != null) {
                                            iawVarA.d = new Runnable() { // from class: ffr
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    fgb fgbVar4 = fgbVar3;
                                                    Runnable runnable = onChipClickListener;
                                                    LinkChipResult linkChipResult2 = linkChipResult;
                                                    mhe mheVar2 = mheVar;
                                                    runnable.run();
                                                    fgbVar4.B.a(linkChipResult2, mheVar2, 3, fgbVar4.v);
                                                }
                                            };
                                        }
                                        if (linkChipResult.getChipContentDescription() != null) {
                                            String chipContentDescription = linkChipResult.getChipContentDescription();
                                            chipContentDescription.getClass();
                                            iawVarA.f = chipContentDescription;
                                        }
                                        if (linkChipResult.getOnCloseButtonClickListener() != null) {
                                            iawVarA.g = new Runnable() { // from class: ffp
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i7) {
                                                        case 0:
                                                            fgb fgbVar4 = fgbVar3;
                                                            LinkChipResult linkChipResult2 = linkChipResult;
                                                            mhe mheVar2 = mheVar;
                                                            if (!fgbVar4.x.g()) {
                                                                ojc ojcVar = fgbVar4.w;
                                                                if (ojcVar.g() && ((LinkChipResult) ojcVar.c()).getId() == linkChipResult2.getId() && linkChipResult2.getCenterpoint() != null) {
                                                                    linkChipResult2.getId();
                                                                    fgbVar4.B.a(linkChipResult2, mheVar2, 5, fgbVar4.v);
                                                                } else {
                                                                    linkChipResult2.getId();
                                                                    fgbVar4.B.a(linkChipResult2, mheVar2, 2, fgbVar4.v);
                                                                }
                                                            } else if (((LinkChipResult) fgbVar4.x.c()).getId() != linkChipResult2.getId()) {
                                                                linkChipResult2.getId();
                                                                fgbVar4.B.a(linkChipResult2, mheVar2, 2, fgbVar4.v);
                                                            }
                                                            fgbVar4.x = ojc.i(linkChipResult2);
                                                            break;
                                                        default:
                                                            fgb fgbVar5 = fgbVar3;
                                                            LinkChipResult linkChipResult3 = linkChipResult;
                                                            mhe mheVar3 = mheVar;
                                                            Runnable onCloseButtonClickListener = linkChipResult3.getOnCloseButtonClickListener();
                                                            onCloseButtonClickListener.getClass();
                                                            onCloseButtonClickListener.run();
                                                            fgbVar5.B.a(linkChipResult3, mheVar3, 4, fgbVar5.v);
                                                            break;
                                                    }
                                                }
                                            };
                                        }
                                        iawVarA.d(linkChipResult.getTimeout());
                                        iawVarA.h = new Runnable() { // from class: ffp
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i6) {
                                                    case 0:
                                                        fgb fgbVar4 = fgbVar3;
                                                        LinkChipResult linkChipResult2 = linkChipResult;
                                                        mhe mheVar2 = mheVar;
                                                        if (!fgbVar4.x.g()) {
                                                            ojc ojcVar = fgbVar4.w;
                                                            if (ojcVar.g() && ((LinkChipResult) ojcVar.c()).getId() == linkChipResult2.getId() && linkChipResult2.getCenterpoint() != null) {
                                                                linkChipResult2.getId();
                                                                fgbVar4.B.a(linkChipResult2, mheVar2, 5, fgbVar4.v);
                                                            } else {
                                                                linkChipResult2.getId();
                                                                fgbVar4.B.a(linkChipResult2, mheVar2, 2, fgbVar4.v);
                                                            }
                                                        } else if (((LinkChipResult) fgbVar4.x.c()).getId() != linkChipResult2.getId()) {
                                                            linkChipResult2.getId();
                                                            fgbVar4.B.a(linkChipResult2, mheVar2, 2, fgbVar4.v);
                                                        }
                                                        fgbVar4.x = ojc.i(linkChipResult2);
                                                        break;
                                                    default:
                                                        fgb fgbVar5 = fgbVar3;
                                                        LinkChipResult linkChipResult3 = linkChipResult;
                                                        mhe mheVar3 = mheVar;
                                                        Runnable onCloseButtonClickListener = linkChipResult3.getOnCloseButtonClickListener();
                                                        onCloseButtonClickListener.getClass();
                                                        onCloseButtonClickListener.run();
                                                        fgbVar5.B.a(linkChipResult3, mheVar3, 4, fgbVar5.v);
                                                        break;
                                                }
                                            }
                                        };
                                        iawVarA.i = new Runnable() { // from class: ffo
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                fgb fgbVar4 = fgbVar3;
                                                linkChipResult.getId();
                                                fgbVar4.x = oih.a;
                                            }
                                        };
                                        iax iaxVarA = iawVarA.a();
                                        if (fgbVar3.w.g() && ((LinkChipResult) fgbVar3.w.c()).getId() == linkChipResult.getId()) {
                                            iayVar3.c(iaxVarA);
                                        } else {
                                            fgbVar3.w = ojc.i(linkChipResult);
                                            iayVar3.b(iaxVarA);
                                        }
                                        break;
                                }
                            }
                        }
                    };
                    DLEngineApi dLEngineApi = mgsVar4.a;
                    pos posVar = mhi.a;
                    posVar.getClass();
                    dLEngineApi.setResultListener(new mhh(posVar, mgvVar));
                    lap lapVar = fgbVar2.e;
                    final mgs mgsVar5 = fgbVar2.n;
                    mgsVar5.getClass();
                    lapVar.c(new lie() { // from class: fft
                        @Override // defpackage.lie, java.lang.AutoCloseable
                        public final void close() {
                            switch (i3) {
                                case 0:
                                    mgs mgsVar6 = mgsVar5;
                                    if (mgsVar6.a() >= ApiVersion.VERSION_8.getVersionCode()) {
                                        mgsVar6.a.stopLinkLogging();
                                    }
                                    break;
                                default:
                                    mgsVar5.a.shutdown();
                                    break;
                            }
                        }
                    });
                    fgbVar2.e.c(fgbVar2.b.a(new lij() { // from class: ffu
                        @Override // defpackage.lij
                        public final void fB(Object obj) {
                            fgb fgbVar3 = fgbVar2;
                            Boolean bool = (Boolean) obj;
                            if (bool.booleanValue()) {
                                fgbVar3.d.execute(new ffi(fgbVar3, 2));
                            } else {
                                fgbVar3.d.execute(new ffi(fgbVar3, 0));
                            }
                            fjs fjsVar2 = fgbVar3.l;
                            poy poyVarM3 = pco.f.m();
                            String str5 = fgbVar3.v;
                            if (poyVarM3.c) {
                                poyVarM3.m();
                                poyVarM3.c = false;
                            }
                            pco pcoVar3 = (pco) poyVarM3.b;
                            str5.getClass();
                            pcoVar3.a |= 8;
                            pcoVar3.e = str5;
                            poy poyVarM4 = pcq.c.m();
                            boolean zBooleanValue = bool.booleanValue();
                            if (poyVarM4.c) {
                                poyVarM4.m();
                                poyVarM4.c = false;
                            }
                            pcq pcqVar = (pcq) poyVarM4.b;
                            pcqVar.a |= 1;
                            pcqVar.b = zBooleanValue;
                            pcq pcqVar2 = (pcq) poyVarM4.h();
                            if (poyVarM3.c) {
                                poyVarM3.m();
                                poyVarM3.c = false;
                            }
                            pco pcoVar4 = (pco) poyVarM3.b;
                            pcqVar2.getClass();
                            pcoVar4.d = pcqVar2;
                            pcoVar4.a |= 4;
                            fjsVar2.t((pco) poyVarM3.h());
                        }
                    }, fgbVar2.d));
                    lap lapVar2 = fgbVar2.e;
                    final mgs mgsVar6 = fgbVar2.n;
                    mgsVar6.getClass();
                    lapVar2.c(new lie() { // from class: fft
                        @Override // defpackage.lie, java.lang.AutoCloseable
                        public final void close() {
                            switch (i2) {
                                case 0:
                                    mgs mgsVar7 = mgsVar6;
                                    if (mgsVar7.a() >= ApiVersion.VERSION_8.getVersionCode()) {
                                        mgsVar7.a.stopLinkLogging();
                                    }
                                    break;
                                default:
                                    mgsVar6.a.shutdown();
                                    break;
                            }
                        }
                    });
                    fgbVar2.o = true;
                    fgbVar2.e();
                } catch (RuntimeException e5) {
                    fjs fjsVar2 = fgbVar2.l;
                    poy poyVarM3 = pco.f.m();
                    String str5 = fgbVar2.v;
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    pco pcoVar3 = (pco) poyVarM3.b;
                    str5.getClass();
                    pcoVar3.a |= 8;
                    pcoVar3.e = str5;
                    poy poyVarM4 = pcp.f.m();
                    if (poyVarM4.c) {
                        poyVarM4.m();
                        poyVarM4.c = false;
                    }
                    pcp pcpVar5 = (pcp) poyVarM4.b;
                    pcpVar5.b = 2;
                    pcpVar5.a |= 1;
                    pcp pcpVar6 = (pcp) poyVarM4.h();
                    if (poyVarM3.c) {
                        poyVarM3.m();
                        poyVarM3.c = false;
                    }
                    pco pcoVar4 = (pco) poyVarM3.b;
                    pcpVar6.getClass();
                    pcoVar4.b = pcpVar6;
                    pcoVar4.a |= 1;
                    fjsVar2.t((pco) poyVarM3.h());
                }
            }
        });
    }
}
