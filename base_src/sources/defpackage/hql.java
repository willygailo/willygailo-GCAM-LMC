package defpackage;

import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class hql {
    public static final ouj a = ouj.h("com/google/android/apps/camera/session/InflightFallbackSaver");
    private static final ojz d = obr.au(fob.e);
    public final ddf b;
    public final Executor c;
    private final File e;
    private final File f;
    private final hsh g;
    private final fjs h;

    public hql(File file, hsh hshVar, ddf ddfVar, fjs fjsVar, Executor executor) {
        this.e = new File(file, "inflight");
        this.f = new File(file, "inflight-mars");
        this.g = hshVar;
        this.b = ddfVar;
        this.h = fjsVar;
        this.c = executor;
    }

    public final void a(hsa hsaVar) {
        File file = hsaVar.j() == hss.MARS_STORE ? this.f : this.e;
        long jD = hsaVar.d();
        StringBuilder sb = new StringBuilder(31);
        sb.append("medres-");
        sb.append(jD);
        sb.append(".jpg");
        hsaVar.u(new hqk(this, new File(file, sb.toString()), hsaVar));
    }

    public final void b(boolean z) {
        File[] fileArrListFiles;
        hsc hscVar;
        hsg hsgVarB;
        Exception exc;
        ova ovaVarB;
        char c;
        File file = z ? this.f : this.e;
        file.getAbsolutePath();
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    try {
                        if (file2.length() != 0) {
                            Matcher matcher = ((Pattern) d.a()).matcher(file2.getName());
                            if (!matcher.matches()) {
                                String strValueOf = String.valueOf(file2.getName());
                                throw new IOException(strValueOf.length() != 0 ? "Unknown fallback file format: ".concat(strValueOf) : new String("Unknown fallback file format: "));
                            }
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            long j = Long.parseLong(strGroup);
                            long jConvert = TimeUnit.SECONDS.convert(System.currentTimeMillis() - j, TimeUnit.MILLISECONDS);
                            ddf ddfVar = this.b;
                            ddi ddiVar = ddl.a;
                            ddfVar.d();
                            hsgVarB = this.g.b(j, dxh.NONE, new String("RESTORED"), z ? hss.MARS_STORE : hss.MEDIA_STORE);
                            try {
                                hsc hscVarA = hsgVarB.a("jpg");
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(file2);
                                    try {
                                        FileOutputStream fileOutputStreamE = hscVarA.a.e();
                                        try {
                                            if (ByteStreams.copy(fileInputStream, fileOutputStreamE) == 0) {
                                                throw new IOException("Copy returned 0 bytes");
                                            }
                                            fileOutputStreamE.close();
                                            fileInputStream.close();
                                            hscVarA.c();
                                            hsgVarB.g();
                                            ((oug) ((oug) a.c()).G(2606)).r("Restored %s", hscVarA.a.b());
                                            fjs fjsVar = this.h;
                                            poy poyVarM = pbz.d.m();
                                            if (poyVarM.c) {
                                                poyVarM.m();
                                                poyVarM.c = false;
                                            }
                                            pbz pbzVar = (pbz) poyVarM.b;
                                            int i = pbzVar.a | 1;
                                            pbzVar.a = i;
                                            pbzVar.b = jConvert;
                                            pbzVar.c = 1;
                                            pbzVar.a = i | 2;
                                            fjsVar.g((pbz) poyVarM.j());
                                            try {
                                                file2.delete();
                                            } catch (Exception e) {
                                                exc = e;
                                                ovaVarB = a.b();
                                                c = 2607;
                                                ((oug) ((oug) ((oug) ovaVarB).h(exc)).G(c)).r("Failed to delete fallback file %s", file2);
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                fileOutputStreamE.close();
                                                throw th;
                                            } catch (Throwable th2) {
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        fileInputStream.close();
                                        throw th3;
                                    }
                                    try {
                                        fileInputStream.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        throw th3;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    hscVar = hscVarA;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                hscVar = null;
                            }
                            if (hscVar != null) {
                                hscVar.b();
                            }
                            if (hsgVarB != null) {
                                hsgVarB.d();
                            }
                            throw e;
                        }
                        ((oug) ((oug) a.b()).G(2610)).r("Failed to restore empty file: %s", file2);
                        try {
                            file2.delete();
                        } catch (Exception e4) {
                            exc = e4;
                            ovaVarB = a.b();
                            c = 2611;
                            ((oug) ((oug) ((oug) ovaVarB).h(exc)).G(c)).r("Failed to delete fallback file %s", file2);
                        }
                    } catch (IOException e5) {
                        e = e5;
                        hscVar = null;
                        hsgVarB = null;
                    }
                } catch (Throwable th5) {
                    try {
                        file2.delete();
                        throw th5;
                    } catch (Exception e6) {
                        ((oug) ((oug) ((oug) a.b()).h(e6)).G((char) 2608)).r("Failed to delete fallback file %s", file2);
                        throw th5;
                    }
                }
            }
        }
    }
}
