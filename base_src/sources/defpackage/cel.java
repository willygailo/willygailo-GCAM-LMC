package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cel implements qcn {
    private final /* synthetic */ int c;
    public static final /* synthetic */ cel b = new cel(1);
    public static final /* synthetic */ cel a = new cel(0);

    private /* synthetic */ cel(int i) {
        this.c = i;
    }

    @Override // defpackage.qcn
    public final void a(Object obj) {
        switch (this.c) {
            case 0:
                List<nnj> list = (List) obj;
                list.size();
                for (nnj nnjVar : list) {
                    nnjVar.a();
                    nnjVar.b();
                }
                break;
            default:
                break;
        }
    }
}
