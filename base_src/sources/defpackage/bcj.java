package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bcj {
    public final fc a;
    public final List b;
    public final String c;

    public bcj(Class cls, Class cls2, Class cls3, List list, fc fcVar) {
        this.a = fcVar;
        aae.v(list);
        this.b = list;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(simpleName2).length() + String.valueOf(simpleName3).length());
        sb.append("Failed LoadPath{");
        sb.append(simpleName);
        sb.append("->");
        sb.append(simpleName2);
        sb.append("->");
        sb.append(simpleName3);
        sb.append("}");
        this.c = sb.toString();
    }

    public final String toString() {
        String string = Arrays.toString(this.b.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 22);
        sb.append("LoadPath{decodePaths=");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }
}
