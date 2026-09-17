package defpackage;

import j$.util.List$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dru {
    private static final ouj a = ouj.h("com/google/android/apps/camera/featurecentral/extraction/FeatureExtractors");

    public static List a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        List$CC.$default$sort(arrayList, cdg.e);
        return arrayList;
    }

    public static drp b(dsz dszVar) {
        return new drp(dszVar);
    }

    public static void c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(((drt) it.next()).a.b);
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            dqw dqwVar = ((drt) it2.next()).a.b;
            for (dqw dqwVar2 : dqwVar.c()) {
                if (!hashSet.contains(dqwVar2)) {
                    ((oug) ((oug) a.c()).G(909)).A("Extractor (%s) of type %s depends on foreign type %s! Feature values may be calculated out of order!", str, dqwVar, dqwVar2);
                }
            }
        }
    }
}
