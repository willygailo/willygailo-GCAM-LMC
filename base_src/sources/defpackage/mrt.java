package defpackage;

import android.media.AudioFormat;

/* JADX INFO: loaded from: classes2.dex */
final class mrt {
    public final long b;
    public final int c;
    public final int d;
    public final Object a = new Object();
    public long e = 0;

    public mrt(AudioFormat audioFormat) {
        this.b = 1000000000 / ((long) audioFormat.getSampleRate());
        this.d = audioFormat.getChannelCount();
        this.c = a(audioFormat);
    }

    public static int a(AudioFormat audioFormat) {
        switch (audioFormat.getEncoding()) {
            case 1:
            case 2:
            case 13:
                return 2;
            case 3:
                return 1;
            case 4:
                return 4;
            default:
                String strValueOf = String.valueOf(audioFormat);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
                sb.append("Bad audio format ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
