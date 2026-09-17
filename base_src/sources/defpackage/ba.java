package defpackage;

import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.ba;

/* JADX INFO: loaded from: classes.dex */
public final class ba implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ba(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(final Parcel parcel) {
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                return new bb(parcel);
            case 1:
                return new az(parcel);
            case 2:
                return new cr(parcel);
            case 3:
                return new cv(parcel);
            case 4:
                return new cy(parcel);
            case 5:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator CREATOR = new ba(5);
                    private final int a;
                    private final MediaDescriptionCompat b;

                    {
                        this.a = parcel.readInt();
                        this.b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.a);
                        this.b.writeToParcel(parcel2, i);
                    }
                };
            case 6:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                ev evVar = new ev();
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                evVar.a = et.i(mediaDescription);
                evVar.b = et.h(mediaDescription);
                evVar.c = et.g(mediaDescription);
                evVar.d = et.f(mediaDescription);
                evVar.e = et.a(mediaDescription);
                evVar.f = et.d(mediaDescription);
                Bundle bundleE = et.e(mediaDescription);
                if (bundleE != null) {
                    bundleE = ew.a(bundleE);
                }
                Uri uri = bundleE != null ? (Uri) bundleE.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uri == null) {
                    bundle = bundleE;
                } else if (!bundleE.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleE.size() != 2) {
                    bundleE.remove("android.support.v4.media.description.MEDIA_URI");
                    bundleE.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    bundle = bundleE;
                }
                evVar.g = bundle;
                if (uri != null) {
                    evVar.h = uri;
                } else {
                    evVar.h = eu.a(mediaDescription);
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(evVar.a, evVar.b, evVar.c, evVar.d, evVar.e, evVar.f, evVar.g, evVar.h);
                mediaDescriptionCompat.a = mediaDescription;
                return mediaDescriptionCompat;
            case 7:
                return new MediaMetadataCompat(parcel);
            case 8:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 9:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator CREATOR = new ba(9);
                    private final MediaDescriptionCompat a;
                    private final long b;

                    {
                        this.a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.a.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.b);
                    }
                };
            case 10:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
                    public static final Parcelable.Creator CREATOR = new ba(10);
                    ResultReceiver a;

                    {
                        this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.a.writeToParcel(parcel2, i);
                    }
                };
            case 11:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator CREATOR = new ba(11);
                    private final Object a;

                    {
                        this.a = parcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Object obj2 = this.a;
                        if (obj2 == null) {
                            return mediaSessionCompat$Token.a == null;
                        }
                        Object obj3 = mediaSessionCompat$Token.a;
                        if (obj3 == null) {
                            return false;
                        }
                        return obj2.equals(obj3);
                    }

                    public final int hashCode() {
                        Object obj = this.a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object] */
                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable(this.a, i);
                    }
                };
            case 12:
                return new ParcelableVolumeInfo(parcel);
            case 13:
                return new PlaybackStateCompat(parcel);
            case 14:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 15:
                return new fa(parcel);
            case 16:
                return new hp(parcel);
            case 17:
                return new no(parcel);
            case 18:
                return new pe(parcel);
            case 19:
                return new rd(parcel);
            default:
                return new rf(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new bb[i];
            case 1:
                return new az[i];
            case 2:
                return new cr[i];
            case 3:
                return new cv[i];
            case 4:
                return new cy[i];
            case 5:
                return new MediaBrowserCompat$MediaItem[i];
            case 6:
                return new MediaDescriptionCompat[i];
            case 7:
                return new MediaMetadataCompat[i];
            case 8:
                return new RatingCompat[i];
            case 9:
                return new MediaSessionCompat$QueueItem[i];
            case 10:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 11:
                return new MediaSessionCompat$Token[i];
            case 12:
                return new ParcelableVolumeInfo[i];
            case 13:
                return new PlaybackStateCompat[i];
            case 14:
                return new PlaybackStateCompat.CustomAction[i];
            case 15:
                return new fa[i];
            case 16:
                return new hp[i];
            case 17:
                return new no[i];
            case 18:
                return new pe[i];
            case 19:
                return new rd[i];
            default:
                return new rf[i];
        }
    }
}
