package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum mbs {
    DNG("image/x-adobe-dng", "dng"),
    GIF("image/gif", "gif"),
    JPEG("image/jpeg", "jpg"),
    PHOTOSPHERE("application/vnd.google.panorama360+jpg", "jpg"),
    MPEG4("video/mp4", "mp4"),
    THREE_GPP("video/3gpp", "3gp"),
    WEBM("video/webm", "webm"),
    OTHER;

    private static final Map k;
    private static final Set l;
    private static final Set m;
    public final String i;
    public final String j;

    static {
        oon oonVar = new oon();
        for (mbs mbsVar : values()) {
            oonVar.e(mbsVar.i, mbsVar);
        }
        k = oonVar.c();
        l = ope.K(DNG, GIF, JPEG, PHOTOSPHERE);
        m = ope.I(MPEG4, THREE_GPP);
    }

    mbs() {
        this.i = "";
        this.j = "";
    }

    mbs(String str, String str2) {
        this.i = str;
        this.j = str2;
    }

    public static mbs a(String str) {
        Map map = k;
        return !map.containsKey(str) ? OTHER : (mbs) map.get(str);
    }

    public final boolean b() {
        return l.contains(this);
    }

    public final boolean c() {
        return m.contains(this);
    }
}
