package defpackage;

import android.graphics.Point;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.barhopper.Barhopper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class cyz extends nvf {
    final /* synthetic */ cza a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyz(cza czaVar, nvh nvhVar) {
        super(nvhVar);
        this.a = czaVar;
    }

    @Override // defpackage.nvf, defpackage.nvg
    public final void a(long j) {
        this.a.c.c(j);
    }

    @Override // defpackage.nvf, defpackage.nvj
    public final void b(final nvk nvkVar) {
        final dac dacVar = this.a.b;
        dacVar.f.execute(new Runnable() { // from class: daa
            /* JADX WARN: Code duplicated, block: B:51:0x0212 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:52:0x0214  */
            /* JADX WARN: Code duplicated, block: B:54:0x021d  */
            /* JADX WARN: Code duplicated, block: B:76:0x02e0  */
            @Override // java.lang.Runnable
            public final void run() {
                oom oomVarL;
                oom oomVarL2;
                nwh nwhVar;
                cyk cykVar;
                cyk cykVar2;
                ojc ojcVarH;
                Float f;
                boolean z;
                dac dacVar2 = dacVar;
                nvk nvkVar2 = nvkVar;
                czn cznVarA = czo.a();
                cznVarA.c(SystemClock.elapsedRealtimeNanos());
                ArrayList arrayList = new ArrayList();
                int i = 1;
                if ((nvkVar2.a & 2) == 0) {
                    oomVarL = oom.l();
                } else {
                    nvu nvuVar = nvkVar2.b;
                    if (nvuVar == null) {
                        nvuVar = nvu.b;
                    }
                    if (nvuVar.a.size() == 0) {
                        oomVarL = oom.l();
                    } else {
                        nvu nvuVar2 = nvkVar2.b;
                        if (nvuVar2 == null) {
                            nvuVar2 = nvu.b;
                        }
                        nvuVar2.a.size();
                        if (dacVar2.k.compareAndSet(false, true)) {
                            Process.setThreadPriority(-1);
                            z = true;
                        } else {
                            z = false;
                        }
                        dacVar2.j.e("camera_vkp_annotator_init");
                        czq czqVar = dacVar2.b;
                        if (czqVar.d.compareAndSet(false, true)) {
                            obr.aQ(!lar.d());
                            czqVar.c.e("cvk_annotators_init");
                            czqVar.b();
                            nls nlsVar = czqVar.c().a;
                            nlsVar.f = Pattern.compile(nls.c, 2);
                            nlsVar.g = Pattern.compile("(http(s)?:(//)?)\\b([wW]{3})([^\\.])", 2);
                            nlsVar.h = Pattern.compile("(\\s| |^)\\b([wW]{3})([^\\.])", 2);
                            nlsVar.i = Pattern.compile(nlr.e, 2);
                            nlsVar.j = Pattern.compile(nls.d, 2);
                            nlsVar.k = Pattern.compile(nls.a, 2);
                            nlsVar.l = Pattern.compile(nls.b, 2);
                            nlsVar.m = Pattern.compile(nls.e, 2);
                            nlsVar.n = new ArrayList(nlr.f.size());
                            for (Pair pair : nlr.f) {
                                String str = (String) pair.first;
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                                sb.append("(?i)\\.\\b(");
                                sb.append(str);
                                sb.append(")\\b");
                                nlsVar.n.add(Pair.create(Pattern.compile(sb.toString(), 2), (String) pair.second));
                            }
                            czqVar.c.f();
                        }
                        dacVar2.j.g("camera_vkp_semantic_result_convert");
                        czq czqVar2 = dacVar2.b;
                        ArrayList arrayList2 = new ArrayList();
                        if ((nvkVar2.a & 2) != 0) {
                            nmb nmbVar = czqVar2.b;
                            nvu nvuVar3 = nvkVar2.b;
                            if (nvuVar3 == null) {
                                nvuVar3 = nvu.b;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (nvs nvsVar : nvuVar3.a) {
                                int iAb = ohh.ab(nvsVar.a);
                                if (iAb == 0) {
                                    iAb = 1;
                                }
                                Barcode rawValue = Barhopper.parseRawValue(nvsVar.b, i << (iAb - 2));
                                ArrayList arrayList4 = new ArrayList();
                                for (nvr nvrVar : nvsVar.c) {
                                    arrayList4.add(new Point(nvrVar.a, nvrVar.b));
                                }
                                rawValue.cornerPoints = (Point[]) arrayList4.toArray(new Point[arrayList4.size()]);
                                arrayList3.add(rawValue);
                                i = 1;
                            }
                            arrayList2.addAll(nmbVar.a((Barcode[]) arrayList3.toArray(new Barcode[arrayList3.size()]), ojc.i(czqVar2.b()), ojc.i(czqVar2.c())));
                        }
                        dacVar2.j.f();
                        ojc ojcVarI = !arrayList2.isEmpty() ? ojc.i((nme) arrayList2.get(0)) : oih.a;
                        if (ojcVarI.g()) {
                            ojc ojcVarA = dacVar2.c.a((nme) ojcVarI.c());
                            if (ojcVarA.g()) {
                                long jLongValue = ((Long) ojcVarA.c()).longValue();
                                dacVar2.j.e("camera_vkp_barcode_convert");
                                cyk cykVarA = dacVar2.b.a((nme) ojcVarI.c(), jLongValue, dacVar2.b(jLongValue));
                                dacVar2.j.f();
                                oomVarL = oom.m(cykVarA);
                            } else {
                                if (z) {
                                    Process.setThreadPriority(0);
                                }
                                oomVarL = oom.l();
                            }
                        } else {
                            if (z) {
                                Process.setThreadPriority(0);
                            }
                            oomVarL = oom.l();
                        }
                    }
                }
                arrayList.addAll(oomVarL);
                if ((nvkVar2.a & 1024) != 0) {
                    nus nusVar = nvkVar2.e;
                    if (nusVar == null) {
                        nusVar = nus.c;
                    }
                    if ((nusVar.a & 2) != 0) {
                        dad dadVar = dacVar2.c;
                        nmc nmcVarB = nme.b();
                        nmcVarB.b = Float.valueOf(1.0f);
                        nmcVarB.i(nlf.DOCUMENT_SCANNING);
                        nmcVarB.h(nmf.a(dacVar2.i.getString(R.string.scan_document)));
                        ojc ojcVarA2 = dadVar.a(nmcVarB.a());
                        if (ojcVarA2.g()) {
                            long jLongValue2 = ((Long) ojcVarA2.c()).longValue();
                            czq czqVar3 = dacVar2.b;
                            long jLongValue3 = ((Long) ojcVarA2.c()).longValue();
                            Runnable runnableB = dacVar2.b(jLongValue2);
                            plz plzVar = nusVar.b;
                            if (plzVar == null) {
                                plzVar = plz.b;
                            }
                            pmj pmjVar = plzVar.a;
                            if (pmjVar == null) {
                                pmjVar = pmj.b;
                            }
                            int size = pmjVar.a.size();
                            ojc ojcVarI2 = oih.a;
                            if (size == 4) {
                                cyj cyjVarA = cyk.a();
                                cyjVarA.a = czqVar3.a.getString(R.string.scan_document);
                                cyjVarA.e = 1;
                                cyjVarA.c = czqVar3.a.getResources().getDrawable(R.drawable.product_logo_lens_new_color_24, null);
                                cyjVarA.e(jLongValue3);
                                cyjVarA.f = 3;
                                cyjVarA.d(runnableB);
                                cyjVarA.d = ojc.i(plzVar);
                                ojcVarI2 = ojc.i(cyjVarA.a());
                            }
                            if (ojcVarI2.g()) {
                                oomVarL2 = oom.m((cyk) ojcVarI2.c());
                            } else {
                                oomVarL2 = oom.l();
                            }
                        } else {
                            oomVarL2 = oom.l();
                        }
                    } else {
                        oomVarL2 = oom.l();
                    }
                } else {
                    oomVarL2 = oom.l();
                }
                arrayList.addAll(oomVarL2);
                HashMap map = new HashMap();
                if ((nvkVar2.a & 8) != 0) {
                    nwb nwbVar = nvkVar2.c;
                    if (nwbVar == null) {
                        nwbVar = nwb.b;
                    }
                    for (nvv nvvVar : new onc(obr.am(nwbVar.a, bxe.n))) {
                        int i2 = nvvVar.a;
                        if ((i2 & 8) != 0 && (i2 & 2) != 0 && dacVar2.g.containsKey(nvvVar.c) && (f = (Float) dacVar2.g.get(nvvVar.c)) != null && nvvVar.b > f.floatValue()) {
                            map.put(nvvVar.c, Float.valueOf(nvvVar.b));
                        }
                    }
                }
                if ((nvkVar2.a & 512) != 0) {
                    nwhVar = nvkVar2.d;
                    if (nwhVar == null) {
                        nwhVar = nwh.b;
                    }
                } else {
                    nwhVar = null;
                }
                if (arrayList.isEmpty()) {
                    ojcVarH = oih.a;
                } else {
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            cykVar = null;
                            break;
                        }
                        cykVar = (cyk) it.next();
                    } while (cykVar.j != 2);
                    if (cykVar != null) {
                        ojcVarH = ojc.i(cykVar);
                    } else {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                cykVar2 = null;
                                break;
                            }
                            cykVar2 = (cyk) it2.next();
                        } while (cykVar2.j != 3);
                        ojcVarH = ojc.h(cykVar2);
                    }
                }
                if (!ojcVarH.g() && map.isEmpty() && nwhVar == null) {
                    return;
                }
                if (ojcVarH.g()) {
                    cznVarA.b((cyk) ojcVarH.c());
                    dacVar2.d.a(((cyk) ojcVarH.c()).a);
                }
                cym cymVar = new cym(null);
                cymVar.a(new HashMap());
                cymVar.a(map);
                cymVar.b = ojc.h(nwhVar);
                oor oorVar = cymVar.a;
                if (oorVar == null) {
                    throw new IllegalStateException("Missing required properties: sceneDetectionResults");
                }
                cznVarA.a = ojc.i(new cyn(oorVar, cymVar.b));
                dacVar2.h.i(cznVarA.a());
            }
        });
    }
}
