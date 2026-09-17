package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class mhk extends ClassLoader {
    private final ClassLoader a;
    private final Set b;

    public mhk(ClassLoader classLoader, Set set) {
        super(classLoader.getParent());
        this.a = classLoader;
        this.b = set;
    }

    @Override // java.lang.ClassLoader
    protected final Class findClass(String str) {
        return this.b.contains(str) ? this.a.loadClass(str) : super.findClass(str);
    }
}
