package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aya extends ContextWrapper {
    static final ayo a = new ayo();
    public final bct b;
    public final ayi c;
    public final List d;
    public final Map e;
    public final bby f;
    public final int g;
    public final nvb h;
    private bkx i;

    public aya(Context context, bct bctVar, ayi ayiVar, Map map, List list, bby bbyVar, nvb nvbVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context.getApplicationContext());
        this.b = bctVar;
        this.c = ayiVar;
        this.d = list;
        this.e = map;
        this.f = bbyVar;
        this.h = nvbVar;
        this.g = 4;
    }

    public final synchronized bkx a() {
        if (this.i == null) {
            bkx bkxVar = new bkx();
            bkxVar.K();
            this.i = bkxVar;
        }
        return this.i;
    }
}
