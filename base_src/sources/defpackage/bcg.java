package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bcg extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private azp c;
    private Class d;
    private String e;
    private int f;

    public bcg(String str) {
        this(str, Collections.emptyList());
    }

    public bcg(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    private final void c(Throwable th, List list) {
        if (!(th instanceof bcg)) {
            list.add(th);
            return;
        }
        Iterator it = ((bcg) th).b.iterator();
        while (it.hasNext()) {
            c((Throwable) it.next(), list);
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException e) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) {
        d(this, appendable);
        List list = this.b;
        bcf bcfVar = new bcf(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                bcfVar.append("Cause (");
                int i2 = i + 1;
                bcfVar.append(String.valueOf(i2));
                bcfVar.append(" of ");
                bcfVar.append(String.valueOf(size));
                bcfVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof bcg) {
                    ((bcg) th).e(bcfVar);
                } else {
                    d(th, bcfVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    final void b(azp azpVar, int i, Class cls) {
        this.c = azpVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        String string3 = "";
        if (cls != null) {
            String strValueOf = String.valueOf(cls);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 2);
            sb2.append(", ");
            sb2.append(strValueOf);
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        int i = this.f;
        if (i != 0) {
            String strC = hr.c(i);
            StringBuilder sb3 = new StringBuilder(strC.length() + 2);
            sb3.append(", ");
            sb3.append(strC);
            string2 = sb3.toString();
        } else {
            string2 = "";
        }
        sb.append(string2);
        azp azpVar = this.c;
        if (azpVar != null) {
            String strValueOf2 = String.valueOf(azpVar);
            StringBuilder sb4 = new StringBuilder(String.valueOf(strValueOf2).length() + 2);
            sb4.append(", ");
            sb4.append(strValueOf2);
            string3 = sb4.toString();
        }
        sb.append(string3);
        List<Throwable> listA = a();
        if (listA.isEmpty()) {
            return sb.toString();
        }
        if (listA.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listA.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listA) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }
}
