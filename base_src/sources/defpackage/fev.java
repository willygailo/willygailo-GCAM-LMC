package defpackage;

import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.ExifInterface;
import android.os.Build;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fev {
    public static final /* synthetic */ int a = 0;
    private static final ouj b = ouj.h("com/google/android/apps/camera/legacy/lightcycle/util/MetadataUtils");
    private static final NumberFormat c = NumberFormat.getInstance(Locale.US);

    public static float a(Map map) {
        if (map == null) {
            return 0.0f;
        }
        try {
            return (Integer.parseInt((String) map.get("cropped_area_width")) / Integer.parseInt((String) map.get("full_pano_width"))) * 360.0f;
        } catch (NumberFormatException e) {
            return 0.0f;
        }
    }

    public static Map b(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            try {
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        String[] strArrSplit = line.split(",", 2);
                        if (strArrSplit.length == 2) {
                            map.put(strArrSplit[0], strArrSplit[1].trim());
                        }
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                        }
                    }
                }
                bufferedReader.close();
                return map;
            } catch (IOException e2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void c(String str, Map map, String str2, boolean z, boolean z2, ojc ojcVar, long j, boolean z3) {
        if (str == null || !new File(str).exists()) {
            return;
        }
        File[] fileArrListFiles = new File(str2).listFiles(new FilenameFilter() { // from class: feu
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str3) {
                int i = fev.a;
                return str3.toLowerCase().endsWith(".jpg");
            }
        });
        String absolutePath = fileArrListFiles.length > 0 ? fileArrListFiles[0].getAbsolutePath() : null;
        try {
            ExifInterface exifInterface = new ExifInterface(str);
            if (absolutePath != null) {
                exifInterface.setAttribute("Make", new ExifInterface(absolutePath).getAttribute("Make"));
            } else {
                exifInterface.setAttribute("Make", Build.MANUFACTURER);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            exifInterface.setAttribute("ImageWidth", String.valueOf(options.outWidth));
            exifInterface.setAttribute("ImageLength", String.valueOf(options.outHeight));
            TimeZone timeZone = TimeZone.getDefault();
            String str3 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US).format(new Date(j));
            String strBl = mip.bl(j);
            int offset = timeZone.getOffset(j);
            int iAbs = Math.abs(offset);
            StringBuilder sb = new StringBuilder();
            String str4 = "-";
            if (offset >= 0) {
                str4 = "+";
            }
            sb.append(str4);
            long j2 = iAbs;
            sb.append(mip.bm(TimeUnit.MILLISECONDS.toHours(j2)));
            sb.append(":");
            sb.append(mip.bm(TimeUnit.MILLISECONDS.toMinutes(j2) % 60));
            String string = sb.toString();
            exifInterface.setAttribute("DateTime", str3);
            exifInterface.setAttribute("DateTimeOriginal", str3);
            exifInterface.setAttribute("DateTimeDigitized", str3);
            exifInterface.setAttribute("SubSecTime", strBl);
            exifInterface.setAttribute("SubSecTimeOriginal", strBl);
            exifInterface.setAttribute("SubSecTimeDigitized", strBl);
            exifInterface.setAttribute("OffsetTime", string);
            exifInterface.setAttribute("OffsetTimeOriginal", string);
            exifInterface.setAttribute("OffsetTimeDigitized", string);
            exifInterface.setAttribute("Model", Build.MODEL);
            if (map != null) {
                Double dE = null;
                Double dE2 = null;
                Double dE3 = null;
                Date dateI = null;
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()).equals("location_altitude")) {
                        dE = e(entry);
                    } else if (((String) entry.getKey()).equals("location_latitude")) {
                        dE2 = e(entry);
                    } else if (((String) entry.getKey()).equals("location_longitude")) {
                        dE3 = e(entry);
                    } else if (((String) entry.getKey()).equals("location_provider")) {
                        exifInterface.setAttribute("GPSProcessingMethod", (String) entry.getValue());
                    } else if (((String) entry.getKey()).equals("location_time")) {
                        dateI = i(entry);
                    }
                }
                if (dE != null) {
                    exifInterface.setAttribute("GPSAltitudeRef", dE.doubleValue() < 0.0d ? "1" : "0");
                }
                if (dE2 != null && dE3 != null) {
                    String strG = g(dE2.doubleValue());
                    String str5 = dE2.doubleValue() >= 0.0d ? "N" : "S";
                    String strG2 = g(dE3.doubleValue());
                    String str6 = dE3.doubleValue() >= 0.0d ? "E" : "W";
                    if (strG != null && strG2 != null) {
                        exifInterface.setAttribute("GPSLatitude", strG);
                        exifInterface.setAttribute("GPSLatitudeRef", str5);
                        exifInterface.setAttribute("GPSLongitude", strG2);
                        exifInterface.setAttribute("GPSLongitudeRef", str6);
                    }
                }
                if (dateI != null) {
                    DesugarTimeZone.getTimeZone("UTC");
                    exifInterface.setAttribute("GPSDateStamp", new SimpleDateFormat("yyyy:MM:dd", Locale.US).format(dateI));
                    exifInterface.setAttribute("GPSTimeStamp", new SimpleDateFormat("HH:mm:ss", Locale.US).format(dateI));
                }
            }
            exifInterface.saveAttributes();
        } catch (IOException e) {
            if (str.length() != 0) {
                "Write exif failed :".concat(str);
            } else {
                new String("Write exif failed :");
            }
        }
        if (z2 || ojcVar.g()) {
            ast astVarA = mde.a();
            if (z2) {
                try {
                    astVarA.j("UsePanoramaViewer", z);
                    astVarA.j("IsPhotosphere", z3);
                    astVarA.c("http://ns.google.com/photos/1.0/panorama/", "ProjectionType", "equirectangular");
                    if (map != null) {
                        Integer numF = null;
                        Integer numF2 = null;
                        Integer numF3 = null;
                        Integer numF4 = null;
                        Integer numF5 = null;
                        Integer numF6 = null;
                        Date dateI2 = null;
                        Date dateI3 = null;
                        Integer numF7 = null;
                        Integer numF8 = null;
                        Integer numF9 = null;
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (((String) entry2.getKey()).equals("full_pano_width")) {
                                numF3 = f(entry2);
                            } else if (((String) entry2.getKey()).equals("full_pano_height")) {
                                numF4 = f(entry2);
                            } else if (((String) entry2.getKey()).equals("cropped_area_width")) {
                                numF = f(entry2);
                            } else if (((String) entry2.getKey()).equals("cropped_area_height")) {
                                numF2 = f(entry2);
                            } else if (((String) entry2.getKey()).equals("cropped_area_top")) {
                                numF5 = f(entry2);
                            } else if (((String) entry2.getKey()).equals("cropped_area_left")) {
                                numF6 = f(entry2);
                            } else if (((String) entry2.getKey()).equals("first_photo_time")) {
                                dateI2 = i(entry2);
                            } else if (((String) entry2.getKey()).equals("last_photo_time")) {
                                dateI3 = i(entry2);
                            } else if (((String) entry2.getKey()).equals("source_photos_count")) {
                                numF7 = f(entry2);
                            } else if (((String) entry2.getKey()).equals("pose_heading")) {
                                numF8 = f(entry2);
                            } else if (((String) entry2.getKey()).equals("yaw_correction_deg")) {
                                numF9 = f(entry2);
                            }
                        }
                        if (numF != null && numF2 != null) {
                            astVarA.k("CroppedAreaImageHeightPixels", numF2.intValue());
                            astVarA.k("CroppedAreaImageWidthPixels", numF.intValue());
                        }
                        if (numF3 != null && numF4 != null) {
                            astVarA.k("FullPanoHeightPixels", numF4.intValue());
                            astVarA.k("FullPanoWidthPixels", numF3.intValue());
                        }
                        if (numF5 != null && numF6 != null) {
                            astVarA.k("CroppedAreaTopPixels", numF5.intValue());
                            astVarA.k("CroppedAreaLeftPixels", numF6.intValue());
                        }
                        if (dateI2 != null) {
                            astVarA.c("http://ns.google.com/photos/1.0/panorama/", "FirstPhotoDate", new atc(dateI2, DesugarTimeZone.getTimeZone("GMT")));
                        }
                        if (dateI3 != null) {
                            ((ati) astVarA).d("http://ns.google.com/photos/1.0/panorama/", "LastPhotoDate", new atc(dateI3, DesugarTimeZone.getTimeZone("GMT")), null);
                        }
                        if (numF7 != null) {
                            astVarA.k("SourcePhotosCount", numF7.intValue());
                        }
                        if (numF8 != null && numF9 != null) {
                            ((ati) astVarA).d("http://ns.google.com/photos/1.0/panorama/", "PoseHeadingDegrees", new Double(((numF8.intValue() + numF9.intValue()) + 720) % 360), null);
                        }
                    }
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options2);
                    int i = options2.outWidth;
                    int i2 = options2.outHeight;
                    astVarA.k("LargestValidInteriorRectLeft", 0);
                    astVarA.k("LargestValidInteriorRectTop", 0);
                    astVarA.k("LargestValidInteriorRectWidth", i);
                    astVarA.k("LargestValidInteriorRectHeight", i2);
                } catch (ass e2) {
                    String strValueOf = String.valueOf(e2.getLocalizedMessage());
                    if (strValueOf.length() != 0) {
                        "Set xmp property failed:".concat(strValueOf);
                        return;
                    } else {
                        new String("Set xmp property failed:");
                        return;
                    }
                }
            }
            if (ojcVar.g()) {
                mde.k(astVarA, (String) ojcVar.c());
            }
            if (mde.h(str, astVarA)) {
                return;
            }
            if (str.length() != 0) {
                "Write XMP meta to file failed:".concat(str);
            } else {
                new String("Write XMP meta to file failed:");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void d(String str, List list) throws Throwable {
        if (list.size() == 0) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(str);
            try {
                fileWriter2.write(h("%s,%d\n", "first_photo_time", Long.valueOf(((few) list.get(0)).a)));
                fileWriter2.write(h("%s,%d\n", "last_photo_time", Long.valueOf(((few) list.get(list.size() - 1)).a)));
                fileWriter2.write(h("%s,%d\n", "source_photos_count", Integer.valueOf(list.size())));
                fileWriter2.write(h("%s,%d\n", "pose_heading", Integer.valueOf(((few) list.get(0)).d)));
                for (int size = list.size() - 1; size >= 0; size--) {
                    Location location = ((few) list.get(size)).c;
                    if (location != null) {
                        fileWriter2.write(h("%s,%f\n", "location_altitude", Double.valueOf(location.getAltitude())));
                        fileWriter2.write(h("%s,%f\n", "location_latitude", Double.valueOf(location.getLatitude())));
                        fileWriter2.write(h("%s,%f\n", "location_longitude", Double.valueOf(location.getLongitude())));
                        fileWriter2.write(h("%s,%s\n", "location_provider", location.getProvider()));
                        fileWriter2.write(h("%s,%d\n", "location_time", Long.valueOf(location.getTime())));
                        break;
                    }
                }
                try {
                    fileWriter2.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                fileWriter = fileWriter2;
                try {
                    String strValueOf = String.valueOf(str);
                    if (strValueOf.length() != 0) {
                        "Could not write metadata file: ".concat(strValueOf);
                    } else {
                        new String("Could not write metadata file: ");
                    }
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileWriter = fileWriter2;
                if (fileWriter != null) {
                    fileWriter.close();
                }
                throw th;
            }
        } catch (IOException e5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static Double e(Map.Entry entry) {
        try {
            return Double.valueOf(c.parse((String) entry.getValue()).doubleValue());
        } catch (ParseException e) {
            ((oug) ((oug) ((oug) b.c()).h(e)).G(1670)).y("Parse double failed for %s ,value:%s", entry.getKey(), entry.getValue());
            return null;
        }
    }

    private static Integer f(Map.Entry entry) {
        try {
            return Integer.valueOf((String) entry.getValue());
        } catch (NumberFormatException e) {
            ((oug) ((oug) ((oug) b.c()).h(e)).G(1671)).y("Parse integer failed for %s ,value:%s", entry.getKey(), entry.getValue());
            return null;
        }
    }

    private static String g(double d) {
        String[] strArrSplit = Location.convert(Math.abs(d), 2).split(":");
        if (strArrSplit.length != 3) {
            return null;
        }
        try {
            float fFloatValue = c.parse(strArrSplit[2]).floatValue();
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length());
            sb.append(str);
            sb.append("/1,");
            sb.append(str2);
            sb.append("/1,");
            sb.append((int) (fFloatValue * 1000.0f));
            sb.append("/1000");
            return sb.toString();
        } catch (ParseException e) {
            ((oug) ((oug) b.c()).G(1672)).r("Could not parse float: %s", strArrSplit[2]);
            return null;
        }
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    private static Date i(Map.Entry entry) {
        try {
            return new Date(Long.parseLong((String) entry.getValue()));
        } catch (NumberFormatException e) {
            entry.getKey();
            entry.getValue();
            return null;
        }
    }
}
