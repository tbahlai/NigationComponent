package com.example.nigationcomponent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
data class Data(val amount: BigDecimal): Parcelable {
}