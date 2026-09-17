package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hdh extends ldl {
    public hdh(lco lcoVar) {
        super(lcoVar);
    }

    @Override // defpackage.ldl
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        gjk gjkVar = (gjk) obj;
        boolean z = true;
        if (gjkVar != gjk.NORMAL_WITH_FLASH && gjkVar != gjk.HDR_PLUS_WITH_TORCH) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
