package com.suji.model.providers

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.suji.model.ConnectionStatus
import com.suji.model.InflationStatus
import com.suji.model.SujiDevice

/**
 * Provides some sample Suji Devices for Compose Previews
 */
class SujiDeviceProvider : PreviewParameterProvider<SujiDevice> {
    override val values: Sequence<SujiDevice>
        get() = sequenceOf(
            SujiDevice(
                name = "Suji-E2802",
                connectionStatus = (ConnectionStatus.CONNECTED),
                pressure = 0,
                batteryPercentage = 0,
                inflationStatus = InflationStatus.DEFLATED,
                assignedLimb = null
            ),
            SujiDevice(
                name = "Suji-E2802",
                connectionStatus = ConnectionStatus.CONNECTED,
                pressure = 0,
                batteryPercentage = 0,
                inflationStatus = InflationStatus.DEFLATED,
                assignedLimb = null
            ),
            SujiDevice(
                name = "Suji-E2802",
                connectionStatus = ConnectionStatus.CONNECTED,
                pressure = 0,
                batteryPercentage = 0,
                inflationStatus = InflationStatus.DEFLATED,
                assignedLimb = null
            ),
        )
}