package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.apps.camera.bottombar.R;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public final class ade {
    private static final adc[] A;
    private static final adc[] B;
    private static final adc[] C;
    private static final adc D;
    private static final adc[] E;
    private static final adc[] F;
    private static final adc[] G;
    private static final adc[] H;
    private static final adc[] I;
    private static final HashMap[] J;
    private static final HashMap[] K;
    private static final HashSet L;
    private static final HashMap M;
    private static final byte[] N;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final String[] d;
    static final int[] e;
    static final byte[] f;
    static final adc[][] g;
    static final Charset h;
    static final byte[] i;
    private static final byte[] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final byte[] v;
    private static SimpleDateFormat w;
    private static SimpleDateFormat x;
    private static final adc[] y;
    private static final adc[] z;
    private final FileDescriptor O;
    private final AssetManager.AssetInputStream P;
    private int Q;
    private final HashMap[] R;
    private final Set S;
    private boolean T;
    private int U;
    private int V;
    private int W;
    private int X;
    public ByteOrder j;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        k = new byte[]{102, 116, 121, 112};
        l = new byte[]{109, 105, 102, 49};
        m = new byte[]{104, 101, 105, 99};
        n = new byte[]{79, 76, 89, 77, 80, 0};
        o = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        p = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        q = new byte[]{101, 88, 73, 102};
        r = new byte[]{73, 72, 68, 82};
        s = new byte[]{73, 69, 78, 68};
        t = new byte[]{82, 73, 70, 70};
        u = new byte[]{87, 69, 66, 80};
        v = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        e = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        adc[] adcVarArr = {new adc("NewSubfileType", 254, 4), new adc("SubfileType", 255, 4), new adc("ImageWidth", 256, 3, 4), new adc("ImageLength", 257, 3, 4), new adc("BitsPerSample", 258, 3), new adc("Compression", 259, 3), new adc("PhotometricInterpretation", 262, 3), new adc("ImageDescription", 270, 2), new adc("Make", 271, 2), new adc("Model", 272, 2), new adc("StripOffsets", 273, 3, 4), new adc("Orientation", 274, 3), new adc("SamplesPerPixel", 277, 3), new adc("RowsPerStrip", 278, 3, 4), new adc("StripByteCounts", 279, 3, 4), new adc("XResolution", 282, 5), new adc("YResolution", 283, 5), new adc("PlanarConfiguration", 284, 3), new adc("ResolutionUnit", 296, 3), new adc("TransferFunction", 301, 3), new adc("Software", 305, 2), new adc("DateTime", 306, 2), new adc("Artist", 315, 2), new adc("WhitePoint", 318, 5), new adc("PrimaryChromaticities", 319, 5), new adc("SubIFDPointer", 330, 4), new adc("JPEGInterchangeFormat", 513, 4), new adc("JPEGInterchangeFormatLength", 514, 4), new adc("YCbCrCoefficients", 529, 5), new adc("YCbCrSubSampling", 530, 3), new adc("YCbCrPositioning", 531, 3), new adc("ReferenceBlackWhite", 532, 5), new adc("Copyright", 33432, 2), new adc("ExifIFDPointer", 34665, 4), new adc("GPSInfoIFDPointer", 34853, 4), new adc("SensorTopBorder", 4, 4), new adc("SensorLeftBorder", 5, 4), new adc("SensorBottomBorder", 6, 4), new adc("SensorRightBorder", 7, 4), new adc("ISO", 23, 3), new adc("JpgFromRaw", 46, 7), new adc("Xmp", 700, 1)};
        y = adcVarArr;
        adc[] adcVarArr2 = {new adc("ExposureTime", 33434, 5), new adc("FNumber", 33437, 5), new adc("ExposureProgram", 34850, 3), new adc("SpectralSensitivity", 34852, 2), new adc("PhotographicSensitivity", 34855, 3), new adc("OECF", 34856, 7), new adc("SensitivityType", 34864, 3), new adc("StandardOutputSensitivity", 34865, 4), new adc("RecommendedExposureIndex", 34866, 4), new adc("ISOSpeed", 34867, 4), new adc("ISOSpeedLatitudeyyy", 34868, 4), new adc("ISOSpeedLatitudezzz", 34869, 4), new adc("ExifVersion", 36864, 2), new adc("DateTimeOriginal", 36867, 2), new adc("DateTimeDigitized", 36868, 2), new adc("OffsetTime", 36880, 2), new adc("OffsetTimeOriginal", 36881, 2), new adc("OffsetTimeDigitized", 36882, 2), new adc("ComponentsConfiguration", 37121, 7), new adc("CompressedBitsPerPixel", 37122, 5), new adc("ShutterSpeedValue", 37377, 10), new adc("ApertureValue", 37378, 5), new adc("BrightnessValue", 37379, 10), new adc("ExposureBiasValue", 37380, 10), new adc("MaxApertureValue", 37381, 5), new adc("SubjectDistance", 37382, 5), new adc("MeteringMode", 37383, 3), new adc("LightSource", 37384, 3), new adc("Flash", 37385, 3), new adc("FocalLength", 37386, 5), new adc("SubjectArea", 37396, 3), new adc("MakerNote", 37500, 7), new adc("UserComment", 37510, 7), new adc("SubSecTime", 37520, 2), new adc("SubSecTimeOriginal", 37521, 2), new adc("SubSecTimeDigitized", 37522, 2), new adc("FlashpixVersion", 40960, 7), new adc("ColorSpace", 40961, 3), new adc("PixelXDimension", 40962, 3, 4), new adc("PixelYDimension", 40963, 3, 4), new adc("RelatedSoundFile", 40964, 2), new adc("InteroperabilityIFDPointer", 40965, 4), new adc("FlashEnergy", 41483, 5), new adc("SpatialFrequencyResponse", 41484, 7), new adc("FocalPlaneXResolution", 41486, 5), new adc("FocalPlaneYResolution", 41487, 5), new adc("FocalPlaneResolutionUnit", 41488, 3), new adc("SubjectLocation", 41492, 3), new adc("ExposureIndex", 41493, 5), new adc("SensingMethod", 41495, 3), new adc("FileSource", 41728, 7), new adc("SceneType", 41729, 7), new adc("CFAPattern", 41730, 7), new adc("CustomRendered", 41985, 3), new adc("ExposureMode", 41986, 3), new adc("WhiteBalance", 41987, 3), new adc("DigitalZoomRatio", 41988, 5), new adc("FocalLengthIn35mmFilm", 41989, 3), new adc("SceneCaptureType", 41990, 3), new adc("GainControl", 41991, 3), new adc("Contrast", 41992, 3), new adc("Saturation", 41993, 3), new adc("Sharpness", 41994, 3), new adc("DeviceSettingDescription", 41995, 7), new adc("SubjectDistanceRange", 41996, 3), new adc("ImageUniqueID", 42016, 2), new adc("CameraOwnerName", 42032, 2), new adc("BodySerialNumber", 42033, 2), new adc("LensSpecification", 42034, 5), new adc("LensMake", 42035, 2), new adc("LensModel", 42036, 2), new adc("Gamma", 42240, 5), new adc("DNGVersion", 50706, 1), new adc("DefaultCropSize", 50720, 3, 4)};
        z = adcVarArr2;
        adc[] adcVarArr3 = {new adc("GPSVersionID", 0, 1), new adc("GPSLatitudeRef", 1, 2), new adc("GPSLatitude", 2, 5, 10), new adc("GPSLongitudeRef", 3, 2), new adc("GPSLongitude", 4, 5, 10), new adc("GPSAltitudeRef", 5, 1), new adc("GPSAltitude", 6, 5), new adc("GPSTimeStamp", 7, 5), new adc("GPSSatellites", 8, 2), new adc("GPSStatus", 9, 2), new adc("GPSMeasureMode", 10, 2), new adc("GPSDOP", 11, 5), new adc("GPSSpeedRef", 12, 2), new adc("GPSSpeed", 13, 5), new adc("GPSTrackRef", 14, 2), new adc("GPSTrack", 15, 5), new adc("GPSImgDirectionRef", 16, 2), new adc("GPSImgDirection", 17, 5), new adc("GPSMapDatum", 18, 2), new adc("GPSDestLatitudeRef", 19, 2), new adc("GPSDestLatitude", 20, 5), new adc("GPSDestLongitudeRef", 21, 2), new adc("GPSDestLongitude", 22, 5), new adc("GPSDestBearingRef", 23, 2), new adc("GPSDestBearing", 24, 5), new adc("GPSDestDistanceRef", 25, 2), new adc("GPSDestDistance", 26, 5), new adc("GPSProcessingMethod", 27, 7), new adc("GPSAreaInformation", 28, 7), new adc("GPSDateStamp", 29, 2), new adc("GPSDifferential", 30, 3), new adc("GPSHPositioningError", 31, 5)};
        A = adcVarArr3;
        adc[] adcVarArr4 = {new adc("InteroperabilityIndex", 1, 2)};
        B = adcVarArr4;
        adc[] adcVarArr5 = {new adc("NewSubfileType", 254, 4), new adc("SubfileType", 255, 4), new adc("ThumbnailImageWidth", 256, 3, 4), new adc("ThumbnailImageLength", 257, 3, 4), new adc("BitsPerSample", 258, 3), new adc("Compression", 259, 3), new adc("PhotometricInterpretation", 262, 3), new adc("ImageDescription", 270, 2), new adc("Make", 271, 2), new adc("Model", 272, 2), new adc("StripOffsets", 273, 3, 4), new adc("ThumbnailOrientation", 274, 3), new adc("SamplesPerPixel", 277, 3), new adc("RowsPerStrip", 278, 3, 4), new adc("StripByteCounts", 279, 3, 4), new adc("XResolution", 282, 5), new adc("YResolution", 283, 5), new adc("PlanarConfiguration", 284, 3), new adc("ResolutionUnit", 296, 3), new adc("TransferFunction", 301, 3), new adc("Software", 305, 2), new adc("DateTime", 306, 2), new adc("Artist", 315, 2), new adc("WhitePoint", 318, 5), new adc("PrimaryChromaticities", 319, 5), new adc("SubIFDPointer", 330, 4), new adc("JPEGInterchangeFormat", 513, 4), new adc("JPEGInterchangeFormatLength", 514, 4), new adc("YCbCrCoefficients", 529, 5), new adc("YCbCrSubSampling", 530, 3), new adc("YCbCrPositioning", 531, 3), new adc("ReferenceBlackWhite", 532, 5), new adc("Xmp", 700, 1), new adc("Copyright", 33432, 2), new adc("ExifIFDPointer", 34665, 4), new adc("GPSInfoIFDPointer", 34853, 4), new adc("DNGVersion", 50706, 1), new adc("DefaultCropSize", 50720, 3, 4)};
        C = adcVarArr5;
        D = new adc("StripOffsets", 273, 3);
        adc[] adcVarArr6 = {new adc("ThumbnailImage", 256, 7), new adc("CameraSettingsIFDPointer", 8224, 4), new adc("ImageProcessingIFDPointer", 8256, 4)};
        E = adcVarArr6;
        adc[] adcVarArr7 = {new adc("PreviewImageStart", 257, 4), new adc("PreviewImageLength", 258, 4)};
        F = adcVarArr7;
        adc[] adcVarArr8 = {new adc("AspectFrame", 4371, 3)};
        G = adcVarArr8;
        adc[] adcVarArr9 = {new adc("ColorSpace", 55, 3)};
        H = adcVarArr9;
        g = new adc[][]{adcVarArr, adcVarArr2, adcVarArr3, adcVarArr4, adcVarArr5, adcVarArr, adcVarArr6, adcVarArr7, adcVarArr8, adcVarArr9};
        I = new adc[]{new adc("SubIFDPointer", 330, 4), new adc("ExifIFDPointer", 34665, 4), new adc("GPSInfoIFDPointer", 34853, 4), new adc("InteroperabilityIFDPointer", 40965, 4), new adc("CameraSettingsIFDPointer", 8224, 1), new adc("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        h = charsetForName;
        i = "Exif\u0000\u0000".getBytes(charsetForName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        w = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        DesugarTimeZone.getTimeZone("UTC");
        x = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        DesugarTimeZone.getTimeZone("UTC");
        int i2 = 0;
        while (true) {
            adc[][] adcVarArr10 = g;
            int length = adcVarArr10.length;
            if (i2 >= 10) {
                HashMap map = M;
                adc[] adcVarArr11 = I;
                map.put(Integer.valueOf(adcVarArr11[0].a), 5);
                map.put(Integer.valueOf(adcVarArr11[1].a), 1);
                map.put(Integer.valueOf(adcVarArr11[2].a), 2);
                map.put(Integer.valueOf(adcVarArr11[3].a), 3);
                map.put(Integer.valueOf(adcVarArr11[4].a), 7);
                map.put(Integer.valueOf(adcVarArr11[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i2] = new HashMap();
            K[i2] = new HashMap();
            for (adc adcVar : adcVarArr10[i2]) {
                J[i2].put(Integer.valueOf(adcVar.a), adcVar);
                K[i2].put(adcVar.b, adcVar);
            }
            i2++;
        }
    }

    public ade(InputStream inputStream) throws Throwable {
        adc[][] adcVarArr = g;
        int length = adcVarArr.length;
        this.R = new HashMap[10];
        int length2 = adcVarArr.length;
        this.S = new HashSet(10);
        this.j = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.P = (AssetManager.AssetInputStream) inputStream;
            this.O = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                adf.a(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.P = null;
                this.O = fileInputStream.getFD();
            } catch (Exception e2) {
                this.P = null;
                this.O = null;
            }
        } else {
            this.P = null;
            this.O = null;
        }
        h(inputStream);
    }

    private final void c() throws Throwable {
        String strB = b("DateTimeOriginal");
        if (strB != null && b("DateTime") == null) {
            this.R[0].put("DateTime", adb.b(strB));
        }
        if (b("ImageWidth") == null) {
            this.R[0].put("ImageWidth", adb.c(0L, this.j));
        }
        if (b("ImageLength") == null) {
            this.R[0].put("ImageLength", adb.c(0L, this.j));
        }
        if (b("Orientation") == null) {
            this.R[0].put("Orientation", adb.c(0L, this.j));
        }
        if (b("LightSource") == null) {
            this.R[1].put("LightSource", adb.c(0L, this.j));
        }
    }

    private final void d(ada adaVar, int i2, int i3) throws Throwable {
        adaVar.b = ByteOrder.BIG_ENDIAN;
        byte b2 = adaVar.readByte();
        byte b3 = -1;
        if (b2 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b2 & 255));
        }
        if (adaVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(255));
        }
        int i4 = 2;
        while (true) {
            byte b4 = adaVar.readByte();
            if (b4 != b3) {
                throw new IOException("Invalid marker:" + Integer.toHexString(255 & b4));
            }
            byte b5 = adaVar.readByte();
            if (b5 == -39 || b5 == -38) {
                adaVar.b = this.j;
                return;
            }
            int unsignedShort = adaVar.readUnsignedShort() - 2;
            int i5 = i4 + 4;
            if (unsignedShort < 0) {
                throw new IOException("Invalid length");
            }
            switch (b5) {
                case -64:
                case -63:
                case -62:
                case -61:
                case -59:
                case -58:
                case -57:
                case -55:
                case -54:
                case -53:
                case -51:
                case -50:
                case -49:
                    adaVar.b(1);
                    this.R[i3].put(i3 != 4 ? "ImageLength" : "ThumbnailImageLength", adb.c(adaVar.readUnsignedShort(), this.j));
                    this.R[i3].put(i3 != 4 ? "ImageWidth" : "ThumbnailImageWidth", adb.c(adaVar.readUnsignedShort(), this.j));
                    unsignedShort -= 5;
                    break;
                case -31:
                    byte[] bArr = new byte[unsignedShort];
                    adaVar.readFully(bArr);
                    int i6 = i5 + unsignedShort;
                    byte[] bArr2 = i;
                    if (!aaq.d(bArr, bArr2)) {
                        byte[] bArr3 = N;
                        if (aaq.d(bArr, bArr3)) {
                            int length = i5 + bArr3.length;
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, unsignedShort);
                            if (b("Xmp") == null) {
                                this.R[0].put("Xmp", new adb(1, bArrCopyOfRange.length, length, bArrCopyOfRange));
                            }
                        }
                        i5 = i6;
                        unsignedShort = 0;
                    } else {
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr2.length, unsignedShort);
                        this.U = i2 + i5 + bArr2.length;
                        j(bArrCopyOfRange2, i3);
                        l(new ada(bArrCopyOfRange2));
                        i5 = i6;
                        unsignedShort = 0;
                    }
                    break;
                case -2:
                    byte[] bArr4 = new byte[unsignedShort];
                    if (adaVar.read(bArr4) != unsignedShort) {
                        throw new IOException("Invalid exif");
                    }
                    if (b("UserComment") == null) {
                        this.R[1].put("UserComment", adb.b(new String(bArr4, h)));
                    }
                    unsignedShort = 0;
                    break;
                    break;
            }
            if (unsignedShort < 0) {
                throw new IOException("Invalid length");
            }
            adaVar.b(unsignedShort);
            i4 = i5 + unsignedShort;
            b3 = -1;
        }
    }

    private final void e(ada adaVar) throws Throwable {
        adaVar.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = p;
        int length = bArr.length;
        adaVar.b(8);
        int length2 = bArr.length;
        int i2 = 8;
        while (true) {
            try {
                int i3 = adaVar.readInt();
                byte[] bArr2 = new byte[4];
                if (adaVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i4 = i2 + 8;
                if (i4 == 16) {
                    if (!Arrays.equals(bArr2, r)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    i4 = 16;
                }
                if (Arrays.equals(bArr2, s)) {
                    return;
                }
                if (Arrays.equals(bArr2, q)) {
                    byte[] bArr3 = new byte[i3];
                    if (adaVar.read(bArr3) != i3) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + aaq.c(bArr2));
                    }
                    int i5 = adaVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i5) {
                        this.U = i4;
                        j(bArr3, 0);
                        n();
                        l(new ada(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i5 + ", calculated CRC value: " + crc32.getValue());
                }
                int i6 = i3 + 4;
                adaVar.b(i6);
                i2 = i4 + i6;
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private final void f(ada adaVar) throws Throwable {
        adaVar.b = ByteOrder.LITTLE_ENDIAN;
        int length = t.length;
        adaVar.b(4);
        int i2 = adaVar.readInt() + 8;
        byte[] bArr = u;
        int length2 = bArr.length;
        adaVar.b(4);
        int length3 = bArr.length;
        int i3 = 12;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (adaVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i4 = adaVar.readInt();
                int i5 = i3 + 8;
                if (Arrays.equals(v, bArr2)) {
                    byte[] bArr3 = new byte[i4];
                    if (adaVar.read(bArr3) == i4) {
                        this.U = i5;
                        j(bArr3, 0);
                        l(new ada(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + aaq.c(bArr2));
                    }
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                i3 = i5 + i4;
                if (i3 == i2) {
                    return;
                }
                if (i3 > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                adaVar.b(i4);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private final void g(ada adaVar, HashMap map) throws Throwable {
        adb adbVar = (adb) map.get("JPEGInterchangeFormat");
        adb adbVar2 = (adb) map.get("JPEGInterchangeFormatLength");
        if (adbVar == null || adbVar2 == null) {
            return;
        }
        int iA = adbVar.a(this.j);
        int iA2 = adbVar2.a(this.j);
        if (this.Q == 7) {
            iA += this.V;
        }
        if (iA <= 0 || iA2 <= 0 || this.P != null || this.O != null) {
            return;
        }
        adaVar.skip(iA);
        adaVar.read(new byte[iA2]);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x016a A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0172 A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, LOOP:5: B:116:0x0165->B:121:0x0172, LOOP_END, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x017b A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0188 A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, LOOP:6: B:123:0x0176->B:128:0x0188, LOOP_END, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x018e A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, LOOP:4: B:111:0x0159->B:130:0x018e, LOOP_END, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0418 A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0421 A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0427 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x0429 A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x042e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:241:0x0430 A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:243:0x0481 A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:246:0x04b3 A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, LOOP:3: B:242:0x047f->B:246:0x04b3, LOOP_END, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:249:0x04be A[Catch: all -> 0x04c5, UnsupportedOperationException -> 0x04cb, IOException -> 0x04cd, TRY_LEAVE, TryCatch #11 {IOException -> 0x04cd, UnsupportedOperationException -> 0x04cb, all -> 0x04c5, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x003e, B:11:0x0044, B:12:0x004f, B:14:0x0052, B:25:0x0081, B:76:0x010a, B:136:0x01a4, B:144:0x01b7, B:146:0x01c4, B:185:0x02bb, B:234:0x040d, B:192:0x02cc, B:193:0x02cf, B:196:0x02d3, B:198:0x02e4, B:200:0x030d, B:204:0x031e, B:207:0x033f, B:208:0x0351, B:210:0x035f, B:212:0x0369, B:215:0x036d, B:217:0x0375, B:219:0x037c, B:221:0x0384, B:222:0x0389, B:223:0x03a5, B:201:0x0313, B:203:0x0319, B:226:0x03c4, B:228:0x03d6, B:229:0x03e3, B:232:0x0400, B:233:0x040a, B:235:0x0418, B:237:0x0421, B:239:0x0429, B:241:0x0430, B:243:0x0481, B:245:0x048f, B:246:0x04b3, B:249:0x04be, B:94:0x0138, B:111:0x0159, B:113:0x015e, B:116:0x0165, B:118:0x016a, B:121:0x0172, B:123:0x0176, B:125:0x017b, B:128:0x0188, B:130:0x018e, B:104:0x014d, B:105:0x0150, B:109:0x0155, B:86:0x011c, B:87:0x011f, B:91:0x0124, B:53:0x00d4, B:52:0x00cd, B:61:0x00e3, B:62:0x00e6, B:132:0x0194, B:134:0x019d), top: B:270:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:262:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x010f A[EDGE_INSN: B:78:0x010f->B:136:0x01a4 BREAK  A[LOOP:1: B:7:0x002d->B:134:0x019d]] */
    /* JADX WARN: Code duplicated, block: B:96:0x013f A[EDGE_INSN: B:96:0x013f->B:136:0x01a4 BREAK  A[LOOP:1: B:7:0x002d->B:134:0x019d]] */
    private final void h(InputStream inputStream) throws Throwable {
        int i2;
        ada adaVar;
        int i3;
        int i4;
        int i5;
        int unsignedShort;
        int unsignedShort2;
        int i6;
        int i7;
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i8;
        Throwable th;
        ada adaVar2;
        Throwable th2;
        ada adaVar3;
        Throwable th3;
        ada adaVar4;
        int i9;
        byte[] bArr;
        int i10;
        byte[] bArr2;
        int i11;
        byte[] bArr3;
        short s2;
        short s3;
        boolean z2;
        int i12 = 0;
        while (true) {
            try {
                int length = g.length;
                if (i12 >= 10) {
                    break;
                }
                this.R[i12] = new HashMap();
                i12++;
            } catch (IOException e2) {
            } catch (UnsupportedOperationException e3) {
            } catch (Throwable th4) {
                c();
                throw th4;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i13 = 0;
        while (true) {
            byte[] bArr5 = c;
            int length2 = bArr5.length;
            long j = 8;
            if (i13 >= 3) {
                i2 = 4;
                break;
            }
            if (bArr4[i13] != bArr5[i13]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                int i14 = 0;
                while (true) {
                    if (i14 >= bytes.length) {
                        i2 = 9;
                        break;
                    }
                    if (bArr4[i14] != bytes[i14]) {
                        try {
                            adaVar2 = new ada(bArr4);
                            try {
                                long j2 = adaVar2.readInt();
                                byte[] bArr6 = new byte[4];
                                adaVar2.read(bArr6);
                                if (Arrays.equals(bArr6, k)) {
                                    long j3 = 16;
                                    if (j2 == 1) {
                                        j2 = adaVar2.readLong();
                                        if (j2 >= 16) {
                                        }
                                    } else {
                                        j3 = j;
                                    }
                                    if (j2 > 5000) {
                                        j2 = 5000;
                                    }
                                    long j4 = j2 - j3;
                                    if (j4 >= j) {
                                        byte[] bArr7 = new byte[4];
                                        long j5 = 0;
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        while (true) {
                                            if (j5 < j4 / 4 && adaVar2.read(bArr7) == 4) {
                                                if (j5 != 1) {
                                                    if (Arrays.equals(bArr7, l)) {
                                                        z4 = true;
                                                    } else if (Arrays.equals(bArr7, m)) {
                                                        z3 = true;
                                                    }
                                                    if (z4 && z3) {
                                                        adaVar2.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                }
                                                j5++;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e4) {
                                if (adaVar2 != null) {
                                }
                                adaVar3 = new ada(bArr4);
                                try {
                                    ByteOrder byteOrderS = s(adaVar3);
                                    this.j = byteOrderS;
                                    adaVar3.b = byteOrderS;
                                    s3 = adaVar3.readShort();
                                    z2 = s3 == 20306 ? true : true;
                                    adaVar3.close();
                                    if (z2) {
                                        i2 = 7;
                                        break;
                                    }
                                    try {
                                        adaVar4 = new ada(bArr4);
                                        try {
                                            ByteOrder byteOrderS2 = s(adaVar4);
                                            this.j = byteOrderS2;
                                            adaVar4.b = byteOrderS2;
                                            s2 = adaVar4.readShort();
                                            adaVar4.close();
                                            if (s2 == 85) {
                                                i2 = 10;
                                                break;
                                            }
                                            i9 = 0;
                                            while (true) {
                                                bArr = p;
                                                int length3 = bArr.length;
                                                if (i9 < 8) {
                                                    i2 = 13;
                                                    break;
                                                }
                                                if (bArr4[i9] != bArr[i9]) {
                                                    i10 = 0;
                                                    while (true) {
                                                        bArr2 = t;
                                                        int length4 = bArr2.length;
                                                        if (i10 < 4) {
                                                            i11 = 0;
                                                            while (true) {
                                                                bArr3 = u;
                                                                int length5 = bArr3.length;
                                                                if (i11 < 4) {
                                                                    i2 = 14;
                                                                    break;
                                                                }
                                                                int length6 = t.length;
                                                                if (bArr4[i11 + 8] != bArr3[i11]) {
                                                                    i2 = 0;
                                                                    break;
                                                                }
                                                                i11++;
                                                            }
                                                        } else {
                                                            if (bArr4[i10] != bArr2[i10]) {
                                                                i2 = 0;
                                                                break;
                                                            }
                                                            i10++;
                                                        }
                                                    }
                                                } else {
                                                    i9++;
                                                }
                                            }
                                        } catch (Exception e5) {
                                            if (adaVar4 != null) {
                                                adaVar4.close();
                                            }
                                        } catch (Throwable th5) {
                                            th3 = th5;
                                            if (adaVar4 == null) {
                                                throw th3;
                                            }
                                            adaVar4.close();
                                            throw th3;
                                        }
                                    } catch (Exception e6) {
                                        adaVar4 = null;
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                        adaVar4 = null;
                                    }
                                } catch (Exception e7) {
                                    if (adaVar3 != null) {
                                        adaVar3.close();
                                    }
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    if (adaVar3 == null) {
                                        throw th2;
                                    }
                                    adaVar3.close();
                                    throw th2;
                                }
                                this.Q = i2;
                                if (i2 != 4) {
                                    adaVar = new ada(bufferedInputStream);
                                    i3 = this.Q;
                                    if (i3 == 4) {
                                        d(adaVar, 0, 0);
                                    } else if (i3 == 13) {
                                        e(adaVar);
                                    } else if (i3 == 9) {
                                        adaVar.b(84);
                                        byte[] bArr8 = new byte[4];
                                        byte[] bArr9 = new byte[4];
                                        byte[] bArr10 = new byte[4];
                                        adaVar.read(bArr8);
                                        adaVar.read(bArr9);
                                        adaVar.read(bArr10);
                                        int i15 = ByteBuffer.wrap(bArr8).getInt();
                                        int i16 = ByteBuffer.wrap(bArr9).getInt();
                                        int i17 = ByteBuffer.wrap(bArr10).getInt();
                                        byte[] bArr11 = new byte[i16];
                                        adaVar.b(i15 - adaVar.c);
                                        adaVar.read(bArr11);
                                        d(new ada(bArr11), i15, 5);
                                        adaVar.b(i17 - adaVar.c);
                                        adaVar.b = ByteOrder.BIG_ENDIAN;
                                        i4 = adaVar.readInt();
                                        for (i5 = 0; i5 < i4; i5++) {
                                            unsignedShort = adaVar.readUnsignedShort();
                                            unsignedShort2 = adaVar.readUnsignedShort();
                                            if (unsignedShort == D.a) {
                                                short s4 = adaVar.readShort();
                                                short s5 = adaVar.readShort();
                                                adb adbVarE = adb.e(s4, this.j);
                                                adb adbVarE2 = adb.e(s5, this.j);
                                                this.R[0].put("ImageLength", adbVarE);
                                                this.R[0].put("ImageWidth", adbVarE2);
                                                break;
                                            }
                                            adaVar.b(unsignedShort2);
                                        }
                                    } else if (i3 == 14) {
                                        f(adaVar);
                                    }
                                } else {
                                    adaVar = new ada(bufferedInputStream);
                                    i3 = this.Q;
                                    if (i3 == 4) {
                                        d(adaVar, 0, 0);
                                    } else if (i3 == 13) {
                                        e(adaVar);
                                    } else if (i3 == 9) {
                                        adaVar.b(84);
                                        byte[] bArr12 = new byte[4];
                                        byte[] bArr13 = new byte[4];
                                        byte[] bArr14 = new byte[4];
                                        adaVar.read(bArr12);
                                        adaVar.read(bArr13);
                                        adaVar.read(bArr14);
                                        int i18 = ByteBuffer.wrap(bArr12).getInt();
                                        int i19 = ByteBuffer.wrap(bArr13).getInt();
                                        int i110 = ByteBuffer.wrap(bArr14).getInt();
                                        byte[] bArr15 = new byte[i19];
                                        adaVar.b(i18 - adaVar.c);
                                        adaVar.read(bArr15);
                                        d(new ada(bArr15), i18, 5);
                                        adaVar.b(i110 - adaVar.c);
                                        adaVar.b = ByteOrder.BIG_ENDIAN;
                                        i4 = adaVar.readInt();
                                        while (i5 < i4) {
                                            unsignedShort = adaVar.readUnsignedShort();
                                            unsignedShort2 = adaVar.readUnsignedShort();
                                            if (unsignedShort == D.a) {
                                                short s6 = adaVar.readShort();
                                                short s7 = adaVar.readShort();
                                                adb adbVarE3 = adb.e(s6, this.j);
                                                adb adbVarE4 = adb.e(s7, this.j);
                                                this.R[0].put("ImageLength", adbVarE3);
                                                this.R[0].put("ImageWidth", adbVarE4);
                                                break;
                                            }
                                            adaVar.b(unsignedShort2);
                                        }
                                    } else if (i3 == 14) {
                                        f(adaVar);
                                    }
                                }
                                c();
                            } catch (Throwable th8) {
                                th = th8;
                                if (adaVar2 == null) {
                                    throw th;
                                }
                                adaVar2.close();
                                throw th;
                            }
                        } catch (Exception e8) {
                            adaVar2 = null;
                        } catch (Throwable th9) {
                            th = th9;
                            adaVar2 = null;
                        }
                        adaVar2.close();
                        try {
                            adaVar3 = new ada(bArr4);
                            ByteOrder byteOrderS3 = s(adaVar3);
                            this.j = byteOrderS3;
                            adaVar3.b = byteOrderS3;
                            s3 = adaVar3.readShort();
                            if (s3 == 20306 && s3 != 21330) {
                                z2 = false;
                            }
                            adaVar3.close();
                            if (z2) {
                                i2 = 7;
                                break;
                            }
                            adaVar4 = new ada(bArr4);
                            ByteOrder byteOrderS4 = s(adaVar4);
                            this.j = byteOrderS4;
                            adaVar4.b = byteOrderS4;
                            s2 = adaVar4.readShort();
                            adaVar4.close();
                            if (s2 == 85) {
                                i2 = 10;
                                break;
                            }
                            i9 = 0;
                            while (true) {
                                bArr = p;
                                int length7 = bArr.length;
                                if (i9 < 8) {
                                    i2 = 13;
                                    break;
                                }
                                if (bArr4[i9] != bArr[i9]) {
                                    i10 = 0;
                                    while (true) {
                                        bArr2 = t;
                                        int length8 = bArr2.length;
                                        if (i10 < 4) {
                                            i11 = 0;
                                            while (true) {
                                                bArr3 = u;
                                                int length9 = bArr3.length;
                                                if (i11 < 4) {
                                                    i2 = 14;
                                                    break;
                                                }
                                                int length10 = t.length;
                                                if (bArr4[i11 + 8] != bArr3[i11]) {
                                                    i2 = 0;
                                                    break;
                                                }
                                                i11++;
                                            }
                                        } else {
                                            if (bArr4[i10] != bArr2[i10]) {
                                                i2 = 0;
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                } else {
                                    i9++;
                                }
                            }
                        } catch (Exception e9) {
                            adaVar3 = null;
                        } catch (Throwable th10) {
                            th2 = th10;
                            adaVar3 = null;
                        }
                    } else {
                        i14++;
                        j = 8;
                    }
                }
            } else {
                i13++;
            }
        }
        this.Q = i2;
        if (i2 != 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            adaVar = new ada(bufferedInputStream);
            i3 = this.Q;
            if (i3 == 4) {
                d(adaVar, 0, 0);
            } else if (i3 == 13) {
                e(adaVar);
            } else if (i3 == 9) {
                adaVar.b(84);
                byte[] bArr16 = new byte[4];
                byte[] bArr17 = new byte[4];
                byte[] bArr18 = new byte[4];
                adaVar.read(bArr16);
                adaVar.read(bArr17);
                adaVar.read(bArr18);
                int i111 = ByteBuffer.wrap(bArr16).getInt();
                int i112 = ByteBuffer.wrap(bArr17).getInt();
                int i113 = ByteBuffer.wrap(bArr18).getInt();
                byte[] bArr19 = new byte[i112];
                adaVar.b(i111 - adaVar.c);
                adaVar.read(bArr19);
                d(new ada(bArr19), i111, 5);
                adaVar.b(i113 - adaVar.c);
                adaVar.b = ByteOrder.BIG_ENDIAN;
                i4 = adaVar.readInt();
                while (i5 < i4) {
                    unsignedShort = adaVar.readUnsignedShort();
                    unsignedShort2 = adaVar.readUnsignedShort();
                    if (unsignedShort == D.a) {
                        short s8 = adaVar.readShort();
                        short s9 = adaVar.readShort();
                        adb adbVarE5 = adb.e(s8, this.j);
                        adb adbVarE6 = adb.e(s9, this.j);
                        this.R[0].put("ImageLength", adbVarE5);
                        this.R[0].put("ImageWidth", adbVarE6);
                        break;
                    }
                    adaVar.b(unsignedShort2);
                }
            } else if (i3 == 14) {
                f(adaVar);
            }
        } else {
            ada adaVar5 = new ada(bufferedInputStream, (byte[]) null);
            int i20 = this.Q;
            if (i20 == 12) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        adg.a(mediaMetadataRetriever, new acz(adaVar5));
                        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                        String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                        String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                        String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                        if ("yes".equals(strExtractMetadata6)) {
                            strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                            strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                            strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                        } else if ("yes".equals(strExtractMetadata7)) {
                            strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                            strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                            strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                        } else {
                            strExtractMetadata = null;
                            strExtractMetadata2 = null;
                            strExtractMetadata3 = null;
                        }
                        if (strExtractMetadata != null) {
                            this.R[0].put("ImageWidth", adb.e(Integer.parseInt(strExtractMetadata), this.j));
                        }
                        if (strExtractMetadata2 != null) {
                            this.R[0].put("ImageLength", adb.e(Integer.parseInt(strExtractMetadata2), this.j));
                        }
                        if (strExtractMetadata3 != null) {
                            switch (Integer.parseInt(strExtractMetadata3)) {
                                case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                    i8 = 6;
                                    break;
                                case 180:
                                    i8 = 3;
                                    break;
                                case 270:
                                    i8 = 8;
                                    break;
                                default:
                                    i8 = 1;
                                    break;
                            }
                            this.R[0].put("Orientation", adb.e(i8, this.j));
                        }
                        if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                            int i21 = Integer.parseInt(strExtractMetadata4);
                            int i22 = Integer.parseInt(strExtractMetadata5);
                            if (i22 <= 6) {
                                throw new IOException("Invalid exif length");
                            }
                            adaVar5.c(i21);
                            byte[] bArr20 = new byte[6];
                            if (adaVar5.read(bArr20) != 6) {
                                throw new IOException("Can't read identifier");
                            }
                            int i23 = i21 + 6;
                            int i24 = i22 - 6;
                            if (!Arrays.equals(bArr20, i)) {
                                throw new IOException("Invalid identifier");
                            }
                            byte[] bArr21 = new byte[i24];
                            if (adaVar5.read(bArr21) != i24) {
                                throw new IOException("Can't read exif");
                            }
                            this.U = i23;
                            j(bArr21, 0);
                        }
                        mediaMetadataRetriever.release();
                    } catch (RuntimeException e10) {
                        throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                    }
                } catch (Throwable th11) {
                    mediaMetadataRetriever.release();
                    throw th11;
                }
            } else if (i20 == 7) {
                p(adaVar5);
                adb adbVar = (adb) this.R[1].get("MakerNote");
                if (adbVar != null) {
                    ada adaVar6 = new ada(adbVar.d, (byte[]) null);
                    adaVar6.b = this.j;
                    byte[] bArr22 = n;
                    int length11 = bArr22.length;
                    byte[] bArr23 = new byte[6];
                    adaVar6.readFully(bArr23);
                    adaVar6.c(0L);
                    byte[] bArr24 = o;
                    int length12 = bArr24.length;
                    byte[] bArr25 = new byte[10];
                    adaVar6.readFully(bArr25);
                    if (Arrays.equals(bArr23, bArr22)) {
                        adaVar6.c(8L);
                    } else if (Arrays.equals(bArr25, bArr24)) {
                        adaVar6.c(12L);
                    }
                    q(adaVar6, 6);
                    adb adbVar2 = (adb) this.R[7].get("PreviewImageStart");
                    adb adbVar3 = (adb) this.R[7].get("PreviewImageLength");
                    if (adbVar2 != null && adbVar3 != null) {
                        this.R[5].put("JPEGInterchangeFormat", adbVar2);
                        this.R[5].put("JPEGInterchangeFormatLength", adbVar3);
                    }
                    adb adbVar4 = (adb) this.R[8].get("AspectFrame");
                    if (adbVar4 != null) {
                        int[] iArr = (int[]) adbVar4.f(this.j);
                        if (iArr == null || iArr.length != 4) {
                            Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                        } else {
                            int i25 = iArr[2];
                            int i26 = iArr[0];
                            if (i25 > i26 && (i6 = iArr[3]) > (i7 = iArr[1])) {
                                int i27 = (i25 - i26) + 1;
                                int i28 = (i6 - i7) + 1;
                                if (i27 < i28) {
                                    int i29 = i27 + i28;
                                    i28 = i29 - i28;
                                    i27 = i29 - i28;
                                }
                                adb adbVarE7 = adb.e(i27, this.j);
                                adb adbVarE8 = adb.e(i28, this.j);
                                this.R[0].put("ImageWidth", adbVarE7);
                                this.R[0].put("ImageLength", adbVarE8);
                            }
                        }
                    }
                }
            } else if (i20 == 10) {
                p(adaVar5);
                adb adbVar5 = (adb) this.R[0].get("JpgFromRaw");
                if (adbVar5 != null) {
                    d(new ada(adbVar5.d), (int) adbVar5.c, 5);
                }
                adb adbVar6 = (adb) this.R[0].get("ISO");
                adb adbVar7 = (adb) this.R[1].get("PhotographicSensitivity");
                if (adbVar6 != null && adbVar7 == null) {
                    this.R[1].put("PhotographicSensitivity", adbVar6);
                }
            } else {
                p(adaVar5);
            }
            adaVar5.c(this.U);
            l(adaVar5);
        }
        c();
    }

    private final void i(ada adaVar) throws IOException {
        ByteOrder byteOrderS = s(adaVar);
        this.j = byteOrderS;
        adaVar.b = byteOrderS;
        int unsignedShort = adaVar.readUnsignedShort();
        int i2 = this.Q;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i3 = adaVar.readInt();
        if (i3 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i3);
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            adaVar.b(i4);
        }
    }

    private final void j(byte[] bArr, int i2) throws IOException {
        ada adaVar = new ada(bArr, (byte[]) null);
        i(adaVar);
        q(adaVar, i2);
    }

    private final void k(int i2, String str, String str2) {
        if (this.R[i2].isEmpty() || this.R[i2].get(str) == null) {
            return;
        }
        HashMap map = this.R[i2];
        map.put(str2, (adb) map.get(str));
        this.R[i2].remove(str);
    }

    private final void l(ada adaVar) throws Throwable {
        int length;
        int length2;
        adb adbVar;
        HashMap map = this.R[4];
        adb adbVar2 = (adb) map.get("Compression");
        if (adbVar2 == null) {
            g(adaVar, map);
            return;
        }
        switch (adbVar2.a(this.j)) {
            case 1:
            case 7:
                adb adbVar3 = (adb) map.get("BitsPerSample");
                if (adbVar3 != null) {
                    int[] iArr = (int[]) adbVar3.f(this.j);
                    int[] iArr2 = a;
                    if (!Arrays.equals(iArr2, iArr)) {
                        if (this.Q == 3 && (adbVar = (adb) map.get("PhotometricInterpretation")) != null) {
                            int iA = adbVar.a(this.j);
                            if (iA == 1) {
                                if (!Arrays.equals(iArr, b)) {
                                }
                            } else if (iA != 6 || !Arrays.equals(iArr, iArr2)) {
                            }
                        }
                    }
                    adb adbVar4 = (adb) map.get("StripOffsets");
                    adb adbVar5 = (adb) map.get("StripByteCounts");
                    if (adbVar4 != null && adbVar5 != null) {
                        long[] jArrE = aaq.e(adbVar4.f(this.j));
                        long[] jArrE2 = aaq.e(adbVar5.f(this.j));
                        if (jArrE == null || (length = jArrE.length) == 0) {
                            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        } else if (jArrE2 == null || (length2 = jArrE2.length) == 0) {
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                        } else if (length == length2) {
                            long j = 0;
                            for (long j2 : jArrE2) {
                                j += j2;
                            }
                            byte[] bArr = new byte[(int) j];
                            this.T = true;
                            int i2 = 0;
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                int length3 = jArrE.length;
                                if (i2 < length3) {
                                    int i5 = (int) jArrE[i2];
                                    int i6 = (int) jArrE2[i2];
                                    if (i2 < length3 - 1 && i5 + i6 != jArrE[i2 + 1]) {
                                        this.T = false;
                                    }
                                    int i7 = i5 - i3;
                                    if (i7 >= 0) {
                                        long j3 = i7;
                                        if (adaVar.skip(j3) == j3) {
                                            int i8 = i3 + i7;
                                            byte[] bArr2 = new byte[i6];
                                            if (adaVar.read(bArr2) == i6) {
                                                i3 = i8 + i6;
                                                System.arraycopy(bArr2, 0, bArr, i4, i6);
                                                i4 += i6;
                                                i2++;
                                            }
                                        }
                                    }
                                } else if (this.T) {
                                    long j4 = jArrE[0];
                                }
                            }
                        } else {
                            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                        }
                        break;
                    }
                }
                break;
            case 6:
                g(adaVar, map);
                break;
        }
    }

    private final void m(int i2, int i3) throws Throwable {
        if (this.R[i2].isEmpty() || this.R[i3].isEmpty()) {
            return;
        }
        adb adbVar = (adb) this.R[i2].get("ImageLength");
        adb adbVar2 = (adb) this.R[i2].get("ImageWidth");
        adb adbVar3 = (adb) this.R[i3].get("ImageLength");
        adb adbVar4 = (adb) this.R[i3].get("ImageWidth");
        if (adbVar == null || adbVar2 == null || adbVar3 == null || adbVar4 == null) {
            return;
        }
        int iA = adbVar.a(this.j);
        int iA2 = adbVar2.a(this.j);
        int iA3 = adbVar3.a(this.j);
        int iA4 = adbVar4.a(this.j);
        if (iA >= iA3 || iA2 >= iA4) {
            return;
        }
        HashMap[] mapArr = this.R;
        HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private final void n() throws Throwable {
        m(0, 5);
        m(0, 4);
        m(5, 4);
        adb adbVar = (adb) this.R[1].get("PixelXDimension");
        adb adbVar2 = (adb) this.R[1].get("PixelYDimension");
        if (adbVar != null && adbVar2 != null) {
            this.R[0].put("ImageWidth", adbVar);
            this.R[0].put("ImageLength", adbVar2);
        }
        if (this.R[4].isEmpty() && o(this.R[5])) {
            HashMap[] mapArr = this.R;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        o(this.R[4]);
        k(0, "ThumbnailOrientation", "Orientation");
        k(0, "ThumbnailImageLength", "ImageLength");
        k(0, "ThumbnailImageWidth", "ImageWidth");
        k(5, "ThumbnailOrientation", "Orientation");
        k(5, "ThumbnailImageLength", "ImageLength");
        k(5, "ThumbnailImageWidth", "ImageWidth");
        k(4, "Orientation", "ThumbnailOrientation");
        k(4, "ImageLength", "ThumbnailImageLength");
        k(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean o(HashMap map) {
        adb adbVar = (adb) map.get("ImageLength");
        adb adbVar2 = (adb) map.get("ImageWidth");
        if (adbVar == null || adbVar2 == null) {
            return false;
        }
        return adbVar.a(this.j) <= 512 && adbVar2.a(this.j) <= 512;
    }

    private final void p(ada adaVar) throws Throwable {
        adb adbVar;
        i(adaVar);
        q(adaVar, 0);
        r(adaVar, 0);
        r(adaVar, 5);
        r(adaVar, 4);
        n();
        if (this.Q != 8 || (adbVar = (adb) this.R[1].get("MakerNote")) == null) {
            return;
        }
        ada adaVar2 = new ada(adbVar.d, (byte[]) null);
        adaVar2.b = this.j;
        adaVar2.b(6);
        q(adaVar2, 9);
        adb adbVar2 = (adb) this.R[9].get("ColorSpace");
        if (adbVar2 != null) {
            this.R[1].put("ColorSpace", adbVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    private final void q(ada adaVar, int i2) throws IOException {
        long j;
        boolean z2;
        int i3;
        int i4;
        long unsignedShort;
        this.S.add(Integer.valueOf(adaVar.c));
        short s2 = adaVar.readShort();
        if (s2 > 0) {
            short s3 = 0;
            while (s3 < s2) {
                int unsignedShort2 = adaVar.readUnsignedShort();
                int unsignedShort3 = adaVar.readUnsignedShort();
                int i5 = adaVar.readInt();
                long j2 = ((long) adaVar.c) + 4;
                HashMap map = J[i2];
                Integer numValueOf = Integer.valueOf(unsignedShort2);
                adc adcVar = (adc) map.get(numValueOf);
                if (adcVar == null) {
                    j = 0;
                    z2 = false;
                } else if (unsignedShort3 > 0) {
                    int[] iArr = e;
                    int length = iArr.length;
                    if (unsignedShort3 >= 14) {
                        j = 0;
                        z2 = false;
                    } else {
                        int i6 = adcVar.c;
                        if (i6 != 7 && unsignedShort3 != 7 && i6 != unsignedShort3 && (i3 = adcVar.d) != unsignedShort3) {
                            if (i6 == 4) {
                                if (unsignedShort3 != 3) {
                                }
                            } else if (i3 == 4) {
                                i3 = 4;
                                if (unsignedShort3 != 3) {
                                }
                            }
                            if ((i6 != 9 && i3 != 9) || unsignedShort3 != 8) {
                                j = 0;
                            }
                        }
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i6;
                        }
                        j = ((long) iArr[unsignedShort3]) * ((long) i5);
                        z2 = j >= 0 && j <= 2147483647L;
                    }
                } else {
                    j = 0;
                }
                if (z2) {
                    if (j > 4) {
                        int i7 = adaVar.readInt();
                        if (this.Q != 7) {
                            i4 = i2;
                        } else if ("MakerNote".equals(adcVar.b)) {
                            this.V = i7;
                            i4 = i2;
                        } else if (i2 == 6) {
                            if ("ThumbnailImage".equals(adcVar.b)) {
                                this.W = i7;
                                this.X = i5;
                                adb adbVarE = adb.e(6, this.j);
                                adb adbVarC = adb.c(this.W, this.j);
                                adb adbVarC2 = adb.c(this.X, this.j);
                                this.R[4].put("Compression", adbVarE);
                                this.R[4].put("JPEGInterchangeFormat", adbVarC);
                                this.R[4].put("JPEGInterchangeFormatLength", adbVarC2);
                            }
                            i4 = 6;
                        } else {
                            i4 = i2;
                        }
                        adaVar.c(i7);
                    } else {
                        adcVar = adcVar;
                        s3 = s3;
                        i4 = i2;
                    }
                    Integer num = (Integer) M.get(numValueOf);
                    if (num != null) {
                        switch (unsignedShort3) {
                            case 3:
                                unsignedShort = adaVar.readUnsignedShort();
                                break;
                            case 4:
                                unsignedShort = adaVar.a();
                                break;
                            case 8:
                                unsignedShort = adaVar.readShort();
                                break;
                            case 9:
                            case 13:
                                unsignedShort = adaVar.readInt();
                                break;
                            default:
                                unsignedShort = -1;
                                break;
                        }
                        if (unsignedShort > 0 && !this.S.contains(Integer.valueOf((int) unsignedShort))) {
                            adaVar.c(unsignedShort);
                            q(adaVar, num.intValue());
                        }
                        adaVar.c(j2);
                    } else {
                        int i8 = adaVar.c;
                        int i9 = this.U;
                        byte[] bArr = new byte[(int) j];
                        adaVar.readFully(bArr);
                        adb adbVar = new adb(unsignedShort3, i5, i8 + i9, bArr);
                        adc adcVar2 = adcVar;
                        this.R[i4].put(adcVar2.b, adbVar);
                        if ("DNGVersion".equals(adcVar2.b)) {
                            this.Q = 3;
                        }
                        if ((("Make".equals(adcVar2.b) || "Model".equals(adcVar2.b)) && adbVar.g(this.j).contains("PENTAX")) || ("Compression".equals(adcVar2.b) && adbVar.a(this.j) == 65535)) {
                            this.Q = 8;
                        }
                        if (adaVar.c != j2) {
                            adaVar.c(j2);
                        }
                    }
                } else {
                    adaVar.c(j2);
                    s2 = s2;
                    s3 = s3;
                }
                s3 = (short) (s3 + 1);
                s2 = s2;
            }
            int i10 = adaVar.readInt();
            long j3 = i10;
            if (j3 <= 0 || this.S.contains(Integer.valueOf(i10))) {
                return;
            }
            adaVar.c(j3);
            if (this.R[4].isEmpty()) {
                q(adaVar, 4);
            } else if (this.R[5].isEmpty()) {
                q(adaVar, 5);
            }
        }
    }

    private final void r(ada adaVar, int i2) throws Throwable {
        adb adbVarE;
        adb adbVarE2;
        adb adbVar = (adb) this.R[i2].get("DefaultCropSize");
        adb adbVar2 = (adb) this.R[i2].get("SensorTopBorder");
        adb adbVar3 = (adb) this.R[i2].get("SensorLeftBorder");
        adb adbVar4 = (adb) this.R[i2].get("SensorBottomBorder");
        adb adbVar5 = (adb) this.R[i2].get("SensorRightBorder");
        if (adbVar != null) {
            if (adbVar.a == 5) {
                add[] addVarArr = (add[]) adbVar.f(this.j);
                if (addVarArr == null || addVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(addVarArr));
                    return;
                }
                adbVarE = adb.d(addVarArr[0], this.j);
                adbVarE2 = adb.d(addVarArr[1], this.j);
            } else {
                int[] iArr = (int[]) adbVar.f(this.j);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                adbVarE = adb.e(iArr[0], this.j);
                adbVarE2 = adb.e(iArr[1], this.j);
            }
            this.R[i2].put("ImageWidth", adbVarE);
            this.R[i2].put("ImageLength", adbVarE2);
            return;
        }
        if (adbVar2 != null && adbVar3 != null && adbVar4 != null && adbVar5 != null) {
            int iA = adbVar2.a(this.j);
            int iA2 = adbVar4.a(this.j);
            int iA3 = adbVar5.a(this.j);
            int iA4 = adbVar3.a(this.j);
            if (iA2 <= iA || iA3 <= iA4) {
                return;
            }
            adb adbVarE3 = adb.e(iA2 - iA, this.j);
            adb adbVarE4 = adb.e(iA3 - iA4, this.j);
            this.R[i2].put("ImageLength", adbVarE3);
            this.R[i2].put("ImageWidth", adbVarE4);
            return;
        }
        adb adbVar6 = (adb) this.R[i2].get("ImageLength");
        adb adbVar7 = (adb) this.R[i2].get("ImageWidth");
        if (adbVar6 == null || adbVar7 == null) {
            adb adbVar8 = (adb) this.R[i2].get("JPEGInterchangeFormat");
            adb adbVar9 = (adb) this.R[i2].get("JPEGInterchangeFormatLength");
            if (adbVar8 == null || adbVar9 == null) {
                return;
            }
            int iA5 = adbVar8.a(this.j);
            int iA6 = adbVar8.a(this.j);
            adaVar.c(iA5);
            byte[] bArr = new byte[iA6];
            adaVar.read(bArr);
            d(new ada(bArr), iA5, i2);
        }
    }

    private static final ByteOrder s(ada adaVar) throws IOException {
        short s2 = adaVar.readShort();
        switch (s2) {
            case 18761:
                return ByteOrder.LITTLE_ENDIAN;
            case 19789:
                return ByteOrder.BIG_ENDIAN;
            default:
                throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
        }
    }

    public final adb a(String str) {
        if (true == "ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i2 = 0;
        while (true) {
            int length = g.length;
            if (i2 >= 10) {
                return null;
            }
            adb adbVar = (adb) this.R[i2].get(str);
            if (adbVar != null) {
                return adbVar;
            }
            i2++;
        }
    }

    public final String b(String str) throws Throwable {
        double d2;
        adb adbVarA = a(str);
        if (adbVarA == null) {
            return null;
        }
        if (!L.contains(str)) {
            return adbVarA.g(this.j);
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = adbVarA.a;
            if (i2 != 5 && i2 != 10) {
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + adbVarA.a);
                return null;
            }
            add[] addVarArr = (add[]) adbVarA.f(this.j);
            if (addVarArr != null && addVarArr.length == 3) {
                add addVar = addVarArr[0];
                add addVar2 = addVarArr[1];
                add addVar3 = addVarArr[2];
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (addVar.a / addVar.b)), Integer.valueOf((int) (addVar2.a / addVar2.b)), Integer.valueOf((int) (addVar3.a / addVar3.b)));
            }
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(addVarArr));
            return null;
        }
        try {
            Object objF = adbVarA.f(this.j);
            if (objF == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objF instanceof String) {
                d2 = Double.parseDouble((String) objF);
            } else if (objF instanceof long[]) {
                long[] jArr = (long[]) objF;
                if (jArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = jArr[0];
            } else if (objF instanceof int[]) {
                int[] iArr = (int[]) objF;
                if (iArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = iArr[0];
            } else if (objF instanceof double[]) {
                double[] dArr = (double[]) objF;
                if (dArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = dArr[0];
            } else {
                if (!(objF instanceof add[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                add[] addVarArr2 = (add[]) objF;
                if (addVarArr2.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                add addVar4 = addVarArr2[0];
                double d3 = addVar4.a;
                double d4 = addVar4.b;
                Double.isNaN(d3);
                Double.isNaN(d4);
                d2 = d3 / d4;
            }
            return Double.toString(d2);
        } catch (NumberFormatException e2) {
            return null;
        }
    }
}
