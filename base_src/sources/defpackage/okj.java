package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class okj extends okm {
    private static final long serialVersionUID = 0;

    public okj(Map map, okm okmVar) {
        super(map, okmVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.b = (okm) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b);
    }

    @Override // defpackage.okm
    public final Object b(Object obj) {
        return this.b.d(obj);
    }

    @Override // defpackage.okm
    public final Object d(Object obj) {
        return this.b.b(obj);
    }

    Object readResolve() {
        return this.b.e();
    }
}
