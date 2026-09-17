package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ine implements ind {
    private final File b = new File("/sdcard/camera_test_score/");
    private final Instrumentation c;

    public ine(Instrumentation instrumentation) {
        this.c = instrumentation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ind
    public final void a(Intent intent) {
        oom oomVarL;
        ojc ojcVarI;
        ojc ojcVarI2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        int iB;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((oug) ((oug) a.c()).G((char) 3025)).o("Intent needs some extra parameters");
        }
        String string = extras.getString("com.google.android.apps.camera.testing.prod.scoreprint.SCORE_TYPE");
        if (string == null) {
            ((oug) ((oug) ind.a.c()).G((char) 3020)).o("No score type given");
            oomVarL = oom.l();
        } else {
            try {
                ooh oohVarE = oom.e();
                Iterator it = ojq.d(",").e(string).iterator();
                while (it.hasNext()) {
                    oohVarE.g(inc.a((String) it.next()));
                }
                oomVarL = oohVarE.f();
            } catch (IllegalArgumentException e) {
                ((oug) ((oug) ((oug) ind.a.c()).h(e)).G((char) 3019)).r("Unknown type:%s", string);
                oomVarL = oom.l();
            }
        }
        if (oomVarL.isEmpty()) {
            return;
        }
        String string2 = extras.getString("com.google.android.apps.camera.testing.prod.scoreprint.OUT_FILE_NAME");
        if (string2 == null) {
            ((oug) ((oug) ind.a.c()).G((char) 3018)).o("No file name given");
            ojcVarI = oih.a;
        } else {
            ojcVarI = ojc.i(string2);
        }
        if (!ojcVarI.g() || ((String) ojcVarI.c()).contains(File.separator)) {
            ((oug) ((oug) a.b()).G((char) 3024)).r("Wrong file name: %s", ojcVarI);
            return;
        }
        File file = new File(this.b, (String) ojcVarI.c());
        if (file.exists()) {
            try {
                ojcVarI2 = ojc.i(new String(oxh.w(file)));
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            ojcVarI2 = oih.a;
        }
        if (ojcVarI2.g()) {
            try {
                jSONObject = new JSONObject((String) ojcVarI2.c());
            } catch (JSONException e3) {
                ((oug) ((oug) ((oug) a.c()).h(e3)).G((char) 3023)).r("Invalid JSON data: %s", ojcVarI2.c());
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        try {
            otj it2 = oomVarL.iterator();
            while (it2.hasNext()) {
                inc incVar = (inc) it2.next();
                String strName = incVar.name();
                try {
                    jSONArray = jSONObject.getJSONArray(strName);
                } catch (JSONException e4) {
                    ((oug) ((oug) ((oug) a.b()).h(e4)).G((char) 3022)).r("The value is not an array: %s", jSONObject);
                    jSONArray = new JSONArray();
                }
                switch (incVar) {
                    case FIRST_PREVIEW_FRAME:
                        iB = b(ijf.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED);
                        continue;
                        jSONArray.put(iB);
                        jSONObject.put(strName, jSONArray);
                        break;
                    case SHUTTER_BUTTON_ENABLED:
                        iB = b(ijf.ACTIVITY_SHUTTER_BUTTON_ENABLED);
                        continue;
                        jSONArray.put(iB);
                        jSONObject.put(strName, jSONArray);
                        break;
                    default:
                        String strValueOf = String.valueOf(incVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 56);
                        sb.append("Shouldn't be reached: The switch statement should cover ");
                        sb.append(strValueOf);
                        throw new AssertionError(sb.toString());
                }
                throw new RuntimeException(e);
            }
            String string3 = jSONObject.toString();
            File parentFile = file.getParentFile();
            obr.ao(parentFile);
            parentFile.mkdirs();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    bufferedWriter.write(string3);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        } catch (JSONException e6) {
            throw new RuntimeException(e6);
        }
    }

    final int b(ijf ijfVar) {
        if (!this.c.e(CameraActivityTiming.class)) {
            ((oug) ((oug) a.c()).G((char) 3021)).o("No CameraActivitySession has recorded.");
            return 0;
        }
        CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.c.a(CameraActivityTiming.class);
        return (int) TimeUnit.NANOSECONDS.toMillis(cameraActivityTiming.g(ijfVar) - cameraActivityTiming.m);
    }
}
