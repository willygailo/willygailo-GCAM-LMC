package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class olp extends old implements oqt {
    private static final long serialVersionUID = 7431625294878419160L;

    protected olp(Map map) {
        super(map);
    }

    @Override // defpackage.old
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.old
    public final Collection c(Object obj, Collection collection) {
        return new olc(this, obj, (Set) collection);
    }

    @Override // defpackage.old, defpackage.oqt
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Set b(Object obj) {
        return (Set) super.b(obj);
    }
}
