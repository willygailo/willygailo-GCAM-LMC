package defpackage;

import j$.util.function.BiConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hei implements BiConsumer {
    private final /* synthetic */ int c;
    public static final /* synthetic */ hei b = new hei(1);
    public static final /* synthetic */ hei a = new hei(0);

    private /* synthetic */ hei(int i) {
        this.c = i;
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                mad madVar = (mad) obj2;
                if (madVar != null) {
                    madVar.close();
                }
                break;
            default:
                mad madVar2 = (mad) obj2;
                if (madVar2 != null) {
                    madVar2.close();
                }
                break;
        }
    }

    @Override // j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.c) {
            case 0:
                break;
        }
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
