package defpackage;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class mkw {
    public static final short[][] a = {new short[]{2, 2}, new short[]{1, 1}, new short[]{5, 6}, new short[]{5, 1}, new short[]{6, 6}, new short[]{6, 7}, new short[]{9, 9}, new short[]{9, 10}, new short[]{4, 4}, new short[]{8, 9}};
    public static final short[] b = {2, 8, 13, 1, 4, 5, 16, 18};

    public static int a(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return 0;
    }
}
