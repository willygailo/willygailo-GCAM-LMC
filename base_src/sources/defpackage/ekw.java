package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ekw {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/video/VideoDecoder");
    public final Surface b;
    private final MediaCodec.BufferInfo i = new MediaCodec.BufferInfo();
    public MediaFormat d = null;
    public long e = 0;
    private long j = -1;
    private long k = 0;
    private boolean l = false;
    private boolean m = false;
    public boolean f = false;
    public ByteBuffer[] g = null;
    public MediaCodec h = null;
    public final MediaExtractor c = new MediaExtractor();

    public ekw(Surface surface) {
        this.b = surface;
    }

    public static MediaFormat b(MediaExtractor mediaExtractor, String str) {
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    i = -1;
                    break;
                }
                if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                    break;
                }
                i++;
            }
            if (i < 0) {
                ((oug) ((oug) a.b()).G((char) 1251)).r("No video track found in %s", str);
                return null;
            }
            mediaExtractor.selectTrack(i);
            return mediaExtractor.getTrackFormat(i);
        } catch (IOException e) {
            ((oug) ((oug) a.b()).G((char) 1252)).r("Could not open video file %s", str);
            return null;
        }
    }

    public final synchronized float a() {
        long j = this.e;
        if (j == 0) {
            return 1.0f;
        }
        return this.k / j;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    public final synchronized boolean c() {
        int iDequeueInputBuffer;
        boolean z = false;
        while (!z) {
            if (this.m) {
                return false;
            }
            if (!this.l && (iDequeueInputBuffer = this.h.dequeueInputBuffer(1000L)) >= 0) {
                int sampleData = this.c.readSampleData(this.g[iDequeueInputBuffer], 0);
                if (sampleData < 0) {
                    this.h.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.l = true;
                } else {
                    this.l = false;
                    this.h.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.c.getSampleTime(), 0);
                    this.c.advance();
                }
            }
            int iDequeueOutputBuffer = this.h.dequeueOutputBuffer(this.i, 1000L);
            if (iDequeueOutputBuffer >= 0) {
                this.k = this.i.presentationTimeUs;
                if ((this.i.flags & 4) > 0) {
                    if (this.i.size > 0) {
                        long j = this.k;
                        if (j <= 0 || j >= this.e) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    this.m = true;
                    this.k = this.e;
                } else if (this.k >= this.j) {
                    z = true;
                }
                this.h.releaseOutputBuffer(iDequeueOutputBuffer, z);
            }
        }
        this.j = Math.min(this.k + 1, this.e);
        return true;
    }
}
