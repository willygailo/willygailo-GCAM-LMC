package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class azl implements azn {
    final /* synthetic */ InputStream a;
    final /* synthetic */ bct b;

    public azl(InputStream inputStream, bct bctVar) {
        this.a = inputStream;
        this.b = bctVar;
    }

    @Override // defpackage.azn
    public final int a(azg azgVar) throws IOException {
        try {
            return azgVar.a(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
