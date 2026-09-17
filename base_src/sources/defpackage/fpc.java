package defpackage;

import android.media.MediaExtractor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class fpc {
    private static final ouj a = ouj.h("com/google/android/apps/camera/microvideo/SafeMp4FixApplier");
    private final fpr b;

    public fpc(fpr fprVar) {
        this.b = fprVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(mak makVar) {
        ojc ojcVarI;
        Throwable th;
        oom oomVarO;
        if (this.b == fpr.FRAMEWORK) {
            try {
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    FileInputStream fileInputStreamB = fcy.b(makVar);
                    try {
                        mediaExtractor.setDataSource(fileInputStreamB.getFD());
                        int trackCount = mediaExtractor.getTrackCount();
                        FileInputStream fileInputStream = null;
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i >= trackCount) {
                                ojcVarI = oih.a;
                                fileInputStreamB.close();
                                break;
                            }
                            String string = mediaExtractor.getTrackFormat(i).getString("mime");
                            if (mip.aG(string) && (i2 = i2 + 1) == 2) {
                                ojcVarI = ojc.i(Integer.valueOf(i + 1));
                                fileInputStreamB.close();
                                break;
                            } else {
                                if (string.equals("application/motionphoto-highres")) {
                                    ojcVarI = ojc.i(Integer.valueOf(i + 1));
                                    fileInputStreamB.close();
                                    break;
                                }
                                i++;
                            }
                        }
                        mediaExtractor.release();
                        if (ojcVarI.g()) {
                            ojcVarI.c();
                            long jA = makVar.a();
                            int iIntValue = ((Integer) ojcVarI.c()).intValue();
                            FileInputStream fileInputStreamB2 = fcy.b(makVar);
                            try {
                                mlj mljVar = new mlj(fileInputStreamB2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, jA), Arrays.asList("moov", "trak", "stbl", "mdia"));
                                mlh mlhVar = new mlh(mljVar.a.position(), mljVar.a.limit());
                                mle mleVar = new mle(oih.a);
                                try {
                                    try {
                                        mljVar.b(mleVar, mljVar.a(mlhVar));
                                        List listC = mleVar.a("moov").c("trak");
                                        if (listC.size() < 2 || listC.size() > 10) {
                                            throw new mli(String.format(Locale.US, "This file has %d trak boxes", Integer.valueOf(listC.size())));
                                        }
                                        int iA = mleVar.a("moov").a("mvhd").b(mjh.c).a();
                                        if (iA == 0) {
                                            throw new mli("Video time scale is 0.");
                                        }
                                        Iterator it = listC.iterator();
                                        mlg mlgVar = null;
                                        mlg mlgVar2 = null;
                                        int iMax = 0;
                                        int iA2 = 0;
                                        while (it.hasNext()) {
                                            try {
                                                mle mleVar2 = (mle) it.next();
                                                mle mleVarA = mleVar2.a("tkhd");
                                                int iA3 = mleVarA.b(mjh.a).a();
                                                Iterator it2 = it;
                                                mlg mlgVarB = mleVarA.b(mjh.b);
                                                mle mleVarA2 = mleVar2.a("mdia").a("mdhd");
                                                if (iA3 != iIntValue) {
                                                    iMax = Math.max(iMax, mlgVarB.a());
                                                } else {
                                                    mlg mlgVarB2 = mleVarA2.b(mjh.f);
                                                    iA2 = mleVarA2.b(mjh.e).a();
                                                    if (iA2 == 0) {
                                                        throw new mli("Media time scale is 0.");
                                                    }
                                                    mlgVar = mlgVarB;
                                                    mlgVar2 = mlgVarB2;
                                                }
                                                it = it2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileInputStream = fileInputStreamB2;
                                            }
                                        }
                                        if (mlgVar == null || iA2 == 0 || mlgVar2 == null) {
                                            StringBuilder sb = new StringBuilder(28);
                                            sb.append("Track ");
                                            sb.append(iIntValue);
                                            sb.append(" not found.");
                                            throw new mli(sb.toString());
                                        }
                                        mlg mlgVarB3 = mleVar.a("moov").a("mvhd").b(mjh.d);
                                        if (mlgVarB3.a() <= iMax) {
                                            String.format("Not fixing video since entire video length %d is shorter than the high-res track %d (video units)", Integer.valueOf(mlgVarB3.a()), Integer.valueOf(iMax));
                                            oomVarO = oom.l();
                                        } else {
                                            long jA2 = mjh.a(iA, mlgVarB3.a());
                                            long jA3 = mjh.a(iA, mlgVar.a());
                                            long jA4 = mjh.a(iA2, mlgVar2.a());
                                            long jA5 = mjh.a(iA, iMax);
                                            if (jA2 == 0 || jA3 == 0 || jA4 == 0 || jA5 == 0) {
                                                throw new mli(String.format(Locale.US, "Zero video lengths? %d %d %d %d", Long.valueOf(jA2), Long.valueOf(jA3), Long.valueOf(jA4), Long.valueOf(jA5)));
                                            }
                                            if (jA2 != jA3) {
                                                throw new mli(String.format(Locale.US, "Video length %d, but longest (high-res) track is %d", Long.valueOf(jA2), Long.valueOf(jA3)));
                                            }
                                            if (Math.abs(jA3 - jA4) > Math.max(jA3, jA4) / 8) {
                                                throw new mli(String.format(Locale.US, "Track and media lengths of the high-res track substantially different: %d vs %d", Long.valueOf(jA3), Long.valueOf(jA4)));
                                            }
                                            double d = jA5;
                                            double d2 = jA4;
                                            Double.isNaN(d2);
                                            if (d < d2 * 0.25d) {
                                                throw new mli(String.format(Locale.US, "Target length too short: %d to %d?", Long.valueOf(jA2), Long.valueOf(jA5)));
                                            }
                                            long jA6 = mjh.a(iA, mlgVarB3.a());
                                            long jA7 = mjh.a(iA, iMax);
                                            String.format(Locale.US, "Fixing video length from %d us to %d us", Long.valueOf(jA6), Long.valueOf(jA7));
                                            oomVarO = oom.o(new mjg(mlgVarB3.a, iMax), new mjg(mlgVar.a, iMax), new mjg(mlgVar2.a, (int) ((((long) iA2) * jA7) / 1000000)));
                                        }
                                        fileInputStreamB2.close();
                                        if (oomVarO.isEmpty()) {
                                            return;
                                        }
                                        FileOutputStream fileOutputStreamE = makVar.e();
                                        try {
                                            otj it3 = oomVarO.iterator();
                                            while (it3.hasNext()) {
                                                mjg mjgVar = (mjg) it3.next();
                                                fileOutputStreamE.getChannel().position(mjgVar.a);
                                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                                                byteBufferAllocate.putInt(mjgVar.b);
                                                fileOutputStreamE.getChannel().write(byteBufferAllocate);
                                            }
                                            fileOutputStreamE.close();
                                            return;
                                        } catch (Throwable th3) {
                                            try {
                                                fileOutputStreamE.close();
                                                throw th3;
                                            } catch (Throwable th4) {
                                                throw th3;
                                            }
                                        }
                                    } catch (Exception e) {
                                        throw new mli(e);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    th = th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                fileInputStream = fileInputStreamB2;
                            }
                            th = th;
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (Throwable th7) {
                                throw th;
                            }
                        }
                    } catch (Throwable th8) {
                        try {
                            fileInputStreamB.close();
                            throw th8;
                        } catch (Throwable th9) {
                            throw th8;
                        }
                    }
                } catch (Throwable th10) {
                    mediaExtractor.release();
                    throw th10;
                }
            } catch (IOException | mli e2) {
                ((oug) ((oug) ((oug) a.b()).h(e2)).G((char) 1835)).o("Couldn't apply MP4 fix");
            }
        }
    }
}
