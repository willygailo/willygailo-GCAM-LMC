package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.ArraySet;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate;
import j$.util.function.ToIntFunction;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class iec implements idt {
    public static final ouj a = ouj.h("com/google/android/apps/camera/socialshare/setting/SocialShareSettingsImpl");
    public static final Pattern b = Pattern.compile("^([A-Za-z][A-Za-z\\d_]*(\\.|\\$))+[A-Za-z][A-Za-z\\d_]*$");
    public final hub c;
    public oor d;
    private final PackageManager e;
    private final huf f;

    public iec(PackageManager packageManager, hub hubVar, huf hufVar) {
        this.e = packageManager;
        this.c = hubVar;
        this.f = hufVar;
    }

    public static ope k(String str, ope opeVar) {
        if (!str.isEmpty()) {
            List listG = ojq.b(',').g(str);
            if (listG.size() >= 2) {
                return ope.F(listG);
            }
        }
        return opeVar;
    }

    private final List n(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(str);
        return this.e.queryIntentActivities(intent, 0);
    }

    private static Map o(ope opeVar) {
        ojq ojqVarB = ojq.b('/');
        HashMap map = new HashMap();
        oti otiVarListIterator = opeVar.listIterator();
        while (otiVarListIterator.hasNext()) {
            ArrayList arrayList = new ArrayList(ojqVarB.g((String) otiVarListIterator.next()));
            Collection.EL.removeIf(arrayList, bql.m);
            if (arrayList.size() >= 2 && Collection.EL.stream(arrayList).allMatch(bql.o)) {
                ArraySet arraySet = new ArraySet();
                int size = arrayList.size();
                String str = "";
                for (int i = 0; i < size; i++) {
                    String str2 = (String) arrayList.get(i);
                    if (str.isEmpty()) {
                        str = str2;
                    } else {
                        arraySet.add(str2);
                    }
                }
                map.put(str, arraySet);
            }
        }
        return map;
    }

    @Override // defpackage.idt
    public final oor a() {
        return this.d;
    }

    @Override // defpackage.idt
    public final Comparator b() {
        return Comparator$CC.comparingInt(new ToIntFunction() { // from class: idy
            @Override // j$.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                iec iecVar = this.a;
                String str = ((ResolveInfo) obj).activityInfo.packageName;
                oon oonVarM = oor.m();
                ope opeVarK = iec.k(pzi.a.a().c(), idn.f);
                ope opeVarK2 = iec.k(pzi.a.a().a(), orx.a);
                int i = 0;
                if (!opeVarK2.isEmpty() && !iecVar.m()) {
                    ArrayList arrayList = new ArrayList(opeVarK);
                    arrayList.removeAll(opeVarK2);
                    arrayList.addAll(0, opeVarK2);
                    opeVarK = ope.F(arrayList);
                }
                oti otiVarListIterator = opeVarK.listIterator();
                while (otiVarListIterator.hasNext()) {
                    String str2 = (String) otiVarListIterator.next();
                    if (iec.b.matcher(str2).matches()) {
                        oonVarM.e(str2, Integer.valueOf(i));
                        i++;
                    }
                }
                Integer num = (Integer) oonVarM.c().get(str);
                if (num == null) {
                    num = Integer.MAX_VALUE;
                }
                return num.intValue();
            }
        });
    }

    @Override // defpackage.idt
    public final /* bridge */ /* synthetic */ List d(String str) {
        ArrayList arrayListC = c(str);
        Collection.EL.removeIf(arrayListC, new Predicate() { // from class: ieb
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                return !this.a.c.m(idm.c(((ResolveInfo) obj).activityInfo.packageName));
            }
        });
        return arrayListC;
    }

    @Override // defpackage.idt
    public final void e(List list) {
        final List list2 = (List) Collection.EL.stream(list).map(icd.j).collect(Collectors.toList());
        Stream map = Collection.EL.stream(this.d.keySet()).filter(new Predicate() { // from class: idw
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                ouj oujVar = iec.a;
                return !list2.contains((String) obj);
            }
        }).map(icd.o);
        final hub hubVar = this.c;
        hubVar.getClass();
        map.filter(new Predicate() { // from class: iea
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                return hubVar.m((String) obj);
            }
        }).forEach(new idz(this, 1));
    }

    @Override // defpackage.idt
    public final void f() {
        oon oonVarM = oor.m();
        ope opeVarK = k(pzi.a.a().b(), idn.d);
        ope opeVarK2 = k(pzi.a.a().d(), idn.e);
        Map mapO = o(opeVarK);
        Map mapO2 = o(opeVarK2);
        for (Map.Entry entry : mapO.entrySet()) {
            String str = (String) entry.getKey();
            ope opeVarF = ope.F((java.util.Collection) entry.getValue());
            ope opeVarF2 = orx.a;
            if (mapO2.containsKey(str)) {
                Set set = (Set) mapO2.get(str);
                set.getClass();
                opeVarF2 = ope.F(set);
                mapO2.remove(str);
            }
            idl idlVarA = idm.a();
            idlVarA.b(str);
            idlVarA.c(opeVarF);
            idlVarA.d(opeVarF2);
            oonVarM.e(str, idlVarA.a());
        }
        for (Map.Entry entry2 : mapO2.entrySet()) {
            entry2.getKey();
            String str2 = (String) entry2.getKey();
            idl idlVarA2 = idm.a();
            idlVarA2.b((String) entry2.getKey());
            idlVarA2.c(orx.a);
            idlVarA2.d(ope.F((java.util.Collection) entry2.getValue()));
            oonVarM.e(str2, idlVarA2.a());
        }
        this.d = oonVarM.c();
    }

    @Override // defpackage.idt
    public final void g(List list) {
        e(oom.l());
        Collection.EL.stream(list).sorted(b()).limit(3L).map(icd.n).forEach(new idz(this, 0));
    }

    @Override // defpackage.idt
    public final void h(List list) {
        if (!((Boolean) this.f.c(htu.z)).booleanValue() || m()) {
            return;
        }
        g(list);
    }

    @Override // defpackage.idt
    public final boolean i(String str) {
        Stream map = Collection.EL.stream(n(str)).map(icd.l);
        final oor oorVar = this.d;
        oorVar.getClass();
        return map.anyMatch(new Predicate() { // from class: idv
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                return oorVar.containsKey((String) obj);
            }
        });
    }

    @Override // defpackage.idt
    public final boolean j(String str) {
        final Set set = (Set) Collection.EL.stream(this.d.keySet()).filter(bql.n).collect(Collectors.toSet());
        Stream map = Collection.EL.stream(n(str)).map(icd.m);
        set.getClass();
        return map.anyMatch(new Predicate() { // from class: idx
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                return set.contains((String) obj);
            }
        });
    }

    @Override // defpackage.idt
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ArrayList c(final String str) {
        return (ArrayList) Collection.EL.stream(n(str)).filter(new Predicate() { // from class: idu
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                ope opeVar;
                iec iecVar = this.a;
                String str2 = str;
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                idm idmVar = (idm) iecVar.d.get(resolveInfo.activityInfo.packageName);
                if (idmVar == null) {
                    return false;
                }
                String str3 = resolveInfo.activityInfo.name;
                if (str2.equals("image/*") || mbs.a(str2).b()) {
                    opeVar = idmVar.a;
                } else {
                    opeVar = (str2.equals("video/*") || mbs.a(str2).c()) ? idmVar.b : orx.a;
                }
                oti otiVarListIterator = opeVar.listIterator();
                while (otiVarListIterator.hasNext()) {
                    if (((String) otiVarListIterator.next()).equals(str3)) {
                        return true;
                    }
                }
                ((oug) ((oug) iec.a.c()).G(2860)).y("isListed: unknown activity. mimeType=%s className=%s", str2, str3);
                return false;
            }
        }).filter(new idg(new ConcurrentHashMap(), icd.k, 3)).collect(Collectors.toCollection(idh.d));
    }

    public final boolean m() {
        return ((Boolean) this.f.c(htu.D)).booleanValue() || ((Boolean) this.f.c(htu.E)).booleanValue();
    }
}
