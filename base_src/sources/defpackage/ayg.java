package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ayg extends ayd {
    public ayg(Class cls) {
        String strValueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 227);
        sb.append("Failed to find result encoder for resource class: ");
        sb.append(strValueOf);
        sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        super(sb.toString());
    }
}
