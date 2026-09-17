package defpackage;

import java.io.FileDescriptor;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class cns implements lfc {
    private final ddf a;

    public cns(ddf ddfVar) {
        this.a = ddfVar;
    }

    @Override // defpackage.lfc
    public final mah a(FileDescriptor fileDescriptor, int i) {
        FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
        ddf ddfVar = this.a;
        ddi ddiVar = dcu.a;
        ddfVar.b();
        mkf mkfVarA = mkg.a();
        mkfVarA.c = 1;
        mkfVarA.b();
        return new mjr(new mkm(fileOutputStream, mkfVarA.a()), mip.bM("gca-muxer"));
    }
}
