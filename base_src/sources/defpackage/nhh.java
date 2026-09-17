package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nhh implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean d;
    private boolean e;
    public String a = "";
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    private String f = "";

    public final int a() {
        return this.b.size();
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.d = true;
            this.a = utf;
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.b.add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.c.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.e = true;
            this.f = utf2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.d);
        if (this.d) {
            objectOutput.writeUTF(this.a);
        }
        int iA = a();
        objectOutput.writeInt(iA);
        for (int i = 0; i < iA; i++) {
            objectOutput.writeInt(((Integer) this.b.get(i)).intValue());
        }
        int size = this.c.size();
        objectOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            objectOutput.writeInt(((Integer) this.c.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.f);
        }
    }
}
