package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class omz extends okm {
    private static final long serialVersionUID = 0;
    private transient Class c;

    public omz(Class cls) {
        super(new EnumMap(cls), obr.ab(((Enum[]) cls.getEnumConstants()).length));
        this.c = cls;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = (Class) objectInputStream.readObject();
        i(new EnumMap(this.c), new HashMap((((Enum[]) this.c.getEnumConstants()).length * 3) / 2));
        obr.H(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        obr.K(this, objectOutputStream);
    }

    @Override // defpackage.okm
    public final /* synthetic */ Object b(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    @Override // defpackage.okm, defpackage.ong, java.util.Map, defpackage.olt
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Enum) obj, obj2);
    }
}
