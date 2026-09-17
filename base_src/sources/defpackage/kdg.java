package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kdg extends kdj {
    private static List b = new ArrayList();

    public kdg(kdx kdxVar) {
        super(kdxVar);
        new HashSet();
    }

    public static void a() {
        synchronized (kdg.class) {
            List list = b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                b = null;
            }
        }
    }
}
