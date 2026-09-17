package defpackage;

import android.system.Os;
import java.io.FileDescriptor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class adf {
    static long a(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, 0L, i);
    }

    public static /* synthetic */ int b(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i >= i2 ? 1 : -1;
    }

    public static lig c(leb lebVar, List list) {
        lig ligVar = new lig(0, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lig ligVar2 = (lig) it.next();
            if (ligVar2.a >= 300 && ligVar2.b >= 300 && lhs.h(ligVar2).equals(lhs.h(lebVar.c())) && (ligVar.b() == 0 || ligVar2.b() < ligVar.b())) {
                ligVar = ligVar2;
            }
        }
        return ligVar;
    }
}
