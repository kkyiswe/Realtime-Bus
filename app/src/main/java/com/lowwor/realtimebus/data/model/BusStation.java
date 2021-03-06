package com.lowwor.realtimebus.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;
import com.hannesdorfmann.parcelableplease.annotation.ParcelablePlease;

/**
 * Created by lowwor on 2015/10/14.
 */
@ParcelablePlease
public class BusStation implements Parcelable {
    public static final Creator<BusStation> CREATOR = new Creator<BusStation>() {
        public BusStation createFromParcel(Parcel source) {
            BusStation target = new BusStation();
            BusStationParcelablePlease.readFromParcel(target, source);
            return target;
        }

        public BusStation[] newArray(int size) {
            return new BusStation[size];
        }
    };
    /**
     * __type : Goophee.ZHGJ.Entity.Station
     * Id : ee5dd05e-9332-48d1-bb21-b2e05391c35f
     * Name : 城轨珠海北站
     * Lng : 113.546275
     * Lat : 22.405286
     * Description :
     */

    @SerializedName("Id")
    public String id;
    @SerializedName("Name")
    public String name;
    @SerializedName("Lng")
    public String longtitude;
    @SerializedName("Lat")
    public String latitude;
    @SerializedName("Description")
    public String description;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        BusStationParcelablePlease.writeToParcel(this, dest, flags);
    }
}
