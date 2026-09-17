package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.GoogleCameraEngR18F1.R;
import com.google.android.apps.camera.imax.cyclops.audio.AudioTrack;
import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;
import com.google.android.apps.camera.imax.cyclops.metadata.PanoMeta;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.io.ByteStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class eht implements hhn {
    private static final ouj b = ouj.h("com/google/android/apps/camera/imax/ImaxProcessingTask");
    public final hsa a;
    private final boolean c;
    private final ejs d = (ejs) ekh.a(ejs.class);
    private final eki e = (eki) ekh.a(eki.class);
    private final bww f;
    private final ddf g;
    private final List h;
    private final ljf i;
    private final jtx j;
    private final boolean k;
    private final ehc l;

    /* JADX WARN: Type inference failed for: r1v2, types: [hpr, java.lang.Object] */
    public eht(nox noxVar, hpu hpuVar, jtx jtxVar, ljf ljfVar, fix fixVar, lda ldaVar, ddf ddfVar, hsh hshVar, ehc ehcVar, Bitmap bitmap, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.l = ehcVar;
        this.c = ((Boolean) ldaVar.fA()).booleanValue();
        ddg ddgVar = ddn.a;
        this.h = new ArrayList();
        this.i = ljfVar;
        bww bwwVarC = fixVar.c();
        this.f = bwwVarC;
        this.j = jtxVar;
        this.k = z;
        this.g = ddfVar;
        String strConcat = String.valueOf(ehcVar.a).concat(".vr");
        hsg hsgVarA = hshVar.a(System.currentTimeMillis(), dxh.PANORAMA, "PANO");
        ?? r1 = noxVar.a.get();
        strConcat.getClass();
        hqh hqhVar = new hqh(r1, strConcat, bwwVarC, hsgVarA);
        this.a = hqhVar;
        int i = true != z ? 0 : 270;
        if (z) {
            Matrix matrix = new Matrix();
            matrix.postRotate(270.0f);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        ljfVar.g("imaxProcessing#startSession");
        hpuVar.e(hqhVar);
        hqhVar.P(lig.h(bitmap.getWidth(), bitmap.getHeight()));
        hqhVar.W(bitmap);
        hqhVar.U(bitmap, i);
        hqhVar.O(mip.ex(R.string.processing_panorama, new Object[0]));
        ljfVar.f();
    }

    @Override // defpackage.hhn
    public final /* synthetic */ hhm a() {
        return this.a;
    }

    @Override // defpackage.hhn
    public final String b() {
        String strValueOf = String.valueOf(this.a.h());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 19);
        sb.append("ImaxProcessingTask-");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // defpackage.hhn
    public final void c(lht lhtVar) {
        lhtVar.getClass();
        this.h.add(lhtVar);
    }

    /* JADX WARN: Code duplicated, block: B:244:0x0522 A[LOOP:0: B:243:0x0520->B:244:0x0522, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x0530  */
    /* JADX WARN: Code duplicated, block: B:278:0x059b A[LOOP:5: B:277:0x0599->B:278:0x059b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x05a7 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:284:0x05b9 A[LOOP:6: B:283:0x05b7->B:284:0x05b9, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hhn
    public final void d(Context context) throws Throwable {
        pjg pjgVar;
        Throwable th;
        pjg pjgVar2;
        oom oomVarJ;
        int size;
        Exception exc;
        oom oomVarJ2;
        int size2;
        File file;
        pjg pjgVar3;
        StereoPanorama stereoPanorama;
        IOException iOException;
        ExifInterface exifInterface;
        boolean z;
        lmg lmgVar;
        String string;
        IOException e;
        String strD;
        AudioTrack audioTrack;
        MediaFormat trackFormat;
        int i;
        Throwable th2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        oom oomVarJ3;
        int size3;
        int i2;
        File file2;
        File[] fileArrListFiles;
        eht ehtVar = this;
        Object obj = "mime";
        pjg pjgVar4 = new pjg(new ehs(ehtVar));
        int i3 = 0;
        try {
            try {
                if (!pjg.a && pjgVar4.c == null) {
                    Looper looper = pjgVar4.d;
                    if (looper == null) {
                        HandlerThread handlerThread = new HandlerThread("ProgressInterpolatorThread", 0);
                        handlerThread.start();
                        looper = handlerThread.getLooper();
                    }
                    pjgVar4.d = looper;
                    pjgVar4.c = new pjf(pjgVar4.b, pjgVar4.d);
                    pjf pjfVar = pjgVar4.c;
                    pjfVar.c = 0.0f;
                    pjfVar.a();
                    pjg.a = true;
                }
                pjgVar4.setRange(0.0f, 0.35f);
                if (ehtVar.d.computePose(ehtVar.l.a(), pjgVar4)) {
                    if (ehtVar.c) {
                        pjgVar4.setRange(0.35f, 0.93f);
                    } else {
                        pjgVar4.setRange(0.35f, 0.96f);
                    }
                    ehtVar.i.e("imaxProcessing#getStitchedPano");
                    ekl eklVar = new ekl(ehtVar.l, ehtVar.g.k(ddn.b), ((Float) ehtVar.g.g(ddn.c).c()).floatValue(), ((Float) ehtVar.g.g(ddn.d).c()).floatValue());
                    eklVar.c = ehtVar.k;
                    AtomicReference atomicReference = new AtomicReference();
                    Thread thread = new Thread(new ekk(eklVar, atomicReference, pjgVar4), "OfflineOmnistereoStitchThread");
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e2) {
                        ((oug) ((oug) ((oug) ekl.a.b()).h(e2)).G((char) 1220)).r("%s", e2.getMessage());
                    }
                    StereoPanorama stereoPanorama2 = (StereoPanorama) atomicReference.get();
                    ehtVar.i.f();
                    if (stereoPanorama2 == null) {
                        pjgVar = pjgVar4;
                        z = false;
                    } else {
                        pjgVar4.setRange(0.0f, 1.0f);
                        if (ehtVar.c) {
                            ehtVar.i.e("imaxProcessing#addAudio");
                            File cacheDir = context.getCacheDir();
                            String strB = ehtVar.l.b();
                            try {
                                File fileCreateTempFile = File.createTempFile("demuxed", "mp4", cacheDir);
                                String absolutePath = fileCreateTempFile.getAbsolutePath();
                                MediaExtractor mediaExtractor = new MediaExtractor();
                                try {
                                    mediaExtractor.setDataSource(strB);
                                    int trackCount = mediaExtractor.getTrackCount();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= trackCount) {
                                            i4 = -1;
                                            break;
                                        } else if (mediaExtractor.getTrackFormat(i4).getString("mime").startsWith("audio/")) {
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (i4 < 0) {
                                        ((oug) ((oug) eju.a.b()).G((char) 1207)).r("No video track found in %s", strB);
                                        trackFormat = null;
                                    } else {
                                        mediaExtractor.selectTrack(i4);
                                        trackFormat = mediaExtractor.getTrackFormat(i4);
                                    }
                                } catch (IOException e3) {
                                    ((oug) ((oug) eju.a.b()).G((char) 1208)).r("Could not open video file %s", strB);
                                    trackFormat = null;
                                }
                                if (trackFormat == null) {
                                    ((oug) ((oug) eju.a.b()).G((char) 1206)).r("Could not extract MediaFormat from %s", strB);
                                    trackFormat = null;
                                } else {
                                    eks eksVar = new eks(absolutePath, 1);
                                    int iA = eksVar.a(trackFormat);
                                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                    int i5 = 2048;
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
                                    while (true) {
                                        int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, i3);
                                        if (sampleData <= 0) {
                                            break;
                                        }
                                        if (sampleData == i5) {
                                            try {
                                                ((oug) ((oug) eju.a.b()).G((char) 1205)).o("Chunk size is the maximum size, we probably clamped the sample");
                                                i = 2048;
                                            } catch (Exception e4) {
                                                e = e4;
                                                pjgVar = pjgVar4;
                                                i3 = 0;
                                                exc = e;
                                                ((oug) ((oug) ((oug) b.b()).h(exc)).G(1165)).o("Failed to compute panorama");
                                                pjgVar.a();
                                                oomVarJ2 = oom.j(ehtVar.h);
                                                size2 = oomVarJ2.size();
                                                while (i3 < size2) {
                                                    ((lht) oomVarJ2.get(i3)).a(ehtVar);
                                                    i3++;
                                                }
                                                return;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj = pjgVar4;
                                                i3 = 0;
                                                th = th;
                                                pjgVar2 = obj;
                                                pjgVar2.a();
                                                oomVarJ = oom.j(ehtVar.h);
                                                size = oomVarJ.size();
                                                while (i3 < size) {
                                                    ((lht) oomVarJ.get(i3)).a(ehtVar);
                                                    i3++;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = sampleData;
                                        }
                                        bufferInfo.set(0, i, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                                        eksVar.c(iA, byteBufferAllocate, bufferInfo);
                                        mediaExtractor.advance();
                                        i3 = 0;
                                        i5 = 2048;
                                    }
                                    mediaExtractor.release();
                                    eksVar.b();
                                }
                                if (trackFormat == null) {
                                    audioTrack = null;
                                } else {
                                    int length = (int) fileCreateTempFile.length();
                                    byte[] bArr = new byte[length];
                                    try {
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        int i6 = 0;
                                        while (i6 < length) {
                                            try {
                                                int i7 = fileInputStream2.read(bArr, i6, length - i6);
                                                if (i7 < 0) {
                                                    break;
                                                } else {
                                                    i6 += i7;
                                                }
                                            } catch (IOException e5) {
                                                if (fileInputStream2 != null) {
                                                    try {
                                                        fileInputStream2.close();
                                                        bArr = null;
                                                    } catch (IOException e6) {
                                                        bArr = null;
                                                    }
                                                } else {
                                                    bArr = null;
                                                }
                                            } catch (Throwable th4) {
                                                th2 = th4;
                                                fileInputStream = fileInputStream2;
                                                if (fileInputStream == null) {
                                                    throw th2;
                                                }
                                                try {
                                                    fileInputStream.close();
                                                    throw th2;
                                                } catch (IOException e7) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                        try {
                                            fileInputStream2.close();
                                        } catch (IOException e8) {
                                        }
                                    } catch (IOException e9) {
                                        fileInputStream2 = null;
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        fileInputStream = null;
                                    }
                                    fileCreateTempFile.delete();
                                    audioTrack = bArr == null ? null : new AudioTrack(trackFormat.getString("mime"), bArr);
                                }
                            } catch (IOException e10) {
                                audioTrack = null;
                            }
                            byte[] bArr2 = stereoPanorama2.a;
                            StereoPanorama stereoPanorama3 = new StereoPanorama(bArr2, ehtVar.k ? bArr2 : stereoPanorama2.b, stereoPanorama2.c, audioTrack);
                            ehtVar.i.f();
                            pjgVar4.setProgress(0.96f);
                            stereoPanorama2 = stereoPanorama3;
                        }
                        pjgVar4.setRange(0.96f, 1.0f);
                        ehtVar.i.e("imaxProcessing#writePano");
                        ehc ehcVar = ehtVar.l;
                        String strA = ehcVar.a();
                        String str = File.separator;
                        String str2 = ehcVar.a;
                        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 7 + String.valueOf(str).length() + String.valueOf(str2).length());
                        sb.append(strA);
                        sb.append(str);
                        sb.append(str2);
                        sb.append(".vr.jpg");
                        File file3 = new File(sb.toString());
                        if (ehtVar.k) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                try {
                                    fileOutputStream.getChannel().write(ByteBuffer.wrap(stereoPanorama2.a));
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Throwable th6) {
                                    try {
                                        fileOutputStream.close();
                                        throw th6;
                                    } catch (Throwable th7) {
                                        throw th6;
                                    }
                                }
                            } catch (IOException e11) {
                                ((oug) ((oug) ((oug) b.b()).h(e11)).G((char) 1168)).o("Failed to write file.");
                            }
                        } else {
                            ehtVar.e.a(stereoPanorama2, file3.getPath(), pjgVar4);
                        }
                        String path = file3.getPath();
                        try {
                            try {
                                ExifInterface exifInterface2 = new ExifInterface();
                                exifInterface2.readExif(path);
                                lmi lmiVar = new lmi(exifInterface2);
                                if (ehtVar.f.b().g()) {
                                    try {
                                        lmiVar.d((Location) ehtVar.f.b().c());
                                    } catch (IOException e12) {
                                        iOException = e12;
                                        file = file3;
                                        pjgVar3 = pjgVar4;
                                        stereoPanorama = stereoPanorama2;
                                        i3 = 0;
                                        try {
                                            ((oug) ((oug) ((oug) b.b()).h(iOException)).G((char) 1164)).o("Could not read exif data");
                                            exifInterface = null;
                                            ehtVar = this;
                                            ehtVar.i.f();
                                            pjgVar = pjgVar3;
                                            try {
                                                pjgVar.setProgress(1.0f);
                                                try {
                                                    byte[] byteArray = ByteStreams.toByteArray(new FileInputStream(file));
                                                    hsa hsaVar = ehtVar.a;
                                                    PanoMeta panoMeta = stereoPanorama.c;
                                                    new lig(panoMeta.croppedAreaImageWidthPixels, panoMeta.croppedAreaImageHeightPixels);
                                                    ikc ikcVar = new ikc(mbs.JPEG);
                                                    ikcVar.a(exifInterface);
                                                    ikcVar.b(lic.CLOCKWISE_0);
                                                    hsaVar.r(byteArray, ikcVar);
                                                    z = true;
                                                } catch (FileNotFoundException e13) {
                                                    ((oug) ((oug) ((oug) b.b()).h(e13)).G((char) 1166)).o("File not found for saving");
                                                    z = true;
                                                } catch (IOException e14) {
                                                    ((oug) ((oug) ((oug) b.b()).h(e14)).G((char) 1167)).o("Unable to read file for saving");
                                                    z = true;
                                                }
                                                pjgVar.a();
                                                oomVarJ3 = oom.j(ehtVar.h);
                                                size3 = oomVarJ3.size();
                                                for (i2 = 0; i2 < size3; i2++) {
                                                    ((lht) oomVarJ3.get(i2)).a(ehtVar);
                                                }
                                                if (z) {
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            } catch (Exception e15) {
                                                e = e15;
                                                exc = e;
                                                ((oug) ((oug) ((oug) b.b()).h(exc)).G(1165)).o("Failed to compute panorama");
                                                pjgVar.a();
                                                oomVarJ2 = oom.j(ehtVar.h);
                                                size2 = oomVarJ2.size();
                                                while (i3 < size2) {
                                                    ((lht) oomVarJ2.get(i3)).a(ehtVar);
                                                    i3++;
                                                }
                                                return;
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            ehtVar = this;
                                            pjgVar = pjgVar3;
                                            exc = e;
                                            ((oug) ((oug) ((oug) b.b()).h(exc)).G(1165)).o("Failed to compute panorama");
                                            pjgVar.a();
                                            oomVarJ2 = oom.j(ehtVar.h);
                                            size2 = oomVarJ2.size();
                                            while (i3 < size2) {
                                                ((lht) oomVarJ2.get(i3)).a(ehtVar);
                                                i3++;
                                            }
                                            return;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            ehtVar = this;
                                            obj = pjgVar3;
                                            th = th;
                                            pjgVar2 = obj;
                                            pjgVar2.a();
                                            oomVarJ = oom.j(ehtVar.h);
                                            size = oomVarJ.size();
                                            while (i3 < size) {
                                                ((lht) oomVarJ.get(i3)).a(ehtVar);
                                                i3++;
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                lmiVar.e();
                                lmiVar.g(System.currentTimeMillis());
                                ExifInterface exifInterface3 = lmiVar.a;
                                ehtVar.j.a(exifInterface3);
                                String tagStringValue = exifInterface3.getTagStringValue(ExifInterface.h);
                                String tagStringValue2 = exifInterface3.getTagStringValue(ExifInterface.g);
                                String strB2 = lid.b(exifInterface3.u(ExifInterface.aT));
                                String strB3 = lid.b(exifInterface3.u(ExifInterface.aV));
                                String tagStringValue3 = exifInterface3.getTagStringValue(ExifInterface.aS);
                                String tagStringValue4 = exifInterface3.getTagStringValue(ExifInterface.aU);
                                String strB4 = lid.b(exifInterface3.u(ExifInterface.aX));
                                lmg lmgVarK = exifInterface3.k(ExifInterface.aW);
                                lid[] lidVarArrU = exifInterface3.u(ExifInterface.aY);
                                if (lidVarArrU != null) {
                                    stereoPanorama = stereoPanorama2;
                                    try {
                                        file = file3;
                                        if (lidVarArrU.length != 3) {
                                            pjgVar3 = pjgVar4;
                                            lmgVar = lmgVarK;
                                            string = null;
                                        } else {
                                            try {
                                                StringBuilder sb2 = new StringBuilder();
                                                int i8 = 0;
                                                while (true) {
                                                    pjgVar3 = pjgVar4;
                                                    try {
                                                        try {
                                                            int length2 = lidVarArrU.length;
                                                            if (i8 >= length2) {
                                                                break;
                                                            }
                                                            lid lidVar = lidVarArrU[i8];
                                                            lmg lmgVar2 = lmgVarK;
                                                            lid[] lidVarArr = lidVarArrU;
                                                            long j = lidVar.b != 1 ? 0L : lidVar.a;
                                                            if (j <= 9) {
                                                                sb2.append("0");
                                                            }
                                                            sb2.append(j);
                                                            if (i8 != length2 - 1) {
                                                                sb2.append(":");
                                                            }
                                                            i8++;
                                                            pjgVar4 = pjgVar3;
                                                            lmgVarK = lmgVar2;
                                                            lidVarArrU = lidVarArr;
                                                        } catch (IOException e17) {
                                                            e = e17;
                                                            iOException = e;
                                                            i3 = 0;
                                                            ((oug) ((oug) ((oug) b.b()).h(iOException)).G((char) 1164)).o("Could not read exif data");
                                                            exifInterface = null;
                                                        }
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                        i3 = 0;
                                                        ehtVar = this;
                                                        exc = e;
                                                        pjgVar = pjgVar3;
                                                        ((oug) ((oug) ((oug) b.b()).h(exc)).G(1165)).o("Failed to compute panorama");
                                                        pjgVar.a();
                                                        oomVarJ2 = oom.j(ehtVar.h);
                                                        size2 = oomVarJ2.size();
                                                        while (i3 < size2) {
                                                            ((lht) oomVarJ2.get(i3)).a(ehtVar);
                                                            i3++;
                                                        }
                                                        return;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        i3 = 0;
                                                        ehtVar = this;
                                                        th = th;
                                                        pjgVar2 = pjgVar3;
                                                        pjgVar2.a();
                                                        oomVarJ = oom.j(ehtVar.h);
                                                        size = oomVarJ.size();
                                                        while (i3 < size) {
                                                            ((lht) oomVarJ.get(i3)).a(ehtVar);
                                                            i3++;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                lmgVar = lmgVarK;
                                                string = sb2.toString();
                                            } catch (IOException e19) {
                                                e = e19;
                                                pjgVar3 = pjgVar4;
                                                iOException = e;
                                                i3 = 0;
                                                ((oug) ((oug) ((oug) b.b()).h(iOException)).G((char) 1164)).o("Could not read exif data");
                                                exifInterface = null;
                                            }
                                        }
                                    } catch (IOException e20) {
                                        e = e20;
                                        file = file3;
                                    }
                                } else {
                                    file = file3;
                                    pjgVar3 = pjgVar4;
                                    stereoPanorama = stereoPanorama2;
                                    lmgVar = lmgVarK;
                                    string = null;
                                }
                                try {
                                    String tagStringValue5 = exifInterface3.getTagStringValue(ExifInterface.bs);
                                    String tagStringValue6 = exifInterface3.getTagStringValue(ExifInterface.s);
                                    String tagStringValue7 = exifInterface3.getTagStringValue(ExifInterface.aM);
                                    String tagStringValue8 = exifInterface3.getTagStringValue(ExifInterface.ad);
                                    android.media.ExifInterface exifInterface4 = new android.media.ExifInterface(path);
                                    if (tagStringValue != null) {
                                        exifInterface4.setAttribute("Model", tagStringValue);
                                    }
                                    if (tagStringValue2 != null) {
                                        exifInterface4.setAttribute("Make", tagStringValue2);
                                    }
                                    if (strB2 != null) {
                                        exifInterface4.setAttribute("GPSLatitude", strB2);
                                    }
                                    if (strB3 != null) {
                                        exifInterface4.setAttribute("GPSLongitude", strB3);
                                    }
                                    if (tagStringValue3 != null) {
                                        exifInterface4.setAttribute("GPSLatitudeRef", tagStringValue3);
                                    }
                                    if (tagStringValue4 != null) {
                                        exifInterface4.setAttribute("GPSLongitudeRef", tagStringValue4);
                                    }
                                    if (string != null) {
                                        exifInterface4.setAttribute("GPSTimeStamp", string);
                                    }
                                    if (tagStringValue5 != null) {
                                        exifInterface4.setAttribute("GPSDateStamp", tagStringValue5);
                                    }
                                    if (strB4 != null) {
                                        exifInterface4.setAttribute("GPSAltitude", strB4);
                                    }
                                    if (lmgVar == null || !lmgVar.e()) {
                                        i3 = 0;
                                    } else {
                                        lmg lmgVar3 = lmgVar;
                                        Object obj2 = lmgVar3.f;
                                        byte[] bArr3 = obj2 instanceof byte[] ? (byte[]) obj2 : null;
                                        if (bArr3 == null || bArr3.length <= 0) {
                                            i3 = 0;
                                        } else {
                                            i3 = 0;
                                            try {
                                                if (bArr3[0] != -1 && (strD = lmgVar3.d()) != null) {
                                                    exifInterface4.setAttribute("GPSAltitudeRef", strD);
                                                }
                                            } catch (IOException e21) {
                                                e = e21;
                                                iOException = e;
                                                ((oug) ((oug) ((oug) b.b()).h(iOException)).G((char) 1164)).o("Could not read exif data");
                                                exifInterface = null;
                                            } catch (Exception e22) {
                                                e = e22;
                                                ehtVar = this;
                                                exc = e;
                                                pjgVar = pjgVar3;
                                                ((oug) ((oug) ((oug) b.b()).h(exc)).G(1165)).o("Failed to compute panorama");
                                                pjgVar.a();
                                                oomVarJ2 = oom.j(ehtVar.h);
                                                size2 = oomVarJ2.size();
                                                while (i3 < size2) {
                                                    ((lht) oomVarJ2.get(i3)).a(ehtVar);
                                                    i3++;
                                                }
                                                return;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                ehtVar = this;
                                                th = th;
                                                pjgVar2 = pjgVar3;
                                                pjgVar2.a();
                                                oomVarJ = oom.j(ehtVar.h);
                                                size = oomVarJ.size();
                                                while (i3 < size) {
                                                    ((lht) oomVarJ.get(i3)).a(ehtVar);
                                                    i3++;
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    if (tagStringValue6 != null) {
                                        exifInterface4.setAttribute("DateTime", tagStringValue6);
                                        exifInterface4.setAttribute("DateTimeOriginal", tagStringValue6);
                                        exifInterface4.setAttribute("DateTimeDigitized", tagStringValue6);
                                    }
                                    if (tagStringValue7 != null) {
                                        exifInterface4.setAttribute("OffsetTime", tagStringValue7);
                                        exifInterface4.setAttribute("OffsetTimeOriginal", tagStringValue7);
                                        exifInterface4.setAttribute("OffsetTimeDigitized", tagStringValue7);
                                    }
                                    if (tagStringValue8 != null) {
                                        exifInterface4.setAttribute("SubSecTime", tagStringValue8);
                                        exifInterface4.setAttribute("SubSecTimeOriginal", tagStringValue8);
                                        exifInterface4.setAttribute("SubSecTimeDigitized", tagStringValue8);
                                    }
                                    exifInterface4.saveAttributes();
                                    exifInterface = exifInterface3;
                                } catch (IOException e23) {
                                    e = e23;
                                    i3 = 0;
                                    iOException = e;
                                    ((oug) ((oug) ((oug) b.b()).h(iOException)).G((char) 1164)).o("Could not read exif data");
                                    exifInterface = null;
                                    ehtVar = this;
                                    ehtVar.i.f();
                                    pjgVar = pjgVar3;
                                    pjgVar.setProgress(1.0f);
                                    byte[] byteArray2 = ByteStreams.toByteArray(new FileInputStream(file));
                                    hsa hsaVar2 = ehtVar.a;
                                    PanoMeta panoMeta2 = stereoPanorama.c;
                                    new lig(panoMeta2.croppedAreaImageWidthPixels, panoMeta2.croppedAreaImageHeightPixels);
                                    ikc ikcVar2 = new ikc(mbs.JPEG);
                                    ikcVar2.a(exifInterface);
                                    ikcVar2.b(lic.CLOCKWISE_0);
                                    hsaVar2.r(byteArray2, ikcVar2);
                                    z = true;
                                    pjgVar.a();
                                    oomVarJ3 = oom.j(ehtVar.h);
                                    size3 = oomVarJ3.size();
                                    while (i2 < size3) {
                                        ((lht) oomVarJ3.get(i2)).a(ehtVar);
                                    }
                                    if (z) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            } catch (IOException e24) {
                                e = e24;
                                file = file3;
                                pjgVar3 = pjgVar4;
                                stereoPanorama = stereoPanorama2;
                            }
                            ehtVar = this;
                            try {
                                ehtVar.i.f();
                                pjgVar = pjgVar3;
                                pjgVar.setProgress(1.0f);
                                byte[] byteArray3 = ByteStreams.toByteArray(new FileInputStream(file));
                                hsa hsaVar3 = ehtVar.a;
                                PanoMeta panoMeta3 = stereoPanorama.c;
                                new lig(panoMeta3.croppedAreaImageWidthPixels, panoMeta3.croppedAreaImageHeightPixels);
                                ikc ikcVar3 = new ikc(mbs.JPEG);
                                ikcVar3.a(exifInterface);
                                ikcVar3.b(lic.CLOCKWISE_0);
                                hsaVar3.r(byteArray3, ikcVar3);
                                z = true;
                            } catch (Exception e25) {
                                e = e25;
                                pjgVar = pjgVar3;
                                exc = e;
                                ((oug) ((oug) ((oug) b.b()).h(exc)).G(1165)).o("Failed to compute panorama");
                                pjgVar.a();
                                oomVarJ2 = oom.j(ehtVar.h);
                                size2 = oomVarJ2.size();
                                while (i3 < size2) {
                                    ((lht) oomVarJ2.get(i3)).a(ehtVar);
                                    i3++;
                                }
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                obj = pjgVar3;
                                th = th;
                                pjgVar2 = obj;
                                pjgVar2.a();
                                oomVarJ = oom.j(ehtVar.h);
                                size = oomVarJ.size();
                                while (i3 < size) {
                                    ((lht) oomVarJ.get(i3)).a(ehtVar);
                                    i3++;
                                }
                                throw th;
                            }
                        } catch (Exception e26) {
                            e = e26;
                            i3 = 0;
                            ehtVar = this;
                            pjgVar = pjgVar4;
                            exc = e;
                            ((oug) ((oug) ((oug) b.b()).h(exc)).G(1165)).o("Failed to compute panorama");
                            pjgVar.a();
                            oomVarJ2 = oom.j(ehtVar.h);
                            size2 = oomVarJ2.size();
                            while (i3 < size2) {
                                ((lht) oomVarJ2.get(i3)).a(ehtVar);
                                i3++;
                            }
                            return;
                        } catch (Throwable th12) {
                            th = th12;
                            i3 = 0;
                            ehtVar = this;
                            obj = pjgVar4;
                            th = th;
                            pjgVar2 = obj;
                            pjgVar2.a();
                            oomVarJ = oom.j(ehtVar.h);
                            size = oomVarJ.size();
                            while (i3 < size) {
                                ((lht) oomVarJ.get(i3)).a(ehtVar);
                                i3++;
                            }
                            throw th;
                        }
                    }
                } else {
                    pjgVar = pjgVar4;
                    z = false;
                }
                pjgVar.a();
                oomVarJ3 = oom.j(ehtVar.h);
                size3 = oomVarJ3.size();
                while (i2 < size3) {
                    ((lht) oomVarJ3.get(i2)).a(ehtVar);
                }
                if (z || (fileArrListFiles = (file2 = new File(ehtVar.l.a())).listFiles()) == null) {
                    return;
                }
                int length3 = fileArrListFiles.length;
                while (i3 < length3) {
                    fileArrListFiles[i3].delete();
                    i3++;
                }
                file2.delete();
            } catch (Throwable th13) {
                th = th13;
            }
        } catch (Exception e27) {
            e = e27;
        } catch (Throwable th14) {
            th = th14;
        }
    }

    @Override // defpackage.hhn
    public final void e(lht lhtVar) {
        lhtVar.getClass();
        this.h.remove(lhtVar);
    }

    @Override // defpackage.hhn
    public final void f() {
    }

    @Override // defpackage.hhn
    public final void g() {
    }
}
