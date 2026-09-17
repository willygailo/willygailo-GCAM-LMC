package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dem {
    protected final Object a;
    protected final ner b;
    private AtomicBoolean c;

    public dem(Object obj, ner nerVar) {
        this.c = new AtomicBoolean(false);
        this.a = obj;
        this.b = nerVar;
    }

    public dem(boolean z, ner nerVar) {
        this(Boolean.valueOf(z), nerVar);
    }

    final Object a() {
        ner nerVar = this.b;
        nerVar.getClass();
        if (this.c.getAndSet(Boolean.TRUE.booleanValue())) {
            return nerVar.e();
        }
        try {
            String strValueOf = String.valueOf(nerVar.f());
            Trace.beginSection(strValueOf.length() != 0 ? "Phenotype:".concat(strValueOf) : new String("Phenotype:"));
            return nerVar.e();
        } finally {
            Trace.endSection();
        }
    }
}
