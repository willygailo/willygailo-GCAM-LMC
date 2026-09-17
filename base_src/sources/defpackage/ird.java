package defpackage;

import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ird {
    public final FloatBuffer a;
    public final int b;
    public final int c;
    public final int d;
    public final ShortBuffer e;
    public int[] f = new int[1];
    public int[] g = new int[2];
    public int h = 0;
    public final mip i;
    private int j;

    public ird(mip mipVar, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.i = mipVar;
        this.c = i;
        this.b = i2;
        int iB = b(35633, "      attribute vec4 a_vertex;\n      varying vec2 o_texture;\n      void main() {\n        // Scale the position to [-1, 1]\n        gl_Position.xy = a_vertex.xy * 2.0 - 1.0;\n        gl_Position.z = 0.0;\n        gl_Position.w = 1.0;\n        o_texture = a_vertex.zw;\n      }");
        int iB2 = b(35632, "      uniform sampler2D texture;\n      varying vec2 o_texture;\n      void main() {\n        vec3 val = texture2D(texture, o_texture).rgb;\n        gl_FragColor = vec4(val, 1.0);\n      }");
        int iGlCreateProgram = GLES30.glCreateProgram();
        this.j = iGlCreateProgram;
        GLES30.glAttachShader(iGlCreateProgram, iB);
        GLES30.glAttachShader(this.j, iB2);
        GLES30.glLinkProgram(this.j);
        GLES30.glUseProgram(this.j);
        GLES30.glGenBuffers(2, this.g, 0);
        GLES30.glBindBuffer(35051, this.g[0]);
        int i3 = i * 4 * i2;
        GLES30.glBufferData(35051, i3, null, 35045);
        GLES30.glBindBuffer(35051, this.g[1]);
        GLES30.glBufferData(35051, i3, null, 35045);
        GLES30.glBindBuffer(35051, 0);
        GLES30.glGenTextures(1, this.f, 0);
        GLES30.glActiveTexture(33984);
        GLES30.glBindTexture(3553, this.f[0]);
        GLES30.glTexParameterf(3553, 10242, 33071.0f);
        GLES30.glTexParameterf(3553, 10243, 33071.0f);
        GLES30.glTexParameterf(3553, 10241, 9729.0f);
        GLES30.glTexParameterf(3553, 10240, 9729.0f);
        this.d = GLES30.glGetAttribLocation(this.j, "a_vertex");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1452);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        for (int i4 = 0; i4 < 11; i4++) {
            for (int i5 = 0; i5 < 11; i5++) {
                int i6 = (i4 * 12) + i5;
                short s = (short) (i6 + 1);
                int i7 = ((i4 + 1) * 12) + i5;
                short s2 = (short) i7;
                shortBufferAsShortBuffer.put((short) i6);
                shortBufferAsShortBuffer.put(s);
                shortBufferAsShortBuffer.put(s2);
                shortBufferAsShortBuffer.put(s);
                shortBufferAsShortBuffer.put((short) (i7 + 1));
                shortBufferAsShortBuffer.put(s2);
            }
        }
        this.e = shortBufferAsShortBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(2304);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.a = byteBufferAllocateDirect2.asFloatBuffer();
    }

    private static int b(int i, String str) {
        int iGlCreateShader = GLES30.glCreateShader(i);
        GLES30.glShaderSource(iGlCreateShader, str);
        GLES30.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    public final int a() {
        return 1 - this.h;
    }
}
