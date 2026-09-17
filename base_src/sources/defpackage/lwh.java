package defpackage;

import android.hardware.camera2.CameraAccessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lwh implements lvx {
    private final lvw a;
    private final ljf b;
    private final lis c;
    private final qpe d;
    private final vm e;

    public lwh(vm vmVar, lvw lvwVar, ljf ljfVar, lis lisVar) {
        lvwVar.getClass();
        ljfVar.getClass();
        this.e = vmVar;
        this.a = lvwVar;
        this.b = ljfVar;
        lis lisVarA = lisVar.a("VerifiedCamLstPrdr");
        lisVarA.getClass();
        this.c = lisVarA;
        this.d = qnt.i(null);
    }

    private final lwg c() {
        this.b.e("verifyCameras");
        try {
            try {
                List list = (List) qmd.m(new vl(this.e, null));
                if (list.isEmpty()) {
                    this.c.d("No cameras available!");
                    throw new lvz();
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = ((ve) it.next()).a;
                    try {
                        Set setB = this.e.a(str).b();
                        Iterator it2 = setB.iterator();
                        while (it2.hasNext()) {
                            String str2 = ((ve) it2.next()).a;
                            if (linkedHashSet.contains(ve.a(str2))) {
                                linkedHashSet.add(ve.a(str));
                            } else {
                                try {
                                    this.e.a(str2);
                                } catch (IllegalStateException e) {
                                    lvt lvtVarA = lvu.a();
                                    lvtVarA.a = str2;
                                    lvtVarA.b = d(e);
                                    linkedHashMap.put(str2, lvtVarA.a());
                                    linkedHashSet.add(ve.a(str));
                                    linkedHashSet.addAll(setB);
                                }
                            }
                        }
                    } catch (IllegalStateException e2) {
                        lvt lvtVarA2 = lvu.a();
                        lvtVarA2.a = str;
                        lvtVarA2.b = d(e2);
                        linkedHashMap.put(str, lvtVarA2.a());
                        linkedHashSet.add(ve.a(str));
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    this.a.ax(qmd.w(linkedHashMap.values()));
                }
                List listX = qmd.x(list);
                listX.removeAll(linkedHashSet);
                if (listX.isEmpty()) {
                    this.c.b("No working cameras available!");
                    throw new lvv(qmd.w(linkedHashMap.values()));
                }
                ArrayList arrayList = new ArrayList(listX.size());
                Iterator it3 = listX.iterator();
                while (it3.hasNext()) {
                    arrayList.add(lvs.b(((ve) it3.next()).a));
                }
                lwg lwgVar = new lwg(arrayList, qmd.w(linkedHashMap.values()));
                this.b.f();
                return lwgVar;
            } catch (CameraAccessException e3) {
                this.c.b("Failed to read the camera list.");
                throw new lvy("Failed to read the camera list.", e3.getReason(), e3);
            }
        } catch (Throwable th) {
            this.b.f();
            throw th;
        }
    }

    private static final Throwable d(IllegalStateException illegalStateException) {
        Throwable cause = illegalStateException.getCause();
        if (cause instanceof CameraAccessException) {
            Throwable cause2 = illegalStateException.getCause();
            if (cause2 != null) {
                return (CameraAccessException) cause2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.hardware.camera2.CameraAccessException");
        }
        if (!(cause instanceof IllegalArgumentException)) {
            return null;
        }
        Throwable cause3 = illegalStateException.getCause();
        if (cause3 != null) {
            return (IllegalArgumentException) cause3;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.IllegalArgumentException{ kotlin.TypeAliasesKt.IllegalArgumentException }");
    }

    @Override // defpackage.lvx
    public final List a() {
        lwg lwgVarC = c();
        qpe qpeVar = this.d;
        int i = qpf.a;
        qpeVar.a = lwgVarC;
        return lwgVarC.a;
    }

    @Override // defpackage.lvx
    public final List b() {
        lwg lwgVar = (lwg) this.d.a;
        return lwgVar == null ? qkx.a : lwgVar.b;
    }
}
