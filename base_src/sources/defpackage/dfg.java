package defpackage;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes.dex */
public final class dfg extends ContentObserver {
    public boolean a;
    public fcy b;
    private boolean c;

    public dfg() {
        super(null);
        this.c = false;
        this.a = false;
    }

    public final void a(boolean z) {
        this.c = z;
        if (z) {
            return;
        }
        this.a = false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.c) {
            this.a = true;
        }
    }
}
