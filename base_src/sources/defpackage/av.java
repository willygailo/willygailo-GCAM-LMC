package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class av {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public av(ar arVar) {
        this.a = arVar.w;
        this.b = arVar.x;
        this.c = arVar.h();
        this.d = arVar.d();
        ArrayList arrayList = arVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new au((aq) arrayList.get(i)));
        }
    }
}
