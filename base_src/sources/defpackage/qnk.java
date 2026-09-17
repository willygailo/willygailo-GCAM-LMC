package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qnk implements qob, qnj {
    private static final Map a;
    private static final HashMap b;
    private static final HashMap c;
    private static final HashMap d;
    private final Class e;

    static {
        int i = 0;
        List listF = qmd.F(new Class[]{qmj.class, qmu.class, qmy.class, qmz.class, qna.class, qnb.class, qnc.class, qnd.class, qne.class, qnf.class, qmk.class, qml.class, qmm.class, qmn.class, qmo.class, qmp.class, qmq.class, qmr.class, qms.class, qmt.class, qmv.class, qmw.class, qmx.class});
        ArrayList arrayList = new ArrayList(qmd.B(listF));
        for (Object obj : listF) {
            int i2 = i + 1;
            if (i < 0) {
                qmd.s();
            }
            arrayList.add(qmd.K((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = qmd.p(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        b = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        c = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        collectionValues.getClass();
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            str.getClass();
            sb.append(qno.v(str));
            sb.append("CompanionObject");
            qkl qklVarK = qmd.K(sb.toString(), str + ".Companion");
            map3.put(qklVarK.a, qklVarK.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        d = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(qmd.o(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), qno.v((String) entry2.getValue()));
        }
    }

    public qnk(Class cls) {
        this.e = cls;
    }

    @Override // defpackage.qnj
    public final Class a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qnk) && qno.c(qnm.b(this), qnm.b((qob) obj));
    }

    public final int hashCode() {
        return qnm.b(this).hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
