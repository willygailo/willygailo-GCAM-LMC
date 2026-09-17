package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class yx implements yv {
    final zg d;
    int e;
    public int f;
    public yv a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    yy h = null;
    public boolean i = false;
    final List j = new ArrayList();
    final List k = new ArrayList();

    public yx(zg zgVar) {
        this.d = zgVar;
    }

    public final void a(yv yvVar) {
        this.j.add(yvVar);
        if (this.i) {
            yvVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((yv) it.next()).f();
        }
    }

    @Override // defpackage.yv
    public final void f() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (!((yx) it.next()).i) {
                return;
            }
        }
        this.c = true;
        yv yvVar = this.a;
        if (yvVar != null) {
            yvVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        yx yxVar = null;
        int i = 0;
        for (yx yxVar2 : this.k) {
            if (!(yxVar2 instanceof yy)) {
                i++;
                yxVar = yxVar2;
            }
        }
        if (yxVar != null && i == 1 && yxVar.i) {
            yy yyVar = this.h;
            if (yyVar != null) {
                if (!yyVar.i) {
                    return;
                } else {
                    this.e = this.g * yyVar.f;
                }
            }
            c(yxVar.f + this.e);
        }
        yv yvVar2 = this.a;
        if (yvVar2 != null) {
            yvVar2.f();
        }
    }

    public final String toString() {
        String str;
        String str2 = this.d.d.ah;
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        String strValueOf = String.valueOf(this.i ? Integer.valueOf(this.f) : "unresolved");
        int size = this.k.size();
        int size2 = this.j.size();
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 33 + str.length() + String.valueOf(strValueOf).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        sb.append("(");
        sb.append(strValueOf);
        sb.append(") <t=");
        sb.append(size);
        sb.append(":d=");
        sb.append(size2);
        sb.append(">");
        return sb.toString();
    }
}
