package com.google.android.apps.camera.logging;

import defpackage.fjt;
import defpackage.pac;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class InstrumentationCameraEventLogger implements fjt {
    private static final Integer a = 100;
    private static final List b = new ArrayList();

    public static List getAndClearEvents() {
        ArrayList arrayList;
        List list = b;
        synchronized (list) {
            arrayList = new ArrayList(list);
            list.clear();
        }
        return arrayList;
    }

    @Override // defpackage.fjt
    public final void a(pac pacVar) {
        List list = b;
        synchronized (list) {
            if (list.size() == a.intValue()) {
                list.remove(list.size() - 1);
            }
            list.add(pacVar);
        }
    }
}
