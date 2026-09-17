package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zf {
    static int a = 0;
    public int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public zf(int i) {
        this.c = -1;
        this.d = 0;
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(ya yaVar, int i) {
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.b;
        yk ykVar = ((yk) arrayList.get(0)).T;
        yaVar.k();
        ykVar.b(yaVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((yk) arrayList.get(i2)).b(yaVar, false);
        }
        if (i == 0) {
            yl ylVar = (yl) ykVar;
            if (ylVar.at > 0) {
                vk.d(ylVar, yaVar, arrayList, 0);
            }
        }
        if (i == 1) {
            yl ylVar2 = (yl) ykVar;
            if (ylVar2.au > 0) {
                vk.d(ylVar2, yaVar, arrayList, 1);
            }
        }
        try {
            yaVar.j();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new ew((yk) arrayList.get(i3)));
        }
        if (i == 0) {
            yl ylVar3 = (yl) ykVar;
            int iO = ya.o(ylVar3.J);
            int iO2 = ya.o(ylVar3.L);
            yaVar.k();
            return iO2 - iO;
        }
        yl ylVar4 = (yl) ykVar;
        int iO3 = ya.o(ylVar4.K);
        int iO4 = ya.o(ylVar4.M);
        yaVar.k();
        return iO4 - iO3;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                zf zfVar = (zf) arrayList.get(i);
                if (this.f == zfVar.c) {
                    c(this.d, zfVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, zf zfVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yk ykVar = (yk) arrayList.get(i2);
            zfVar.d(ykVar);
            if (i == 0) {
                ykVar.an = zfVar.c;
            } else {
                ykVar.ao = zfVar.c;
            }
        }
        this.f = zfVar.c;
    }

    public final boolean d(yk ykVar) {
        if (this.b.contains(ykVar)) {
            return false;
        }
        this.b.add(ykVar);
        return true;
    }

    public final String toString() {
        int i = this.d;
        String str = i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both";
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append(str);
        sb.append(" [");
        sb.append(i2);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            yk ykVar = (yk) arrayList.get(i3);
            String strValueOf = String.valueOf(string);
            String str2 = ykVar.ah;
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(str2).length());
            sb2.append(strValueOf);
            sb2.append(" ");
            sb2.append(str2);
            string = sb2.toString();
        }
        return String.valueOf(string).concat(" >");
    }
}
