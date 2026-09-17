package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum oqm implements oiu {
    KEY,
    VALUE;

    @Override // defpackage.oiu
    public final /* synthetic */ Object a(Object obj) {
        switch (this) {
            case KEY:
                return ((Map.Entry) obj).getKey();
            case VALUE:
                return ((Map.Entry) obj).getValue();
            default:
                throw null;
        }
    }
}
