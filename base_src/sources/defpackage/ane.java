package defpackage;

import androidx.work.OverwritingInputMerger;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ane {
    public aqt b;
    final Set c = new HashSet();
    UUID a = UUID.randomUUID();

    public ane(Class cls) {
        this.b = new aqt(this.a.toString(), cls.getName());
        b(cls.getName());
        this.b.c = OverwritingInputMerger.class.getName();
    }

    public final anf a() {
        anf anfVar = new anf(this);
        aml amlVar = this.b.i;
        boolean z = true;
        if (!amlVar.a() && !amlVar.d && !amlVar.b && !amlVar.c) {
            z = false;
        }
        if (this.b.o && z) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.a = UUID.randomUUID();
        aqt aqtVar = new aqt(this.b);
        this.b = aqtVar;
        aqtVar.a = this.a.toString();
        return anfVar;
    }

    public final void b(String str) {
        this.c.add(str);
    }
}
