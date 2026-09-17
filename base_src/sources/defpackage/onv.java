package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class onv extends olp {
    private static final long serialVersionUID = 0;
    transient int e;

    private onv() {
        super(omf.e(12));
        this.e = 2;
        obr.aF(true);
        this.e = 2;
    }

    public static onv r() {
        return new onv();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.e = 2;
        int i = objectInputStream.readInt();
        k(omf.e(12));
        obr.I(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        obr.L(this, objectOutputStream);
    }

    @Override // defpackage.olp, defpackage.old
    public final /* bridge */ /* synthetic */ Collection a() {
        return new omh(this.e);
    }
}
