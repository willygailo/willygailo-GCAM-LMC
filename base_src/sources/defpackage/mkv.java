package defpackage;

import android.media.MediaCodec;
import android.util.Pair;
import com.google.android.libraries.microvideo.gcamuxer.AnnexBToAvcc;
import j$.nio.charset.StandardCharsets;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class mkv implements AutoCloseable {
    private FileOutputStream b;
    private FileChannel c;
    private final mkt i;
    private final mkp j;
    private final mkl k;
    private final AtomicBoolean d = new AtomicBoolean(false);
    final List a = new ArrayList();
    private long e = 0;
    private long f = 0;
    private long g = 0;
    private orj h = orj.f(0L, 0L);

    public mkv(FileOutputStream fileOutputStream, mkt mktVar, mkp mkpVar, mkl mklVar) {
        this.i = mktVar;
        this.b = fileOutputStream;
        this.c = fileOutputStream.getChannel();
        this.j = mkpVar;
        this.k = mklVar;
    }

    private final ByteBuffer b() {
        byte b;
        ByteBuffer byteBufferAw;
        ByteBuffer byteBufferAw2;
        long jMin = Long.MAX_VALUE;
        for (mku mkuVar : this.a) {
            if (!mkuVar.c.isEmpty()) {
                jMin = Math.min(((MediaCodec.BufferInfo) mkuVar.c.get(0)).presentationTimeUs, jMin);
            }
        }
        ByteBuffer byteBufferA = jMin != Long.MAX_VALUE ? this.i.a(this.a, jMin) : ByteBuffer.allocate(0);
        mkp mkpVar = this.j;
        if (mkpVar.a.isEmpty()) {
            byteBufferAw2 = ByteBuffer.allocate(0);
        } else {
            ByteBuffer[] byteBufferArr = new ByteBuffer[7];
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.put("pict".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.put((byte) 0);
            byteBufferArr[0] = mip.ax("hdlr", byteBufferAllocate);
            byteBufferArr[1] = ByteBuffer.allocate(0);
            List list = mkpVar.a;
            List list2 = mkpVar.c;
            List list3 = mkpVar.d;
            List list4 = mkpVar.e;
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((list.size() * 16) + 200);
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    b = 0;
                    break;
                }
                if (!((mko) it.next()).equals(mko.FILE)) {
                    b = 1;
                    break;
                }
            }
            byteBufferAllocate2.put(b);
            byteBufferAllocate2.put((byte) 0);
            byteBufferAllocate2.put((byte) 0);
            byteBufferAllocate2.put((byte) 0);
            byteBufferAllocate2.put((byte) 68);
            byteBufferAllocate2.put((byte) 0);
            if (list.size() != list3.size()) {
                int size = list.size();
                int size2 = list3.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Items size ");
                sb.append(size);
                sb.append(" does not match offsets size ");
                sb.append(size2);
                throw new IllegalArgumentException(sb.toString());
            }
            if (list3.size() != list4.size()) {
                int size3 = list3.size();
                int size4 = list4.size();
                StringBuilder sb2 = new StringBuilder(64);
                sb2.append("Offsets size ");
                sb2.append(size3);
                sb2.append(" does not match lengths size ");
                sb2.append(size4);
                throw new IllegalArgumentException(sb2.toString());
            }
            byteBufferAllocate2.putShort((short) list.size());
            for (int i = 0; i < list.size(); i++) {
                byteBufferAllocate2.putShort((short) ((Integer) list.get(i)).intValue());
                if (b > 0) {
                    byteBufferAllocate2.putShort(((mko) list2.get(i)).d);
                }
                byteBufferAllocate2.putShort((short) 0);
                byteBufferAllocate2.putShort((short) 1);
                byteBufferAllocate2.putInt((int) ((Long) list3.get(i)).longValue());
                byteBufferAllocate2.putInt((int) ((Long) list4.get(i)).longValue());
            }
            byteBufferArr[2] = mip.ax("iloc", byteBufferAllocate2);
            ByteBuffer[] byteBufferArr2 = new ByteBuffer[2];
            byteBufferArr2[0] = mip.aw("ipco", mkpVar.g);
            List list5 = mkpVar.a;
            List list6 = mkpVar.f;
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(200);
            byteBufferAllocate3.putInt(0);
            if (list5.size() != list6.size()) {
                int size5 = list5.size();
                int size6 = list6.size();
                StringBuilder sb3 = new StringBuilder(54);
                sb3.append("From ids count ");
                sb3.append(size5);
                sb3.append(" is not equal to ");
                sb3.append(size6);
                throw new IllegalArgumentException(sb3.toString());
            }
            Iterator it2 = list6.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                if (!((List) it2.next()).isEmpty()) {
                    i2++;
                }
            }
            byteBufferAllocate3.putInt(i2);
            for (int i3 = 0; i3 < list5.size(); i3++) {
                if (!((List) list6.get(i3)).isEmpty()) {
                    byteBufferAllocate3.putShort((short) ((Integer) list5.get(i3)).intValue());
                    List list7 = (List) list6.get(i3);
                    if (list7.size() > 127) {
                        throw new IllegalArgumentException("Too many properties");
                    }
                    byteBufferAllocate3.put((byte) list7.size());
                    Iterator it3 = list7.iterator();
                    while (it3.hasNext()) {
                        int iIntValue = ((Integer) it3.next()).intValue();
                        if (iIntValue > 255) {
                            throw new IllegalArgumentException("Association does not fit into byte");
                        }
                        byteBufferAllocate3.put((byte) iIntValue);
                    }
                }
            }
            byteBufferArr2[1] = mip.ax("ipma", byteBufferAllocate3);
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, byteBufferArr2);
            byteBufferArr[3] = mip.aw("iprp", arrayList);
            List list8 = mkpVar.b;
            ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(200);
            byteBufferAllocate4.putInt(0);
            byteBufferAllocate4.putShort((short) list8.size());
            Iterator it4 = list8.iterator();
            while (it4.hasNext()) {
                byteBufferAllocate4.put((ByteBuffer) it4.next());
            }
            byteBufferArr[4] = mip.ax("iinf", byteBufferAllocate4);
            if (mkpVar.h.isEmpty()) {
                byteBufferAw = ByteBuffer.allocate(0);
            } else {
                List list9 = mkpVar.h;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(ByteBuffer.allocate(4));
                arrayList2.addAll(list9);
                byteBufferAw = mip.aw("iref", arrayList2);
            }
            byteBufferArr[5] = byteBufferAw;
            byteBufferArr[6] = mkpVar.i.isEmpty() ? ByteBuffer.allocate(0) : mip.aw("idat", mkpVar.i);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(ByteBuffer.allocate(4));
            Collections.addAll(arrayList3, byteBufferArr);
            byteBufferAw2 = mip.aw("meta", arrayList3);
        }
        if (byteBufferAw2.remaining() <= 0) {
            return byteBufferA;
        }
        ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(byteBufferA.remaining() + byteBufferAw2.remaining());
        byteBufferAllocate5.put(byteBufferA);
        byteBufferAllocate5.put(byteBufferAw2);
        return byteBufferAllocate5;
    }

    private final void c(long j, ByteBuffer byteBuffer) throws IOException {
        obr.aQ(j >= ((Long) this.h.k()).longValue());
        obr.aQ(j >= this.g);
        this.c.position(j);
        this.c.write(mip.ax("free", byteBuffer.duplicate()));
        this.g = 8 + j;
        d();
        this.h = orj.f(Long.valueOf(j), Long.valueOf(j + ((long) byteBuffer.limit())));
    }

    private final void d() throws IOException {
        this.c.position(this.e + 8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(this.g - this.e);
        this.c.write(byteBufferAllocate);
    }

    final void a(mku mkuVar) throws IOException {
        if (mkuVar.f.isEmpty()) {
            return;
        }
        if (!this.d.getAndSet(true)) {
            this.c.position(0L);
            this.c.write(this.k.a());
            this.e = this.c.position();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            byteBufferAllocate.putInt(1);
            byteBufferAllocate.put("mdat".getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate.putLong(16L);
            this.c.write(byteBufferAllocate);
            long j = this.e + 16;
            this.f = j;
            this.g = j;
        }
        Iterator it = mkuVar.f.iterator();
        long jLimit = 0;
        while (it.hasNext()) {
            jLimit += (long) ((ByteBuffer) ((Pair) it.next()).second).limit();
        }
        obr.aQ(jLimit > 0);
        long j2 = this.f;
        if (j2 + jLimit >= this.g) {
            c(Math.max(this.g + Math.max(500000L, (long) (j2 * 0.2f)) + jLimit, ((Long) this.h.k()).longValue()), b());
        }
        mkuVar.d.add(Long.valueOf(this.f));
        mkuVar.e.add(Integer.valueOf(mkuVar.f.size()));
        do {
            Pair pair = (Pair) mkuVar.f.removeFirst();
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) pair.first;
            ByteBuffer byteBuffer = (ByteBuffer) pair.second;
            mkuVar.c.add(bufferInfo);
            if (mip.aq(mkuVar.a)) {
                AnnexBToAvcc.a(byteBuffer);
            }
            long j3 = this.f;
            this.f = j3 + ((long) this.c.write(byteBuffer, j3));
        } while (!mkuVar.f.isEmpty());
        obr.aQ(this.f <= this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                a((mku) it.next());
            }
            if (this.d.get()) {
                ByteBuffer byteBufferB = b();
                int iLimit = byteBufferB.limit();
                long j = iLimit + 8;
                boolean z = true;
                if (this.g - this.f < j) {
                    c(((Long) this.h.k()).longValue() + j, byteBufferB);
                    obr.aQ(this.g - this.f >= j);
                }
                long j2 = this.f;
                this.c.position(j2);
                this.c.write(byteBufferB);
                long j3 = ((long) iLimit) + j2;
                long jLongValue = ((Long) this.h.k()).longValue() - j3;
                if (jLongValue >= 2147483647L) {
                    z = false;
                }
                obr.aQ(z);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.putInt((int) jLongValue);
                byteBufferAllocate.put((byte) 102);
                byteBufferAllocate.put((byte) 114);
                byteBufferAllocate.put((byte) 101);
                byteBufferAllocate.put((byte) 101);
                this.c.write(byteBufferAllocate);
                this.g = j2;
                d();
                this.h = orj.f(Long.valueOf(j2), Long.valueOf(j2 + ((long) byteBufferB.limit())));
                this.c.truncate(j3);
            }
        } finally {
            this.c.close();
            this.b.close();
            this.c = null;
            this.b = null;
        }
    }
}
