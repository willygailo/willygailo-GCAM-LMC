package com.google.android.libraries.microvideo;

import android.util.Log;
import com.google.common.io.ByteStreams;
import defpackage.ass;
import defpackage.ast;
import defpackage.mip;
import defpackage.nii;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class MicrovideoFiles {
    private static final byte[] MPEG4_FTYP_MARKER = {102, 116, 121, 112};
    private static final String TAG = "MicrovideoFiles";

    private MicrovideoFiles() {
    }

    public static void extractVideo(File file, File file2) throws ass, IOException {
        long videoOffset = getVideoOffset(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteStreams.skipFully(fileInputStream, videoOffset);
                ByteStreams.copy(fileInputStream, fileOutputStream);
                fileInputStream.close();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable th4) {
            }
            throw th3;
        }
    }

    public static ast extractXMPData(File file) {
        return nii.b(file.getPath());
    }

    public static long getVideoOffset(File file) throws ass, IOException {
        int iAC = mip.aC(extractXMPData(file));
        long length = file.length() - ((long) iAC);
        if (length <= 0 || !validateOffset(file, length)) {
            Log.w(TAG, String.format("MicroVideoOffset %d invalid. Attempting recovery", Integer.valueOf(iAC)));
            long jScanForMpeg4FtypAtom = scanForMpeg4FtypAtom(file);
            if (jScanForMpeg4FtypAtom >= 0) {
                return jScanForMpeg4FtypAtom;
            }
            throw new IOException("Could not recover starting offset.");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream.skip((-2) + length);
            fileInputStream.close();
            return length;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    public static boolean isMicrovideo(InputStream inputStream) {
        ast astVarA = nii.a(inputStream);
        if (astVarA == null) {
            return false;
        }
        try {
            return ((long) mip.aC(astVarA)) > 0;
        } catch (ass e) {
            return false;
        }
    }

    public static InputStream openVideoStream(File file) throws ass, IOException {
        long videoOffset = getVideoOffset(file);
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.skip(videoOffset);
        return fileInputStream;
    }

    private static long scanForMpeg4FtypAtom(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[4];
            ByteStreams.readFully(fileInputStream, bArr);
            long j = 4;
            while (true) {
                byte[] bArr2 = MPEG4_FTYP_MARKER;
                if (Arrays.equals(bArr, bArr2)) {
                    int length = bArr2.length;
                    fileInputStream.close();
                    return (j - ((long) length)) - 4;
                }
                int i = 0;
                while (i < 3) {
                    int i2 = i + 1;
                    bArr[i] = bArr[i2];
                    i = i2;
                }
                int i3 = fileInputStream.read();
                if (i3 < 0) {
                    fileInputStream.close();
                    return -1L;
                }
                bArr[3] = (byte) i3;
                j++;
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }

    private static boolean validateOffset(File file, long j) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteStreams.skipFully(fileInputStream, j + 4);
                byte[] bArr = new byte[4];
                ByteStreams.readFully(fileInputStream, bArr);
                boolean zEquals = Arrays.equals(bArr, MPEG4_FTYP_MARKER);
                fileInputStream.close();
                return zEquals;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (IOException e) {
            return false;
        }
    }
}
