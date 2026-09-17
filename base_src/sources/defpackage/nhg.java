package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nhg implements Externalizable {
    private static final long serialVersionUID = 1;
    public final List a = new ArrayList();

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            nhf nhfVar = new nhf();
            nhfVar.readExternal(objectInput);
            this.a.add(nhfVar);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        int size = this.a.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((nhf) this.a.get(i)).writeExternal(objectOutput);
        }
    }
}
