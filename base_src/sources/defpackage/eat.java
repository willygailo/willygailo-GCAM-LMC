package defpackage;

import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.StaticMetadataVector;
import com.google.googlex.gcam.hdrplus.HalideRuntime;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eat implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;

    public eat(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:46:0x0158  */
    /* JADX WARN: Code duplicated, block: B:47:0x015a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0168  */
    /* JADX WARN: Code duplicated, block: B:51:0x016f  */
    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        int i;
        long jStaticMetadata_active_area_get;
        PixelRect pixelRect;
        lvq lvqVar = ((lhr) this.a).get();
        Object obj = this.b.get();
        ljf ljfVar = (ljf) this.c.get();
        egg eggVar = (egg) this.d.get();
        ddf ddfVar = (ddf) this.e.get();
        lzi lziVar = (lzi) this.f.get();
        eca ecaVar = (eca) obj;
        ljfVar.e("Gcam#provide");
        if (!HalideRuntime.checkGcamHalideRuntime()) {
            ((oug) ((oug) eas.a.b()).G((char) 1026)).o("HalideRuntime.checkGcamHalideRuntime -> Failed");
        }
        StaticMetadataVector staticMetadataVector = new StaticMetadataVector();
        int i2 = 2;
        boolean z = true;
        lwd[] lwdVarArr = {lwd.BACK, lwd.FRONT};
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                InitParams initParams = ecaVar.a;
                GcamModuleJNI.InitParams_reference_focal_length_35mm_set(initParams.a, initParams, new float[]{eas.a(staticMetadataVector, 0), eas.a(staticMetadataVector, 1)});
                GcamModuleJNI.InitParams_portrait_brightening_enabled_set(initParams.a, initParams, ddfVar.k(ddm.at));
                if (initParams.a() == 1) {
                    eggVar.a();
                }
                long jGcam_Create = GcamModuleJNI.Gcam_Create(initParams.a, initParams, staticMetadataVector.a, staticMetadataVector);
                Gcam gcam = jGcam_Create != 0 ? new Gcam(jGcam_Create) : null;
                if (!lziVar.l) {
                    obr.aF(gcam.f());
                }
                ljfVar.f();
                qmd.ae(gcam);
                return gcam;
            }
            List<lvs> listH = lvqVar.h(lwdVarArr[i3]);
            ArrayList arrayList = new ArrayList();
            for (lvs lvsVar : listH) {
                if (lvsVar != null && lvsVar.a != null) {
                    lvp lvpVarA = lvqVar.a(lvsVar);
                    if (eas.b(lvpVarA)) {
                        staticMetadataVector.a(pkr.v(lvpVarA));
                    }
                    for (lvs lvsVar2 : ((lvo) lvpVarA).b) {
                        if (!listH.contains(lvsVar2) && !arrayList.contains(lvsVar2)) {
                            arrayList.add(lvsVar2);
                        }
                    }
                }
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                lvp lvpVarA2 = lvqVar.a((lvs) arrayList.get(i4));
                if (eas.b(lvpVarA2)) {
                    StaticMetadata staticMetadataV = pkr.v(lvpVarA2);
                    staticMetadataVector.a(staticMetadataV);
                    switch (staticMetadataV.b()) {
                        case 4:
                            if (lziVar.e()) {
                                StaticMetadata staticMetadata = new StaticMetadata(GcamModuleJNI.new_StaticMetadata__SWIG_1(StaticMetadata.c(staticMetadataV), staticMetadataV), z);
                                GcamModuleJNI.ApplySensorBinning__SWIG_1(2, StaticMetadata.c(staticMetadata), staticMetadata);
                                int iIntValue = ((Integer) ddfVar.a(ddx.e).c()).intValue();
                                int iIntValue2 = ((Integer) ddfVar.a(ddx.d).c()).intValue();
                                if (z != ddfVar.k(ddl.T)) {
                                    i = 7;
                                } else {
                                    i = 9;
                                }
                                int i5 = i;
                                jStaticMetadata_active_area_get = GcamModuleJNI.StaticMetadata_active_area_get(staticMetadata.a, staticMetadata);
                                if (jStaticMetadata_active_area_get == 0) {
                                    pixelRect = null;
                                } else {
                                    pixelRect = new PixelRect(jStaticMetadata_active_area_get, false);
                                }
                                pixelRect.f(iIntValue);
                                staticMetadata.e(iIntValue2);
                                staticMetadata.f(i5);
                                staticMetadataVector.a(staticMetadata);
                            } else {
                                size = size;
                                lwdVarArr = lwdVarArr;
                            }
                            break;
                        case 8:
                            if (lziVar.g() || lziVar.h()) {
                                StaticMetadata staticMetadata2 = new StaticMetadata(GcamModuleJNI.new_StaticMetadata__SWIG_1(StaticMetadata.c(staticMetadataV), staticMetadataV), z);
                                GcamModuleJNI.ApplySensorBinning__SWIG_1(2, StaticMetadata.c(staticMetadata2), staticMetadata2);
                                int iIntValue3 = ((Integer) ddfVar.a(ddx.e).c()).intValue();
                                int iIntValue4 = ((Integer) ddfVar.a(ddx.d).c()).intValue();
                                if (z != ddfVar.k(ddl.T)) {
                                    i = 7;
                                } else {
                                    i = 9;
                                }
                                int i6 = i;
                                jStaticMetadata_active_area_get = GcamModuleJNI.StaticMetadata_active_area_get(staticMetadata2.a, staticMetadata2);
                                if (jStaticMetadata_active_area_get == 0) {
                                    pixelRect = null;
                                } else {
                                    pixelRect = new PixelRect(jStaticMetadata_active_area_get, false);
                                }
                                pixelRect.f(iIntValue3);
                                staticMetadata2.e(iIntValue4);
                                staticMetadata2.f(i6);
                                staticMetadataVector.a(staticMetadata2);
                            } else {
                                size = size;
                                lwdVarArr = lwdVarArr;
                            }
                            break;
                        default:
                            size = size;
                            lwdVarArr = lwdVarArr;
                            break;
                    }
                } else {
                    size = size;
                    lwdVarArr = lwdVarArr;
                }
                i4++;
                lvqVar = lvqVar;
                size = size;
                lwdVarArr = lwdVarArr;
                z = true;
            }
            i3++;
            i2 = 2;
            z = true;
        }
    }
}
